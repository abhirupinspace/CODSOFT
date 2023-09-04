import java.util.Scanner;
public class ATM
{
    private BankAccount userAccount;
    public ATM(BankAccount account)
    {
        userAccount = account;
    }
    public void displayMenu()
    {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\nATM Menu:");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the deposit amount: ₹");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the withdrawal amount: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    double balance = userAccount.checkBalance();
                    System.out.println("Your account balance: ₹" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while(choice!=4);
    }
    public static void main(String[] args)
    {
        BankAccount userAccount = new BankAccount(5000.0);
        ATM atmMachine = new ATM(userAccount);
        atmMachine.displayMenu();
    }
}
