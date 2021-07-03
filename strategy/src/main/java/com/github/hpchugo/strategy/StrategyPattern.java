package com.github.hpchugo.strategy;

import java.util.Arrays;
import java.util.List;

public class StrategyPattern {
    public static void main(String[] args) {
        List<Stock> stockList = Arrays.asList(
                new Stock("APPL", 318.65, 10),
                new Stock("MSFT", 166.86, 45),
                new Stock("Google", 99, 12.5),
                new Stock("AMZ", 1866.74, 45),
                new Stock("GOOGL", 1480.20, 3.5),
                new Stock("AAPL", 318.65, 8),
                new Stock("AMZ", 1866.74, 9));
        StockFilters.filter(stockList, stock -> stock.getSymbol().equals("AMZ")).forEach(System.out::println);
        System.out.println("------------------------------------------");
        StockFilters.filter(stockList, stock -> stock.getPrice() > 300).forEach(System.out::println);
    }
}
