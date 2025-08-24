/*
 * 31. Suppose X. Y, Z are arrays of integers of size M, N, and M + N
 * respectively. The numbers in array X and Y appear in descending order. Write
 * a java program to produce third array Z by merging arrays X and Y in
 * descending order.
 */

import java.util.*;

class p1 {
    public static void main(String[] args) {
        // Arrays X and Y in descending order
        int[] X = { 90, 70, 50, 30 };
        int[] Y = { 100, 80, 60, 40, 20 };

        int M = X.length;
        int N = Y.length;
        int[] Z = new int[M + N];

        
        for (int i = 0; i < M; i++) {
            Z[i] = X[i];
        }

        
        for (int j = 0; j < N; j++) {
            Z[M + j] = Y[j];
        }

        
        Arrays.sort(Z);

        for (int i = 0; i < Z.length / 2; i++) {
            int temp = Z[i];
            Z[i] = Z[Z.length - 1 - i];
            Z[Z.length - 1 - i] = temp;
        }

    
        System.out.println("Array X (Descending): " + Arrays.toString(X));
        System.out.println("Array Y (Descending): " + Arrays.toString(Y));
        System.out.println("Merged Array Z (Descending): " + Arrays.toString(Z));
    }
}
