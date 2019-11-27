package design.factory;

public class ExpressSender implements Sender {
    @Override
    public void Send() {
        System.out.println("快递发送...");
    }
}
