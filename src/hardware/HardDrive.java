package hardware;

public enum HardDrive {
    KINGSTON_SSD_120GB ("KINGSTON SSD 120GB"),
    KINGSTON_SSD_500GB ("KINGSTON SSD 500GB"),
    WD_SSD_1TB ("WD SSD 1TB");

    private final String description;

    HardDrive(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}