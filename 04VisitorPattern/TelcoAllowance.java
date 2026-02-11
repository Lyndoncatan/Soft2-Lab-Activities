public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double money) {
        if (telcoName.equalsIgnoreCase("Smart")) return "offers 15 GB for ₱" + money + " per month.";
        if (telcoName.equalsIgnoreCase("Globe")) return "offers 10 GB for ₱" + money + " per month.";
        if (telcoName.equalsIgnoreCase("Ditto")) return "offers 8 GB for ₱" + money + " per month.";
        return "Unknown Plan";
    }
}