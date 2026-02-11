public abstract class WasteCollector {
    protected WasteCollector nextCollector;

    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    public void collect(WasteContainer container) {
        if (canHandle(container)) {
            dispose(container);
        } else if (nextCollector != null) {
            nextCollector.collect(container);
        } else {
            System.out.println("Error: No collector found for waste type: " + container.getType());
        }
    }

    protected abstract boolean canHandle(WasteContainer container);
    protected abstract void dispose(WasteContainer container);
}