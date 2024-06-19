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
class Rectangle {

    float length = 1.0f;
    float width = 1.0f;

    Rectangle() {
    }

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void getWidth() {
    }

    public double getArea() {
    //area calculation
        return length * width;
    }

    public double getPerimeter() {
    //perimeter calculation
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

}

public class Assignment3_Rectangle {

    public static void main(String args[]) {
        Rectangle rect = new Rectangle();
        System.out.println("Area of rectangle : " + rect.getArea());//calling getArea() method
        System.out.println("Perimeter of rectangle : " + rect.getPerimeter());//calling getPerimeter()method
        System.out.println("String : " + rect.toString());
    }
}