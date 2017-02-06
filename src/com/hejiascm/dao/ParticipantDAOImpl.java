package com.hejiascm.dao;

import com.hejiascm.domain.Participant;

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
 * DAO to manage Participant entities.
 * 
 */
@Repository("ParticipantDAO")
@Transactional
public class ParticipantDAOImpl extends AbstractJpaDao<Participant> implements
		ParticipantDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Participant.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ParticipantDAOImpl
	 *
	 */
	public ParticipantDAOImpl() {
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
	 * JPQL Query - findParticipantByRoleContaining
	 *
	 */
	@Transactional
	public Set<Participant> findParticipantByRoleContaining(String role) throws DataAccessException {

		return findParticipantByRoleContaining(role, -1, -1);
	}

	/**
	 * JPQL Query - findParticipantByRoleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Participant> findParticipantByRoleContaining(String role, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findParticipantByRoleContaining", startResult, maxRows, role);
		return new LinkedHashSet<Participant>(query.getResultList());
	}

	/**
	 * JPQL Query - findParticipantByNameContaining
	 *
	 */
	@Transactional
	public Set<Participant> findParticipantByNameContaining(String name) throws DataAccessException {

		return findParticipantByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findParticipantByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Participant> findParticipantByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findParticipantByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Participant>(query.getResultList());
	}

	/**
	 * JPQL Query - findParticipantByPermission
	 *
	 */
	@Transactional
	public Set<Participant> findParticipantByPermission(String permission) throws DataAccessException {

		return findParticipantByPermission(permission, -1, -1);
	}

	/**
	 * JPQL Query - findParticipantByPermission
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Participant> findParticipantByPermission(String permission, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findParticipantByPermission", startResult, maxRows, permission);
		return new LinkedHashSet<Participant>(query.getResultList());
	}

	/**
	 * JPQL Query - findParticipantByRole
	 *
	 */
	@Transactional
	public Set<Participant> findParticipantByRole(String role) throws DataAccessException {

		return findParticipantByRole(role, -1, -1);
	}

	/**
	 * JPQL Query - findParticipantByRole
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Participant> findParticipantByRole(String role, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findParticipantByRole", startResult, maxRows, role);
		return new LinkedHashSet<Participant>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllParticipants
	 *
	 */
	@Transactional
	public Set<Participant> findAllParticipants() throws DataAccessException {

		return findAllParticipants(-1, -1);
	}

	/**
	 * JPQL Query - findAllParticipants
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Participant> findAllParticipants(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllParticipants", startResult, maxRows);
		return new LinkedHashSet<Participant>(query.getResultList());
	}

	/**
	 * JPQL Query - findParticipantByPrimaryKey
	 *
	 */
	@Transactional
	public Participant findParticipantByPrimaryKey(String id) throws DataAccessException {

		return findParticipantByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findParticipantByPrimaryKey
	 *
	 */

	@Transactional
	public Participant findParticipantByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findParticipantByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Participant) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findParticipantByPermissionContaining
	 *
	 */
	@Transactional
	public Set<Participant> findParticipantByPermissionContaining(String permission) throws DataAccessException {

		return findParticipantByPermissionContaining(permission, -1, -1);
	}

	/**
	 * JPQL Query - findParticipantByPermissionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Participant> findParticipantByPermissionContaining(String permission, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findParticipantByPermissionContaining", startResult, maxRows, permission);
		return new LinkedHashSet<Participant>(query.getResultList());
	}

	/**
	 * JPQL Query - findParticipantById
	 *
	 */
	@Transactional
	public Participant findParticipantById(String id) throws DataAccessException {

		return findParticipantById(id, -1, -1);
	}

	/**
	 * JPQL Query - findParticipantById
	 *
	 */

	@Transactional
	public Participant findParticipantById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findParticipantById", startResult, maxRows, id);
			return (com.hejiascm.domain.Participant) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findParticipantBySignedTimeContaining
	 *
	 */
	@Transactional
	public Set<Participant> findParticipantBySignedTimeContaining(String signedTime) throws DataAccessException {

		return findParticipantBySignedTimeContaining(signedTime, -1, -1);
	}

	/**
	 * JPQL Query - findParticipantBySignedTimeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Participant> findParticipantBySignedTimeContaining(String signedTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findParticipantBySignedTimeContaining", startResult, maxRows, signedTime);
		return new LinkedHashSet<Participant>(query.getResultList());
	}

	/**
	 * JPQL Query - findParticipantBySignedTime
	 *
	 */
	@Transactional
	public Set<Participant> findParticipantBySignedTime(String signedTime) throws DataAccessException {

		return findParticipantBySignedTime(signedTime, -1, -1);
	}

	/**
	 * JPQL Query - findParticipantBySignedTime
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Participant> findParticipantBySignedTime(String signedTime, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findParticipantBySignedTime", startResult, maxRows, signedTime);
		return new LinkedHashSet<Participant>(query.getResultList());
	}

	/**
	 * JPQL Query - findParticipantByStatus
	 *
	 */
	@Transactional
	public Set<Participant> findParticipantByStatus(Integer status) throws DataAccessException {

		return findParticipantByStatus(status, -1, -1);
	}

	/**
	 * JPQL Query - findParticipantByStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Participant> findParticipantByStatus(Integer status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findParticipantByStatus", startResult, maxRows, status);
		return new LinkedHashSet<Participant>(query.getResultList());
	}

	/**
	 * JPQL Query - findParticipantByName
	 *
	 */
	@Transactional
	public Set<Participant> findParticipantByName(String name) throws DataAccessException {

		return findParticipantByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findParticipantByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Participant> findParticipantByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findParticipantByName", startResult, maxRows, name);
		return new LinkedHashSet<Participant>(query.getResultList());
	}

	/**
	 * JPQL Query - findParticipantByIdContaining
	 *
	 */
	@Transactional
	public Set<Participant> findParticipantByIdContaining(String id) throws DataAccessException {

		return findParticipantByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findParticipantByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Participant> findParticipantByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findParticipantByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Participant>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Participant entity) {
		return true;
	}
}
