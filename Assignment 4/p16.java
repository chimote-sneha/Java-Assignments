/**16) …... -6	-3	0	3	6	9	……. n terms */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the limit of the series  : ");
    int n = sc.nextInt();
        int count = 0;
        int term = -6;
        System.out.print("Series: ");
        while (count < n) {
            System.out.print(term + " ");
            term += 3;  
            count++;

    }

    }
}