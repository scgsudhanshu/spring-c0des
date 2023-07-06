package com.springpractice.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springpractice.jdbc.dao.SeatDaoImpl;

@Configuration
@ComponentScan(basePackages= {"com.springpractice.jdbc.dao"})
public class jdbcConfigAW {
	@Bean("ds")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/project");
		ds.setUsername("root");
		ds.setPassword("mysqlpassword@1234");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getjdbcTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
}
