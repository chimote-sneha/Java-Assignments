import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of the student  : ");
        int marks=sc.nextInt();
        if(marks>0 && marks <=25)
         System.out.println("You are fail : F");
        if(marks>26 && marks<=45)
         System.out.println("You are okay : E");
        if(marks>46 && marks<=50)
         System.out.println("You are good : D");
        if(marks>51 && marks<=60)
         System.out.println("You are very good : C");
        if(marks>61 && marks<=80)
         System.out.println("You are excellent : B");
        if(marks<81 && marks>=100)
         System.out.println("You are outstanding : A");
       
         System.out.println("Congratulations !!");
    }
}