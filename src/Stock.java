public class Stock {
    private String name;
    private int quantity;
    private double rate;
    private double value;

    public Stock(String name, int quantity, double rate) {
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

    public double setRate() {
        return rate;
    }

    public double getRate() {
        return rate;
    }

    public double getValue() {
        return value;
    }
}
