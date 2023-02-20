package Task1;

public class Square implements Shape{
    @Override
    public double calculateArea(double side) {
        return side * side;
    }

    @Override
    public double calculatePerimeter(double side) {
        return 4 * side;
    }
}
