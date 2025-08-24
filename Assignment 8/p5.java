class p1{
    public static void main(String args[]){
        int arr[][]={
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        int Evensum = 0;
        int Oddsum =0;
        for(int r = 0;r<3; r++ ){
            for(int c= 0;c<3; c++){
                if(arr[r][c]%2 == 0){
                    Evensum +=arr[r][c];
                     System.out.println("Sum of Even Element is : "+Evensum);
                }
                else{
                    Oddsum +=arr[r][c];
                     System.out.println("Sum of Odd Element is : "+Oddsum);
                }
            }
        }
    }
}