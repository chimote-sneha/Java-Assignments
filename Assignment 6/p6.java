class p1{
    public static void main(String args[]){
        int arr[] = new int[5];
        arr[0] = 2;
		arr[1] = 10;
        arr[2] = 18;
        arr[3] = 15;
        arr[4] = 16;
       int temp = 0;
        for(int i = 0; i<5; i++){
         for(int j=i+1;j<5;j++){
           
            if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
         }
         }
        for(int i =0;i<5;i++)
        System.out.println("Array is : "+arr[i]);
      }
    }
