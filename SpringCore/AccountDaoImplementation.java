package com.ankush.LoginAutho.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ankush.LoginAutho.Entities.Account;


@Component("accountDao")
public class AccountDaoImplementation implements AccountDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int createUser(Account account) {
		
		String q = "insert into account(fname, lname, email, password) values(?,?,?,?)";
		  int r = this.jdbcTemplate.update(q,account.getFname(),account.getLname(),account.getEmail(),account.getPassword());
		  
		return r;
	}
	
	public Account readUser(String email) {
		
		String q = "select * from account where email=?";
		RowMapper<Account> rowMapper =new RowMapperImplement();
		Account  account= this.jdbcTemplate.queryForObject(q, rowMapper,email);
		return account;

	}

	public Account loginUser(String email, String password) {
		String q = "select * from account where email=? and password=?";
		RowMapper<Account> rowMapper =new RowMapperImplement();
		Account  account= this.jdbcTemplate.queryForObject(q, rowMapper,email,password);
		return account;
		
	}

	
	
	


	public int updateUser(Account account) {

		String q = "update account set fname=? , lname=? where email =? and password=?";
		int r=this.jdbcTemplate.update(q,account.getFname(),account.getLname(),account.getEmail(),account.getPassword());

		return r;

	}


	
	public int deleteUser(String email,String password) {
		String q = "delete from account where email=? and password=?";
		int r = this.jdbcTemplate.update(q,email,password);
			
			return r;
	}

	public List<Account> readDB() {
		String q ="select * from account";
		List<Account> account =this.jdbcTemplate.query(q,new RowMapperImplement());
		return account;
	}




	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}






	
}
