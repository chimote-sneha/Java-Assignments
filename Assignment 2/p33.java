import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the value of side  of garden : ");
        int l=sc.nextInt();
        int area=l*l;
        System.out.println("Area of garden is : "+area);
         System.out.println("Enter the value of side  of path : ");
         int p=sc.nextInt();
         int patharea=p*p;
         int Garea=area-patharea;
         System.out.println("Area of garden used is : "+Garea);
    }
}