/**20) 0	7	14	21	28	35	….. */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of series : ");
        int n = sc.nextInt();
        int i = 0;
        while(i <= n){
        System.out.println(7*i);
        i++;
        }
    }
}