public class Triangle extends Figure {
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA);
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double countPerimeter() {
        double perimeter = (sideA + sideB + sideC) / 2;
        return perimeter;
    }

    @Override
    public double countSquare() {
        double perimeter = (sideA + sideB + sideC) / 2;
        double square = Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
        return square;
    }
}
