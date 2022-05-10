public class BankAccount {

    public static void main(String[] args) {

        BankAccount john = new BankAccount(500, "John Smith");
        john.deposit(100);
        john.displayBalance();

        //BANK TRANSFER ASSIGNMENT
        BankAccount larry = new BankAccount(5000, "Larry Smith");
        BankAccount mary = new BankAccount(300, "Mary Smith");

        larry.withdrawal(100);
        mary.deposit(100);

        larry.displayBalance();
        mary.displayBalance();
    }
    double accountBalance;
    String holderName;

    public BankAccount(double startingBalance, String customerName) {
        this.accountBalance = startingBalance;
        this.holderName = customerName;
    }

    public double deposit(double depositAmount){
        accountBalance = accountBalance + depositAmount;
        return accountBalance;
    }

    public double withdrawal(double withdrawalAmount){
        accountBalance = accountBalance - withdrawalAmount;
        return accountBalance;
    }

    public void displayBalance(){
        System.out.println("Hello, " + holderName + "! Your account balance is : " + accountBalance);

    }



}
