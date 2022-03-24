package com.sefolearning.spring.basics.firstspringproject.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

//NOTE: If we want to be sure a new instance of this class is created every time the dependency
//      injector finds a request to it, we need to add the proxyMode=TARGET_CLASS. Otherwise
//      we will get the same instance even if the scope was set to PROTOTYPE. That is because
//      we are not directly requesting an instance of this class through ApplicationContext.getBean()
//      and instead is being dynamically injected to the classes requesting it.

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)
public class PersonDAO {
	
	@Autowired
	JdbcConnection jdbcConnection;

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	

}
