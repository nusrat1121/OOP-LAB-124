// Java program to demonstrate ClassNotFoundException 

package com.mycompany.mavenproject12;

public class ClassNotFoundException {
  public static void main(String[] args) throws java.lang.ClassNotFoundException { 

        try{ 

            Class.forName("Class1");   // Class1 is not defined 

        } 

        catch(java.lang.ClassNotFoundException e){ 

            System.out.println(e); 

            System.out.println("Class Not Found..."); 

        }
  }
}
 

