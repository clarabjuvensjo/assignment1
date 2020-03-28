public class Jewellery extends Valuable {
    private int numberOfJewels;
    private Material material;
    private double value;

    public Jewellery(String name, int numberOfJewels, Material material) {
        super(name);
        this.numberOfJewels = numberOfJewels;
        this.material = material;
    }

    public int getJewels() {
        return numberOfJewels;
    }

    public Material getMaterial() {
        return material;
    }

    public enum Material {
        GOLD, SILVER;
    }

    public double getValue() {
        if (material == Material.GOLD) {
            return 2000 + 500 * getJewels();
        } else {
            return 700 + 500 * getJewels();
        }
    }

    public String toString() {
        return super.toString() +
                " Number of jewels: " + getJewels() +
                " Material: " + getMaterial();
    }

    public static void main(String[] args) {
        Jewellery jewellery1 = new Jewellery("Ring", 5, Material.GOLD);
        System.out.println(jewellery1.getValue());
        Jewellery jewellery2 = new Jewellery("Klocka", 4, Material.SILVER);
        System.out.println(jewellery2.getValue());
    }
}
