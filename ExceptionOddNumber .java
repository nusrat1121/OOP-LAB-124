// Lab assignment 2, task 2
package com.mycompany.mavenproject27;
public class ExceptionOddNumber {
  public static void main(String[] args) {
   int n;
    n = 11;
    checknumber(n);
  }

  public static void checknumber(int n) {
    try {
      checkEvenNumber(n);
      System.out.println(n + " is even.");
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void checkEvenNumber(int number) {
    if (number % 2 != 0) {
      throw new IllegalArgumentException(number + " is odd.");
    }
  }
}   
