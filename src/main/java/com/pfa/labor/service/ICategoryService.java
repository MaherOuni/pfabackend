package com.pfa.labor.service;

import com.pfa.labor.dao.entities.Category;
import com.pfa.labor.dto.CategoryDTO;

import java.util.List;

public interface ICategoryService {
    void addCategory(CategoryDTO Category);

    void updateCategory(Category Category);

    void deleteCategory(Long id);

    List<Category> getAll();
}
