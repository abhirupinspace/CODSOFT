public class BankAccount
{
    private double balance;

    public BankAccount(double initialBalance)
    {
        balance=initialBalance;
    }

    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Deposit successful. New balance: ₹" + balance);
        }
        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount)
    {
        if (amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println("Withdrawal successful. New balance: ₹" + balance);
            return true;
        }
        else
        {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
            return false;
        }
    }
    public double checkBalance()
    {
        return balance;
    }
}
