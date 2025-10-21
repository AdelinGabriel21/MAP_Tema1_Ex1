import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] grades = {29, 37, 38, 41, 84, 67};
        Ex1 ex1 = new Ex1();

        System.out.println("Failing grades: " + Arrays.toString(ex1.getFailingGrades(grades)));
        System.out.println("Average grade: " + ex1.getAverageGrade(grades));
        System.out.println("Rounded grades: " + Arrays.toString(ex1.getRoundedGrades(grades)));
        System.out.println("Max rounded grade: " + ex1.getMaxRoundedGrade(grades));
    }
}