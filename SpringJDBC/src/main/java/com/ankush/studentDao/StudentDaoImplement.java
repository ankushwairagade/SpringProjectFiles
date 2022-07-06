package com.ankush.studentDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ankush.entities.Student;

@Component("studentDao")
public class StudentDaoImplement implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		
		String q = "insert into student(id, name, city) values(?,?,?)";
		  int r = this.jdbcTemplate.update(q,student.getId(),student.getName(),student.getCity());

		
		return r;
	}

	
	public int change(Student student) {
		// updating Data
		
		String q = "update student set name=? , city=? where id =?";
		int r=this.jdbcTemplate.update(q,student.getName(),student.getCity(),student.getId());

		return r;
	}


	public int delete(int studentId) {
		// Delete 
	String q = "delete from student where id=?";
	int r = this.jdbcTemplate.update(q,studentId);
		
		return r;
	}

	public Student getStudent(int sudentId) {
		// Getting single student Data
		String q = "select * from student where id=?";
		RowMapper<Student> rowMapper =new RowMapperImle();
		Student  student= this.jdbcTemplate.queryForObject(q, rowMapper,sudentId);
		return student;
	}
	
	public List<Student> getAllStudent() {
		// Getting multiple student
		
		String q ="select * from student";
		List<Student> students =this.jdbcTemplate.query(q,new RowMapperImle());
		return students;
	}

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}







	
}
