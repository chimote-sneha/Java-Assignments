class p1{
    public static void main(String args[]){
        int[] arr = new int[20];
        arr[0] = 2;
		arr[1] = 10;
        arr[2] = 8;
        arr[3] = 5;
        arr[4] = 16;
        
        int n = 6, key = 26;
        System.arraycopy(arr, 0, arr, 0, n);

        System.out.print("Before Insertion: ");
       
        for (int i = 0; i < n; i++) 
        System.out.print(arr[i] + " ");

        if (n < arr.length) 
        arr[n++] = key;

        System.out.print("\nAfter Insertion: ");
       
        for (int i = 0; i < n; i++) 
        System.out.print(arr[i] + " ");
    }
}

