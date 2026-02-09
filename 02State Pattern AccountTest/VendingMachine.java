public class VendingMachine {
    private VendingMachineState currentState;
    private int inventory;
    private double balance;

    public VendingMachine(int inventory) {
        this.inventory = inventory;
        this.balance = 0.0;
        this.currentState = new IdleState(); // Initial state
        System.out.println("Vending Machine initialized with " + inventory + " items.");
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public VendingMachineState getState() {
        return currentState;
    }

    public int getInventory() {
        return inventory;
    }

    public void reduceInventory() {
        if (inventory > 0) {
            inventory--;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addBalance(double amount) {
        this.balance += amount;
    }

    // Actions delegated to the current state
    public void selectItem() {
        currentState.selectItem(this);
    }

    public void insertCoin() {
        currentState.insertCoin(this);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }
}
