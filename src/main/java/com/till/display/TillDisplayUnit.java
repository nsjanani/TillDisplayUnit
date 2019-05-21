package com.till.display;

public class TillDisplayUnit {

    public static void main(String[] args) {

        System.out.println("Hello ! Welcome to the Till...");
        InputData inputData = new InputData();
        inputData.getUserInput();

        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.calculateTotalPrice(inputData.getItemPriceMap(), inputData.getStateCode());
    }

}