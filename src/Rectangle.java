public class Rectangle extends Figure {
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    @Override
    public double countPerimeter() {
        double perimeter = 2 * (sideA + sideB);
        return perimeter;
    }

    @Override
    public double countSquare() {
        double square = sideA * sideB;
        return square;
    }
}
