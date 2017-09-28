package com.v4s.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.v4s.shoppingbackend.dao.CategoryDAO;
import com.v4s.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		
		//adding first category
	

		Category category2 = new Category();
		category2.setId(1);
		category2.setName("LAPTOP");
		category2.setDescription("FEATURES OF IPHONE 6S");
		category2.setImageURL("iphone.png");
		categories.add(category2);
		
		Category category3 = new Category();
		category3.setId(2);
		category3.setName("SAMSUNG");
		category3.setDescription("FEATURES OF IPHONE 6S");
		category3.setImageURL("iphone.png");
		categories.add(category3);
		
		Category category4 = new Category();
		category4.setId(3);
		category4.setName("Iphone");
		category4.setDescription("FEATURES OF IPHONE 6S");
		category4.setImageURL("iphone.png");
		categories.add(category4);
		
		Category category1 = new Category();
		category1.setId(4);
		category1.setName("Television");
		category1.setDescription("FEATURES OF IPHONE 6S");
		category1.setImageURL("iphone.png");
		categories.add(category1);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		
		return categories;
	}

	@Override
	public Category getId(int id) {
		
		for(Category category: categories) {
			if(category.getId() == id) {
				return category;
			}
		}
		return null;
	}

	
}
