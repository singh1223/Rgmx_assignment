package com.example.rgmx.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.example.rgmx.service.CategoryService;
import com.example.rgmx.model.Category;

@RestController
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	@GetMapping("/categories")
	public ResponseEntity<List<Category>> getAllCategory(){
		return ResponseEntity.ok().body(categoryService.getAllCategory());
	}
	
	@PostMapping("/categories")
	public ResponseEntity<Category> createCategory(@RequestBody Category category){
		return ResponseEntity.ok().body(this.categoryService.createCategory(category));
	}
	
	@PutMapping("/categories/{id}")
	public ResponseEntity<Category> updateCategory(@PathVariable long id, @RequestBody Category category){
		category.setId(id);
		return ResponseEntity.ok().body(this.categoryService.updateCategory(category));
	}
}
