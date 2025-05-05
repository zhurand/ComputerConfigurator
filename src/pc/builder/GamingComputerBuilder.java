package pc.builder;
import hardware.*;
import pc.Computer;

public class GamingComputerBuilder implements ComputerBuilder {
    private CPU cpu = CPU.INTEL_CORE_I5;
    private RAM ram = RAM.RAM_32GB;
    private GraphicsCard graphicsCard = GraphicsCard.NVIDIA_RTX_3060_TI;
    private PowerSupply powerSupply = PowerSupply.EXEGATE_UNS600_600W;
    private HardDrive hardDrive = HardDrive.KINGSTON_SSD_500GB;

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