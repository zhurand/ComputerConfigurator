package hardware;

public enum RAM {
    RAM_8GB ("8GB"),
    RAM_16GB ("16GB"),
    RAM_32GB ("32GB");

    private final String description;

    RAM(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}