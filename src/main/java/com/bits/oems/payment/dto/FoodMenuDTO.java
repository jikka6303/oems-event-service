package com.bits.oems.payment.dto;

import lombok.Data;

@Data
public class FoodMenuDTO {

    private String id;
    private String name;
    private String description;
    private String price;
    private String category;
    private boolean available;
}
