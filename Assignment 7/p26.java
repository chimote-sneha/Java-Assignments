 //26. Write a Java program to find the largest and smallest element of an array.

 class p1 {
     public static void main(String[] args) {
         // Fixed array
         int[] arr = { 25, 78, 12, 56, 89, 5, 42 };

         
         int largest = arr[0];
         int smallest = arr[0];

         // Traverse the array
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] > largest) {
                 largest = arr[i];
             }
             if (arr[i] < smallest) {
                 smallest = arr[i];
             }
         }

         // Display results
         System.out.println("Array elements:");
         for (int num : arr) {
             System.out.print(num + " ");
         }

         System.out.println("\nLargest element = " + largest);
         System.out.println("Smallest element = " + smallest);
     }
}
