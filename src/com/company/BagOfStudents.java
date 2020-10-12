package com.company;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents {

    private List<Student>bag;

    public BagOfStudents(List<Student> bag) {
        this.bag = new ArrayList<>();
    }

    public  void addStudent(Student student){
        this.bag.add(student);

    }

    public void removeStudent(Student student){
        this.bag.remove(student);
    }

    public void clearStudent(){
      this.bag.clear();
    }
}
