public interface TelcoSubscription {
    public String accept(UsagePromo promo, double price);

    public String accept(UnliCallOffer unli, boolean unliCallText);

    public String getTelcoName();

    public double getPromoPrice();

    public boolean getUnliCallText();
}