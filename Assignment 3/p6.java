import java.util.Scanner;
import java.lang.Math;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer (positive or negative) : ");
        int num=sc.nextInt();
        if(num>=0){
            System.out.println("The absolute number is : "+ num);
        }
        else if(num<0){
            num= Math.abs(num);
            System.out.println("The absolute number is : "+num);
        }
        else
        System.out.println("please enter only integer value");
    }
}