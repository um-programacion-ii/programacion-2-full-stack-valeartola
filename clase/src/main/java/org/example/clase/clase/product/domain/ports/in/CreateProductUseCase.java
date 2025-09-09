package org.example.clase.clase.product.domain.ports.in;

import org.example.clase.clase.product.domain.model.Product;

public interface CreateProductUseCase {
    Product createProduct(Product product);
}
