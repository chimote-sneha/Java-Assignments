/**49) WAP to find out all the perfect numbers between two entered numbers */
import java.util.Scanner;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        int num = start;
        System.out.println("Perfect numbers between " + start + " and " + end + ":");
        while (num <= end) {
            int sum = 0;
            int i = 1;

            while (i < num) {
                if (num % i == 0) {
                    sum += i;
                }
                i++;
            }

            if (sum == num && num != 0) 
                System.out.println(num);
            
        num++;
        }
    }
}
