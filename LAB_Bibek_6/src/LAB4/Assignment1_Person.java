/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

/**
 *
 * @author bibek
 */
class Person {

    String firstName;
    String lastName;
    String address;
    int id;

    Person() {
    }

    Person(String firstName, String lastName, String address, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String newLastName) {
        lastName = newLastName;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String newAddress) {
        address = newAddress;
    }

    int getID() {
        return id;
    }

    void setID(int newID) {
        id = newID;
    }

    void display() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("ID: " + id);

    }
}

class Student extends Person {

    double gpa;

    Student() {

    }

    Student(double gpa) {
        this.gpa = gpa;
    }

    double getGpa() {
        return gpa;
    }

    void setGpa(double newGpa) {
        gpa = newGpa;
    }

    void display() {
        System.out.println("Gpa: "+gpa);
    }
}

class Employee extends Person {

    String jobTitle;

    Employee() {
         super();
    }

    Employee(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    String getJobTitle() {
        return jobTitle;
    }

    void setJobTitle(String newJobTitle) {
        jobTitle = newJobTitle;
    }

    void display() {
        System.out.println("Job Title: "+jobTitle);
    }
}

public class Assignment1_Person {

    public static void main(String args[]) {
        Employee e = new Employee();
        e.setJobTitle("Student");
        Student s = new Student();
        s.setGpa(4.0);
        e.display();
        s.display();
        Person p = new Person();
        p.setFirstName("Bibek");
        p.setLastName("Tamang");
        p.setAddress("New-Baneshwor");
        p.setID(06);
        p.display();
    }
}