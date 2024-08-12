import java.util.Scanner;

public class BankAccount {
    private String name;
    private long accNo;
    private double balance;
    private Scanner sc;

    public BankAccount(String name, long accNo, double balance, Scanner sc) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
        this.sc = sc;
    }
    void getinfo(String name, long accNo, double balance) {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Balance: " + balance);
    }

    void deposit(double balance) {
        System.out.println("Enter amount to deposit");
        double depo_money = sc.nextInt();
        balance = balance + depo_money;
        System.out.println("Updated Balance: " + balance);
    }

    void withdraw(double balance){
        System.out.println("Enter amount to withdraw");
        double with_money = sc.nextInt();
        if(with_money > balance){
            System.out.println("Insufficient Balance");
            } else {
                balance = balance - with_money;
                System.out.println("Updated Balance: " + balance);
                }           
    }
void current(double balance){
    System.out.println("Current Balance: " + balance);

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Holder name:");
        String name = sc.nextLine();
        System.out.println("Enter Account Number:");
        long accNo = sc.nextLong();
        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();
        System.out.println("Enter 1 to know complete Information");
        System.out.println("Enter 2 to deposit money");
        System.out.println("Enter 3 to withdraw money");
        System.out.println("Enter 4 to know current balance");
        int number = sc.nextInt();

        
        BankAccount account = new BankAccount(name, accNo, balance, sc);
        switch (number) {
            case 1:
                account.getinfo(name, accNo, balance);
                break;
            case 2:
                account.deposit(balance);
                break;
            case 3:
                account.withdraw(balance);
                break;
            case 4:
            account.current(balance);
            break;
            default:
            System.out.println("Invalid choice");
                break;
        }

    }
}
