package InputOutput.task4_4_9;

public class Inspector implements MailService {

    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if ((((MailPackage) mail).getContent().getContent().contains(WEAPONS)) ||
                    (((MailPackage) mail).getContent().getContent().contains(BANNED_SUBSTANCE))) {
                throw new IllegalPackageException();
            }
            if (((MailPackage) mail).getContent().getContent().contains("stones")) {
                throw new StolenPackageException();
            }
            return mail;
        }
        return mail;
    }
}