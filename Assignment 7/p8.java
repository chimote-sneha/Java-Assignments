//Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.


class p1 {
    public static void main(String[] args) {
        int[] arr = { 2, -3, 1, -5, 6, -1, 4 };

        System.out.print("Original Array: ");
        printArray(arr);

        int n = arr.length;
        int[] result = new int[n];
        int index = 0;

        // First, add all positive (and zero) elements in order
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                result[index++] = arr[i];
            }
        }

        // Then, add all negative elements in order
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                result[index++] = arr[i];
            }
        }

        System.out.print("Modified Array: ");
        printArray(result);
    }

    // Simple method to print array without imports
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
