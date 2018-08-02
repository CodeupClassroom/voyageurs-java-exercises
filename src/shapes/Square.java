package shapes;

public class Square extends Quadrilateral implements Measurable{

    public Square(double l) {
        super(l, l);
    }

    @Override
    void setLength(double length) {
        this.length = this.width = length;
    }

    @Override
    void setWidth(double width) {
        this.length = this.width = width;
    }

}
