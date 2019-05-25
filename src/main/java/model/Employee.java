package model;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long SerialVersionUID = 10l;

    public Employee( Integer employeeId,String empoyeeName) {
        this.empoyeeName = empoyeeName;
        this.employeeId = employeeId;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private String empoyeeName;

    private Integer employeeId;

    public String getEmpoyeeName() {
        return empoyeeName;
    }

    public void setEmpoyeeName(String empoyeeName) {
        this.empoyeeName = empoyeeName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}
