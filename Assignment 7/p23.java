/*23. Write a Java program to find the sum and average of one dimensional integer array */
class p1 {
        public static void main(String[] args) {
            // Fixed array (you can change values as needed)
            int[] arr = { 10, 20, 30, 40, 50 };
            int sum = 0;

            // Calculate sum
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }

            // Calculate average
            double average = (double) sum / arr.length;

            // Display results
            System.out.println("Array elements: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            System.out.println("\nSum of array elements = " + sum);
            System.out.println("Average of array elements = " + average);
        
    }
}
