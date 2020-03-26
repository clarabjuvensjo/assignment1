public class Stock extends Valuable {
    private String name;
    private int quantity;
    private double rate;
    private double value;

    public Stock(String name, int quantity, double rate) {
        super(name);
        this.name = name;
        this.quantity = quantity;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public double getValue() {
        return getQuantity() * getRate();
    }

    public String toString() {
        return "Name: " + getName() +
                "Quantity: " + getQuantity() +
                "Rate: " + getRate();

    }

    public static void main(String[] args) {
        Stock Swedbank = new Stock("Swedbank", 5, 50);
        System.out.println(Swedbank.getValue());
    }
}