package Task2;

public class Tester {
    public static void main(String[] args) {

        Marks [] percentages = {new StudentA(40, 50, 60), new StudentB(44, 33, 55, 22)};
        for(Marks p: percentages) {
            System.out.println(p.getPercentage());
        }
    }
}
