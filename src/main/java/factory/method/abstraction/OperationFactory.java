package factory.method.abstraction;

import factory.method.simple.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 利用反射改造工厂模型 去掉 分支判断逻辑
 * @author yaochaochen
 */
public class OperationFactory {
    
    private static Map<String,Class<?>> allOperationMaps = new HashMap<String, Class<?>>();
    
    public static  void fillMap() {
        allOperationMaps.put("+", OperationAdd.class);
        allOperationMaps.put("-", OperationSub.class);
        allOperationMaps.put("*", OperationMul.class);
        allOperationMaps.put("/", OperationDiv.class);
        
    }
    public static Operation createOperation(String operator) throws InstantiationException, IllegalAccessException{
        
        Operation operation;
        fillMap();
        Class<?> operationClass = allOperationMaps.get(operator);
        
        if(operationClass == null) {
            throw  new  RuntimeException("unsupported operation");
        }
        operation = (Operation) operationClass.newInstance();
        return operation;
    }
    
}
