package org.example.clase.clase.product.infraestructure.web.mapper;

import org.example.clase.clase.product.domain.model.Product;
import org.example.clase.clase.product.infraestructure.web.dto.ProductRequest;
import org.example.clase.clase.product.infraestructure.web.dto.ProductResponse;
import org.springframework.stereotype.Component;

@Component
public class ProductDtoMapper {
    public Product toDomain(ProductRequest productRequest) {
        if (productRequest == null) {
            return null;
        }

        return new Product(null, productRequest.getDescription(), productRequest.getPrice());
    }

    public ProductResponse toResponse(Product product) {
        if (product == null) {
            return null;
        }

        return new ProductResponse(product.getId(), product.getDescription(), product.getPrice());
    }
}
