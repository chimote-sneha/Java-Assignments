/**51) WAP to reverse all the numbers between two entered numbers */
import java.util.Scanner;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        while (start <= end) {
            int temp = start, rev = 0;
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            System.out.println("Reverse of " + start + " is " + rev);
            start++;
        }
    }
}
