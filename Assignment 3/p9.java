
import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Alphabetic character : ");
        char ch = sc.next().charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Character is Lowercase");
        } else if(ch >= 'A' && ch <= 'Z') {
            System.out.println("Charachter is Uppercase");
        } else {
            System.out.println("Character is Not an alphabet");
        }
    }
}