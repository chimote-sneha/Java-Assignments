//24. Write a Java program to swap first and last element of an integer 1-d array.
class p1 {
    public static void main(String[] args) {
        
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Swap first and last elements
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        System.out.println("\nArray after swapping first and last elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
