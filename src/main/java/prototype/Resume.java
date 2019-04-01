package prototype;

import java.io.*;

/**
 * 简历类
 */
public class Resume implements  Cloneable, Serializable {
    
    
    private String name;
    
    private String gender;
    private int age;
    
    //引用 工作经验对象 浅拷贝和深拷贝
    private WorkExperience workExperience;
    
    
    public  Resume() {
       //实例化简历时，同时实例化 工作经历类 
        workExperience = new WorkExperience();
    }
    
    public void display() {
        
        System.out.println(this.getName() + "" +this.getGender() + "" + this.age + "\n工作经历"
        + this.getWorkExperience().getWorkDate() + "" + this.getWorkExperience().getWorkCompany());
    }
    
    
    @Override
    protected  Object clone() throws  CloneNotSupportedException {
        return super.clone();
    }
    
    
    //通过对象序列化，实现深度拷贝
    protected  Object deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流内
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
        oos.writeObject(this);
        
        //从流内读取对象

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        return ois.readObject();
        
    }
    

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workDate, String workCompany) {
        workExperience.setWorkDate(workDate);
        workExperience.setWorkCompany(workCompany);
    }
}
