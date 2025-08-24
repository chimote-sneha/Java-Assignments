// Q.1 Peak an element

// An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
// Given an array arr[] of size N, find the index of any one of its peak elements.
// Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.

// Example 1:
// Input:
// N = 3
// arr[] = {1,2,3}
// Output: 1
// Explanation: index 2 is 3.
// It is the peak element as it is 
// greater than its neighbour 2.
// Example 2:
// Input:
// N = 2
// arr[] = {3,4}
// Output: 1
// Explanation: 4 (at index 1) is the 
// peak element as it is greater than 
// its only neighbour element 3.
// Constraints:
// 1 ≤ N ≤ 105
// 1 ≤ A[] ≤ 106



import java.util.Scanner;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the array size: ");
        int N = sc.nextInt();

        // Edge case: array size must be at least 1
        if (N <= 0) {
            System.out.println(0);
            sc.close();
            return;
        }

        int[] arr = new int[N];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = -1;

        for (int i = 0; i < N; i++) {
            if (N == 1) {
                // Only one element is always a peak
                peakIndex = 0;
                break;
            } else if (i == 0) {
                // First element, check only with right neighbor
                if (arr[i] >= arr[i + 1]) {
                    peakIndex = i;
                    break;
                }
            } else if (i == N - 1) {
                // Last element, check only with left neighbor
                if (arr[i] >= arr[i - 1]) {
                    peakIndex = i;
                    break;
                }
            } else {
                // Middle elements, check both neighbors
                if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                    peakIndex = i;
                    break;
                }
            }
        }

        // Output as per the requirement: 1 if peak exists
        if (peakIndex != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}


