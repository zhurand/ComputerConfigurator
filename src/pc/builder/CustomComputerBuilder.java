package pc.builder;
import hardware.*;
import pc.Computer;

public class CustomComputerBuilder implements ComputerBuilder {
    private CPU cpu = null;
    private RAM ram = null;
    private GraphicsCard graphicsCard = null;
    private PowerSupply powerSupply = null;
    private HardDrive hardDrive = null;

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