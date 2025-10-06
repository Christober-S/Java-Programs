package com.christober.learning.encapsulation;

public class Employee {
    private String ename;
    private double salary;
    private int eid;
    private String Desgination;
    private String dept;
    private int deptNo;

    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getDesgination() {
        return Desgination;
    }
    public void setDesgination(String desgination) {
        Desgination = desgination;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public int getDeptNo() {
        return deptNo;
    }
    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

}
