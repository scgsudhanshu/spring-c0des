package com.spring.jdbc;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.dao.SeatDaoImpl;
import com.spring.jdbc.dao.SeatDao;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;


@Configuration
public class SpringConfig 
{
	@Bean("ds")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds =new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver"); 
		ds.setUrl("jdbc:mysql://localhost:3306/project");
		ds.setUsername("root");
		ds.setPassword("mysqlpassword@1234");
		return ds;
	}
	
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean("seatDao")
	public SeatDao getSeatDao()
	{
		SeatDaoImpl seatDao = new SeatDaoImpl();
		seatDao.setJdbcTemplate(getJdbcTemplate());
		return seatDao;
	}
	
	
}
