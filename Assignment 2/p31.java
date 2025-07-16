import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the value of perimeter of Square : ");
         int p=sc.nextInt();
         int s=p/4;
         int area=s*s;
         System.out.println("Area of that square : "+area);
    }
}