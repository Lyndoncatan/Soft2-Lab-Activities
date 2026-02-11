package statePattern;
public class AccountTest{
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0); 
        
        myAccount.activate(); 

        System.out.println();

		myAccount.suspend(); 

        System.out.println();

        myAccount.activate();

        System.out.println();
		
	    myAccount.deposit(1000.0);   
        
        System.out.println();

	    myAccount.withdraw(100.0);  	 
        
        System.out.println();

		myAccount.close();  

        System.out.println();

		myAccount.activate(); 

        System.out.println();

		myAccount.suspend();

        System.out.println();


        myAccount.withdraw(500.0);

        System.out.println();

        myAccount.deposit(1000.0);
    }
}
