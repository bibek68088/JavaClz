/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import static java.lang.Math.PI;

/**
 *
 * @author bibek
 */
class Circle{
    double radius =1.0;
    
    public double getRadius(){
    return radius;
    }
    
    public void setRadius(double radius){
    this.radius = radius;
    }
    
    public double getArea(){
    return radius*PI*radius;
    }
    
    public double getCircumference(){
    return 2*PI*radius;
    }
    
    public String toString(){
    return "Circle[radius =" + radius + "]";
    }
}

public class Area {
    public static void main(String[]args){
    Circle c1= new Circle();
    System.out.println("Area of circle is: " +c1.getArea());
    System.out.println("Cicumference: "+c1.getCircumference());
    System.out.println("String:"+c1.toString());
    }
}
