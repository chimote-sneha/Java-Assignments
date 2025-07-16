import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght of the floor : ");
        int fl=sc.nextInt();
        System.out.println("Enter the breath of the floor : ");
        int fb=sc.nextInt();
        
        int fa=fl*fb;
        System.out.println("Enter the lenght of the tile : ");
        int tl=sc.nextInt();
        System.out.println("Enter the breath of the tile : ");
        int tb=sc.nextInt();
        int ta=tl*tb;
        int noTile=fa/ta;
        System.out.println("no. of  tile : "+noTile);

    }
}