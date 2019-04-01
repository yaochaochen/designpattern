package prototype;

import java.io.IOException;

/**
 * 原型模式客户端
 * @Todo 考虑优化此处重复代码
 * @author yaochaochen
 */
public class PrototypeClient {
    
    public static  void shallowCopy() throws CloneNotSupportedException {
        
        Resume aResume = new Resume();
        aResume.setName("大鸟");
        aResume.setGender("男");
        aResume.setAge(23);
        aResume.setWorkExperience("2010-03-01", "大公司");
        Resume bResume = (Resume) aResume.clone();
        bResume.setWorkExperience("2009-12-01", "悦途出行");
        Resume cResume = (Resume) aResume.clone();
        cResume.setWorkExperience("2007-09-01", "创业公司");
        System.out.println(">>>>>>>>浅拷贝：");
        aResume.display();
        bResume.display();
        cResume.display();
    }
    
    public static  void deepCopy() throws  IOException, ClassNotFoundException {

        Resume aResume = new Resume();
        aResume.setName("大鸟");
        aResume.setGender("男");
        aResume.setAge(23);
        aResume.setWorkExperience("2010-03-01", "大公司");
        Resume bResume = (Resume) aResume.deepClone();
        bResume.setWorkExperience("2009-12-01", "悦途出行");
        Resume cResume = (Resume) aResume.deepClone();
        cResume.setWorkExperience("2007-09-01", "创业公司");
        System.out.println(">>>>>>>>深拷贝：");
        aResume.display();
        bResume.display();
        cResume.display();
        
    }
    public static  void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException{
        //浅度拷贝
        shallowCopy();
        
        System.out.println("====================");
        
        //深度拷贝
        deepCopy();
    }
}
