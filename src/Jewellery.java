public class Jewellery {
    private String name;
    private int numberOfJewels;
    private String material;


    public Jewellery(String name, int jewels) {
        this.name = name;
        this.numberOfJewels = numberOfJewels;
    }

    public String getName() {
        return name;
    }

    public int getJewels() {
        return numberOfJewels;
    }

    enum getMaterial {
        GOLD, SILVER;
    }
}
