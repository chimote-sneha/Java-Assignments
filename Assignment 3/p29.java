import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        System.out.println("Enter third number");
        int n3 = sc.nextInt();
        System.out.println("Enter fourth number");
        int n4 = sc.nextInt();
        if(n1<n2 && n1<n3 && n1<n4)
        System.out.println("Lowest number is "+n1);
        else if(n2<n1 && n2<n3 && n2<n4)
        System.out.println("Lowest number is "+n2);
        else if(n3<n1 && n3<n2 && n3<n4)
        System.out.println("Lowest number is "+n3);
        else if(n4<n1 && n4<n3 && n4<n2)
        System.out.println("Lowest number is "+n4);
        else
        System.out.println("INVALID OUTPUT !!");
    }
}