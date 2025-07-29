/**17) 1 	2	 4	 7	 11	 16 	…… n terms */
import java.util.Scanner;
class p1{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of series : ");
        int n = sc.nextInt();
        int i = 1, val = 1, inc = 1;
        while(i <= n){
            System.out.println(val);
            val += inc;
            inc++;
            i++;

        }
    }

}