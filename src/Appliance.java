public class Appliance {
    private String name;
    private double price;
    private int wear;

    public Appliance(String name, double price, int wear){
        this.name = name;
        this.price = price;
        this.wear = wear;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getWear(){
        return wear;
    }
}
