public class ShapeTest {

    public static void main(String[] args) {
        Shape triangle = new Triangle(10,10,10);
        Shape quad = new Quad(10);
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(10,10);
        Shape rhombus = new Rhombus(10,10,10);

        System.out.println("====================Names Of Shapes====================");
        ShapePrinter.printShape(triangle);
        ShapePrinter.printShape(quad);
        ShapePrinter.printShape(circle);
        ShapePrinter.printShape(rectangle);
        ShapePrinter.printShape(rhombus);

        System.out.println("====================Square Of Shapes====================");
        System.out.println("triangle.calculateSquare() = " + triangle.calculateSquare());
        System.out.println("quad.calculateSquare() = " + quad.calculateSquare());
        System.out.println("circle.calculateSquare() = " + circle.calculateSquare());
        System.out.println("rectangle.calculateSquare() = " + rectangle.calculateSquare());
        System.out.println("rhombus.calculateSquare() = " + rhombus.calculateSquare());

        System.out.println("====================Perimeter Of Shapes====================");
        System.out.println("triangle.calculatePerimeter() = " + triangle.calculatePerimeter());
        System.out.println("quad.calculatePerimeter() = " + quad.calculatePerimeter());
        System.out.println("circle.calculatePerimeter() = " + circle.calculatePerimeter());
        System.out.println("rectangle.calculatePerimeter() = " + rectangle.calculatePerimeter());
        System.out.println("rhombus.calculatePerimeter() = " + rhombus.calculatePerimeter());

        System.out.println("====================toString====================");
        System.out.println(triangle);
        System.out.println(quad);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(rhombus);
    }
}
