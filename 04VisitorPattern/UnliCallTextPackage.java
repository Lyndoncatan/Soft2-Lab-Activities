public class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (!unliCallText) return "No free calls or texts. Charged per use.";
        if (telcoName.equalsIgnoreCase("Globe")) return "Unlimited calls and texts within network.";
        if (telcoName.equalsIgnoreCase("Ditto")) return "Unlimited calls and texts to all networks.";
        return "Standard rates apply.";
    }
}