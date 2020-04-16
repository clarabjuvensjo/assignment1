// PROG2 VT2020, Inlämningsuppgift 1, del 1
// Clara Bjuvensjö clbj3090

public class Jewellery extends Valuable {
    private int numberOfJewels;
    private Material material;

    public Jewellery(String name, int numberOfJewels, String material) {
        super(name);
        this.numberOfJewels = numberOfJewels;
        this.material = Material.valueOf(material);
    }

    public int getJewels() {
        return numberOfJewels;
    }

    public Material getMaterial() {
        return material;
    }

    public enum Material {
        Guld, Silver
    }

    public double getValue() {
        if (material == Material.Guld) {
            return 2000 + 500 * getJewels();
        } else {
            return 700 + 500 * getJewels();
        }
    }

    public String toString() {
        return super.toString() +
                " Antal stenar: " + getJewels() +
                " Material: " + getMaterial();
    }

    public static void main(String[] args) {
        Jewellery jewellery1 = new Jewellery("Ring", 5, "Guld");
        System.out.println(jewellery1.getValue());
        Jewellery jewellery2 = new Jewellery("Klocka", 4, "Silver");
        System.out.println(jewellery2);
    }
}
