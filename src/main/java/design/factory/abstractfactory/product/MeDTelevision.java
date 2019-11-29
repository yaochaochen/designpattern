package design.factory.abstractfactory.product;

import design.factory.abstractfactory.Television;

public class MeDTelevision implements Television {
    @Override
    public void dosomething() {
        System.out.println("我是美的电视机, 我可以看电视");
    }
}
