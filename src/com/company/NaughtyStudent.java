package com.company;

import java.util.List;

public class NaughtyStudent extends Student{

    public NaughtyStudent(String name, List<Double> grades, Level yourLevel) {
        super(name, grades, yourLevel);
    }

    public double getAverageGrade() {
        return super.getAverageGrade() + (0.1 * super.getAverageGrade());

    }
}
