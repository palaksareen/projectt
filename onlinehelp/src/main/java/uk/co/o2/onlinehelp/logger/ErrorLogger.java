package uk.co.o2.onlinehelp.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ErrorLogger {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void log(Throwable t, String... msgs) {
        StringBuilder builder = new StringBuilder();
        for (String msg : msgs) {
            builder.append(msg);
        }
        logger.error(builder.toString(), t);
    }

}
