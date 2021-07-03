package com.github.hpchugo.factorymethod;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        Flooring floor = FlooringFactory.getFlooring(-1, 19);
        floor.installation();
    }
}
