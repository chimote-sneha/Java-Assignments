// . Write a Java program to reverse the element of an integer 1-D array.

class p1 {
    public static void main(String[] args) {
        // Fixed array
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("\nArray after reversing:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}