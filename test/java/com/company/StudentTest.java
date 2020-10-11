package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    List<Double> grades = new ArrayList<>(Arrays.asList(10.0,20.0,30.0));

    Student student = new Student("Hash",grades,Level.L200);


    @Test
    void getAverageGrade() {
        assertEquals(20.0,student.getAverageGrade());
    }

}