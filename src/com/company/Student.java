package com.company;

import java.util.List;

public class Student implements Nameable,HasLevel {
    private String name;
    private List<Double> grades;
    private Level yourLevel;



    //constructor

    public Student(String name, List<Double> grades, Level yourLevel) {
        this.grades = grades;
        this.name = name;
        this.yourLevel = yourLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.yourLevel = yourLevel;
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

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Level getLevel() {
        return this.yourLevel;


    }
}
