package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> grades = new ArrayList<>(Arrays.asList(10.0,20.0,30.0));
        //grades.add
        Student student = new Student("Hash",grades, Level.L200);
        System.out.println(student.getLevel());

    }
}
