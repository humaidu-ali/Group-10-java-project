import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NaughtyStudentTest {
    List<Double> grades = new ArrayList<>(Arrays.asList(10.0,40.0,30.0,20.0));
    NaughtyStudent afi = new NaughtyStudent (grades);
    @Test
    public void getAverageGrade() {
        assertEquals(27.5,  afi.getAverageGrade(), 20.0);
    }
}