package com.hejiascm.blockchain;

import java.util.List;

import com.hejiascm.domain.User;

public interface BcUserDAO {
	public int bcAdd(User u);
	
	public void bcDelete(String orgId, String name);
	
	public List<User> bcGetAll(String orgId);
	
	public User bcGetOne(String orgId, String name);
	
	public int update(User u);
}
