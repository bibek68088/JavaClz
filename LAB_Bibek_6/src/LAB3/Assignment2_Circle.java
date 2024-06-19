/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;
import static java.lang.Math.PI;
/**
 *
 * @author bibek
 */

class Circle {

    double radius = 1.0;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {//area claculation
        return PI * radius * radius;
    }
    public double getCircumference(){//circumference calculation
        return 2*PI*radius;
    }
    
    public String toString() {
   return "Circle[radius =" +radius+"]";
}
}

public class Assignment2_Circle {

    public static void main(String[] args) {
//creating first circle object with
        Circle c1 = new Circle();
        //calling getArea() method
        System.out.println("Area of circle : " + c1.getArea());
        //calling getCircumference() method
        System.out.println("Circumference of circle : "+c1.getCircumference());
        System.out.println("String : "+c1.toString());
        
    }
}