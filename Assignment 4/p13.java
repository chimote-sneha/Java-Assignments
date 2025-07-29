/**13) WAP to print N natural numbers in reverse order */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit od series : ");
        int n = sc.nextInt();
        int i = 1;
        while(n >= i){
            System.out.println("reversed : "+n);
            n--;
        }
    }
}