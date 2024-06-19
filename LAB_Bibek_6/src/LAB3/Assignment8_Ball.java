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
class Ball{
    float x;
    float y;
    float xDelta;
    float yDelta;
    int radius;
Ball(){
}
Ball(float x,float y,float xDelta,float yDelta, int radius){
    this.radius = radius;
    this.x =x;
    this.y = y;
    this.xDelta = xDelta;
    this.yDelta = yDelta;
}
float getX(){
    return x;
}
void setX(float newX){
    x = newX;
} 
float getY(){
    return y;
}
void setY(float newY){
    y = newY;
}
int getRadius(){
        return radius;
}
void setRadius(int newRadius){
    radius = newRadius;
}
float getXDelta(){
        return xDelta;
}
void setXDelta(float newXDelta){
    xDelta = newXDelta;
}
float getYDelta(){
        return yDelta;
}
void setYDelta(float newYDelta){
    yDelta = newYDelta;
}
void move(){
    System.out.println("Move one step:");
    x+=xDelta;
    y+=yDelta;}
void reflectHorizontal(){
    xDelta = -xDelta; 
}
void reflectVertical(){
    yDelta = - yDelta;
}
public String toString(){
    return "Ball[("+x+","+y+"),speed=("+xDelta+","+yDelta+"]";
}
}

public class Assignment8_Ball {
    public static void main(String[] args){
        Ball b = new Ball();
        b.setRadius(4);
        b.setX(2);
        b.move();
        b.reflectHorizontal();
        b.setY(2);
        b.setXDelta(3);
        b.setYDelta(1);
        System.out.println("x: "+b.getX());
        System.out.println("y: "+b.getY());
        System.out.println("radius: "+b.getRadius());
        System.out.println("xdelta: "+b.getXDelta());
        System.out.println("ydelta: "+b.getYDelta());
        System.out.println("Ball: "+b.toString());
    }
}