import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of class held : ");
        int cHeld=sc.nextInt();
        System.out.println("Number of classes attented : ");
        int cAttend=sc.nextInt();
         double attend=(cAttend*100)/cHeld;
        if(attend>75){
            System.out.println("you can sit in exam : ");
            System.out.println("your attendence is : "+attend);
        }
        else{
            System.out.println("you cant sit in exam : ");
            System.out.println("your Attendence is : "+attend);
        }
    }
}