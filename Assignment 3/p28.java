import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to perform");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition of " + a + " and " + b + " is" + (a + b) );
                break;

            case 2:
                System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b) );
                break;

            case 3:
                System.out.println("Multiplication of " + a + " and " + b + " is" + (a * b) );
                break;

            case 4:
                System.out.println("Division of " + a + " and " + b + " is" + (a / b) );
                break;     
        }
    }
}