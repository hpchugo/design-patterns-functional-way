package com.github.hpchugo.fluentinterface;

public class FluentShopping {
    public static void main(String[] args) {
        Order.place(order ->
                order.add("Shoes")
                        .add("HeadPhone")
                        .deliverAt("Street nº45 - NY"));
    }
}
