//Q.6 Find occurance of an integer number in array.
import java.util.Scanner;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Validate array size
        if (n <= 0) {
            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input number to find
        System.out.print("Enter the number to find its occurrence: ");
        int target = sc.nextInt();

        int count = 1;

        // Count occurrences manually
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        // Output the result
        System.out.println("The number " + target + " occurs " + count + " time(s) in the array.");

        sc.close();
    }
}
