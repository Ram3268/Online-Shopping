package com.v4s.shoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= {"com.v4s.shoppingbackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {

	private final static String DATABASE_URL="jdbc:mysql://localhost:3306/onlineshopping";
	private final static String DATABASE_DRIVER="com.mysql.jdbc.Driver";
	private final static String DATABASE_DIALECT="org.hibernate.dialect.MySQLDialect";
	private final static String DATABASE_USERNAME="root";
	private final static String DATABASE_PASSWORD="root";
	
	
	
	//DATASOURCE BEAN
	@Bean
	public DataSource getDataSource() {
		
		BasicDataSource dataSource = new  BasicDataSource();
		
		dataSource.setUrl(DATABASE_URL);
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		
		return dataSource;
	}
	
	//SESSIONFACTORY BEAN 
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {
		
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		

		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.v4s.shoppingbackend.dto");
		
		return builder.buildSessionFactory();
		
	}

	//Hibernate properties available
	private Properties getHibernateProperties() {
		
		Properties properties =  new Properties();
		
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		
		return properties;
	}
	
	//transcation
	@Bean
	public HibernateTransactionManager getTranscationManager(SessionFactory sessionFactory) {
		
		HibernateTransactionManager transcationManager = new HibernateTransactionManager(sessionFactory);
		
		return transcationManager;
		
	}
	
	
	
	
	
	
}
