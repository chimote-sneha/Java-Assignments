import java.util.Scanner;
class P1{
    public static void main(String main[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the four digit number : ");
        int num=sc.nextInt();
        if(num>=1000 && num<=9999){
            int rev=0;
            int digit1=num%10;
            rev= rev*10+digit1;
            num=num/10;
           
        
            int digit2=num%10;
            rev= rev*10+digit2;
            num=num/10;

            
            int digit3=num%10;
            rev= rev*10+digit3;
            num=num/10;
           
           
            int digit4=num%10;
            rev= rev*10+digit4;
            num=num/10;

      System.out.println("Reversed Number is : "+rev);
        }
        else
        System.out.prinln("Please Enter the Numbers only ");
    }
}