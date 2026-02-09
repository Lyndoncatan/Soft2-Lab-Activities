public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Please wait, dispensing item.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Please wait, dispensing item.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing item...");
        machine.reduceInventory();
        machine.setBalance(0); // Deduct cost, simplified to clearing balance
        System.out.println("Item dispensed. Returning to Idle state.");
        machine.setState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Cannot switch to OutOfOrder while dispensing.");
    }
}
