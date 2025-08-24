/* 3. Write a java program to impelment binary search algorithm */

class p1 {
    public static void main(String[] args) {
        // Sorted array (ascending order)
        int[] arr = { 5, 15, 25, 35, 45, 55, 65, 75 };

        int val = 45; 
        int low = 0, high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == val) {
                found = true;
                break;
            } else if (arr[mid] < val) {
                low = mid + 1; // search in right half
            } else {
                high = mid - 1; // search in left half
            }
        }

        // Display array
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Result
        System.out.println("\nSearching for value: " + val);
        if (found) {
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found!");
        }
    }
}