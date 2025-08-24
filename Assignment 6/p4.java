import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        arr[0] = 2;
	     	arr[1] = 4;
        arr[2] = 8;
        arr[3] = 12;
        arr[4] = 16;
        for(int i = 0; i<5; i++){
        System.out.println("Array is : "+arr[i]);
      }
      System.out.println("Enter the element to found : ");
      int ele = sc.nextInt();
      for(int i = 0; i<5; i++){
        if(ele == arr[i])
        break;
      }
      if(ele < 5)
      System.out.println("Element found at :");
      else
        System.out.println("Element is not found");

    }
}