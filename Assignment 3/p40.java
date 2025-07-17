import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price of the item:");
        double cp = sc.nextDouble();
        System.out.println("Enter the selling price of the item:");
        double sp = sc.nextDouble();
        double profit = sp - cp;
        if (sp>cp) {
            System.out.println("Profit is: " + profit);
            }
        else if (sp<cp) {
            System.out.println("Loss is: " + Math.abs(profit));
            }
        else {
            System.out.println("No profit no loss");
            }
    }
}