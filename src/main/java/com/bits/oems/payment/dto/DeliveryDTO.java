package com.bits.oems.payment.dto;

import lombok.Data;

@Data
public class DeliveryDTO {

    private String id;
    private String orderId;
    private String deliveryPersonId;
    private String status;
    private String deliveryAddress;
}
