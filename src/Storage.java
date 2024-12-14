public final class Storage {
    public final StorageType type;
    public final int capacity;
    public final double weight;

    public Storage(StorageType type, int capacity, double weight) {
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Storage: " +
                "\n\ttype: " + type +
                "\n\tcapacity: " + capacity +
                "\n\tweight: " + weight;
    }
}
