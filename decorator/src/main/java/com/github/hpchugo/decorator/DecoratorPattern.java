package com.github.hpchugo.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        var myOrder = new BurgerShop(burger -> burger.addVeggies()).use(new Burger()).addCheese();
        System.out.println(myOrder);
    }
}
