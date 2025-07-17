import java.util.Scanner;
class P1{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of the Employee : ");
        int age=sc.nextInt();
        System.out.println("Enter the gender of the Employee (M or F): ");
        char gen=sc.next().charAt(0);
        System.out.println("Enter the marital Status of the Employee (Y or N) : ");
        char mar=sc.next().charAt(0);
        if(gen=='F'){
            System.out.println("Employee have to work in unbar area");
        }
        else if(gen=='M' && age>=20 && age<=40){
            System.out.println("Employee can work anywhere");
        }
        else if(gen=='M' && age>=40 && age<=60){
            System.out.println("Employee have to work in unbar area");
        }
        else{
            System.out.println("Error");
        }
    }
}