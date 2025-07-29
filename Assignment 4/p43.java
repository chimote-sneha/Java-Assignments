/**43) WAP to convert binary number into decimal number 
 * 
*/
import java.util.Scanner;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        int decimal = 0, base = 1, remainder;

        while (binary > 0) {
            remainder = binary % 10;
            decimal += remainder * base;
            base *= 2;
            binary /= 10;
        }

        System.out.println("Decimal equivalent is: " + decimal);
        
    }
}
