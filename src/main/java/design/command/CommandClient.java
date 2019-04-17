package design.command;

import java.util.ArrayList;
import java.util.List;

public class CommandClient {


    public static void main(String[] args) {
        List<Reciever> list = new ArrayList<Reciever>();

        list.add(new RecieverA());
        list.add(new RecieverB());
        list.add(new RecieverC());
        Command command = new Command.ConcreateCommand(list);

        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();

    }
}
