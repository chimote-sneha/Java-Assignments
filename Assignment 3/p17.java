import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght of the rectangle : ");
        int l=sc.nextInt();
        System.out.println("Enter the breath of the reactangle : ");
        int b=sc.nextInt();
        int area=l*b;
        System.out.println("Area of the rectangle : "+area);
    }
}