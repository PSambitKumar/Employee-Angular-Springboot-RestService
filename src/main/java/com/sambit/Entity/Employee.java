package com.sambit.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "employee_master")
public class Employee {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String empUniqueCode;
    private String empFullName;
    private String empEmail;
    private Date empDOB;
    private String empType;
    private boolean empActive;
    private char empLock;



    public Employee() {
    }

    public Employee(int empId, String empUniqueCode, String empFullName, String empEmail, Date empDOB, String empType, boolean empActive, char empLock) {
        this.empId = empId;
        this.empUniqueCode = empUniqueCode;
        this.empFullName = empFullName;
        this.empEmail = empEmail;
        this.empDOB = empDOB;
        this.empType = empType;
        this.empActive = empActive;
        this.empLock = empLock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmpId() == employee.getEmpId() && isEmpActive() == employee.isEmpActive() && getEmpLock() == employee.getEmpLock() && getEmpUniqueCode().equals(employee.getEmpUniqueCode()) && getEmpFullName().equals(employee.getEmpFullName()) && getEmpEmail().equals(employee.getEmpEmail()) && getEmpDOB().equals(employee.getEmpDOB()) && getEmpType().equals(employee.getEmpType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), getEmpUniqueCode(), getEmpFullName(), getEmpEmail(), getEmpDOB(), getEmpType(), isEmpActive(), getEmpLock());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empUniqueCode='" + empUniqueCode + '\'' +
                ", empFullName='" + empFullName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empDOB=" + empDOB +
                ", empType='" + empType + '\'' +
                ", empActive=" + empActive +
                ", empLock=" + empLock +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpUniqueCode() {
        return empUniqueCode;
    }

    public void setEmpUniqueCode(String empUniqueCode) {
        this.empUniqueCode = empUniqueCode;
    }

    public String getEmpFullName() {
        return empFullName;
    }

    public void setEmpFullName(String empFullName) {
        this.empFullName = empFullName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public Date getEmpDOB() {
        return empDOB;
    }

    public void setEmpDOB(Date empDOB) {
        this.empDOB = empDOB;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public boolean isEmpActive() {
        return empActive;
    }

    public void setEmpActive(boolean empActive) {
        this.empActive = empActive;
    }

    public char getEmpLock() {
        return empLock;
    }

    public void setEmpLock(char empLock) {
        this.empLock = empLock;
    }
}
