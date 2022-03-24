package com.sefolearning.spring.basics.componentscan;

import org.springframework.stereotype.Component;

@Component
public class ComponentJdbcConnection {
	
	public ComponentJdbcConnection() {
		System.out.println("JDBC Connection");
	}
}
