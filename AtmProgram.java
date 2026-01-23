import java.util.Scanner;

public class AtmProgram {
    static int balance = 1_00_00;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--- ATM services ---");
            System.out.println(" 1 -> Withdraw");
            System.out.println(" 2 -> Deposit");
            System.out.println(" 3 -> Check Balance");
            System.out.println(" 4 -> Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to withdraw:");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance");
                    } else if (withdrawAmount == 0) {
                        System.out.println("Amount can't be 0");
                    } else {
                        balance = withdraw(withdrawAmount);
                        System.out.println("Amount withdrawn: " + withdrawAmount);
                        System.out.println("Remaining balance: " + balance);
                    }
                }
                case 2 -> {
                    System.out.print("Enter amount to deposit:");
                    int depositAmount = sc.nextInt();
                    if (depositAmount == 0) {
                        System.out.println("Amount can't be 0");
                        break;
                    }
                    System.out.println("Amount deposited: " + depositAmount);
                    balance = deposit(depositAmount);
                    System.out.println("Current balance: " + balance);
                }
                case 3 -> System.out.println("Current balance: " + balance);
                case 4 -> {
                    System.out.println("Thank you for visiting");
                    return;
                }
                default -> System.out.println("Invalid choice, try again...");
            }
        }
    }
    
    public static int deposit(int sum) {
        balance += sum;
        return balance;
    }

    public static int withdraw(int sum) {
        balance -= sum;
        return balance;
    }
    
}
