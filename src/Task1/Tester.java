package Task1;

public class Tester {

    public static void main(String[] args) {

        Shape [] figures = {new Circle(), new Square()};
        for(Shape figure: figures) {
            System.out.println(figure.calculateArea(10.0));
            System.out.println(figure.calculatePerimeter(11.0));
        }

        //OR

        System.out.println("*********************");

        Circle circle = new Circle();
        System.out.println(circle.calculateArea(1.0));
        System.out.println(circle.calculatePerimeter(2.0));

        Square square = new Square();
        System.out.println(square.calculateArea(1.0));
        System.out.println(square.calculatePerimeter(2.0));


    }
}
