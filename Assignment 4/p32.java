/**32) A	b	C	d	E	f	G	h	…… n terms  */
import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of the series : ");
        int n = sc.nextInt(); 
        int i = 0;
        char ch = 'A';

        while (i < n) {
            if (i % 2 == 0) 
                System.out.print(ch + " ");  
            else 
                System.out.print((char)(ch + 32) + " ");  
            ch++;  
            i++;
        }

    }
}