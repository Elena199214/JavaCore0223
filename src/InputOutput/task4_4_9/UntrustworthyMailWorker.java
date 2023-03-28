package InputOutput.task4_4_9;

import java.util.logging.Logger;

/*
ненадежного работника почты
 */
public class UntrustworthyMailWorker implements MailService {
    MailService[] mailService = {new Spy(Logger.getLogger(MailMessage.class.getName())), new Thief(300), new Inspector()};
    RealMailService realMailService = new RealMailService();

    public RealMailService getRealMailService() {
        return realMailService;
    }

    public UntrustworthyMailWorker(MailService[] mailService) {
        this.mailService = mailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable result = this.mailService[0].processMail(mail);
        for (int i = 1; i < this.mailService.length; i++) {
            result = this.mailService[i].processMail(result);
        }
        return getRealMailService().processMail(result);
    }
}
