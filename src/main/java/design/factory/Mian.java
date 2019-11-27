package design.factory;

public class Mian {
    public static void main(String[] args) {

        SendFactory sendFactory = new SendFactory();
        Sender senderSms = sendFactory.produce("sms");
        senderSms.Send();

        Sender senderEmail = sendFactory.produce("email");
        senderEmail.Send();

        Sender senderExpress = sendFactory.produce("express");
        senderExpress.Send();
    }
}
