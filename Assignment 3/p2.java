import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the cost of the purchased goods : ");
        int goods=sc.nextInt();
        if (goods>1000){
            int price=goods/100*10;
            System.out.println("the cost of the purchased goods is : "+price);
    }
        
        else
         System.out.println("the cost of the purchased goods is : "+goods);
    }
}
