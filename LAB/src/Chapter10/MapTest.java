/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bibek
 */
public class MapTest {
    public static void main(String[]args){
        Map<String,String>courses = new HashMap<String,String>();
        courses.put("Book1", "Java");
        courses.put("Book2","C");
        System.out.println(courses);
        System.out.println("The size of course is:\t"+courses.size());
        String key = courses.get("Book1");
        if(courses.containsKey("Book1")){
            System.out.println("found\t"+courses.replace("Book1", "C++"));
        }
        System.out.println(courses);
    }
}
