package com.till.display;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class PriceCalculator {

    public void calculateTotalPrice(Map<String, BigDecimal> itemMap, String stateCode) {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for(Map.Entry<String, BigDecimal> itemEntry : itemMap.entrySet()) {
            totalPrice = totalPrice.add(itemEntry.getValue());
        }
        System.out.println("Your Payslip (in $)             ");
        System.out.println("---------------------------------------------");
        System.out.println("Total Price (in $ without tax): " + totalPrice);
        BigDecimal taxPrice = getStateTaxPrice(stateCode, totalPrice);
        System.out.println("Tax Price (in $):               " + taxPrice);
        totalPrice = totalPrice.add(taxPrice);
        System.out.println("Total Price to pay (in $)       " + totalPrice);
    }

    public BigDecimal getStateTaxPrice(String stateCode, BigDecimal totalPrice) {
        BigDecimal stateTaxPercent = new BigDecimal(StateCodes.valueOf(stateCode).tax);
        BigDecimal stateTaxPrice = totalPrice.multiply(stateTaxPercent);
        stateTaxPrice = stateTaxPrice.setScale(2, RoundingMode.FLOOR);
        return stateTaxPrice;
    }
}
