package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 添加产品类，由多个部件构成
 * @author yaochaochen
 */

public class Product {
    
    List<String> parts  = new ArrayList<String>();
    
    //添加产品部件
    public void  add(String part) {
        parts.add(part);
    }
    
    //列举所有的产品部件
    public  void  show (){
        System.out.println("产品 -- 创建 ---");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
