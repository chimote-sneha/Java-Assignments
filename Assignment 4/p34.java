/**34) WAP to check whether entered number is perfect or not 
 * A Perfect Number is a number that is equal to the sum of its proper divisors, excluding itself.
*/
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0, i = 1;
        while (i < n) {
            if (n % i == 0) 
                sum += i;
            
            i++;
        }

        if (sum == n) 
            System.out.println(n + " is a Perfect Number.");
         else 
            System.out.println(n + " is not a Perfect Number.");
        
    }
}