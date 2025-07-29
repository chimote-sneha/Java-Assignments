/**44) WAP to interchange first and last digit of a number */
import java.util.Scanner;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int lastDigit = num % 10;
        int digits = 0;
        int temp = num;
        int firstDigit = 0;
        int middlePart = 0;
        while (temp > 0) {
            firstDigit = temp % 10;
            temp /= 10;
            digits++;
        }
        if (digits == 1) 
            System.out.println("Number after swapping: " + num);
        else 
            middlePart = (num % (int)Math.pow(10, digits - 1)) / 10;

            int newNumber = lastDigit * (int)Math.pow(10, digits - 1) + 
                            middlePart * 10 + 
                            firstDigit;

            System.out.println("Number after swapping first and last digits: " + newNumber);
        

       
    }
}
