//write a program to find minimum and maximum in array
import java.util.Scanner;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Handle invalid size
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize min and max with the first element
        int min = arr[0];
        int max = arr[0];

        // Loop through the array to find min and max
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Output the result
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

        sc.close();
    }
}
