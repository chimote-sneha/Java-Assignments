/**42) WAP to find out HCF of a number */
import java.util.Scanner;

class p1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("HCF is: " + a);
    }
}
