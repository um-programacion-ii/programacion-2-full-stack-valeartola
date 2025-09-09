package org.example.clase.clase.product.infraestructure.persistence.repository;


import org.example.clase.clase.product.infraestructure.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRepository extends JpaRepository<ProductEntity, Long> {
}
