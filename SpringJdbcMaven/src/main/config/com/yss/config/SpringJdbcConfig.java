package com.yss.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.yss.daos.EmployeeDao;
import com.yss.daos.EmployeeDaoImpl;

@Configuration
public class SpringJdbcConfig {
	@Bean
	public DataSource dataSource() {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("hr");
		bds.setPassword("hr");
		bds.setInitialSize(10);
		bds.setMaxActive(15);
		return bds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource ds) {
		
		   return new JdbcTemplate(ds);
	}
	
	@Bean(name = "empdao" )
	public EmployeeDao empDao(){
		
		return new EmployeeDaoImpl();
	}
}
