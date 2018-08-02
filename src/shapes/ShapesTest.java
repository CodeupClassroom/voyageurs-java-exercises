package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        System.out.println("shapes.Rectangle...");
//        Rectangle box1 = new Rectangle(2, 3);
//        System.out.println(box1.getPerimeter()); // 10
//        System.out.println(box1.getArea()); // 6
//
//        System.out.println("shapes.Square...");
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter()); // 20
//        System.out.println(box2.getArea()); // 25
//
//        System.out.println(box1.length); // protected properties are accessible by any class inside the given package and any subclasses inside or outside the package containing the class with the protected properties

//        New tests for interfaces

        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable anotherShape = new Rectangle(2,3);
        System.out.println(anotherShape.getArea());
        System.out.println(anotherShape.getPerimeter());

    }

}
