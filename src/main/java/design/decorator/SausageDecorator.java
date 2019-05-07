package design.decorator;

public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个火腿肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
