public abstract class Valuable {
    private String name;
    private double vat;

    public Valuable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getValue();

    public double getValuePlusVAT() {
        vat = getValue() * 0.25;
        return vat;
    }

    public void setVAT() {
        vat = 0.25;
    }

    public static void main(String[] args) {
        Valuable jewellery = new Jewellery("Ring", 5, Jewellery.Material.SILVER);
        System.out.println(jewellery.getValuePlusVAT());
        Valuable stock = new Stock("Swedbank", 5, 5);
        System.out.println(stock.getValuePlusVAT());
    }
}
