package com.v4s.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.v4s.shoppingbackend.dao.CategoryDAO;
import com.v4s.shoppingbackend.dto.Category;

@Repository("categoryDAO")	
@Transactional
public class CategoryDAOImpl implements CategoryDAO{


	@Autowired
	private SessionFactory sessionFactory;

	@Override

	public List<Category> list() {

		String selectActiveCategory = "FROM Category WHERE active = :active";

		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);

		query.setParameter("active", true);

		return query.getResultList();
	}

	/**
	 * Getting single category based on id
	 */
	@Override
	public Category getId(int id) {


		return (Category) sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}


	@Override

	public boolean add(Category category) {

		try {
			//add category to database

			sessionFactory.getCurrentSession().persist(category);

			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * updating for single method
	 */
	@Override
	public boolean update(Category category) {
		try {
			//add category to database

			sessionFactory.getCurrentSession().update(category);

			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * DELETING A SINGLE CATEGORY
	 */
	@Override
	public boolean delete(Category category) {

		category.setActive(false);
		try {
			//add category to database

			sessionFactory.getCurrentSession().update(category);

			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


}
