public class Rectangle extends Shape{
    private double firstSideSize;
    private double secondSideSize;

    public Rectangle(float firstSideSize, float secondSideSize) {
        this.firstSideSize = firstSideSize;
        this.secondSideSize = secondSideSize;
    }

    public double getFirstSideSize() {
        return firstSideSize;
    }

    public double getSecondSideSize() {
        return secondSideSize;
    }

    @Override
    public void printShapeName() {
        System.out.println("Rectangle");
    }

    @Override
    public double calculateSquare() {
        return firstSideSize*secondSideSize;
    }

    @Override
    public double calculatePerimeter() {
        return (firstSideSize+secondSideSize)*2;
    }

    @Override
    public String toString(){
        return "Shape name is Rectangle, square of that Rectangle is " + calculateSquare() +
                ", perimeter of that Rectangle is " + calculatePerimeter();
    }
}
