import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        for(i = 0;i<n; i++){
            System.out.println("Enter the "+ arr[i]+" elemnent of array : ");
           arr[i] = sc.nextInt();
        }
        for(i = 0; i<n; i++){
            System.out.println("Array element are : "+arr[i]);
        }
        
    }
}