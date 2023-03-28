
package exception3;
import java.util.Scanner ;

public class Exception3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try {
        System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
    } 

        catch(ArithmeticException e) {
            System.out.println("Exception: Divisor cannot be zero ");
        }
        
    }
}
