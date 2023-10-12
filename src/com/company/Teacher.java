package com.company;

public class Teacher extends Student {
    int salary;
    Teacher(){
        super();
        this.salary=salary;
    }
    Teacher(String firstName, String lastName, int age,String course,int salary){
        super(firstName, lastName, age,course);
        this.salary=salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    void display() {
        super.display();
        System.out.println("the salary is :"+salary);
    }
}
