package com.hejiascm.dao;

import com.hejiascm.domain.Term;

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
 * DAO to manage Term entities.
 * 
 */
@Repository("TermDAO")
@Transactional
public class TermDAOImpl extends AbstractJpaDao<Term> implements TermDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Term.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new TermDAOImpl
	 *
	 */
	public TermDAOImpl() {
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
	 * JPQL Query - findTermByTypeContaining
	 *
	 */
	@Transactional
	public Set<Term> findTermByTypeContaining(String type) throws DataAccessException {

		return findTermByTypeContaining(type, -1, -1);
	}

	/**
	 * JPQL Query - findTermByTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Term> findTermByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTermByTypeContaining", startResult, maxRows, type);
		return new LinkedHashSet<Term>(query.getResultList());
	}

	/**
	 * JPQL Query - findTermByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Term> findTermByDescriptionContaining(String description) throws DataAccessException {

		return findTermByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findTermByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Term> findTermByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTermByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Term>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllTerms
	 *
	 */
	@Transactional
	public Set<Term> findAllTerms() throws DataAccessException {

		return findAllTerms(-1, -1);
	}

	/**
	 * JPQL Query - findAllTerms
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Term> findAllTerms(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllTerms", startResult, maxRows);
		return new LinkedHashSet<Term>(query.getResultList());
	}

	/**
	 * JPQL Query - findTermByPrimaryKey
	 *
	 */
	@Transactional
	public Term findTermByPrimaryKey(String id) throws DataAccessException {

		return findTermByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findTermByPrimaryKey
	 *
	 */

	@Transactional
	public Term findTermByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTermByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Term) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTermByName
	 *
	 */
	@Transactional
	public Set<Term> findTermByName(String name) throws DataAccessException {

		return findTermByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findTermByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Term> findTermByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTermByName", startResult, maxRows, name);
		return new LinkedHashSet<Term>(query.getResultList());
	}

	/**
	 * JPQL Query - findTermByType
	 *
	 */
	@Transactional
	public Set<Term> findTermByType(String type) throws DataAccessException {

		return findTermByType(type, -1, -1);
	}

	/**
	 * JPQL Query - findTermByType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Term> findTermByType(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTermByType", startResult, maxRows, type);
		return new LinkedHashSet<Term>(query.getResultList());
	}

	/**
	 * JPQL Query - findTermById
	 *
	 */
	@Transactional
	public Term findTermById(String id) throws DataAccessException {

		return findTermById(id, -1, -1);
	}

	/**
	 * JPQL Query - findTermById
	 *
	 */

	@Transactional
	public Term findTermById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTermById", startResult, maxRows, id);
			return (com.hejiascm.domain.Term) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTermByContent
	 *
	 */
	@Transactional
	public Set<Term> findTermByContent(String content) throws DataAccessException {

		return findTermByContent(content, -1, -1);
	}

	/**
	 * JPQL Query - findTermByContent
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Term> findTermByContent(String content, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTermByContent", startResult, maxRows, content);
		return new LinkedHashSet<Term>(query.getResultList());
	}

	/**
	 * JPQL Query - findTermByIdContaining
	 *
	 */
	@Transactional
	public Set<Term> findTermByIdContaining(String id) throws DataAccessException {

		return findTermByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findTermByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Term> findTermByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTermByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Term>(query.getResultList());
	}

	/**
	 * JPQL Query - findTermByNameContaining
	 *
	 */
	@Transactional
	public Set<Term> findTermByNameContaining(String name) throws DataAccessException {

		return findTermByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findTermByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Term> findTermByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTermByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Term>(query.getResultList());
	}

	/**
	 * JPQL Query - findTermByDescription
	 *
	 */
	@Transactional
	public Set<Term> findTermByDescription(String description) throws DataAccessException {

		return findTermByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findTermByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Term> findTermByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTermByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Term>(query.getResultList());
	}

	/**
	 * JPQL Query - findTermByContentContaining
	 *
	 */
	@Transactional
	public Set<Term> findTermByContentContaining(String content) throws DataAccessException {

		return findTermByContentContaining(content, -1, -1);
	}

	/**
	 * JPQL Query - findTermByContentContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Term> findTermByContentContaining(String content, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTermByContentContaining", startResult, maxRows, content);
		return new LinkedHashSet<Term>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Term entity) {
		return true;
	}
}
