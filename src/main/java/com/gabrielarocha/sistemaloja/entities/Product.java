package com.gabrielarocha.sistemaloja.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {
    private Long id;
    private String description;
    private String color;
    private Integer quantity;
    private Double price;
}
