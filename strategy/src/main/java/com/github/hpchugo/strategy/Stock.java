package com.github.hpchugo.strategy;

public class Stock {
    private String symbol;
    private double price;
    private double unit;

    public Stock(String symbol, double price, double unit) {
        this.symbol = symbol;
        this.price = price;
        this.unit = unit;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public double getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                ", unit=" + unit +
                '}';
    }
}
