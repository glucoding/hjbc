package com.hejiascm.dao;

import com.hejiascm.domain.Orgsummaryinfo;

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
 * DAO to manage Orgsummaryinfo entities.
 * 
 */
@Repository("OrgsummaryinfoDAO")
@Transactional
public class OrgsummaryinfoDAOImpl extends AbstractJpaDao<Orgsummaryinfo>
		implements OrgsummaryinfoDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Orgsummaryinfo.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrgsummaryinfoDAOImpl
	 *
	 */
	public OrgsummaryinfoDAOImpl() {
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
	 * JPQL Query - findOrgsummaryinfoById
	 *
	 */
	@Transactional
	public Orgsummaryinfo findOrgsummaryinfoById(String id) throws DataAccessException {

		return findOrgsummaryinfoById(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrgsummaryinfoById
	 *
	 */

	@Transactional
	public Orgsummaryinfo findOrgsummaryinfoById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrgsummaryinfoById", startResult, maxRows, id);
			return (com.hejiascm.domain.Orgsummaryinfo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrgsummaryinfoByNameContaining
	 *
	 */
	@Transactional
	public Set<Orgsummaryinfo> findOrgsummaryinfoByNameContaining(String name) throws DataAccessException {

		return findOrgsummaryinfoByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findOrgsummaryinfoByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgsummaryinfo> findOrgsummaryinfoByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgsummaryinfoByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Orgsummaryinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgsummaryinfoByPrimaryKey
	 *
	 */
	@Transactional
	public Orgsummaryinfo findOrgsummaryinfoByPrimaryKey(String id) throws DataAccessException {

		return findOrgsummaryinfoByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrgsummaryinfoByPrimaryKey
	 *
	 */

	@Transactional
	public Orgsummaryinfo findOrgsummaryinfoByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrgsummaryinfoByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Orgsummaryinfo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrgsummaryinfoByName
	 *
	 */
	@Transactional
	public Set<Orgsummaryinfo> findOrgsummaryinfoByName(String name) throws DataAccessException {

		return findOrgsummaryinfoByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findOrgsummaryinfoByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgsummaryinfo> findOrgsummaryinfoByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgsummaryinfoByName", startResult, maxRows, name);
		return new LinkedHashSet<Orgsummaryinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrgsummaryinfoByRole
	 *
	 */
	@Transactional
	public Set<Orgsummaryinfo> findOrgsummaryinfoByRole(Integer role) throws DataAccessException {

		return findOrgsummaryinfoByRole(role, -1, -1);
	}

	/**
	 * JPQL Query - findOrgsummaryinfoByRole
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgsummaryinfo> findOrgsummaryinfoByRole(Integer role, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrgsummaryinfoByRole", startResult, maxRows, role);
		return new LinkedHashSet<Orgsummaryinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllOrgsummaryinfos
	 *
	 */
	@Transactional
	public Set<Orgsummaryinfo> findAllOrgsummaryinfos() throws DataAccessException {

		return findAllOrgsummaryinfos(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrgsummaryinfos
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orgsummaryinfo> findAllOrgsummaryinfos(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrgsummaryinfos", startResult, maxRows);
		return new LinkedHashSet<Orgsummaryinfo>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Orgsummaryinfo entity) {
		return true;
	}
}
