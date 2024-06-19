/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

enum WeekDays{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

public class EnumTest {
    public static void main(String[]args){
        WeekDays arr[]= WeekDays.values();
        for(WeekDays wk:arr){
            System.out.println(wk);
        }
    }
}
