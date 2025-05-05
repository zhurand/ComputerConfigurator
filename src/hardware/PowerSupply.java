package hardware;

public enum PowerSupply {
    EXEGATE_UN400_400W ("EXEGATE UN400 400W"),
    EXEGATE_500PPE_500W ("EXEGATE 500PPE 500W"),
    EXEGATE_UNS600_600W ("EXEGATE UNS600 600W");

    private final String description;

    PowerSupply(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}