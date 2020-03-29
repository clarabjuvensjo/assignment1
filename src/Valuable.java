public abstract class Valuable {
    private String name;
    private double vat;

    public Valuable(String name) {
        this.vat = 0.25;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getValue();

    public double getValuePlusVAT() {
        return getValue() * (1 + vat);
    }

    public void setVAT(double vat) {
        this.vat = vat;
    }

    public String toString() {
        return "Name: " + getName() +
                " Value: " + getValue() +
                " Value + VAT: " + getValuePlusVAT();
    }

    public static void main(String[] args) {
        Valuable jewellery = new Jewellery("Ring", 5, Jewellery.Material.SILVER);
        System.out.println(jewellery.getValuePlusVAT());
        Valuable stock = new Stock("Swedbank", 5, 5);
        System.out.println(stock.getValuePlusVAT());
        Valuable stock1 = new Stock("Nordea", 2, 1);
        System.out.println(stock1);
        Valuable appliance = new Appliance("TV", 5500, 5);
        System.out.println(appliance);
        appliance.setVAT(0.2);
        System.out.println(appliance);
    }
}
