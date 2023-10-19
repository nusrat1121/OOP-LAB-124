//Java program to demonstrate NullPointerException 
package com.mycompany.mavenproject17;
public class NullPointer {

    public static void main(String args[]) 

    { 

        try { 

            String a = null; //null value 

            System.out.println(a.charAt(0)); 

        } catch(NullPointerException e) { 

            System.out.println("NullPointerException.."); 

        } 

    } 
}
    

