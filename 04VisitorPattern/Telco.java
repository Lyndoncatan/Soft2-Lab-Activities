public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallOffer unli, boolean unliCallText) {
        return unli.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public String getTelcoName() { return telcoName; }
    public double getPromoPrice() { return promoPrice; }
    public boolean getUnliCallText() { return unliCallText; }
}