class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer buildComputer() {
        return builder.build();
    }

    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }
}