package com.v4s.spring.OnlineShopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.v4s.shoppingbackend.dao.CategoryDAO;
import com.v4s.shoppingbackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value= {"/","/home"})
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");

		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickHome",true);
		return mv;
	}

	@RequestMapping(value= {"/about"})
	public ModelAndView about() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About");
		mv.addObject("userClickAbout",true);
		return mv;
	}

	@RequestMapping(value= {"/contact"})
	public ModelAndView contact() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact");
		mv.addObject("userClickContact",true);
		return mv;
	}

	@RequestMapping(value= {"/products"})
	public ModelAndView products() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Products");
		mv.addObject("userClickProducts",true);
		return mv;
	}

	/**
	 * 
	 * Methods to load all products based on categories
	 */
	@RequestMapping(value= {"/show/all/products"})
	public ModelAndView showAllProducts() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All Products");

		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAllProducts",true);
		return mv;
	}

	@RequestMapping(value= {"/show/category/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {

		ModelAndView mv = new ModelAndView("page");
		
		// categoryDAO to fetch a single variable
		Category category = null;
		category = categoryDAO.getId(id);
		
		mv.addObject("title",category.getName());

		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		
		//passing single category
		mv.addObject("category",category);
		
		mv.addObject("userClickCategoryProducts",true);
		return mv;
	}
}
