/**26) 0	8	64	216	………… */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of the series : ");
        int n = sc.nextInt();
        int i = 0;
        while(i <=n){
            System.out.println(i*i*i);
            i += 2;
        }
    }
}