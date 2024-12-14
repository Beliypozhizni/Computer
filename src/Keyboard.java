// Решил показать, что уяснил Records
public record Keyboard(String type, boolean hasBacklight, double weight) {
    @Override
    public String toString() {
        return "Keyboard: " +
                "\n\ttype: " + type +
                "\n\thasBacklight: " + hasBacklight +
                "\n\tweight: " + weight;
    }
}