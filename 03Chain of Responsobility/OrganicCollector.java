/**
 * Concrete Handler for Organic Waste.
 */
public class OrganicCollector extends WasteCollector {

    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getType().equalsIgnoreCase("organic");
    }

    @Override
    protected void dispose(WasteContainer container) {
        System.out.println(">>> [ORGANIC WASTE DETECTED]");
        System.out.println("Action: Routing to Composting Facility.");
        System.out.println("Processing: " + container.getCapacity() + "kg of organic matter.");
        System.out.println("Status: Natural decomposition process initiated.");
        System.out.println("--------------------------------------------------");
    }
}