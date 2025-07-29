/**27) *	#	*	#	*	#	*	#	*	 */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of the series : ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            if(i%2 == 0) 
            System.out.println("#");
            else
            System.out.println("*");
            i++;
        }
    }
}