public class Rhombus extends Shape{

    private double sideSize;
    private double biggerDiagonal;
    private double lowerDiagonal;

    public Rhombus(float sideSize, float biggerDiagonal, float lowerDiagonal) {
        this.sideSize = sideSize;
        this.biggerDiagonal = biggerDiagonal;
        this.lowerDiagonal = lowerDiagonal;
    }

    public double getSideSize() {
        return sideSize;
    }

    public double getBiggerDiagonal() {
        return biggerDiagonal;
    }

    public double getLowerDiagonal() {
        return lowerDiagonal;
    }

    @Override
    public void printShapeName() {
        System.out.println("Rhombus");
    }

    @Override
    public double calculateSquare() {
        return (biggerDiagonal*lowerDiagonal)/2.0;
    }

    @Override
    public double calculatePerimeter() {
        return sideSize*4;
    }

    @Override
    public String toString(){
        return "Shape name is Rhombus, square of that Rhombus is " + calculateSquare() +
                ", perimeter of that Rhombus is " + calculatePerimeter();
    }
}
