package org.mensageria.ecom;

import java.math.BigDecimal;

public class Order {

    private final String UserId, OrderId;
    private final BigDecimal value;


    public Order(String userId, String orderId, BigDecimal value) {
        UserId = userId;
        OrderId = orderId;
        this.value = value;
    }
}


