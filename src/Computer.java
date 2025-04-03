/**
 * Класс компьютера со свойствами <b>cpu</b>, <b>ram</b>, <b>graphicsCard</b>, <b>powerSupply<b/>, <b>hardDrive<b/>.
 * @autor zhurand
 * @version 1.0
 */
class Computer {
    /** Поле процессор */
    private CPU cpu;
    /** Поле оперативная память */
    private RAM ram;
    /** Поле видеокарта */
    private GraphicsCard graphicsCard;
    /** Поле блок питания */
    private PowerSupply powerSupply;
    /** Поле жесткий диск */
    private HardDrive hardDrive;
    /**
     * Создание нового компьютера
     * @param cpu процессор
     * @param ram оперативная память
     * @param graphicsCard видеокарта
     * @param powerSupply блок питания
     * @param hardDrive жесткий диск
     */
    public Computer(CPU cpu, RAM ram, GraphicsCard graphicsCard, PowerSupply powerSupply, HardDrive hardDrive) {
        this.cpu = cpu;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.powerSupply = powerSupply;
        this.hardDrive = hardDrive;
    }
    /**
     * Функция получения значения поля {@link Computer#cpu}
     * @return возвращает тип процессора
     */
    public CPU getCpu() {
        return cpu;
    }
    /**
     * Функция получения значения поля {@link Computer#ram}
     * @return возвращает тип оперативной памяти
     */
    public RAM getRam() {
        return ram;
    }
    /**
     * Функция получения значения поля {@link Computer#graphicsCard}
     * @return возвращает тип видеокарты
     */
    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }
    /**
     * Функция получения значения поля {@link Computer#powerSupply}
     * @return возвращает тип блока питания
     */
    public PowerSupply getPowerSupply() {
        return powerSupply;
    }
    /**
     * Функция получения значения поля {@link Computer#hardDrive}
     * @return возвращает тип жесткого диска
     */
    public HardDrive getHardDrive() {
        return hardDrive;
    }

    @Override
    public String toString() {
        return "\nПроцессор = " + cpu.getDescription() +
                "\nОЗУ = " + ram.getDescription() +
                "\nВидеокарта = " + graphicsCard.getDescription() +
                "\nБП = " + powerSupply.getDescription() +
                "\nЖесткий диск = " + hardDrive.getDescription();
    }
}