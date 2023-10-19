package com.mycompany.mavenproject3;
 //Lab report 3, task 1
//Shape.java
public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}
// Subclass(inherit from Shape
 class Rectangle extends Shape {
   double length;
   double width;
   
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }
 
   @Override
  public double getArea() {
    return length * width;
  }
  
  @Override
  public double getPerimeter() {
    return 2 * (length + width);
  }
}

package com.mycompany.mavenproject3;

// Main.java
public class Main {
 
  public static void main(String[] args) {
    
    Shape rectangle = new Rectangle(11, 9);
   
    System.out.println("\nRectangle: Length-11, Width-9");
    System.out.println("Area: " + rectangle.getArea());
    System.out.println("Perimeter: " + rectangle.getPerimeter());

   
  }
}      

  

