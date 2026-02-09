public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Please insert coins.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin inserted.");
        machine.addBalance(100); // Assuming 100 for simplicity or we can pass amount
        System.out.println("Current balance: " + machine.getBalance());
        
        // Check if sufficient balance logic could trigger dispense? 
        // Instructions say "Dispensing State: Allow no operations. Automatically transition back to Idle after dispensing"
        // But usually user has to confirm purchase or insert enough coins.
        // For this pattern, we'll let the user explicitly call dispense() or have logic check balance.
        // However, requirements say: "ItemSelected State: Allow inserting coins and dispensing items."
        // So we just add balance here.
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        if (machine.getBalance() >= 100) { // Assuming item cost is 100
             if(machine.getInventory() > 0) {
                machine.setState(new DispensingState());
                machine.getState().dispenseItem(machine); // Trigger dispense in new state
             } else {
                 System.out.println("Out of stock.");
                 machine.setState(new IdleState()); // Return to idle or refund?
             }
        } else {
            System.out.println("Insufficient balance. Insert more coins.");
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}
