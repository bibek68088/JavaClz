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
class Date{
    int day;
    int month;
    int year;
    
Date(){    
}

Date(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
}
int getDay(){
    return day;
}
void setDay(int newDay){
    day = newDay;
}
int getMonth(){
    return month;
}
void setMonth(int newMonth){
    month =newMonth;
}
int getYear(){
    return year;
}
void setYear(int newYear){
    year = newYear;
}

public void setDate(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
}
public String setDate(){
    return setDate();
}
public String toString(){
    return "dd//mm/yyyy:["+day+"/"+month+"/"+year+"]";
}

}
public class Assignment7_Date {
    public static void main(String[] args){
        Date d = new Date();
        d.setDay(02);
        d.setMonth(03);
        d.setYear(2002);
        System.out.println("Day: "+d.getDay());
        System.out.println("Month: "+d.getMonth());
        System.out.println("Year: "+d.getYear());
        System.out.println("Date:"+d.toString());
    }
}
