package statePattern;
public class SuspendedState implements AccountState{
    


        public void deposit(Double depositAmount, Account account){
            System.out.println("Suspended Accounts Cannot Deposit");
            account.toString();
        }
    
        public void withdraw(Double withdrawAmount, Account account){
            System.out.println("Suspended Accounts Cannot Withdraw");
            account.toString();
        }
    
        public void suspend(Account account){
            System.out.println("Account is already suspended");
        }
    
        public void activate(Account account){
            account.setState(new ActiveState());
            System.out.println("Account is Activated!");
        }
    
        public void close(Account account){
            account.setState(new ClosedState());
            System.out.println("Account is Closed!");
        }
 }
