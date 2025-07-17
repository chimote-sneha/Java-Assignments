
import java.util.Scanner;
class P1{
    
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int a,b,c;
            System.out.println("Enter the value of a");
            a=sc.nextInt();
            System.out.println("Enter the value of b");
            b=sc.nextInt();
            c=a;
            a=b;
            b=c;
            System.out.println("Value of a is "+a);
            System.out.println("Value of b is "+b);
            System.out.println("Value of c is "+c);
       

            
        }
    
}