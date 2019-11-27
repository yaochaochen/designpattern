package design.factory;

public class Main1 {

    public static void main(String[] args) {
        Provider providerSms = new SmsSendFactory();
         Sender senderSms = providerSms.produce();
         senderSms.Send();

        Provider providerEmail = new EmailSendFactory();
        Sender senderEmail = providerEmail.produce();
        senderEmail.Send();

        Provider providerExpress = new ExpressSendFactory();
       Sender senderExpress =  providerExpress.produce();
       senderExpress.Send();

    }

}
 class  ExpressSendFactory implements Provider {

    @Override
    public Sender produce() {
        return new ExpressSender();
    }
}
class EmailSendFactory implements Provider{

    @Override
    public Sender produce() {
        return new EmailSender();
    }
}
class SmsSendFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
