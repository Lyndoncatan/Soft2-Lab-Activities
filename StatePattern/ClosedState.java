package statePattern;

public class ClosedState implements AccountState{
    

    public void deposit(Double depositAmount, Account account){
        System.out.println("You cannot deposit on a closed account!");
        account.toString();
    }

    public void withdraw(Double withdrawAmount, Account account){
        System.out.println("You cannot withdraw on a closed account!");
        account.toString();
    }

    public void suspend(Account account){
        System.out.println("Cannot Suspended Closed Account");
    }

    public void activate(Account account){
        System.out.println("Cannot Activate Closed Account");
    }

    public void close(Account account){
        System.out.println("Account is already Closed!");
    }
}
