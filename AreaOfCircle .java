import java.util.Scanner;
public class AreaOfCircle {
   
   public static void main(String args[]) 
    { 
        int rad;
        double pie = 3.14,area;
       
        Scanner s = new 
         Scanner (System.in);        
        
         System.out.println("Enter radius of the circle ::");
         rad = s.nextInt();
         area = pie*rad*rad;
         System.out.println("Area of circle :"+area);
    }
}
         
