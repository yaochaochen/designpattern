package design.factory.abstractfactory.product;

import design.factory.abstractfactory.Refrigerator;

public class MeDiRefigerator implements Refrigerator {
    @Override
    public void dosomething() {
        System.out.println("我是美的冰箱, 我可以洗衣服");
    }
}
