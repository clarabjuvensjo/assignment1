public abstract class Valuable {
    private String name;
    private double value;

    public Valuable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
