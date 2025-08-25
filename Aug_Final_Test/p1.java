/**Write a Java program to remove duplicate elements from an array and print the unique elements.
Example:

Input: [1, 2, 2, 3, 4, 4, 5]
Output: [1, 2, 3, 4, 5] */

class duplicate{
     private int arr[] = {1,2,2,3,4,4,5};;

     public duplicate(){
       this.arr = arr;
     }
    
    public void removeDuplicate(){
        for(int i = 0 ; i < 7; i++){
            for(int j=i+1 ; j <7; j++){
                if(arr[i] == arr[j]){
                    arr[i] = '\0';
                    break;
                }
            }
        }   
    }

    public void displayArray(){
        removeDuplicate();
        for(int i = 0; i < 7; i++){
            System.out.println(arr[i]);
        }
    }
}
class Main{
    public static void main(String args[]){
        duplicate d = new duplicate();
        d.displayArray();

    }
}