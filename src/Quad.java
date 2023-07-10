public class Quad extends Shape{
    private double sideSize;

    public Quad(float sideSize) {
        this.sideSize = sideSize;
    }

    public double getSideSize() {
        return sideSize;
    }

    @Override
    public void printName() {
        System.out.println("Quad");
    }

    @Override
    public double calculateSquare() {
        return sideSize*sideSize;
    }


    @Override
    public double calculatePerimeter() {
        return sideSize*4;
    }

    @Override
    public String toString(){
        return "Shape name is Quad, square of that Quad is " + calculateSquare() +
                ", perimeter of that Quad is " + calculatePerimeter();
    }
}
