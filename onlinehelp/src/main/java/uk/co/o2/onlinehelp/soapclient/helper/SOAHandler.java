package uk.co.o2.onlinehelp.soapclient.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import uk.co.o2.onlinehelp.exception.OHEncryptionException;
import uk.co.o2.onlinehelp.logger.ErrorCode;
import uk.co.o2.onlinehelp.logger.OnlineHelpLogger;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class SOAHandler implements SOAPHandler<SOAPMessageContext> {

    public static final String REQUEST_START_TIME_KEY = "uk.co.o2.onlinehelp.soapclient.helper.SoaHandler:REQUEST_START_TIME";
    public static final String RESPONSE_TIME = "RESPONSE TIME:";
    public static final String CORE_DATA_NAMESPACE = "http://soa.o2.co.uk/coredata_1";
    public static final String SERVICE_NAME = "ServiceName";
    public static final String WSSE = "wsse";
    public static final String SOA_CONSUMER_TRANSACTION_ID_HEADER = "SOAConsumerTransactionID";

    @Autowired
    private SoaConfig config;

    @Autowired
    private OnlineHelpLogger logger;

    @Autowired
    private SoaPasswordEncryption soaPasswordEncryption;

    @Override
    public Set<QName> getHeaders() {
        return new HashSet<>();
    }

    @Override
    public boolean handleMessage(SOAPMessageContext soapMessageContext) {
        Boolean outboundProperty = (Boolean) soapMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        soapMessageContext.put(REQUEST_START_TIME_KEY, Instant.now());
        SOAPMessage soapMessage = soapMessageContext.getMessage();
        try {
            Object serviceName = soapMessageContext.get(MessageContext.WSDL_SERVICE);
            if (outboundProperty) {
                try {
                    String soaConsumerTransactionId = UUID.randomUUID().toString();
                    String message = getSOAPMessage(soapMessage);
                    createConsumerTransactionIDElement(soapMessage,
                            soaConsumerTransactionId);
                    soapMessage.saveChanges();
                    logger.accessLog("SOA REQUEST: ", SERVICE_NAME, serviceName.toString(), message);
                    addHeaders(soapMessage);
                } catch (SOAPException ex) {
                    logger.errorLog(ex, ErrorCode.MSG_HANDLER_ERROR.getCodeNMessage());
                } catch (OHEncryptionException ex) {
                    logger.errorLog(ex, ErrorCode.SOA_PASSWORD_DECRYPTION_FAILURE.getCodeNMessage());
                }

            } else {
                Instant requestStarted = (Instant) soapMessageContext.get(REQUEST_START_TIME_KEY);
                Duration responseTime = Duration.between(requestStarted, Instant.now());
                String message = getSOAPMessage(soapMessage);
                logger.accessLog("SOA RESPONSE: ", SERVICE_NAME, serviceName.toString(),
                        RESPONSE_TIME, responseTime.toMillis() + "ms", message);
            }
        } catch (SOAPException | IOException ex) {
            logger.errorLog(ex, ErrorCode.MSG_HANDLER_ERROR.getCodeNMessage());
        }

        return true;
    }

    private String getSOAPMessage(SOAPMessage soapMessage) throws SOAPException,
            IOException {
        ByteArrayOutputStream soapMsgByteStream = new ByteArrayOutputStream();
        soapMessage.writeTo(soapMsgByteStream);
        return soapMsgByteStream.toString().replaceAll("[\r\n]+", "");
    }

    private SOAPMessage addHeaders(SOAPMessage message) throws SOAPException, OHEncryptionException {
        SOAPHeader header = message.getSOAPHeader() != null ? message.getSOAPHeader() : message.getSOAPPart().getEnvelope().addHeader();

        SOAPElement security = header.addChildElement("Security", WSSE, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
        SOAPElement usernameToken = security.addChildElement("UsernameToken", WSSE);
        usernameToken.addAttribute(new QName("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
        SOAPElement usernameElement = usernameToken.addChildElement("Username", WSSE);
        usernameElement.addTextNode(config.getUsername());
        SOAPElement passwordElement = usernameToken.addChildElement("Password", WSSE);
        passwordElement.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
        passwordElement.addTextNode(soaPasswordEncryption.decrypt(config.getPassword()));
        return message;
    }

    private SOAPMessage createConsumerTransactionIDElement(SOAPMessage message, String consumerTransactionId) throws SOAPException {
        logger.accessLog(SOA_CONSUMER_TRANSACTION_ID_HEADER, ": ", consumerTransactionId);
        SOAPHeader header = message.getSOAPHeader() != null ? message.getSOAPHeader() : message.getSOAPPart().getEnvelope().addHeader();
        SOAPElement consumerTransactionIdElement = header.addChildElement(SOA_CONSUMER_TRANSACTION_ID_HEADER, "cor", CORE_DATA_NAMESPACE);
        consumerTransactionIdElement.addTextNode(consumerTransactionId == null ? "unknown" : consumerTransactionId);
        return message;
    }

    @Override
    public boolean handleFault(SOAPMessageContext soapMessageContext) {
        Boolean outboundProperty = (Boolean) soapMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        SOAPMessage soapMessage = soapMessageContext.getMessage();
        try {
            Object serviceName = soapMessageContext.get(MessageContext.WSDL_SERVICE);
            if (!outboundProperty) {
                String message = getSOAPMessage(soapMessage);
                logger.accessLog("SOA FAULT RESPONSE: ", SERVICE_NAME, serviceName.toString(), message);
            }
        } catch (SOAPException | IOException ex) {
            logger.errorLog(ex, ErrorCode.MSG_HANDLER_ERROR.getCodeNMessage());
        }

        return true;
    }

    @Override
    public void close(MessageContext messageContext) {
    }

}

