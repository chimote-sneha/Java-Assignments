import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of the first subject : ");
        double f1=sc.nextDouble();
        System.out.println("Enter the marks of the second subject  : ");
        double f2=sc.nextDouble();
        System.out.println("Enter the marks of the thrid subject : ");
        double f3=sc.nextDouble();
        double percentage =((f1+f2+f3)/300)*100;
        System.out.println("Percentage of the Students is : "+percentage);
    }
}