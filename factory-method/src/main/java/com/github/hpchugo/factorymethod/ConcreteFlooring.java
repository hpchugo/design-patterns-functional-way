package com.github.hpchugo.factorymethod;

public class ConcreteFlooring implements Flooring {
    @Override
    public void installation() {
        System.out.println("The Concrete flooring is installed");
    }
}
