/* 37. Write a java progrtam to implement insertion sort algorithm */

class p1 {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };

        System.out.print("Original Array: ");
        printArray(arr);

        // Insertion Sort Algorithm
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // current element
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.print("Sorted Array (Ascending): ");
        printArray(arr);
    }

    // Custom method to print array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
