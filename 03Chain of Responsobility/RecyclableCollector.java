/**
 * Concrete Handler for Recyclable Waste.
 */
public class RecyclableCollector extends WasteCollector {

    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getType().equalsIgnoreCase("recyclable");
    }

    @Override
    protected void dispose(WasteContainer container) {
        System.out.println(">>> [RECYCLABLE WASTE DETECTED]");
        System.out.println("Action: Routing to Materials Recovery Facility (MRF).");
        System.out.println("Processing: " + container.getCapacity() + "kg of recyclable material.");
        System.out.println("Status: Sorting and cleaning for reuse.");
        System.out.println("--------------------------------------------------");
    }
}