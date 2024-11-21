package com.bits.oems.payment.dto;

import lombok.Data;

import java.time.LocalTime;
import java.util.Set;

@Data
public class RestaurantDTO {

    private String name;
    private String address;
    private String phone;
    private String restaurantType;
    private Set<String> foodItems;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private Set<String> deliveryAreas;

}
