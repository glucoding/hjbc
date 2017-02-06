package com.hejiascm.dao;

import com.hejiascm.domain.Users;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Users entities.
 * 
 */
public interface UsersDAO extends JpaDao<Users> {

	/**
	 * JPQL Query - findUsersByPassword
	 *
	 */
	public Set<Users> findUsersByPassword(String password) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPassword
	 *
	 */
	public Set<Users> findUsersByPassword(String password, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUsername
	 *
	 */
	public Users findUsersByUsername(String username) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUsername
	 *
	 */
	public Users findUsersByUsername(String username, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllUserss
	 *
	 */
	public Set<Users> findAllUserss() throws DataAccessException;

	/**
	 * JPQL Query - findAllUserss
	 *
	 */
	public Set<Users> findAllUserss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */
	public Users findUsersByPrimaryKey(String userid) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */
	public Users findUsersByPrimaryKey(String userid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserid
	 *
	 */
	public Users findUsersByUserid(String userid_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUserid
	 *
	 */
	public Users findUsersByUserid(String userid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByEnabled
	 *
	 */
	public Set<Users> findUsersByEnabled(Boolean enabled) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByEnabled
	 *
	 */
	public Set<Users> findUsersByEnabled(Boolean enabled, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPasssaltContaining
	 *
	 */
	public Set<Users> findUsersByPasssaltContaining(String passsalt) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPasssaltContaining
	 *
	 */
	public Set<Users> findUsersByPasssaltContaining(String passsalt, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPasssalt
	 *
	 */
	public Set<Users> findUsersByPasssalt(String passsalt_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPasssalt
	 *
	 */
	public Set<Users> findUsersByPasssalt(String passsalt_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUseridContaining
	 *
	 */
	public Set<Users> findUsersByUseridContaining(String userid_2) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUseridContaining
	 *
	 */
	public Set<Users> findUsersByUseridContaining(String userid_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPasswordContaining
	 *
	 */
	public Set<Users> findUsersByPasswordContaining(String password_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByPasswordContaining
	 *
	 */
	public Set<Users> findUsersByPasswordContaining(String password_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUsernameContaining
	 *
	 */
	public Set<Users> findUsersByUsernameContaining(String username_1) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUsernameContaining
	 *
	 */
	public Set<Users> findUsersByUsernameContaining(String username_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findUsersByUsernameContaining
	 *
	 */
	public Set<Users> findUsersByOrgid(String orgid) throws DataAccessException;
}