/*
Задача 2:
Написать иерархию классов Фигура,
Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади
для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы).
Создать массив из 5 разных фигур.
Вывести на экран сумму периметра всех фигур в массиве.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Треугольник");
        Triangle triangle = new Triangle(3, 3, 3);
        System.out.println("Периметр: " + triangle.countPerimeter());
        System.out.println("Площадь: " + triangle.countSquare());
        System.out.println();

        System.out.println("Прямоугольник");
        Rectangle rectangle = new Rectangle(2, 1);
        System.out.println("Периметр: " + rectangle.countPerimeter());
        System.out.println("Площадь: " + rectangle.countSquare());
        System.out.println();

        System.out.println("Круг");
        Circle circle = new Circle(6);
        System.out.println("Периметр: " + circle.countPerimeter());
        System.out.println("Площадь: " + circle.countSquare());
        System.out.println();

        double[] figure = {triangle.countPerimeter(), rectangle.countPerimeter(), circle.countPerimeter(), triangle.countPerimeter(), circle.countPerimeter()};

        double sum = 0;
        for (double number : figure) {
            sum += number;
        }
        System.out.println("Сумма периметра фигур: " + sum);
    }
}