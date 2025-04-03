class OfficeComputerBuilder implements ComputerBuilder {
    private CPU cpu = CPU.INTEL_CORE_I3;
    private RAM ram = RAM.RAM_8GB;
    private GraphicsCard graphicsCard = GraphicsCard.INTEGR_GRAPH;
    private PowerSupply powerSupply = PowerSupply.EXEGATE_UN400_400W;
    private HardDrive hardDrive = HardDrive.KINGSTON_SSD_120GB;

    @Override
    public ComputerBuilder addCPU(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public ComputerBuilder addRAM(RAM ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputerBuilder addGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    @Override
    public ComputerBuilder addPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    @Override
    public ComputerBuilder addHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(cpu, ram, graphicsCard, powerSupply, hardDrive);
    }
}