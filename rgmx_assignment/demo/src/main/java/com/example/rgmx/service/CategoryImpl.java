package com.example.rgmx.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.rgmx.exception.CategoryNotFoundException;
import com.example.rgmx.model.Category;
import com.example.rgmx.repository.CategoryRepository;

@Service
@Transactional
public class CategoryImpl implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository ;

	@Override
	public Category createCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		Optional<Category> categoryDb = this.categoryRepository.findById(category.getId());
		if(categoryDb.isPresent()) {
	        Category categoryUpdate = categoryDb.get();
			categoryUpdate.setId(category.getId());
			categoryUpdate.setName(category.getName());
			categoryUpdate.setDescription(category.getDescription());
			categoryRepository.save(categoryUpdate);
			return categoryUpdate;
		} else {
			throw new CategoryNotFoundException("Record not found with id : " + category.getId());
		}
	}

	@Override
	public List<Category> getAllCategory() {
		return this.categoryRepository.findAll();
		// TODO Auto-generated method stub
	}

}
