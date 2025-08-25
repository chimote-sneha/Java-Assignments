/**Write a Java program to find the second largest number in an array.

Example Input: {10, 5, 20, 8, 25, 3}

Example Output: Second Largest = 20 */

class secondLargest{
    
     int arr[] = {10, 5, 20, 8, 25, 3} ;
     
     
    public void sortArray(){
       for(int i = 0 ; i <= 5; i++){
        for(int j = 0 ; j <= 5 - i - 1 ; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
       }
    }

    public void findLargest(){
     int result = arr[5 - 2];
    System.out.println("Second Largest : "+ result);
    }
}

class Main{
    public static void main(String args[]){
    secondLargest sl = new secondLargest();
    sl.findLargest();
    }
}