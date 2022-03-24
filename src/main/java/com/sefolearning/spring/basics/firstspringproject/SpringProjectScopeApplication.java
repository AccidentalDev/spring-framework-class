package com.sefolearning.spring.basics.firstspringproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sefolearning.spring.basics.firstspringproject.scope.PersonDAO;

@SpringBootApplication
public class SpringProjectScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringProjectScopeApplication.class);

	public static void main(String[] args) {
		  
		//Get the application context for the beans
		ApplicationContext appContext = SpringApplication.run(SpringProjectScopeApplication.class, args);
		
		PersonDAO personDAO = appContext.getBean(PersonDAO.class);
		
		PersonDAO personDAO2 = appContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
	}

}
