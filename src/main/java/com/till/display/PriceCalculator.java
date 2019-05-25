package com.till.display;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class PriceCalculator {

    public void calculateTotalPrice(Map<String, BigDecimal> itemMap, String stateCode) {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for(Map.Entry<String, BigDecimal> itemEntry : itemMap.entrySet()) {
            totalPrice = totalPrice.add(itemEntry.getValue());
        }
        System.out.println("Your Total Payment                           ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Total Items Price             " + currencyFormat(totalPrice));
        BigDecimal discountPrice = getDiscountPrice(totalPrice);
        System.out.println("Discount                   -  " + currencyFormat(discountPrice));
        totalPrice = totalPrice.subtract(discountPrice);
        System.out.println("Price after discount          " + currencyFormat(totalPrice));
        BigDecimal taxPrice = getStateTaxPrice(stateCode, totalPrice);
        System.out.println("Tax                        +  " + currencyFormat(taxPrice));
        totalPrice = totalPrice.add(taxPrice);
        System.out.println("Total Amount to pay           " + currencyFormat(totalPrice));
    }

    public BigDecimal getStateTaxPrice(String stateCode, BigDecimal totalPrice) {
        BigDecimal stateTaxPercent = new BigDecimal(StateCodes.valueOf(stateCode).tax);
        BigDecimal stateTaxPrice = totalPrice.multiply(stateTaxPercent);
        stateTaxPrice = stateTaxPrice.setScale(2, RoundingMode.FLOOR);
        return stateTaxPrice;
    }

    public BigDecimal getDiscountPrice(BigDecimal totalPrice) {
        double price = totalPrice.doubleValue();
        double discount_rate = 0;
        if (price >= 150000)
            discount_rate = 0.15;
        else if (price >= 10000)
            discount_rate = 0.1;
        else if (price >= 7000)
            discount_rate = 0.07;
        else if (price >= 5000)
            discount_rate = 0.05;
        else if (price >= 1000)
            discount_rate = 0.03;

        return totalPrice.multiply(new BigDecimal(discount_rate)).setScale(2, RoundingMode.FLOOR);
    }

    public static String currencyFormat(BigDecimal n) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(n);
    }
}
