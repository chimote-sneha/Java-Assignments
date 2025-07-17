import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of first person : ");
        int p1=sc.nextInt();
         System.out.println("Enter the age of second person : ");
        int p2=sc.nextInt();
         System.out.println("Enter the age of third person : ");
        int p3=sc.nextInt();

        if(p1>p2){
            if(p1>p3){
                System.out.println("Age of first person is greatest : ");
            }
            else{
                System.out.println("Age of the thrid person is greatest");
            }
        }
        else{
            System.out.println("Age of second person is greatest ");
        }
    }
}