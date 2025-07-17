import java.util.Scanner;
class P1{
    public static void main(String agrs[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        int r=sc.nextInt();
        if(r>0){
            double area=3.14*r*r;
            System.out.println("Area of the circle is : "+area);
        }
        else
        System.out.println("Please enter valid input  ");
    }
}