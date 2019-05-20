package com.till.display;

public class TillDisplayUnit {

    public static void main(String[] args) {

        System.out.println("Hello ! Welcome to the Till...");
        InputData inputData = new InputData();
        inputData.getUserInput();

        PriceCalculator priceCalculator = new PriceCalculator();
        System.out.println("Your Total Price (in $) is : ");
        System.out.println("$ "+ priceCalculator.calculateTotalPrice(inputData.getItemPriceMap()));
    }

}