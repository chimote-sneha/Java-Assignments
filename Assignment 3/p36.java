import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle of the triangle");
        double a = sc.nextDouble();
        System.out.println("Enter the second angle of the triangle");
        double b = sc.nextDouble();
        System.out.println("Enter the third angle of the triangle");
        double c = sc.nextDouble();
        if(a+b+c==180 && a>0 && b>0 && c>0 &&a<180 && b<180 && c<180){
            System.out.println("The triangle is valid");
        }
         else{
                System.out.println("The triangle is not valid");
         }
    }

}