/**1) WAP to count no. Of even and odd digits in a number */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
      int even = 0, odd = 0;

        while(num != 0){
         int digits = num *10;
        if(digits%2 == 0)
        even++;
        else
        odd++;
         num/=10;
        }
        System.out.println("count : "+"even : "+even+" odd : "+odd);
    }
}