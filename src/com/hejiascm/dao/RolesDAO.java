package com.hejiascm.dao;

import com.hejiascm.domain.Roles;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Roles entities.
 * 
 */
public interface RolesDAO extends JpaDao<Roles> {

	/**
	 * JPQL Query - findRolesByRoleidContaining
	 *
	 */
	public Set<Roles> findRolesByRoleidContaining(String roleid) throws DataAccessException;

	/**
	 * JPQL Query - findRolesByRoleidContaining
	 *
	 */
	public Set<Roles> findRolesByRoleidContaining(String roleid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRolesByRoleid
	 *
	 */
	public Roles findRolesByRoleid(String roleid_1) throws DataAccessException;

	/**
	 * JPQL Query - findRolesByRoleid
	 *
	 */
	public Roles findRolesByRoleid(String roleid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRolesByUserid
	 *
	 */
	public Set<Roles> findRolesByUserid(String userid) throws DataAccessException;

	/**
	 * JPQL Query - findRolesByUserid
	 *
	 */
	public Set<Roles> findRolesByUserid(String userid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRolesByRoleName
	 *
	 */
	public Set<Roles> findRolesByRoleName(String roleName) throws DataAccessException;

	/**
	 * JPQL Query - findRolesByRoleName
	 *
	 */
	public Set<Roles> findRolesByRoleName(String roleName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllRoless
	 *
	 */
	public Set<Roles> findAllRoless() throws DataAccessException;

	/**
	 * JPQL Query - findAllRoless
	 *
	 */
	public Set<Roles> findAllRoless(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRolesByRoleNameContaining
	 *
	 */
	public Set<Roles> findRolesByRoleNameContaining(String roleName_1) throws DataAccessException;

	/**
	 * JPQL Query - findRolesByRoleNameContaining
	 *
	 */
	public Set<Roles> findRolesByRoleNameContaining(String roleName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRolesByUseridContaining
	 *
	 */
	public Set<Roles> findRolesByUseridContaining(String userid_1) throws DataAccessException;

	/**
	 * JPQL Query - findRolesByUseridContaining
	 *
	 */
	public Set<Roles> findRolesByUseridContaining(String userid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findRolesByPrimaryKey
	 *
	 */
	public Roles findRolesByPrimaryKey(String roleid_2) throws DataAccessException;

	/**
	 * JPQL Query - findRolesByPrimaryKey
	 *
	 */
	public Roles findRolesByPrimaryKey(String roleid_2, int startResult, int maxRows) throws DataAccessException;

}