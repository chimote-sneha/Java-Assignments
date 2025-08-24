/*4. Write a java program to implement linear search */

class p1 {
    public static void main(String[] args) {
       
        int[] arr = { 25, 10, 45, 30, 60, 15 };

        int val = 30; // value to search
        boolean found = false;

        // Linear Search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                found = true;
                break;
            }
        }


        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

     
        System.out.println("\nSearching for value: " + val);
        if (found) {
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found!");
        }
    } 
}
