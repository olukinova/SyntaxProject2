package Task2;

public class StudentB extends Marks{

    int grade1, grade2, grade3, grade4;

    public StudentB(int grade1, int grade2, int grade3, int grade4) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
    }

    double getPercentage() {
        return (grade1 + grade2 + grade3 + grade4) / 4;
    }
}
