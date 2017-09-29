package com.v4s.spring.shoppingbackentest;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.v4s.shoppingbackend.dao.CategoryDAO;
import com.v4s.shoppingbackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		
		context =  new AnnotationConfigApplicationContext();
		context.scan("com.v4s.shoppingbackend");
		context.refresh();
		
		categoryDAO =  (CategoryDAO) context.getBean("categoryDAO");
	}
	
/*	@Test
	public void testAddCategory() {
		
		category = new Category();
		category.setName("IPHONE");
		category.setDescription("FEATURES OF IPHONE 6S");
		category.setImageURL("iphone.png");
		category.setActive(true);
		
		assertEquals("succesfully added to database", true, categoryDAO.add(category));
	}
*/
	
/*	@Test
	public void testGetCategory() {
		category = categoryDAO.getId(1);
		assertEquals("succesfully fectched single category","LAPTOP",category.getName());
	}
	*/
	
/*	@Test
	public void testUpdateCategory() {
		category = categoryDAO.getId(1);
		category.setName("TV");
		assertEquals("succesfully fectched single category",true,categoryDAO.update(category));
	}
	*/
		
/*		@Test
	public void testDeleteCategory() {
		category = categoryDAO.getId(1);
		category.setName("TV");
		assertEquals("succesfully fectched single category",true,categoryDAO.delete(category));
	}
	*/
	
	/*@Test
	public void testListCategory() {
		
		assertEquals("succesfully fectched list category",3,categoryDAO.list().size());
	}*/
	
	@Test
	public void testCRUDCategory() {
		
		//adding new category
		category = new Category();
		category.setName("IPHONE");
		category.setDescription("FEATURES OF IPHONE 6S");
		category.setImageURL("iphone.png");
		category.setActive(true);
		
		
		assertEquals("succesfully added to database", true, categoryDAO.add(category));
		
		category = new Category();
		category.setName("IPHONE");
		category.setDescription("FEATURES OF IPHONE 6S");
		category.setImageURL("iphone.png");
		category.setActive(true);
		
		
		assertEquals("succesfully added to database", true, categoryDAO.add(category));
		//fetching and updating category
		category = categoryDAO.getId(1);
		category.setName("TV");
		assertEquals("succesfully fectched single category",true,categoryDAO.delete(category));
		
		//deleting categoty
		
		assertEquals("succesfully fectched single category",true,categoryDAO.delete(category));
	}
	
}
