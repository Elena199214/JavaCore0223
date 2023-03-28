package InputOutput.task4_4_9;

import java.util.logging.Logger;

public class Spy implements MailService {

    Logger logger = Logger.getLogger(MailMessage.class.getName());
    public static final String AUSTIN_POWERS = "Austin Powers";

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            if (mail.getFrom().equalsIgnoreCase(AUSTIN_POWERS) || mail.getTo().equalsIgnoreCase(AUSTIN_POWERS)) {
                logger.warning(String.format("Detected target mail correspondence: from %s to %s \"%s\"",mail.getFrom(),mail.getTo(), ((MailMessage) mail).getMessage()));
                //logger.warning(String.format("Detected target mail correspondence: from %s, to %s, \" %s,\"",mail.getFrom(),mail.getTo(), ((MailMessage) mail).getMessage()));
                logger.info(String.format("Usual correspondence: from %s to %s",mail.getFrom(),mail.getTo()));
            }
            return mail;
        }
        return mail;
    }
}
