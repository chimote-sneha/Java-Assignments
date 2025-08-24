class p1{
    public static void main(String args[]){
        int arr[] = new int[5];
        arr[0] = 2;
		arr[1] = 4;
        arr[2] = 8;
        arr[3] = 12;
        arr[4] = 16;
        int i;
        int Evensum = 0;
        int Oddsum = 0;
        for(i = 0; i< 5 ; i++){
            if(i%2 == 0){
                Evensum +=arr[i];
               
            }
            else{
                Oddsum +=arr[i];
               
            }
        }
        System.out.println("Even place sum : "+Evensum);
         System.out.println("Odd place sum : "+Oddsum);
    }
}