import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght of the floor : ");
        int l=sc.nextInt();
        System.out.println("Enter the breath of the floor : ");
        int b=sc.nextInt();
        
        int ca=l*b;
         System.out.println("Enter the side of the tile : ");
        int s=sc.nextInt();
        int cubea=s*s;
        int noTile=ca/cubea;
        System.out.println("no. of cube tile : "+noTile);

    }
}