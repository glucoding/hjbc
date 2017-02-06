package com.hejiascm.service;

import com.hejiascm.dao.PermissionsDAO;

import com.hejiascm.domain.Permissions;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Permissions entities
 * 
 */

@Service("PermissionsService")
@Transactional
public class PermissionsServiceImpl implements PermissionsService {

	/**
	 * DAO injected by Spring that manages Permissions entities
	 * 
	 */
	@Autowired
	private PermissionsDAO permissionsDAO;

	/**
	 * Instantiates a new PermissionsServiceImpl.
	 *
	 */
	public PermissionsServiceImpl() {
	}

	/**
	 * Return all Permissions entity
	 * 
	 */
	@Transactional
	public List<Permissions> findAllPermissionss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Permissions>(permissionsDAO.findAllPermissionss(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Permissions findPermissionsByPrimaryKey(String permissionid) {
		return permissionsDAO.findPermissionsByPrimaryKey(permissionid);
	}

	/**
	 * Return a count of all Permissions entity
	 * 
	 */
	@Transactional
	public Integer countPermissionss() {
		return ((Long) permissionsDAO.createQuerySingleResult("select count(o) from Permissions o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Permissions entity
	 * 
	 */
	@Transactional
	public Set<Permissions> loadPermissionss() {
		return permissionsDAO.findAllPermissionss();
	}

	/**
	 * Save an existing Permissions entity
	 * 
	 */
	@Transactional
	public void savePermissions(Permissions permissions) {
		Permissions existingPermissions = permissionsDAO.findPermissionsByPrimaryKey(permissions.getPermissionid());

		if (existingPermissions != null) {
			if (existingPermissions != permissions) {
				existingPermissions.setPermissionid(permissions.getPermissionid());
				existingPermissions.setPermissionName(permissions.getPermissionName());
				existingPermissions.setRoleid(permissions.getRoleid());
			}
			permissions = permissionsDAO.store(existingPermissions);
		} else {
			permissions = permissionsDAO.store(permissions);
		}
		permissionsDAO.flush();
	}

	/**
	 * Delete an existing Permissions entity
	 * 
	 */
	@Transactional
	public void deletePermissions(Permissions permissions) {
		permissionsDAO.remove(permissions);
		permissionsDAO.flush();
	}
}
