import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght of the rectangle : ");
        int l=sc.nextInt();
        System.out.println("Enter the breath of the rectangle : ");
        int b=sc.nextInt();
         if(l == b)
         System.out.println("it is a  square ");
         else
         System.out.println("It is a rectangle");
    }
}