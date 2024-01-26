package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + getArea() + " sq. units, length: " + length
                + " units, width: " + width + " units, color: " + color;
    }
}