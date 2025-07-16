import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of lenght of path : ");
        int l=sc.nextInt();
        System.out.println(" the value of lenght of path : "+l);
        System.out.println("Enter the value of breath of path : ");
        int b=sc.nextInt();
        System.out.println(" the value of breath of path : "+b);
        int area=l*b;
       
        System.out.println("Enter the value of lenght of brick : ");
        int bl=sc.nextInt();
        System.out.println(" the value of lenght of brick : "+l);
        System.out.println("Enter the value of breath of brick : ");
        int bb=sc.nextInt();
        System.out.println(" the value of breath of brick : "+b);
        int areabrick=bl*bb;
        int brickNo=area/areabrick;
        System.out.println("No. OF THE  BRICKS : "+brickNo);

    }
}