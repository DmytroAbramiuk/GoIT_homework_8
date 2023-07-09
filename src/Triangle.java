public class Triangle extends Shape{

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(float firstSide, float secondSide, float thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    @Override
    public void printShapeName() {
        System.out.println("Triangle");
    }


    private double calculateHalfPerimeter(){
        return calculatePerimeter()/2;
    }

    @Override
    public double calculateSquare() {
        double halfPerimeter = calculateHalfPerimeter();
        return Math.sqrt(halfPerimeter*(halfPerimeter-firstSide)*(halfPerimeter-secondSide)*(halfPerimeter-thirdSide));
    }

    @Override
    public double calculatePerimeter() {
        return firstSide+secondSide+thirdSide;
    }

    @Override
    public String toString(){
        return "Shape name is Triangle, square of that Triangle is " + calculateSquare() +
                ", perimeter of that Triangle is " + calculatePerimeter();
    }
}
