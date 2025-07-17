import java.util.Scanner;
class P1{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the leap year : ");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("The year is a leap year : ");
        }
        else
        System.out.println("The year is not leap year : ");
    }
}