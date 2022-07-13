package com.example.rgmx.service;
import java.util.List;
import com.example.rgmx.model.Category;
public interface CategoryService {
	Category createCategory(Category category);
	Category updateCategory(Category category);
	List<Category> getAllCategory();
}
