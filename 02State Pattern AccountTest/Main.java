public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(3); // Start with 3 items

        System.out.println("\n--- Scenario 1: Normal Purchase ---");
        vendingMachine.selectItem();     // Idle -> ItemSelected
        vendingMachine.insertCoin();     // Adds balance
        vendingMachine.dispenseItem();   // Checks balance -> Dispensing -> Idle

        System.out.println("\n--- Scenario 2: Selecting item but not enough balance ---");
        vendingMachine.selectItem();     // Idle -> ItemSelected
        vendingMachine.dispenseItem();   // Insufficient balance

        System.out.println("\n--- Scenario 3: Machine goes out of order ---");
        vendingMachine.setOutOfOrder();  // ItemSelected -> OutOfOrder
        vendingMachine.selectItem();     // Should be disallowed
        vendingMachine.insertCoin();     // Should be disallowed

        // To test return to normal, we'd need a repair method, but for now we just show it's stuck.
    }
}
