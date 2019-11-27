package design.factory;

public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("短信发送....");
    }
}
