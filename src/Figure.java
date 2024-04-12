abstract public class Figure {
    public double sideA;

    public Figure(double sideA) {
        this.sideA = sideA;
    }

    abstract double countPerimeter();

    abstract double countSquare();
}
