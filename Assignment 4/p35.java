/**35) WAP to count number of digits */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int count = 0;

        while(num != 0){
         num /=10;
         count++;
        }
        System.out.println("count : "+count);
    }
}