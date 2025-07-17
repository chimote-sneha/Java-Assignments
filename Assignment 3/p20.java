import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Before swapping");
         int a = sc.nextInt();
        int b = sc.nextInt();
        
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        }
        
    
}