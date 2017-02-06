package com.hejiascm.dao;

import com.hejiascm.domain.Permissions;

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
 * DAO to manage Permissions entities.
 * 
 */
@Repository("PermissionsDAO")
@Transactional
public class PermissionsDAOImpl extends AbstractJpaDao<Permissions> implements
		PermissionsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Permissions.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new PermissionsDAOImpl
	 *
	 */
	public PermissionsDAOImpl() {
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
	 * JPQL Query - findPermissionsByPermissionName
	 *
	 */
	@Transactional
	public Set<Permissions> findPermissionsByPermissionName(String permissionName) throws DataAccessException {

		return findPermissionsByPermissionName(permissionName, -1, -1);
	}

	/**
	 * JPQL Query - findPermissionsByPermissionName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Permissions> findPermissionsByPermissionName(String permissionName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPermissionsByPermissionName", startResult, maxRows, permissionName);
		return new LinkedHashSet<Permissions>(query.getResultList());
	}

	/**
	 * JPQL Query - findPermissionsByPermissionNameContaining
	 *
	 */
	@Transactional
	public Set<Permissions> findPermissionsByPermissionNameContaining(String permissionName) throws DataAccessException {

		return findPermissionsByPermissionNameContaining(permissionName, -1, -1);
	}

	/**
	 * JPQL Query - findPermissionsByPermissionNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Permissions> findPermissionsByPermissionNameContaining(String permissionName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPermissionsByPermissionNameContaining", startResult, maxRows, permissionName);
		return new LinkedHashSet<Permissions>(query.getResultList());
	}

	/**
	 * JPQL Query - findPermissionsByPrimaryKey
	 *
	 */
	@Transactional
	public Permissions findPermissionsByPrimaryKey(String permissionid) throws DataAccessException {

		return findPermissionsByPrimaryKey(permissionid, -1, -1);
	}

	/**
	 * JPQL Query - findPermissionsByPrimaryKey
	 *
	 */

	@Transactional
	public Permissions findPermissionsByPrimaryKey(String permissionid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPermissionsByPrimaryKey", startResult, maxRows, permissionid);
			return (com.hejiascm.domain.Permissions) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllPermissionss
	 *
	 */
	@Transactional
	public Set<Permissions> findAllPermissionss() throws DataAccessException {

		return findAllPermissionss(-1, -1);
	}

	/**
	 * JPQL Query - findAllPermissionss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Permissions> findAllPermissionss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllPermissionss", startResult, maxRows);
		return new LinkedHashSet<Permissions>(query.getResultList());
	}

	/**
	 * JPQL Query - findPermissionsByPermissionid
	 *
	 */
	@Transactional
	public Permissions findPermissionsByPermissionid(String permissionid) throws DataAccessException {

		return findPermissionsByPermissionid(permissionid, -1, -1);
	}

	/**
	 * JPQL Query - findPermissionsByPermissionid
	 *
	 */

	@Transactional
	public Permissions findPermissionsByPermissionid(String permissionid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPermissionsByPermissionid", startResult, maxRows, permissionid);
			return (com.hejiascm.domain.Permissions) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findPermissionsByRoleidContaining
	 *
	 */
	@Transactional
	public Set<Permissions> findPermissionsByRoleidContaining(String roleid) throws DataAccessException {

		return findPermissionsByRoleidContaining(roleid, -1, -1);
	}

	/**
	 * JPQL Query - findPermissionsByRoleidContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Permissions> findPermissionsByRoleidContaining(String roleid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPermissionsByRoleidContaining", startResult, maxRows, roleid);
		return new LinkedHashSet<Permissions>(query.getResultList());
	}

	/**
	 * JPQL Query - findPermissionsByPermissionidContaining
	 *
	 */
	@Transactional
	public Set<Permissions> findPermissionsByPermissionidContaining(String permissionid) throws DataAccessException {

		return findPermissionsByPermissionidContaining(permissionid, -1, -1);
	}

	/**
	 * JPQL Query - findPermissionsByPermissionidContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Permissions> findPermissionsByPermissionidContaining(String permissionid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPermissionsByPermissionidContaining", startResult, maxRows, permissionid);
		return new LinkedHashSet<Permissions>(query.getResultList());
	}

	/**
	 * JPQL Query - findPermissionsByRoleid
	 *
	 */
	@Transactional
	public Set<Permissions> findPermissionsByRoleid(String roleid) throws DataAccessException {

		return findPermissionsByRoleid(roleid, -1, -1);
	}

	/**
	 * JPQL Query - findPermissionsByRoleid
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Permissions> findPermissionsByRoleid(String roleid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPermissionsByRoleid", startResult, maxRows, roleid);
		return new LinkedHashSet<Permissions>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Permissions entity) {
		return true;
	}
}
