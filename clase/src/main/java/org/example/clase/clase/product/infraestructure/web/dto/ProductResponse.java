package org.example.clase.clase.product.infraestructure.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductResponse {

    private Long id;
    private String description;
    private BigDecimal price;

    public ProductResponse(Long id, String description, BigDecimal id1) {

    }
}
