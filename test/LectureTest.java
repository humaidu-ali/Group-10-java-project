import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

class LectureTest {

    List<Double> grades = new ArrayList<>(Arrays.asList(10.0, 20.0, 30.0));
    List<Double> grades2 = new ArrayList<>(Arrays.asList(20.7, 26.0, 60.0));
    List<Double> grades3 = new ArrayList<>(Arrays.asList(45.0, 29.0, 32.0));

    Student student = new Student(grades);
    Student student2 = new Student(grades2);
    Student student3 = new Student(grades3);


    Lecture lecture = new Lecture();

    @Test
    void enter(){

//        lecture.enter(student);
        assertTrue(lecture.enter(student));
    }
    @Test
    void getHighestAverage() {
        lecture.enter(student);
        lecture.enter(student2);
        lecture.enter(student3);
        assertEquals(35.56666666666667, lecture.getHighestAverage(), 35.0000000000);
    }
}