package Task3;

public class Sedan extends Car{
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if(length > 20) {
            return carPrice * 0.95;
        }
        return carPrice * 0.9;
    }
}
