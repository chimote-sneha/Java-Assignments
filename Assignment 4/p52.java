/**52) WAP to find out all the Armstrong numbers between two entered numbers */
class p1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        while (start <= end) {
            int temp = start, sum = 0, digitCount = 0;

            int countNum = temp;
            while (countNum > 0) {
                digitCount++;
                countNum /= 10;
            }

            int num = start;
            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digitCount);
                num /= 10;
            }

            if (sum == start)
                System.out.println(start);
            start++;
        }
    }
}
