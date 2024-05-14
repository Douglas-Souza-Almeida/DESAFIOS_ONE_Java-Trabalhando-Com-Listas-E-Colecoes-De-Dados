package Class;

public class Square implements Form {
    private double base;
    private double height;

    public Square (double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }
}
