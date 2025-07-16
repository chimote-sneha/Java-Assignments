import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of lenght of rectangle : ");
        int l=sc.nextInt();
        System.out.println(" the value of lenght of rectangle : "+l);
        System.out.println("Enter the value of breath of rectangle : ");
        int b=sc.nextInt();
        System.out.println(" the value of breath of rectangle : "+b);
        int path=100*l*b;
        System.out.println("Area of path is : "+path);
    }
}