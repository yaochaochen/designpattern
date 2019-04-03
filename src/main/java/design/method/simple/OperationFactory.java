package design.method.simple;

/**
 * 操作类 工厂类
 */

public class OperationFactory {
    public static  Operation createOperation(char opreator) {
        
        Operation operation = null;
        switch (opreator) {
            case '+':
                operation = new OperationAdd();  
                break;
            case  '-':
                operation = new OperationSub();
                break;
            case  '*':
                operation = new OperationMul();
                break;
            case '/':
                operation = new OperationSub();
                break;
            default:
                throw  new  RuntimeException("unsuppported operation");
                  
        }
        return operation;
    }
    
}
