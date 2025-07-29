/**57) WAP to print all the prime numbers between two entered numbers */
class  p1{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();

        while (start <= end) {
            int i = 2, isPrime = 1;

            if (start < 2) {
                isPrime = 0;
            } else {
                while (i <= start / 2) {
                    if (start % i == 0) {
                        isPrime = 0;
                        break;
                    }
                    i++;
                }
            }

            if (isPrime == 1)
                System.out.println(start);

            start++;
        }
    }
}
