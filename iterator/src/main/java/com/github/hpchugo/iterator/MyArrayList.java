package com.github.hpchugo.iterator;

import java.util.function.Consumer;

public class MyArrayList {
    Object[] elements = new Object[5];

    public MyArrayList(Object[] elements) {
        this.elements = elements;
    }

    public void forEach(Consumer action){
        for (var element : elements) {
            action.accept(element);
        }
    }

    public Object[] getElements() {
        return elements;
    }
}
