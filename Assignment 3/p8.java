import java.util.Scanner;
/**/ 
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of class held : ");
        int cHeld=sc.nextInt();
        System.out.println("Number of classes attented : ");
        int cAttend=sc.nextInt();
         double attend=(cAttend*100)/cHeld;
          if(attend >= 75) {
            System.out.println("Allowed to sit in exam");
             System.out.println("your attendence is : "+attend);
        } else {
            System.out.print("Do you have medical cause (Y/N)? ");
            char med = sc.next().charAt(0);

            if(med == 'Y' || med == 'y') {
                System.out.println("Allowed due to medical reason");
                 System.out.println("your attendence is : "+attend);
            } else {
                System.out.println("Not allowed to sit in exam");
            }
        }
    }
}