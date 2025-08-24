/* 35. Write a java program to implement selection sort algoritm*/

class p1 {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original Array: ");
        printArray(arr);

        // Selection Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
