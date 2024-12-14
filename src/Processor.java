public final class Processor {
    public final double frequency;
    public final int coreCount;
    public final String manufacturer;
    public final double weight;

    public Processor(double frequency, int coreCount, String manufacturer, double weight) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor:" +
                "\n\tfrequency: " + frequency +
                "\n\tcoreCount: " + coreCount +
                "\n\tmanufacturer: " + manufacturer +
                "\n\tweight: " + weight;
    }
}
