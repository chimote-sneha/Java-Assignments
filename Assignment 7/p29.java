/*Suppose A, B, C are arrays of integers of size M, N, and M + N respectively. The numbers in array A appear in ascending order while the numbers in array B appear in descending order. Write a java progtam to produce third array C by merging arrays A and B in ascending order. .  */


import java.util.*;
class p1 {
    public static void main(String[] args) {
        // Array A in ascending order
        int[] A = { 10, 20, 30, 40, 50 };
        // Array B in descending order
        int[] B = { 90, 80, 70, 60 };

        int M = A.length;
        int N = B.length;
        int[] C = new int[M + N];

        // Copy A into C
        for (int i = 0; i < M; i++) {
            C[i] = A[i];
        }

        // Copy B into C (after A)
        for (int j = 0; j < N; j++) {
            C[M + j] = B[j];
        }

        // Sort C in ascending order
        Arrays.sort(C);

        // Display arrays
        System.out.println("Array A (Ascending): " + Arrays.toString(A));
        System.out.println("Array B (Descending): " + Arrays.toString(B));
        System.out.println("Merged Array C (Ascending): " + Arrays.toString(C));
    }
}
