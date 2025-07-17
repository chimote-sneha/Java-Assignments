import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary");
        int bs = sc.nextInt();
        double hra,da,gs;
        if(bs<=10000)
        {
            hra=(20/100)*bs;
            da=(80/100)*bs;
            }
        else if(bs<=20000)
        {
            hra=(25/100)*bs;
            da=(90/100)*bs;
            }
        else
        {
            hra=(30/100)*bs;
            da=(95/100)*bs;
        }
        gs = bs + hra + da;
        System.out.println("Gross Salary is: "+gs);
        }
        

}