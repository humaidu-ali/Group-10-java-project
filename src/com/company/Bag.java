package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bag<E> {

    List<E> bag;

    public Bag(List<E> bag) {
        this.bag = new ArrayList<>();
    }

    void add(E obj){
        bag.add(obj);
    }

    void remove(E obj){
        bag.remove(obj);
    }

    void clear(){
        bag.clear();
    }
}
