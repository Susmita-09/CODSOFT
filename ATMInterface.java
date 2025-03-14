import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 5000;  
        
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = input.nextInt();
            
            if (choice == 1) {
                System.out.println("Your balance: ₹" + balance);
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ₹");
                double amount = input.nextDouble();
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposit successful! New balance: ₹" + balance);
                } else {
                    System.out.println("Invalid deposit amount.");
                }
            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ₹");
                double amount = input.nextDouble();
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawal successful! Remaining balance: ₹" + balance);
                } else if (amount > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    System.out.println("Invalid withdrawal amount.");
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM!");
                break;
            } else {
                System.out.println("Invalid option! Please try again.");
            }
        }
        
        input.close();
    }
}