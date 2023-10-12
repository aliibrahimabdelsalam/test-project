package com.company;

public class Student extends Person {
    protected String course;
    Student() {
        super();
        this.course="";
    }
    Student(String firstName, String lastName, int age,String course) {
        super(firstName, lastName, age);
        this.course=course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    void display() {
        super.display();
        System.out.println("the course is : "+course);
    }
}
