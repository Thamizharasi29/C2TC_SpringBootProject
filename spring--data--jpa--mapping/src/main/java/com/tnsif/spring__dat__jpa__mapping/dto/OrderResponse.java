package com.tnsif.spring__dat__jpa__mapping.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class OrderResponse {
    private String name;
    private String productName;
    private int price;

    // Constructor for JPQL projection
    public OrderResponse(String name, String productName, int price) {
        this.name = name;
        this.productName = productName;
        this.price = price;
    }
}
