package com.pfa.labor.dao.repositories;

import com.pfa.labor.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
