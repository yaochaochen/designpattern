package design.factory.abstractfactory.product;

import design.factory.abstractfactory.Refrigerator;

public class TCLRefigerator implements Refrigerator {
    @Override
    public void dosomething() {
        System.out.println("我是TCL冰箱, 我可以洗衣服");
    }
}
