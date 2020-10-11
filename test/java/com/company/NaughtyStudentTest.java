package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    List<Double> grades = new ArrayList<>(Arrays.asList(10.0,20.0,30.0));
    NaughtyStudent afi = new NaughtyStudent ("Man",grades,Level.L200);
    @Test
    public void getAverageGrade() {
        assertEquals(22.0,  afi.getAverageGrade());
    }
}