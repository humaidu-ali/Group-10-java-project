
import java.util.*;

public class Student {
    private List<Double> grades;

    //constructor

    public Student(List<Double> grades) {
        this.grades = grades;
    }

    //setters


    public void setGrades(List<Double> grades) {

        this.grades = grades;
    }
    // getters


    public List<Double> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        double size = grades.size();
        double sum = 0;
        for (double i : grades) {
            sum += i;

        }

        double averageGrade = (sum / size);
        return averageGrade;
    }

}
