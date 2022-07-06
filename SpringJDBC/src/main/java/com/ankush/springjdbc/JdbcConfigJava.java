package com.ankush.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.ankush.studentDao.StudentDao;
import com.ankush.studentDao.StudentDaoImplement;

@Configuration
@ComponentScan(basePackages= {"com.ankush.studentDao"})
public class JdbcConfigJava {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds =new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("ankush");
		ds.setPassword("Ankush@2020");
		
		return ds;
	}

	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	
	/* make it as component
	 * 
	 * @Bean("studentDao") public StudentDao getStudentDao() { StudentDaoImplement
	 * studentDao = new StudentDaoImplement();
	 * studentDao.setJdbcTemplate(getTemplate());
	 * 
	 * 
	 * return studentDao; }
	 */
	
}
