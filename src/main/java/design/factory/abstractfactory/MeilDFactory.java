package design.factory.abstractfactory;

import design.factory.abstractfactory.product.MeDTelevision;
import design.factory.abstractfactory.product.MeDiRefigerator;

public class MeilDFactory implements Factory {
    @Override
    public Television newTelevision() {
        return new MeDTelevision();
    }

    @Override
    public Refrigerator newRefrigerator() {
        return new MeDiRefigerator();
    }
}
