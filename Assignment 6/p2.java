class p1{
    public static void main(String args[]){
        int arr[] = new int[5];
        arr[0] = 2;
		arr[1] = 4;
        arr[2] = 8;
        arr[3] = 12;
        arr[4] = 16;
        int i, sum = 0;
        for(i = 0; i< 5 ; i++){
            sum+=arr[i];
            System.out.println("Sum of array is : "+sum);
        }
    }
}