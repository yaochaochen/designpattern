package design.factory;

public class EmailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("发送邮件.....");
    }
}
