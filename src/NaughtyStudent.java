import java.util.List;

public class NaughtyStudent extends Student {


    public NaughtyStudent(List<Double> grade) {
        super(grade);
    }

    public double getAverageGrade() {
        return super.getAverageGrade() + (0.1 * super.getAverageGrade());

    }
}
