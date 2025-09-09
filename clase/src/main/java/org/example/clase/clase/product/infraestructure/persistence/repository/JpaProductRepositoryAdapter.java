package org.example.clase.clase.product.infraestructure.persistence.repository;

import lombok.RequiredArgsConstructor;
import org.example.clase.clase.product.domain.model.Product;
import org.example.clase.clase.product.domain.ports.out.ProductRepository;
import org.example.clase.clase.product.infraestructure.persistence.entity.ProductEntity;
import org.example.clase.clase.product.infraestructure.persistence.mapper.ProductMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class JpaProductRepositoryAdapter implements ProductRepository {

    private final JpaProductRepository jpaProductRepository;
    private final ProductMapper productMapper;

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = productMapper.toEntity(product);
        ProductEntity savedProduct = jpaProductRepository.save(productEntity);
        return productMapper.toDomain(savedProduct);
    }

    @Override
    public Optional<Product> findById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Product> findAll() {
        return jpaProductRepository.findAll()
                .stream()
                .map(productMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Product> update(Long id, Product product) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

}

