/**24) 0	4	16	36	64	….. */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of the series : ");
        int n = sc.nextInt();
        int i = 0;
        while(i <=n){
            System.out.println(i*i);
            i += 2;
        }
    }
}