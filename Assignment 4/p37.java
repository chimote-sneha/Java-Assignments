/**37) WAP to check whether entered number is palindrome or not */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int og = num, reverse = 0;
         while (num != 0) {
            int digit = num % 10;        
            reverse = reverse * 10 + digit; 
            num = num / 10;              
        }
if(og == reverse)
System.out.println("palindrome");
else
System.out.println("Not palindrome");
    }

}