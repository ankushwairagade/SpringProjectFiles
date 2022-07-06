package com.ankush.LoginAutho.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ankush.LoginAutho.Entities.Account;




public class  RowMapperImplement implements RowMapper<Account>    {

	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = new Account();
		account.setFname(rs.getString(1));
		account.setLname(rs.getString(2));
		account.setEmail(rs.getString(3));
		account.setPassword("*******");
		
		return account;
	}

}
