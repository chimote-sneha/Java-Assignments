import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if((n & 1) == 0)
        System.out.println(n + " is even");
        else
        System.out.println(n + " is odd");
        }

}