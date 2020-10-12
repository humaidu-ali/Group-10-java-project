package com.company;

import java.util.ArrayList;
import java.util.List;

public class BagOfLectures {


    private List<Lecture> bag;

    public BagOfLectures(List<Lecture> bag) {
        this.bag = new ArrayList<>();
    }

    public  void addLecture(Lecture lecture){
        this.bag.add(lecture);

    }

    public void removeLecture(Lecture lecture){
        this.bag.remove(lecture);
    }

    public void clearLecture(){
        this.bag.clear();
    }
}
