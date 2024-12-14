public final class RAM {
    public final String type;
    public final int capacity;
    public final double weight;

    public RAM(String type, int capacity, double weight) {
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "RAM: " +
                "\n\ttype: " + type +
                "\n\tcapacity: " + capacity +
                "\n\tweight: " + weight;
    }
}
