/**Java program to find the second largest element in the array */

import java.util.Arrays;
class p1{
     static int findSecondLargest(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 4, 3, 2, 6 };
        System.out.println(findSecondLargest(arr));
    }
}