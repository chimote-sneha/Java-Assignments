/** 28. P is one-dimensional array of integers. Write a Java program search for a data VAL from P. If VAL is present in the array then “element found ” otherwise “element not found” should be displayed. */

class p1 {
    public static void main(String[] args) {
        
        int[] P = { 15, 28, 34, 42, 56, 78, 90 };

        int VAL = 42; 
        boolean found = false;

        // Search using for loop
        for (int i = 0; i < P.length; i++) {
            if (P[i] == VAL) {
                found = true;
                break;
            }
        }

        // Display array
        System.out.println("Array elements:");
        for (int num : P) {
            System.out.print(num + " ");
        }

        // Display result
        System.out.println("\nSearching for value: " + VAL);
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
