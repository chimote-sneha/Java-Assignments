/**60) WAP to print Square, Cube and Square Root of all numbers from 1 to N */
class p1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            System.out.println("Number: " + i +
                               ", Square: " + (i * i) +
                               ", Cube: " + (i * i * i) +
                               ", Square Root: " + Math.sqrt(i));
            i++;
        }
    }
}
