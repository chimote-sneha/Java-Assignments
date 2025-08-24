class p1{
    public static void main(String args[]){
         int arr[] = new int[5];
        arr[0] = 2;
		arr[1] = 10;
        arr[2] = 8;
        arr[3] = 5;
        arr[4] = 8;
         System.out.println("Your original array is: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted) {
                int count = 0;
                for (int j = 0; j < 5; j++) {
                    if (arr[j] == arr[i]) {
                        count++;
                    }
                }
                System.out.println("The occurrence of " + arr[i] + " is " + count);
            }
        }
    }
}