public class Circle extends Shape{

    private double radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void printShapeName() {
        System.out.println("Circle");
    }

    @Override
    public double calculateSquare() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString(){
        return "Shape name is Circle, square of that Circle is " + calculateSquare() +
                ", perimeter of that Circle is " + calculatePerimeter();
    }
}
