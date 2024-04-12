public class Circle extends Figure {
    public Circle(double sideA) {
        super(sideA);
    }

    @Override
    public double countPerimeter() {
        double perimeter = 2 * 3.14 * sideA;
        return perimeter;
    }

    @Override
    public double countSquare() {
        double square = Math.pow(sideA, 2) * 3.14;
        return square;
    }
}
