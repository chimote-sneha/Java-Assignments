/**18) 1	2	2	4	8	32	…… n terms */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of series : ");
        int n = sc.nextInt();
        int i = 1, term1 = 1 ,term2 = 2;
        while(i <= n){
            
            long nextterm = term1*term2;
            term1 = term2;
            term2 = nextterm;
            System.out.println(nextterm);
            i++;
        }
    }
}