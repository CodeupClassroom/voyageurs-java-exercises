package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double l, double w){
        this.length = l;
        this.width = w;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

//    Since we don't know what kind of Quad it is, the process it's defined in each class
    abstract void setLength(double length);
    abstract void setWidth(double width);

    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
