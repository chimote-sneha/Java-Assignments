/**56) WAP to print factorial of all the numbers between two entered numbers */
class p1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();

        while (start <= end) {
            int fact = 1, i = 1;
            while (i <= start) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + start + " = " + fact);
            start++;
        }
    }
}
