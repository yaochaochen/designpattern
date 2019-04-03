package design.method;

import design.adapter.method.simple.*;
import design.method.simple.*;

/**
 * 工厂接口
 * @author yaochaochen
 */
public interface IFactory {
    public Operation createOperation();
    
    
    
}

class AddFactory implements  IFactory {

    public Operation createOperation() {
        return new OperationAdd();
    }
}

class SubFactory implements IFactory {


    public Operation createOperation() {
        return new OperationSub();
    }
}

class MulFactoty implements IFactory {

    public Operation createOperation() {
        return new OperationMul();
    }
}

class DivFactory implements  IFactory {

    public Operation createOperation() {
        return  new OperationDiv();
    }
}