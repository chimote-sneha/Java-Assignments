/**48) WAP to find out the factors of all the numbers between two entered numbers */
import java.util.Scanner;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        int num = start;
        while (num <= end) {
            System.out.print("Factors of " + num + ": ");
            int i = 1;
            while (i <= num) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }

            System.out.println(); 
            num++;
        }
    }
}
