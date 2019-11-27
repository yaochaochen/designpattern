package design.factory;

public class SendFactory {
    public Sender produceSms() {
        return  new SmsSender();
    }

    public Sender produceEmail() {
        return new EmailSender();
    }
    public Sender produceExpress() {
        return new ExpressSender();
    }

}
