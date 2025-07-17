import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost price of the bike : ");
        double price=sc.nextInt();
        if(price > 100000){
            double tax=price*(15.0/100);
            System.out.println("Road tax is : "+tax);
        }
        else if(price >50000 && price <=100000 ){
            double tax=price*(10.0/100);
            System.out.println("Road tax is : "+tax);
        }
       else  if(price  <=50000){
            double tax=price*(5.0/100);
            System.out.println("Road tax is : "+tax);
        }
        else
        System.out.println("Enter valid price : ");

    }
}