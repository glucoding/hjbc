package com.hejiascm.service;

import com.hejiascm.domain.Users;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Users entities
 * 
 */
public interface UsersService {

	/**
	 * Delete an existing Users entity
	 * 
	 */
	public void deleteUsers(Users users);

	/**
	 * Return a count of all Users entity
	 * 
	 */
	public Integer countUserss();

	/**
	 */
	public Users findUsersByPrimaryKey(String userid);

	/**
	 * Load an existing Users entity
	 * 
	 */
	public Set<Users> loadUserss();

	/**
	 * Return all Users entity
	 * 
	 */
	
	/**
     * Find user by user name
     */
    public Users findUserByUserName(String username);
    
	public List<Users> findAllUserss(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Users entity
	 * 
	 */
	public void saveUsers(Users users_1);
}