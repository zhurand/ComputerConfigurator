package pc.builder;
import hardware.*;
import pc.Computer;

public class MultimediaComputerBuilder implements ComputerBuilder {
    private CPU cpu = CPU.AMD_RYZEN_5;
    private RAM ram = RAM.RAM_16GB;
    private GraphicsCard graphicsCard = GraphicsCard.AMD_RADEON_RX_580;
    private PowerSupply powerSupply = PowerSupply.EXEGATE_500PPE_500W;
    private HardDrive hardDrive = HardDrive.WD_SSD_1TB;

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