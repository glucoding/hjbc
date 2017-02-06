package com.hejiascm.blockchain.dao;

import java.util.List;

import com.hejiascm.domain.Roles;
import com.hejiascm.domain.Users;

public interface BcUserDAO {
	public Users saveBcUser(Users u);
	
	public Users delBcUser(String id);
	
	public Users findBcUserById(String id);
	
	public List<Users> findAllBcUsers();
	
	public Roles saveBcRoles(Roles r);
	
	public Roles delBcRoles(String id);
	
	public Roles findBcRolesById(String id);
	
	public List<Roles> findAllBcRoles();
}
