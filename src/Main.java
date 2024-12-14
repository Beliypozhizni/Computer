public class Main {
    public static void main(String[] args) {
        Processor processor_1 = new Processor(4.2, 8, "AMD", 50);
        RAM ram_1 = new RAM("DDR5", 16, 75);
        Storage storage_1 = new Storage(StorageType.SSD, 512, 150);
        Screen screen_1 = new Screen(23, PanelType.IPS, 2000);
        Keyboard keyboard_1 = new Keyboard("Mechanical keyboard", true, 500);

        Processor processor_2 = new Processor(4.8, 16, "Intel", 55);
        RAM ram_2 = new RAM("DDR5", 32, 150);
        Storage storage_2 = new Storage(StorageType.SSD, 1024, 150);
        Screen screen_2 = new Screen(27, PanelType.IPS, 2500);
        Keyboard keyboard_2 = new Keyboard("Mechanical keyboard", true, 700);

        Computer computer_1 = new Computer(
                "PC_1",
                "Beliy_1",
                processor_1,
                ram_1,
                storage_1,
                screen_1,
                keyboard_1);

        Computer computer_2 = new Computer(
                "PC_2",
                "Beliy_2",
                processor_2,
                ram_2,
                storage_2,
                screen_2,
                keyboard_2);

        System.out.println(computer_1);
        System.out.println("\n" + computer_2);
        computer_1.setProcessor(processor_2);
        computer_1.setRam(ram_2);
        System.out.println("\n" + computer_1);
    }
}