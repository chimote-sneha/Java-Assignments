import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of lenght of garden : ");
        int l=sc.nextInt();
        System.out.println("Enter the value of breath of garden : ");
        int b=sc.nextInt();
        int ga=l*b;
         System.out.println("Enter the value of lenght of path : ");
        int pl=sc.nextInt();
        System.out.println("Enter the value of breath of path : ");
        int pb=sc.nextInt();
        int w=(l*pl)+(b*pb)-(pl*pb);
        int used=ga-w;
        System.out.println("The  used area of garden is : "+used);
    }
}