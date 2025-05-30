package pc.builder;

import hardware.*;
import pc.Computer;

public interface ComputerBuilder {
    ComputerBuilder addCPU(CPU cpu);
    ComputerBuilder addRAM(RAM ram);
    ComputerBuilder addGraphicsCard(GraphicsCard graphicsCard);
    ComputerBuilder addPowerSupply(PowerSupply powerSupply);
    ComputerBuilder addHardDrive(HardDrive hardDrive);
    Computer build();
}