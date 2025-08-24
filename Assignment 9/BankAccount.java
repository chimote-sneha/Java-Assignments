/**Bank Account
Create a class BankAccount with fields: accountNumber, holderName, balance.
Use setters to assign values. Add a method to display balance. */

class BankAccount{
       
    private int acNum;
    private String holdername;
    private int balance;

  
    public void setAccountDetails(int acNum, String holdername, int balance) {
        this.acNum = acNum;
        this.holdername = holdername;
        this.balance = balance;
    }

    public void setAcNum(int acNum) {
        this.acNum = acNum;
    }

    public void setName(String holdername) {
        this.holdername = holdername;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Holder Number   : " + acNum);
        System.out.println("Holder Name : " + holdername);
        System.out.println("Account balance: " + balance);
    }
}
class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

       
        ba.setAcNum(202);
        ba.setName("John Doe");
        ba.setBalance(50000);

        ba.displayDetails();
    }
}
