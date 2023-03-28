package Streams.task6_2_14;

public class MailMessage extends AbstractSendable<String> {


    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }
}
