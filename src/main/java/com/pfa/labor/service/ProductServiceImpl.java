package com.pfa.labor.service;

import com.pfa.labor.dao.entities.Product;
import com.pfa.labor.dao.entities.Product;
import com.pfa.labor.dao.repositories.IProductRepository;
import com.pfa.labor.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.pfa.labor.dto.ProductDTO.fromDtoToEntity;

@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    private IProductRepository repository;

    @Override
    public void addProduct(ProductDTO product) {
        repository.save(fromDtoToEntity(product));
    }

    @Override
    public void updateProduct(Product product) {
        if(product != null && product.getId() != null){
            Optional<Product> ProductFromDb = repository.findById(product.getId());
            if(ProductFromDb.isPresent()){
                repository.save(product);
            }
        }
    }

    @Override
    public void deleteProduct(Long id) {
        if (id != null){
            repository.deleteById(id);
        }

    }

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }
}
