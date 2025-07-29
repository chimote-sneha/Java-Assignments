/** 54) WAP to print all the even numbers between two entered numbers*/
class p1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();

        while (start <= end) {
            if (start % 2 == 0)
                System.out.println(start);
            start++;
        }
    }
}
