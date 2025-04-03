public enum CPU {
    INTEL_CORE_I3 ("Intel Core i3"),
    INTEL_CORE_I5 ("Intel Core i5"),
    AMD_RYZEN_5 ("AMD Ryzen 5");

    private final String description;

    CPU(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}