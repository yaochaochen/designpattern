package design.command;

import java.util.List;

/**
 * 声明式执行操作接口
 */
public abstract class Command {


    protected List<Reciever> recievers;

    public Command(List<Reciever> recievers) {
        this.recievers = recievers;

    }

    public void addRecievers(Reciever reciever) {

        this.recievers.add(reciever);
    }

    public abstract void execute();

    static class ConcreateCommand extends Command {


        ConcreateCommand(List<Reciever> recievers) {
            super(recievers);
        }
        @Override
        public void execute() {
            for (Reciever reciever : recievers) {
                reciever.action();
            }
        }
    }


}
