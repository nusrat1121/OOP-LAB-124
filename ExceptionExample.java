// lab assignment 2, task 1
package com.mycompany.mavenproject26;
   
   public class ExceptionExample {
  public static void main(String[] args) {
    try {
      int result = divideNumbers(7, 0);
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
  public static int divideNumbers(int dividend, int divisor) {
    if (divisor == 0) {
      throw new ArithmeticException("Cannot divide the given number by zero!");
    }
    return dividend / divisor;
  }
}
