/**46) WAP to find out the sum of first and last digit of a user entered number  */
import java.util.Scanner;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        int sum = firstDigit + lastDigit;

        System.out.println("Sum of first and last digit: " + sum);
    }
}
