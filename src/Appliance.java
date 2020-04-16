// PROG2 VT2020, Inlämningsuppgift 1, del 1
// Clara Bjuvensjö clbj3090

public class Appliance extends Valuable {
    private double price;
    private int wear;

    public Appliance(String name, double price, int wear) {
        super(name);
        this.price = price;
        this.wear = wear;
    }

    public double getPrice() {
        return price;
    }

    public int getWear() {
        return wear;
    }

    public double getValue() {
        return getWear() / 10d * getPrice();
    }

    public String toString() {
        return super.toString() +
                " Pris: " + getPrice() +
                " Slitage: " + getWear();
    }

    public static void main(String[] args) {
        Appliance appliance1 = new Appliance("TV", 5500, 6);
        System.out.println(appliance1);
        Appliance appliance2 = new Appliance("Radio", 400, 2);
        System.out.println(appliance2);
    }
}
