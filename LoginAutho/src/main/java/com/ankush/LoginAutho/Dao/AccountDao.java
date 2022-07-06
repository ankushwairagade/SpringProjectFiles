package com.ankush.LoginAutho.Dao;

import java.util.List;

import com.ankush.LoginAutho.Entities.Account;

public interface AccountDao {
// CRUD  -- create , read , update , delete
	
	public int createUser(Account account);
	
	public Account readUser(String gmail);
	
	public int updateUser(Account account);
	
	public int deleteUser(String email,String password);
	
	public List<Account> readDB();
	
	public Account loginUser(String email ,String password);
	
	
}
