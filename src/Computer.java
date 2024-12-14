public class Computer {
    public final String name;
    public final String vendor;
    private Processor processor;
    private RAM ram;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(String name, String vendor, Processor processor, RAM ram, Storage storage, Screen screen, Keyboard keyboard) {
        this.name = name;
        this.vendor = vendor;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public double getTotalWeight() {
        return processor.weight + ram.weight + storage.weight + screen.weight() + keyboard.weight();
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Screen getDisplay() {
        return screen;
    }

    public void setDisplay(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nVendor: " + vendor +
                "\n" + processor +
                "\n" + ram +
                "\n" + storage +
                "\n" + screen +
                "\n" + keyboard;
    }
}
