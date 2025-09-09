package org.example.clase.clase.product.infraestructure.persistence.mapper;

import org.example.clase.clase.product.domain.model.Product;
import org.example.clase.clase.product.infraestructure.persistence.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductEntity toEntity(Product product) {
        if (product == null)
            return null;

        return new ProductEntity(product.getId(), product.getDescription(), product.getPrice());
    }

    public Product toDomain(ProductEntity productEntity) {
        if (productEntity == null)
            return null;

        return new Product(productEntity.getId(), productEntity.getDescription(), productEntity.getPrice());
    }
}