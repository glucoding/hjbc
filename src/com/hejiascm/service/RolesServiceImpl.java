package com.hejiascm.service;

import com.hejiascm.dao.RolesDAO;

import com.hejiascm.domain.Roles;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Roles entities
 * 
 */

@Service("RolesService")
@Transactional
public class RolesServiceImpl implements RolesService {

	/**
	 * DAO injected by Spring that manages Roles entities
	 * 
	 */
	@Autowired
	private RolesDAO rolesDAO;

	/**
	 * Instantiates a new RolesServiceImpl.
	 *
	 */
	public RolesServiceImpl() {
	}

	/**
	 * Delete an existing Roles entity
	 * 
	 */
	@Transactional
	public void deleteRoles(Roles roles) {
		rolesDAO.remove(roles);
		rolesDAO.flush();
	}

	/**
	 * Return a count of all Roles entity
	 * 
	 */
	@Transactional
	public Integer countRoless() {
		return ((Long) rolesDAO.createQuerySingleResult("select count(o) from Roles o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public Roles findRolesByPrimaryKey(String roleid) {
		return rolesDAO.findRolesByPrimaryKey(roleid);
	}

	/**
	 * Save an existing Roles entity
	 * 
	 */
	@Transactional
	public void saveRoles(Roles roles) {
		Roles existingRoles = rolesDAO.findRolesByPrimaryKey(roles.getRoleid());

		if (existingRoles != null) {
			if (existingRoles != roles) {
				existingRoles.setRoleid(roles.getRoleid());
				existingRoles.setRoleName(roles.getRoleName());
				existingRoles.setUserid(roles.getUserid());
			}
			roles = rolesDAO.store(existingRoles);
		} else {
			roles = rolesDAO.store(roles);
		}
		rolesDAO.flush();
	}

	/**
	 * Load an existing Roles entity
	 * 
	 */
	@Transactional
	public Set<Roles> loadRoless() {
		return rolesDAO.findAllRoless();
	}

	/**
	 * Return all Roles entity
	 * 
	 */
	@Transactional
	public List<Roles> findAllRoless(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Roles>(rolesDAO.findAllRoless(startResult, maxRows));
	}
	
	@Transactional
	public List<Roles> findRolesByUserid(String userid){
		return new java.util.ArrayList<Roles>(rolesDAO.findRolesByUserid(userid));
	}
}
