package com.sefolearning.spring.basics.firstspringproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sefolearning.spring.basics.componentscan.ComponentDAO;

//NOTE: If you want Spring to look for beans on different packages you can add the annotation @ComponentScan()
//      and then define the full path of the package you want to look for beans

@SpringBootApplication
@ComponentScan("com.sefolearning.spring.basics.componentscan")
public class SpringProjectComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringProjectComponentScanApplication.class);

	public static void main(String[] args) {
		
		//Get the application context for the beans
		ApplicationContext appContext = SpringApplication.run(SpringProjectComponentScanApplication.class, args);
		
		ComponentDAO componentDAO = appContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getJdbcConnection());
	}

}
