import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

    private List<Student> studentList = new ArrayList<>();

    public boolean enter(Student student) {
        if(this.studentList.add(student)){
            return true;
        }
        return false;
    }

    public double getHighestAverage() {

        double max = 0.0;
        for (Student s : this.studentList) {
            if (s.getAverageGrade() > max) {
                max = s.getAverageGrade();
            }
        }
        return max;


    }

}
