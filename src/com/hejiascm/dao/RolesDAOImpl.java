package com.hejiascm.dao;

import com.hejiascm.domain.Roles;

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
 * DAO to manage Roles entities.
 * 
 */
@Repository("RolesDAO")
@Transactional
public class RolesDAOImpl extends AbstractJpaDao<Roles> implements RolesDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Roles.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new RolesDAOImpl
	 *
	 */
	public RolesDAOImpl() {
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
	 * JPQL Query - findRolesByRoleidContaining
	 *
	 */
	@Transactional
	public Set<Roles> findRolesByRoleidContaining(String roleid) throws DataAccessException {

		return findRolesByRoleidContaining(roleid, -1, -1);
	}

	/**
	 * JPQL Query - findRolesByRoleidContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roles> findRolesByRoleidContaining(String roleid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRolesByRoleidContaining", startResult, maxRows, roleid);
		return new LinkedHashSet<Roles>(query.getResultList());
	}

	/**
	 * JPQL Query - findRolesByRoleid
	 *
	 */
	@Transactional
	public Roles findRolesByRoleid(String roleid) throws DataAccessException {

		return findRolesByRoleid(roleid, -1, -1);
	}

	/**
	 * JPQL Query - findRolesByRoleid
	 *
	 */

	@Transactional
	public Roles findRolesByRoleid(String roleid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRolesByRoleid", startResult, maxRows, roleid);
			return (com.hejiascm.domain.Roles) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRolesByUserid
	 *
	 */
	@Transactional
	public Set<Roles> findRolesByUserid(String userid) throws DataAccessException {

		return findRolesByUserid(userid, -1, -1);
	}

	/**
	 * JPQL Query - findRolesByUserid
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roles> findRolesByUserid(String userid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRolesByUserid", startResult, maxRows, userid);
		return new LinkedHashSet<Roles>(query.getResultList());
	}

	/**
	 * JPQL Query - findRolesByRoleName
	 *
	 */
	@Transactional
	public Set<Roles> findRolesByRoleName(String roleName) throws DataAccessException {

		return findRolesByRoleName(roleName, -1, -1);
	}

	/**
	 * JPQL Query - findRolesByRoleName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roles> findRolesByRoleName(String roleName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRolesByRoleName", startResult, maxRows, roleName);
		return new LinkedHashSet<Roles>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRoless
	 *
	 */
	@Transactional
	public Set<Roles> findAllRoless() throws DataAccessException {

		return findAllRoless(-1, -1);
	}

	/**
	 * JPQL Query - findAllRoless
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roles> findAllRoless(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRoless", startResult, maxRows);
		return new LinkedHashSet<Roles>(query.getResultList());
	}

	/**
	 * JPQL Query - findRolesByRoleNameContaining
	 *
	 */
	@Transactional
	public Set<Roles> findRolesByRoleNameContaining(String roleName) throws DataAccessException {

		return findRolesByRoleNameContaining(roleName, -1, -1);
	}

	/**
	 * JPQL Query - findRolesByRoleNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roles> findRolesByRoleNameContaining(String roleName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRolesByRoleNameContaining", startResult, maxRows, roleName);
		return new LinkedHashSet<Roles>(query.getResultList());
	}

	/**
	 * JPQL Query - findRolesByUseridContaining
	 *
	 */
	@Transactional
	public Set<Roles> findRolesByUseridContaining(String userid) throws DataAccessException {

		return findRolesByUseridContaining(userid, -1, -1);
	}

	/**
	 * JPQL Query - findRolesByUseridContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Roles> findRolesByUseridContaining(String userid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRolesByUseridContaining", startResult, maxRows, userid);
		return new LinkedHashSet<Roles>(query.getResultList());
	}

	/**
	 * JPQL Query - findRolesByPrimaryKey
	 *
	 */
	@Transactional
	public Roles findRolesByPrimaryKey(String roleid) throws DataAccessException {

		return findRolesByPrimaryKey(roleid, -1, -1);
	}

	/**
	 * JPQL Query - findRolesByPrimaryKey
	 *
	 */

	@Transactional
	public Roles findRolesByPrimaryKey(String roleid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRolesByPrimaryKey", startResult, maxRows, roleid);
			return (com.hejiascm.domain.Roles) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Roles entity) {
		return true;
	}
}
