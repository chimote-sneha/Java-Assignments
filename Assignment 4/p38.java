/**38) WAP to check whether entered number is Armstrong or not 
 * An Armstrong Number (also known as a narcissistic number) is a number that is equal to the sum of its digits raised to the power of the number of digits.
*/
import java.util.Scanner;

class p1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int count = 0;
        int temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int sum = 0;
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count); 
            temp /= 10;
        }
        if (sum == original) 
            System.out.println(original + " is an Armstrong Number.");
        else 
            System.out.println(original + " is not an Armstrong Number.");
        
    }
}
