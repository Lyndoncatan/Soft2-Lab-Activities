/**
 * Concrete Handler for Hazardous Waste.
 * This class ensures that dangerous materials are handled with 
 * specific safety protocols rather than general disposal.
 */
public class HazardousCollector extends WasteCollector {

    @Override
    protected boolean canHandle(WasteContainer container) {
        // Checks if the waste type matches 'hazardous' (case-insensitive)
        return container.getType().equalsIgnoreCase("hazardous");
    }

    @Override
    protected void dispose(WasteContainer container) {
        System.out.println(">>> [SECURITY ALERT: HAZARDOUS WASTE DETECTED]");
        System.out.println("Action: Dispatching specialized containment unit.");
        System.out.println("Processing: " + container.getCapacity() + "kg of hazardous materials.");
        System.out.println("Status: Neutralizing and securing waste according to safety protocols.");
        System.out.println("--------------------------------------------------");
    }
}