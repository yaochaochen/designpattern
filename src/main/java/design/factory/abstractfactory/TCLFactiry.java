package design.factory.abstractfactory;

import design.factory.abstractfactory.product.TCLRefigerator;
import design.factory.abstractfactory.product.TCLTelevision;

/**
 * 具体工厂
 */
public class TCLFactiry implements  Factory {
    @Override
    public Television newTelevision() {
        return new TCLTelevision();
    }

    @Override
    public Refrigerator newRefrigerator() {
        return new TCLRefigerator();
    }
}
