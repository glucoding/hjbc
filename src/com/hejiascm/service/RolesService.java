package com.hejiascm.service;

import com.hejiascm.domain.Roles;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Roles entities
 * 
 */
public interface RolesService {

	/**
	 * Delete an existing Roles entity
	 * 
	 */
	public void deleteRoles(Roles roles);

	/**
	 * Return a count of all Roles entity
	 * 
	 */
	public Integer countRoless();

	/**
	 */
	public Roles findRolesByPrimaryKey(String roleid);

	/**
	 * Save an existing Roles entity
	 * 
	 */
	public void saveRoles(Roles roles_1);

	/**
	 * Load an existing Roles entity
	 * 
	 */
	public Set<Roles> loadRoless();

	/**
	 * Return all Roles entity
	 * 
	 */
	public List<Roles> findAllRoless(Integer startResult, Integer maxRows);

	/**
	 * Return all Roles for a specific user
	 * 
	 */
	public List<Roles> findRolesByUserid(String userid);
}
