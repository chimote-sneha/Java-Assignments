import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the percentage of the student : ");
        int marks=sc.nextInt();
        if(marks>90 )
         System.out.println("Your are grade : A");
        else if(marks>80 && marks<=90)
         System.out.println("Your are grade : B");
        else if(marks>60 && marks<=80)
         System.out.println("Your are grade : C");
        else if(marks<60)
         System.out.println("Your are grade : D");
        else
        System.out.println("You are fail : ");

        System.out.println("Congratulaions !!");
    }
} 