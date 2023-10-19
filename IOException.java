// Java program to demonstrate IOException 
package com.mycompany.mavenproject15;

import java.util.Scanner;

public class IOException {
 
    public static void main(String[] args) 

    { 
        // Print the line
        try ( // Create a new scanner with the specified String
        // Object
                Scanner scan = new Scanner("Hello Jeny!")) {
            // Print the line
            
            System.out.println("" + scan.nextLine());
            
            
            // Check if there is an IO exception
            
            System.out.println("Exception Output: "
                    
                    + scan.ioException());
        } 

    } 
}   

