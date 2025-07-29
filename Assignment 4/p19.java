/**19) 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum) */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of series : ");
        int n = sc.nextInt();
        int i = 1;
        double sum = 0;
        while(i <= n){
            sum += (1.0/i);
            System.out.println(sum);
            i++;
        }
    }
}