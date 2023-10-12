package com.company;

public class Person {
   protected String firstName,lastName;
   protected int age;
   Person(){
       this.firstName="";
       this.lastName="";
       this.age=0;
   }
   public Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void display(){
        System.out.println("the first name :"+firstName);
        System.out.println("the last name :"+lastName);
        System.out.println("the age :"+age);
    }
    public static void main(String[] args) {

    }
}
