package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width, String color) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, length: "
                + getLength() + " units, width: " + getWidth() + " units, color: " + color);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
