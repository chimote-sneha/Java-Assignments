 import java.util.Scanner;
 class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        System.out.println("Enter the element to be found: ");
        int target = sc.nextInt();
        int left = 0;
        int right = arr.length - 1;
       

        for (left = 0; left <= right;left++ ) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                
                break;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (left > right) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found  " );
        }
    }
}