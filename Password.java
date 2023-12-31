import java.util.Scanner;

public class Password {
  
public static final int PASSWORD_LENGTH = 10;

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("""
                         1. A password must have at least ten characters.
                         2. A password consists of only letters and digits.
                         3. A password must contain at least two digits. 
                         4. A password must contain a whitespace.
                         Input a password (You are agreeing to the above Terms and Conditions.): """);
        String s = input.nextLine();

        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }

    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int digit_Count = 0;
        int Whitespace = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) digit_Count++;
            else if (is_Letter(ch)) charCount++;
            else if (Character.isWhitespace(ch)){
                Whitespace++;
            }
            else return false;
        }
  
        return (charCount >= 2&& digit_Count >= 2 );
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');     
    }
    
    }  

