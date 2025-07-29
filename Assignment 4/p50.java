/**50) WAP to find out all the palindrome numbers between two entered numbers */
import java.util.Scanner;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
         System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int num = start;

        System.out.println("Palindrome numbers between " + start + " and " + end + ":");
        while (num <= end) {
            int temp = num;
            int reverse = 0;
            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }
            if (num == reverse) {
                System.out.println(num);
            }

            num++;
        }
    }
}
