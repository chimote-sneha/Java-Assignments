/**59) WAP to find out the sum of all integer between 100 and 200 which are divisible by 9 */
class p1 {
    public static void main(String[] args) {
        int sum = 0, i = 100;
        while (i <= 200) {
            if (i % 9 == 0)
                sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
