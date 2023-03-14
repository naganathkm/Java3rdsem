package com.lab7;

import javax.persistence.EntityManagerFactory;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories(basePackages = {"com.lab7"})
public class config {
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory()
	{
		LocalEntityManagerFactoryBean factorybean = new LocalEntityManagerFactoryBean();
		factorybean.setPersistenceUnitName("lab7_student");
		return factorybean;
	}
	
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory)
	{
		JpaTransactionManager transactionManager = new JpaTransactionManager();		
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}
}
