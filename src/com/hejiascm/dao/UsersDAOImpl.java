package com.hejiascm.dao;

import com.hejiascm.domain.Users;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Users entities.
 * 
 */
@Repository("UsersDAO")
@Transactional
public class UsersDAOImpl extends AbstractJpaDao<Users> implements UsersDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Users.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new UsersDAOImpl
	 *
	 */
	public UsersDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findUsersByPassword
	 *
	 */
	@Transactional
	public Set<Users> findUsersByPassword(String password) throws DataAccessException {

		return findUsersByPassword(password, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByPassword(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByPassword", startResult, maxRows, password);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUsername
	 *
	 */
	@Transactional
	public Users findUsersByUsername(String username) throws DataAccessException {

		return findUsersByUsername(username, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUsername
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Users findUsersByUsername(String username, int startResult, int maxRows) throws DataAccessException {
		try{
			Query query = createNamedQuery("findUsersByUsername", startResult, maxRows, username);
			return (Users)query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllUserss
	 *
	 */
	@Transactional
	public Set<Users> findAllUserss() throws DataAccessException {

		return findAllUserss(-1, -1);
	}

	/**
	 * JPQL Query - findAllUserss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findAllUserss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllUserss", startResult, maxRows);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */
	@Transactional
	public Users findUsersByPrimaryKey(String userid) throws DataAccessException {

		return findUsersByPrimaryKey(userid, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPrimaryKey
	 *
	 */

	@Transactional
	public Users findUsersByPrimaryKey(String userid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsersByPrimaryKey", startResult, maxRows, userid);
			return (com.hejiascm.domain.Users) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsersByUserid
	 *
	 */
	@Transactional
	public Users findUsersByUserid(String userid) throws DataAccessException {

		return findUsersByUserid(userid, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUserid
	 *
	 */

	@Transactional
	public Users findUsersByUserid(String userid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findUsersByUserid", startResult, maxRows, userid);
			return (com.hejiascm.domain.Users) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findUsersByEnabled
	 *
	 */
	@Transactional
	public Set<Users> findUsersByEnabled(Boolean enabled) throws DataAccessException {

		return findUsersByEnabled(enabled, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByEnabled
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByEnabled(Boolean enabled, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByEnabled", startResult, maxRows, enabled);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByPasssaltContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByPasssaltContaining(String passsalt) throws DataAccessException {

		return findUsersByPasssaltContaining(passsalt, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPasssaltContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByPasssaltContaining(String passsalt, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByPasssaltContaining", startResult, maxRows, passsalt);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByPasssalt
	 *
	 */
	@Transactional
	public Set<Users> findUsersByPasssalt(String passsalt) throws DataAccessException {

		return findUsersByPasssalt(passsalt, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPasssalt
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByPasssalt(String passsalt, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByPasssalt", startResult, maxRows, passsalt);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUseridContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUseridContaining(String userid) throws DataAccessException {

		return findUsersByUseridContaining(userid, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUseridContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUseridContaining(String userid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUseridContaining", startResult, maxRows, userid);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByPasswordContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByPasswordContaining(String password) throws DataAccessException {

		return findUsersByPasswordContaining(password, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByPasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByPasswordContaining", startResult, maxRows, password);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * JPQL Query - findUsersByUsernameContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByUsernameContaining(String username) throws DataAccessException {

		return findUsersByUsernameContaining(username, -1, -1);
	}

	/**
	 * JPQL Query - findUsersByUsernameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByUsernameContaining(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByUsernameContaining", startResult, maxRows, username);
		return new LinkedHashSet<Users>(query.getResultList());
	}
	
	/**
	 * JPQL Query - findUsersByUsernameContaining
	 *
	 */
	@Transactional
	public Set<Users> findUsersByOrgid(String orgid) throws DataAccessException {

		return findUsersByOrgid(orgid, -1, -1);
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Users> findUsersByOrgid(String orgid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findUsersByOrgid", startResult, maxRows, orgid);
		return new LinkedHashSet<Users>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Users entity) {
		return true;
	}
}
