package design.command;


/***
 * 执行请求
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {

        command.execute();
    }
}
