import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice 'c' for celsius and 'f' for fahrenheit : ");
        char ch = sc.next().charAt(0);
        if(ch == 'c' || ch == 'C'){
            System.out.println("Enter temperature in Fahrenheit");
            int f = sc.nextInt();
            double c = (f - 32) * 5/9;
            System.out.println("Temperature in Celsius is : "+c);
            }
        else if(ch == 'f' || ch == 'F'){
                System.out.println("Enter temperature in Celsius");
                int c = sc.nextInt();
                double f = (c * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit is : "+f);
                }
        else{
             System.out.println("Invalid choice");

          }
    }

}