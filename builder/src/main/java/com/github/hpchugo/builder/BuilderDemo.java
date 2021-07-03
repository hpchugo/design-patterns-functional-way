package com.github.hpchugo.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        MobileBuilder builder = new MobileBuilder();
        var mobile = builder.with(myBuilder -> {
            myBuilder.ram = 4;
            myBuilder.battery = 4000;
            myBuilder.processor = "A12 Bionic";
        }).createMobile();
        System.out.println(mobile);
    }
}
