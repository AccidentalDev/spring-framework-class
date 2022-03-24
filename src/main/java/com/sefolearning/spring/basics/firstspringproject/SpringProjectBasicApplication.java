package com.sefolearning.spring.basics.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sefolearning.spring.basics.firstspringproject.basics.BinarySearch;

@SpringBootApplication
public class SpringProjectBasicApplication {
	
	//What do we need to use Sprint's dependency injection:
	//     Define the beans -> Add @Component
	//     Define the dependencies of a bean
	//     Define where to search for beans -> No need (@SpringBootApplication is defined for that)

	public static void main(String[] args) {
		  
		//Get the application context for the beans
		ApplicationContext appContext = SpringApplication.run(SpringProjectBasicApplication.class, args);
		BinarySearch binarySearch = appContext.getBean(BinarySearch.class);
		
		int result = binarySearch.doBinarySearch(new int[] {45, 123, 4, 18}, 3);
		System.out.println(result);
		
		SpringApplication.run(SpringProjectBasicApplication.class, args);
	}

}
