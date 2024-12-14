// Решил показать, что уяснил Records
public record Screen(double diagonal, PanelType type, double weight) {
    @Override
    public String toString() {
        return "Screen: " +
                "\n\tdiagonal: " + diagonal +
                "\n\ttype: " + type +
                "\n\tweight: " + weight;
    }
}
