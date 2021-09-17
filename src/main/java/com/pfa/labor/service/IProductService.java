package com.pfa.labor.service;

import com.pfa.labor.dao.entities.Product;
import com.pfa.labor.dto.ProductDTO;

import java.util.List;

public interface IProductService {
    void addProduct(ProductDTO product);

    void updateProduct(Product product);

    void deleteProduct(Long id);

    List<Product> getAll();
}
