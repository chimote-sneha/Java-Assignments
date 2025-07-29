/**53) WAP to print all the strong numbers between two entered numbers */
class p1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
    while (start <= end) {
            int sum = 0, temp = start;

            while (temp > 0) {
                int digit = temp % 10;
                int fact = 1, i = 1;
                while (i <= digit) {
                    fact *= i;
                    i++;
                }
                sum += fact;
                temp /= 10;
            }

            if (sum == start)
                System.out.println(start);
            start++;
        }
    }
}
