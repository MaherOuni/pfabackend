package com.pfa.labor.service;

import com.pfa.labor.dao.entities.Category;
import com.pfa.labor.dao.repositories.ICategoryRepository;
import com.pfa.labor.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.pfa.labor.dto.CategoryDTO.fromDtoToEntity;

@Service
public class CateogryServiceImpl implements ICategoryService{
    @Autowired
    private ICategoryRepository repository;

    @Override
    public void addCategory(CategoryDTO Category) {
        repository.save(fromDtoToEntity(Category));
    }

    @Override
    public void updateCategory(Category Category) {
        if(Category != null && Category.getId() != null){
            Optional<Category> CategoryFromDb = repository.findById(Category.getId());
            if(CategoryFromDb.isPresent()){
                repository.save(Category);
            }
        }
    }

    @Override
    public void deleteCategory(Long id) {
        if (id != null){
            repository.deleteById(id);
        }

    }

    @Override
    public List<Category> getAll() {
        return repository.findAll();
    }
}
