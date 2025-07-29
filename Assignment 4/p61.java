/**61) WAP to find out all the leap years between two entered years */
class p1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter starting year: ");
        int start = sc.nextInt();
        System.out.print("Enter ending year: ");
        int end = sc.nextInt();

        while (start <= end) {
            if ((start % 4 == 0 && start % 100 != 0) || (start % 400 == 0))
                System.out.println(start);
            start++;
        }
    }
}
