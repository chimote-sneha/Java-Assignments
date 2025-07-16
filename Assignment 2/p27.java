import java.util.Scanner;
class P1{
    public static void main(String agrs[]){
        Scanner sc= new Scanner(System.in);
      
        System.out.println("Enter the value of lenght of tile : ");
        int l=sc.nextInt();
        System.out.println(" the value of lenght of tile : "+l);
        System.out.println("Enter the value of breath of tile : ");
        int b=sc.nextInt();
        System.out.println(" the value of breath of tile : "+b);
        int price=l*b*5;
        System.out.println("cost of tiling  is : "+price);
    }
}