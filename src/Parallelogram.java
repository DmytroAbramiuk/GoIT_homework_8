public class Parallelogram extends Shape{

    private double upSide;
    private double lateralSide;
    private double height;

    @Override
    public double calculatePerimeter() {
        return upSide*2+lateralSide*2;
    }

    @Override
    public void printName() {
        System.out.println("Parallelogram");
    }

    @Override
    public double calculateSquare() {
        return height*upSide;
    }
}
