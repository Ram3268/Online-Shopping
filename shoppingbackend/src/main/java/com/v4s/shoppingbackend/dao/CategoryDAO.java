package com.v4s.shoppingbackend.dao;

import java.util.List;

import com.v4s.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	
	List<Category> list();
	Category getId(int id);
	
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);

}
