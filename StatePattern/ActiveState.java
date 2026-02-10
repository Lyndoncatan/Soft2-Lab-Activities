package statePattern;
public class ActiveState implements AccountState{


    public void deposit(Double depositAmount, Account account){
        System.out.println("Old Balance: " + account.balance + " Deposited Amount: " + depositAmount);
        account.balance = account.balance + depositAmount;
        System.out.println("Account Deposited");
        account.toString();
    }


    public void withdraw(Double withdrawAmount, Account account){
        System.out.println("Old Balance: " + account.balance + " Withdrawn Amount: " + withdrawAmount);
        account.balance = account.getBalance() - withdrawAmount;

        System.out.println("Account Withdraw");
        account.toString();
    }


    public void suspend(Account account){
        System.out.println("Account is suspended!");
        account.setState(new SuspendedState());
        
    }

 
    public void activate(Account account){
        System.out.println("Account is already Activated");
    }

   
    public void close(Account account){
        account.setState(new ClosedState());
        System.out.println("Account is Closed!");
    }
}