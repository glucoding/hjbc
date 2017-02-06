package com.hejiascm.service;

import com.hejiascm.domain.Permissions;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Permissions entities
 * 
 */
public interface PermissionsService {

	/**
	 * Return all Permissions entity
	 * 
	 */
	public List<Permissions> findAllPermissionss(Integer startResult, Integer maxRows);

	/**
	 */
	public Permissions findPermissionsByPrimaryKey(String permissionid);

	/**
	 * Return a count of all Permissions entity
	 * 
	 */
	public Integer countPermissionss();

	/**
	 * Load an existing Permissions entity
	 * 
	 */
	public Set<Permissions> loadPermissionss();

	/**
	 * Save an existing Permissions entity
	 * 
	 */
	public void savePermissions(Permissions permissions);

	/**
	 * Delete an existing Permissions entity
	 * 
	 */
	public void deletePermissions(Permissions permissions_1);
}