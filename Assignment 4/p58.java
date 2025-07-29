/**58) WAP to convert decimal number into binary number without using array */
class p1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        int binary = 0, place = 1;

        while (num > 0) {
            int rem = num % 2;
            binary += rem * place;
            place *= 10;
            num /= 2;
        }

        System.out.println("Binary = " + binary);
    }
}
