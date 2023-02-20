package Task3;

public class Tester {

    public static void main(String[] args) {

        Car[] cars = {new Truck(10000 , "white", 1999),
                      new Sedan(1000, "white", 19)};

        for(Car car: cars) {
            System.out.println(car.calculateSalePrice());
        }

    }
}
