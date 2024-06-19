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
public class Assignment1_Student {

    int studentID;
    String studentName;
    String branch;
    int year;
    String location;
    String college;

    Assignment1_Student(){
    
    }

    Assignment1_Student(int studentID,
            String studentName,
            String branch,
            int year,
            String location,
            String college) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.branch = branch;
        this.year = year;
        this.location = location;
        this.college = college;
    }
}

class AverageMarks {

    float subject1 = 100;
    float subject2 = 88;
    float subject3 = 99;
    float subject4 = 79;
    float subject5 = 87;
    float subject6 = 95;
    float average = (subject1 + subject2 + subject3 + subject4 + subject5 + subject6) / 6;
}

class Attendance {

    float presentDays = 96;
    float attendDays = 100;
    float attendPercent = (presentDays * 100) / attendDays;
}

class PrintDetail {

    public static void main(String args[]) {
        Assignment1_Student std = new Assignment1_Student(06, "Bibek", "Gaushala", 2021, "Bijayachowk, Gaushala", "Orchid");
        AverageMarks avgm = new AverageMarks();
        Attendance atd = new Attendance();
        System.out.println("Student details: ");
        System.out.println("Student ID: " + std.studentID);
        System.out.println("Student Name: " + std.studentName);
        System.out.println("Student Branch: " + std.branch);
        System.out.println("Student Year: " + std.year);
        System.out.println("Student Location: " + std.location);
        System.out.println("Student College: " + std.college);
        System.out.println("Average marks: " + avgm.average);
        System.out.println("Attendance percent: " + atd.attendPercent);
    }
}
