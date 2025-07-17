import java.util.Scanner;
class P1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the service years of the employee : ");
        int years=sc.nextInt();
        System.out.println("Enter the salary of the employee : ");
        int salary=sc.nextInt();
        if(years>5){
            int bounsSalary=(salary/100)*5;
            int total =bounsSalary+salary;
            System.out.println("The bonus and salary of the employee is : "+total);
        }
        else
          System.out.println("The salary of the employee is without bonus : "+salary);
    }
}