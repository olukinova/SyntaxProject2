package Task2;

public class StudentA extends Marks{

    int grade1, grade2, grade3,grade4;

    public StudentA(int grade1, int grade2, int grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double getPercentage() {
        return (grade1 + grade2 + grade3) / 3;
    }
    }

