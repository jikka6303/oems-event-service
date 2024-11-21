package com.bits.oems.payment.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
public class OrderDTO {

    private String orderId;

    private String orderDate;

    private String orderStatus;

    private String orderTotal;

    private Set<String> orderItems;

    private Set<String> deliveries;

    @NotBlank
    private String restaurantId;

}
