public class Circle extends Shape{

    private double radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void printName() {
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

     
}
