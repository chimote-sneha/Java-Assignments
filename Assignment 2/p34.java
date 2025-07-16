import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two bases of the trapezoid : ");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        System.out.println("Enter the height of the trapezoid : ");
        int h = sc.nextInt();
        double area = (a1 + a2) * h / 2;
        System.out.println("Enter the width of the walkway");
        int tw=sc.nextInt();
        int walkway=h*tw;
        double woodArea=area-walkway;
        System.out.println("wooded area : "+woodArea);
    }
}