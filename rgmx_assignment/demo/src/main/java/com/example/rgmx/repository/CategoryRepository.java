package com.example.rgmx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rgmx.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
