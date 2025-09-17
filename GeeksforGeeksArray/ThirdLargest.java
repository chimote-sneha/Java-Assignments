//java program to find third largest element of the array

import java.util.Arrays;
class p1 {
    static int findThirdLargest(int[] arr) {
         int n = arr.length;
         int largest = Integer.MIN_VALUE;
         int secondlaegest = Integer.MIN_VALUE;
         int thirdlargest = Integer.MIN_VALUE;

         for (int i = 0; i < n; i++) {
             if (arr[i] > largest) {
                 thirdlargest = secondlaegest;
                 secondlaegest = largest;
                 largest = arr[i];
             }
         }
             for(int i = 0 ; i < n; i++){
               if(arr[i] > secondlaegest && arr[i] != largest) {
                 thirdlargest = secondlaegest;
                 secondlaegest = arr[i];
               }
             } 
             
             for(int i = 0 ; i < n; i++){
             if(arr[i] > thirdlargest && arr[i] != secondlaegest && arr[i] != largest) {
                 thirdlargest = arr[i];
             }
            }
            
            return thirdlargest;
        }
    
     public static void main(String[] args) {
         int[] arr = { 3, 49, 28, 4, 87, 2, 47 };
         System.out.println(findThirdLargest(arr));
     }
}
