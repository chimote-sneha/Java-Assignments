import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle");
        int a = sc.nextInt();
        System.out.println("Enter the second side of the triangle");
        int b = sc.nextInt();
        System.out.println("Enter the third side of the triangle");
        int c = sc.nextInt();
        if(a==b && b==c)
        {
            System.out.println("The triangle is equilateral");
        }
        else if(a==b || b==c || a==c)
        {
            System.out.println("The triangle is isosceles");
        }
         else
        {
            System.out.println("The triangle is scalene");
        }

    }
}