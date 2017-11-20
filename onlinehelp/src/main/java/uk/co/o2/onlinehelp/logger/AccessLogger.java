package uk.co.o2.onlinehelp.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AccessLogger {

    private static final String BLANK_SPACE = " ";
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void log(String... messages) {
        StringBuilder builder = new StringBuilder();
        for (String msg : messages) {
            builder.append(msg);
            builder.append(BLANK_SPACE);
        }
        logger.info(builder.toString());
    }
}
