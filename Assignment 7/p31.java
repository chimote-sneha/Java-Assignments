/*32. Given two arrays of integers A and B of sizes M and N respectively. Write a Write a java program, which will produce a third array named C. such that the following sequence is followed. 
All even numbers of A from left to right are copied into C from left to right. 
All odd numbers of A from left to right are copied into C from right to left. 
All even numbers of B from left to right are copied into C from left to right. 
All old numbers of B from left to right are copied into C from right to left.
  */

  import java.util.*;
class p1 {
    public static void main(String[] args) {
        int[] A = { 10, 15, 20, 25 };
        int[] B = { 30, 35, 40, 45, 50 };

        int M = A.length;
        int N = B.length;
        int[] C = new int[M + N];

        int left = 0; // pointer for left-to-right filling
        int right = C.length - 1; // pointer for right-to-left filling

        // Step 1: Even numbers of A → left to right
        for (int i = 0; i < M; i++) {
            if (A[i] % 2 == 0) {
                C[left++] = A[i];
            }
        }

        // Step 2: Odd numbers of A → right to left
        for (int i = 0; i < M; i++) {
            if (A[i] % 2 != 0) {
                C[right--] = A[i];
            }
        }

        // Step 3: Even numbers of B → left to right
        for (int i = 0; i < N; i++) {
            if (B[i] % 2 == 0) {
                C[left++] = B[i];
            }
        }

        // Step 4: Odd numbers of B → right to left
        for (int i = 0; i < N; i++) {
            if (B[i] % 2 != 0) {
                C[right--] = B[i];
            }
        }

        // Display arrays
        System.out.println("Array A: " + Arrays.toString(A));
        System.out.println("Array B: " + Arrays.toString(B));
        System.out.println("Array C (Final): " + Arrays.toString(C));
    }
}
