package com.mycompany.mavenproject4;

  // Shape.java
// Interface Shape

public interface Shape { 
    double getArea();
}



// Triangle.java
// Class Triangle that implements the Shape interface
package com.mycompany.mavenproject4;
 class Triangle implements Shape {
    double base;
    double height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
} 


// Main.java

package com.mycompany.mavenproject4;

class Main{
   public static void main(String[] args) {
        
  Triangle triangle = new Triangle(4, 6);
     System.out.println("Area of the Triangle: " + triangle.getArea());
    }
}    





 

  
 

