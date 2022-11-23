package Xixixixi;

import java.sql.SQLOutput;

public class Employee {
    protected String name;
    protected   int id;
    protected   String department;
    protected   double salary;

    public Employee(){

    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setDepartment(String dept){
        this.department = dept;
    }

    public void setSalary(int sal) {
        this.salary = sal;
    }

    public void displayEmployee(){
        System.out.println("Name        : " + this.name);
        System.out.println("Employee ID : " + this.id);
        System.out.println("Department  : " + this.department);
        System.out.println("Salary      : " + this.salary);
        System.out.println("===================================");
    }
}
