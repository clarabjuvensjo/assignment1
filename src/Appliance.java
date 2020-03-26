public class Appliance extends Valuable {
    private String name;
    private double price;
    private int wear;
    private double value;

    public Appliance(String name, double price, int wear) {
        super(name);
        this.name = name;
        this.price = price;
        this.wear = wear;
    }

    public String getName() {
        return name;
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

    public String toString(){
        return "Name: " + getName() +
                " Price: " + getPrice() +
                " Wear: " + getWear() +
                " Value: " + getValue();
    }

    public static void main(String []args){
        Appliance appliance1 = new Appliance("TV", 5500, 6);
        System.out.println(appliance1);
        Appliance appliance2 = new Appliance("Radio", 400, 2);
        System.out.println(appliance2);
    }
}
