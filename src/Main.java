import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Выберите тип компьютера:");
    System.out.println("1 : Игровой");
    System.out.println("2 : Офисный");
    System.out.println("3 : Мультимедийный");
    System.out.println("4 : Собрать свой ПК");
    System.out.print("Ваш выбор: ");

    int choice = scanner.nextInt();
    scanner.nextLine();

    ComputerBuilder builder = null;

    switch (choice) {
        case 1:
            builder = new GamingComputerBuilder();
            break;
        case 2:
            builder = new OfficeComputerBuilder();
            break;
        case 3:
            builder = new MultimediaComputerBuilder();
            break;
        case 4:
            builder = new CustomComputerBuilder();

            System.out.println("Выберите процессор: ");
            for (CPU cpu : CPU.values()) {
                System.out.println(cpu.ordinal() + " : " + cpu.getDescription());
            }
            System.out.print("Ваш выбор: ");
            String idCpu = scanner.nextLine();
            builder.addCPU(CPU.values()[Integer.parseInt(idCpu)]);

            System.out.println("Выберите оперативную память: ");
            for (RAM ram : RAM.values()) {
                System.out.println(ram.ordinal() + " : " + ram.getDescription());
            }
            System.out.print("Ваш выбор: ");
            String idRam = scanner.nextLine();
            builder.addRAM(RAM.values()[Integer.parseInt(idRam)]);

            System.out.println("Выберите видеокарту: ");
            for (GraphicsCard graphicsCard : GraphicsCard.values()) {
                System.out.println(graphicsCard.ordinal() + " : " + graphicsCard.getDescription());
            }
            System.out.print("Ваш выбор: ");
            String idGraphicsCard = scanner.nextLine();
            builder.addGraphicsCard(GraphicsCard.values()[Integer.parseInt(idGraphicsCard)]);

            System.out.println("Выберите блок питания: ");
            for (PowerSupply powerSupply : PowerSupply.values()) {
                System.out.println(powerSupply.ordinal() + " : " + powerSupply.getDescription());
            }
            System.out.print("Ваш выбор: ");
            String idPowerSupply = scanner.nextLine();
            builder.addPowerSupply(PowerSupply.values()[Integer.parseInt(idPowerSupply)]);

            System.out.println("Выберите жесткий диск: ");
            for (HardDrive hardDrive : HardDrive.values()) {
                System.out.println(hardDrive.ordinal() + " : " + hardDrive.getDescription());
            }
            System.out.print("Ваш выбор: ");
            String idHardDrive = scanner.nextLine();
            builder.addHardDrive(HardDrive.values()[Integer.parseInt(idHardDrive)]);
            break;
        default:
            System.out.println("Некорректный выбор. Создание офисного компьютера по умолчанию.");
            builder = new OfficeComputerBuilder();
    }

    ComputerDirector director = new ComputerDirector(builder);
    Computer computer = director.buildComputer();
    System.out.println("Конфигурация вашего ПК: " + computer);

    scanner.close();
}