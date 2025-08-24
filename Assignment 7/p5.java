/**Q.5 Find the kth largest and kth smallest element in array. */ 
import java.util.Scanner;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Validate size
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

        // Input value of k
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        if (k <= 0 || k > n) {
            System.out.println("Invalid value of k.");
            sc.close();
            return;
        }

        // Sort the array using Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // kth smallest is at index k-1, kth largest is at index n-k
        int kthSmallest = arr[k - 1];
        int kthLargest = arr[n - k];

        System.out.println("Kth Smallest element: " + kthSmallest);
        System.out.println("Kth Largest element: " + kthLargest);

        sc.close();
    }
}

