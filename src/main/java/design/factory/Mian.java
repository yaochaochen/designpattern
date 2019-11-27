package design.factory;

public class Mian {
    public static void main(String[] args) {

        SendFactory sendFactory = new SendFactory();
        Sender senderSms = sendFactory.produceSms();
        senderSms.Send();

        Sender senderEmail = sendFactory.produceEmail();
        senderEmail.Send();

        Sender senderExpress = sendFactory.produceExpress();
        senderExpress.Send();
    }
}
