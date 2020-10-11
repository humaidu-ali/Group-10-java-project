package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

     List<Student> listOfStudents = new ArrayList<>();

    List<Double> grades = new ArrayList<>(Arrays.asList(10.0, 20.0, 30.0));
    List<Double> grades2 = new ArrayList<>(Arrays.asList(20.7, 26.0, 60.0));
    List<Double> grades3 = new ArrayList<>(Arrays.asList(45.0, 29.0, 32.0));

    Student student = new Student("Hash",grades,Level.L200);
    Student student1 = new Student("Kofi",grades,Level.L200);
    Student student2 = new Student("Max",grades2,Level.L200);
    Student student3 = new Student("Theo",grades3,Level.L200);



    @Test
    void getRegister() {
     listOfStudents.add(student);
     listOfStudents.add(student1);
     listOfStudents.add(student2);
     listOfStudents.add(student3);

        Register neewStudents = new Register(listOfStudents);

        assertEquals("Hash",student.getName());
        assertEquals("Kofi",student1.getName());
        assertEquals("Max",student2.getName());
        assertEquals("Theo",student3.getName());
        assertTrue(listOfStudents.contains(student));

    }
}