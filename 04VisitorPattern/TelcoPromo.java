public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco(15, 500, "Smart", false);
        TelcoSubscription globe = new Telco(10, 450, "Globe", true);
        TelcoSubscription ditto = new Telco(8, 400, "Ditto", true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallOffer unli = new UnliCallTextPackage();    

        System.out.println("Smart Data Usage Offer and price: " + smart.accept(promo, 500));
        System.out.println("Globe Data Usage Offer and price: " + globe.accept(promo, 450));
        System.out.println("Ditto Data Usage Offer and price: " + ditto.accept(promo, 400));

        System.out.println("\nSmart unlimited calls and text package: " + smart.accept(unli, false));
        System.out.println("Globe unlimited calls and text package: " + globe.accept(unli, true));
        System.out.println("Ditto unlimited calls and text package: " + ditto.accept(unli, true));
    }
}