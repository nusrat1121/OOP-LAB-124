// Java Program to check how
// interrupt () method  works
// simultaneously while a thread stops working

package com.mycompany.mavenproject22;

public class CheckInterruptionextendsThread {
    public void run ()
{
try {
Thread.sleep (2000);
System.out.println ( "We are checking Interrupted Exception");
}
catch (InterruptedException e) {
throw new RuntimeException ( "Thread is" + "interrupted");
}
}
    
public static void main (String args[])
{
CheckInterruption t1 = new CheckInterruption ();
t1.start ();
try {
t1.interrupt ();
}
catch (Exception e) {
System.out.println ("Exception handled");
}
}

    private static class CheckInterruption {

        public CheckInterruption() {
        }

        private void start() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void interrupt() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}

