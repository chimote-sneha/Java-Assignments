import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght of the cuboid : ");
        int l=sc.nextInt();
        System.out.println("Enter the breath of the cuboid : ");
        int b=sc.nextInt();
        System.out.println("Enter the height of the cuboid : ");
        int h=sc.nextInt();
        int cvol=l*b*h;
         System.out.println("Enter the side of the cube : ");
        int s=sc.nextInt();
        int cubev=s*s*s;
        int noBox=cvol/cubev;
        System.out.println("no. of cube box : "+noBox);

    }
}