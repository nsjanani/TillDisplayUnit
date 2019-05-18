package com.till.display;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInput {

    public Map getNValidateUserInput() {
        Map<String, BigDecimal> itemPriceMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of items (in number) : ");
        System.out.println("----------------------------------------------------------------");
        int noOfItems;
        while (!scanner.hasNextInt()) {
            String itemNumberInput = scanner.next();
            System.out.println("Sorry, invalid input ! Please enter a valid input in number.");
        }
        noOfItems = scanner.nextInt();

        System.out.println("----------------------------------------------------------------");
        System.out.println("Please enter the item name and price (in $) for all the items : ");
        for (int i = 0; i < noOfItems; i++) {

            System.out.println("Item Name : ");
            String itemName = scanner.next();

            System.out.println("Price (in $ with exactly two decimal places as 32.00) : ");
            BigDecimal price;
            do {
                while (!scanner.hasNextBigDecimal()) {
                    String priceInput = scanner.next();
                    System.out.println("Sorry, invalid input ! Please enter a valid input in number with 2 decimal places");
                }
                price = scanner.nextBigDecimal();
            } while (!isPriceDecimalValid(price));

            itemPriceMap.put(itemName, price);
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("Please enter the state code (UT, NV, TX, AL, CA) : ");
        String stateCode = null;
        do {
            stateCode = scanner.next();
        } while (!isStateCodeValid(stateCode));

        System.out.println("----------------------------------------------------------------");

        return itemPriceMap;
    }

    public boolean isPriceDecimalValid(BigDecimal price) {
        if (price.scale() == 2)
            return true;
        else {
            System.out.println("Sorry, invalid input ! Please make sure whether your input has exactly 2 decimal places");
            return false;
        }
    }

    public boolean isStateCodeValid(String stateCode) {
        StateCode[] codes = StateCode.values();
        for (StateCode code : codes) {
            if (stateCode.equals(code.toString()))
                return true;
        }
        System.out.println("Sorry, invalid input ! Please make sure whether your input matches any in the given state code list");
        return false;
    }

}