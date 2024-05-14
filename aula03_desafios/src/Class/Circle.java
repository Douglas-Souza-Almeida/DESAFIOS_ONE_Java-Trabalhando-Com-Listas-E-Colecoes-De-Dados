package Class;

public class Circle implements Form {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea () {
        return  Math.PI * radius * radius;
    }
}
