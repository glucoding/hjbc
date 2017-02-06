package com.hejiascm.dao;

import com.hejiascm.domain.Permissions;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Permissions entities.
 * 
 */
public interface PermissionsDAO extends JpaDao<Permissions> {

	/**
	 * JPQL Query - findPermissionsByPermissionName
	 *
	 */
	public Set<Permissions> findPermissionsByPermissionName(String permissionName) throws DataAccessException;

	/**
	 * JPQL Query - findPermissionsByPermissionName
	 *
	 */
	public Set<Permissions> findPermissionsByPermissionName(String permissionName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPermissionsByPermissionNameContaining
	 *
	 */
	public Set<Permissions> findPermissionsByPermissionNameContaining(String permissionName_1) throws DataAccessException;

	/**
	 * JPQL Query - findPermissionsByPermissionNameContaining
	 *
	 */
	public Set<Permissions> findPermissionsByPermissionNameContaining(String permissionName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPermissionsByPrimaryKey
	 *
	 */
	public Permissions findPermissionsByPrimaryKey(String permissionid) throws DataAccessException;

	/**
	 * JPQL Query - findPermissionsByPrimaryKey
	 *
	 */
	public Permissions findPermissionsByPrimaryKey(String permissionid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllPermissionss
	 *
	 */
	public Set<Permissions> findAllPermissionss() throws DataAccessException;

	/**
	 * JPQL Query - findAllPermissionss
	 *
	 */
	public Set<Permissions> findAllPermissionss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPermissionsByPermissionid
	 *
	 */
	public Permissions findPermissionsByPermissionid(String permissionid_1) throws DataAccessException;

	/**
	 * JPQL Query - findPermissionsByPermissionid
	 *
	 */
	public Permissions findPermissionsByPermissionid(String permissionid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPermissionsByRoleidContaining
	 *
	 */
	public Set<Permissions> findPermissionsByRoleidContaining(String roleid) throws DataAccessException;

	/**
	 * JPQL Query - findPermissionsByRoleidContaining
	 *
	 */
	public Set<Permissions> findPermissionsByRoleidContaining(String roleid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPermissionsByPermissionidContaining
	 *
	 */
	public Set<Permissions> findPermissionsByPermissionidContaining(String permissionid_2) throws DataAccessException;

	/**
	 * JPQL Query - findPermissionsByPermissionidContaining
	 *
	 */
	public Set<Permissions> findPermissionsByPermissionidContaining(String permissionid_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPermissionsByRoleid
	 *
	 */
	public Set<Permissions> findPermissionsByRoleid(String roleid_1) throws DataAccessException;

	/**
	 * JPQL Query - findPermissionsByRoleid
	 *
	 */
	public Set<Permissions> findPermissionsByRoleid(String roleid_1, int startResult, int maxRows) throws DataAccessException;

}