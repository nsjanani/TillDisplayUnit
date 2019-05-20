package com.till.display;

import java.math.BigDecimal;
import java.util.Map;

public class PriceCalculator {

    public BigDecimal calculateTotalPrice(Map<String, BigDecimal> itemMap) {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for(Map.Entry<String, BigDecimal> itemEntry : itemMap.entrySet()) {
            totalPrice = totalPrice.add(itemEntry.getValue());
        }
        return totalPrice;
    }
}
