package com.mycompany.orderapi.rest.dto;

import com.mycompany.orderapi.model.Order;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
public class OrderDto {

    private UUID orderId;
    private Order.Status status;
    private LocalDateTime created;
    private Set<Item> items;
    private String customerId;

    @Data
    public static class Item {

        private String id;
        private Integer quantity;
        private BigDecimal price;

    }

}
