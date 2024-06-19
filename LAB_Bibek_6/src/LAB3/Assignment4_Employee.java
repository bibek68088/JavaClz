/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

/**
 *
 * @author bibek
 */
class Employee {

    int id;
    String firstName;
    String lastName;
    int salary;

    Employee() {
    }

    Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        return (salary/100)*percent;
    }

    public String toString() {
        return "Employee [ID = " + id + ", name = " + firstName + " " + lastName + ", Salary = " + salary + "]";
    }
}

public class Assignment4_Employee {

    public static void main(String args[]) {
        Employee e1 = new Employee(10, "Bibek", "Tamang", 100000);
        System.out.println("Employee ID is: " + e1.getID());
        System.out.println("Firstname is: " + e1.getFirstName());
        System.out.println("Lastname is: " + e1.getLastName());
        System.out.println("Salary is: " + e1.getSalary());
        System.out.println("Annual Salary: " + e1.getAnnualSalary());
        System.out.println("Raised salary: " + e1.raiseSalary(10));
        System.out.println("String : " + e1.toString());
    }
}