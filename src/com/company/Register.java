package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class Register {
    private List<Student>studentName;

    public Register(List<Student> studentName) {
        this.studentName = studentName;
    }

    public List<String> getRegister(){
    List<String>names = new ArrayList<>();

    for (Student student : studentName){
            names.add(student.getName());

    }
        return names;

    }

    List<String> getRegisterByLevel(Level level){
        List<String>levelOfStudentsNames = new ArrayList<>();

        for (Student student : studentName){
            if(student.getLevel().equals(level)){
                levelOfStudentsNames.add(student.getName());
            }
        }

        return levelOfStudentsNames;

    }

   /* String printReport(){

    }*/
}
