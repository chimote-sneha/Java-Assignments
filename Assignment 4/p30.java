/**30) 1+11+111+1111+11111+….  */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of the series : ");
        int n = sc.nextInt();
        int i =1;
        int num = 0;
        while(i <= n){
        num += num*10+1;
        System.out.println(num);
        i++;
        }
    }
}