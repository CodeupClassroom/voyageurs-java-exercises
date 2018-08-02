package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double l, double w) {
        // Calls the super class constructor
        super(l, w);
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }
}
