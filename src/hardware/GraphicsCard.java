package hardware;

public enum GraphicsCard {
    NVIDIA_RTX_3060_TI ("GeForce RTX 3060 Ti"),
    AMD_RADEON_RX_580 ("AMD Rаdеоn RХ 580"),
    INTEGR_GRAPH ("Integrated Graphics");

    private final String description;

    GraphicsCard(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}