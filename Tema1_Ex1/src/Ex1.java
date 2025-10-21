public class Ex1{
    public int[] getFailingGrades(int[] grades){
        int size = 0;
        for(int grade : grades){
            if(grade < 40){
                size++;
            }
        }
        int[] failingGrades = new int[size];
        int index = 0;
        for (int grade : grades){
            if(grade < 40){
                failingGrades[index++] = grade;
            }
        }
        return failingGrades;
    }

    public double getAverageGrade(int[] grades){
        if (grades.length == 0) return 0;
        int sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        double avg = (double)sum/grades.length;
        return Math.round(avg * 100.0) / 100.0;
    }
}