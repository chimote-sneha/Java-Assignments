/**39) WAP to check whether entered number is strong or not 
 * A Strong Number is a number whose sum of the factorials of its digits is equal to the original number.
*/
import java.util.Scanner;

class p1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            int i = 1;
            while (i <= digit) {
                fact *= i;
                i++;
            }

            sum += fact;
            temp /= 10;
        }

        if (sum == num)
            System.out.println(num + " is a Strong Number.");
        else
            System.out.println(num + " is NOT a Strong Number.");

    
    }
}
