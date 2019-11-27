package design.factory;

public class SendFactory {
    public Sender produce(String type) {
        if (type == null) {
            return null;
        } else if ("email".equals(type)) {
            return new EmailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else if ("express".equals(type)) {
            return new EmailSender();
        } else {
            return null;
        }

    }
}
