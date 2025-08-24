class p1{
    public static void main(String args[]){
        int arr[] = new int[5];
        arr[0] = 2;
		arr[1] = 10;
        arr[2] = 8;
        arr[3] = 5;
        arr[4] = 16;
        for(int i = 0; i<5; i++){
          if(arr[i]%5 == 0){
            arr[i] = 0;
          }
      }
      for(int i = 0; i<5; i++){
        System.out.println("Array is : "+arr[i]);
      }
    }
}