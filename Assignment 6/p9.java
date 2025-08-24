class p1{
    public static void main(String args[]){
         int arr[] = new int[5];
        arr[0] = 2;
		arr[1] = 10;
        arr[2] = 8;
        arr[3] = 5;
        arr[4] = 16;
        int n = arr.length, key = 30;

        System.out.print("Before Deletion: ");
        for (int i = 0; i < n; i++)
         System.out.print(arr[i] + " ");

        int pos = -1;
        for (int i = 0; i < n; i++)
            if (arr[i] == key) 
            {
                 pos = i; 
                 break; 
           }

        if (pos != -1) {
            for (int i = pos; i < n - 1; i++)
                arr[i] = arr[i + 1];
            n--;
        } else {
            System.out.println("\nElement not found");
        }

        System.out.print("\nAfter Deletion: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}