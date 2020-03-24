public class Jewellery {
    private String name;
    private int numberOfJewels;
    private String material;
    private double value;

    public Jewellery(String name, int numberOfJewels, String material) {
        this.name = name;
        this.numberOfJewels = numberOfJewels;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public int getJewels() {
        return numberOfJewels;
    }

    public String getMaterial() {
        return material;
    }

    public enum material {
        GOLD, SILVER;
    }

    public double getValue(String material, int numberOfJewels) {
        return value;
    }
}
