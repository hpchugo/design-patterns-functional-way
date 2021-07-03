package com.github.hpchugo.iterator;

public class IteratorPattern {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(new Object[]{1,485,0,8,54});
        list.forEach(System.out::println);
    }
}
