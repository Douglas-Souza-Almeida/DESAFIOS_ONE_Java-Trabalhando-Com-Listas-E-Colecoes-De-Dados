package Class;
public class PerishableProduct extends Product {
    private String expirationDate;

    public PerishableProduct(String name, double price, double quantity, String expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nData de validade: " + this.expirationDate;
    }
}