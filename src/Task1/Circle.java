package Task1;

public class Circle implements Shape{

    @Override
    public double calculateArea(double radius) {
        return 3.14 * (radius * radius);
    }

    @Override
    public double calculatePerimeter(double radius) {
        return 2 * 3.14 * radius;
    }
}
