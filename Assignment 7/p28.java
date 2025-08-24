/* Suppose a one-dimensional array AR containing integers is arranged in ascending order. Write a java program to search for an integer from AR with the help of Binary search method, */
class p1 {
    public static void main(String[] args) {
       
        int[] AR = { 5, 12, 23, 34, 45, 56, 67, 78, 89, 100 };

        int VAL = 45; 
        int low = 0, high = AR.length - 1;
        boolean found = false;

        // Binary Search algorithm
        while (low <= high) {
            int mid = (low + high) / 2;

            if (AR[mid] == VAL) {
                found = true;
                break;
            } else if (AR[mid] < VAL) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

    
        System.out.println("Array elements:");
        for (int num : AR) {
            System.out.print(num + " ");
        }

      
        System.out.println("\nSearching for value: " + VAL);
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
