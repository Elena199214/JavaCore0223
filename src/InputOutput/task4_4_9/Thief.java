package InputOutput.task4_4_9;

public class Thief implements MailService {
    int minValue;
    int stolenValue = 0;

    public Thief(int minValue) {
        this.minValue = minValue;
    }

    public int getStolenValue() {
        return this.stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getPrice() > minValue) {
                stolenValue += (((MailPackage) mail).getContent().getPrice());
                return new MailPackage(mail.getFrom(), mail.getTo(),
                        new Package("stones instead of " +
                                (((MailPackage) mail).getContent().getContent()), 0));
            }
            return mail;
        }
        return mail;
    }
}