package prototype;

import java.io.Serializable;

/**
 * 工作经历类 演示浅拷贝和深拷贝
 */

public class WorkExperience implements Serializable {
    
    private String workDate;
    
    private String workCompany;

    public String getWorkDate() {
        return workDate;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public void setWorkCompany(String workCompany) {
        this.workCompany = workCompany;
    }
}
