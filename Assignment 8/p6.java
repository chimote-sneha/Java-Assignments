class p1{
    public static void main(String args[]){
         int arr[][]={
            {1,2,3,4},
            {3,1,2,6},
            {8,9,0,1}
        };
        int row1=0;
        int row2=0;
        int row3=0;
        int row4=0;
        //int max = arr[r][c];
        for(int r = 0; r<3;r++){
            for(int c = 0; c<3; c++){
               if(r==0)
                row1 +=arr[c];
               
               if(r==1)
                row2 +=arr[c];
                 if(r==2)             
                row3 +=arr[c];
               
              if(r==3)
                row4 +=arr[c];
            }   
           
        if(row1 > row2 && row1 > row3 && row1 > row4)
        System.out.println("row 1 sum is greater");

        if(row2 > row1 && row2 > row3 && row2 > row4 )
        System.out.println("row 2 sum is greater");

         if(row3 > row1 && row3 > row2 && row3 > row4 )
        System.out.println("row 3 sum is greater");

        if(row4 > row1 && row4 > row2 && row4 > row3)
        System.out.println("row 4 sum is greater");


        }

    }
}