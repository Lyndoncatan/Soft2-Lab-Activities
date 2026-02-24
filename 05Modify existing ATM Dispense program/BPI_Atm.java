public class BPI_Atm {
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        int amount = 2970; // Current test amount
        
        // Validation check for multiples of 10
        if (amount % 10 != 0) {
            System.out.println("Amount should be in multiples of 10s.");
        } else {
            atmDispenser.dispense(new Currency(amount));
        }
    }
}