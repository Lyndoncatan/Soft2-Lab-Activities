public class AutomatedWasteSystem {
    public static void main(String[] args) {
        // Initialize collectors
        WasteCollector organic = new OrganicCollector();
        WasteCollector recyclable = new RecyclableCollector();
        WasteCollector hazardous = new HazardousCollector();

        // Chain them: Organic -> Recyclable -> Hazardous
        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);

        // Simulate incoming full containers
        WasteContainer bin1 = new WasteContainer("organic", 15);
        WasteContainer bin2 = new WasteContainer("hazardous", 5);
        WasteContainer bin3 = new WasteContainer("recyclable", 25);
        WasteContainer bin4 = new WasteContainer("nuclear", 10); // Unknown type

        System.out.println("--- Starting Waste Collection Process ---");
        organic.collect(bin1);
        organic.collect(bin2);
        organic.collect(bin3);
        organic.collect(bin4);
    }
}