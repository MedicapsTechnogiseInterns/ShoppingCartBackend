package com.technogise.interns.shoppingcart.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class Cart {

    private UUID id;
    private String name;
    private String image;
    private BigDecimal price;
    private int quantity;
}
