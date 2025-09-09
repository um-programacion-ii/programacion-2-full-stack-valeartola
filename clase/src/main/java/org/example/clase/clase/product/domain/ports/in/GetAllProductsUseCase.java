package org.example.clase.clase.product.domain.ports.in;

import org.example.clase.clase.product.domain.model.Product;

import java.util.List;

public interface GetAllProductsUseCase {

    List<Product> getAllProducts();
}
