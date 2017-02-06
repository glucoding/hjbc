package com.hejiascm.dao;

import com.hejiascm.domain.Bankaccountentry;

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
 * DAO to manage Bankaccountentry entities.
 * 
 */
@Repository("BankaccountentryDAO")
@Transactional
public class BankaccountentryDAOImpl extends AbstractJpaDao<Bankaccountentry>
		implements BankaccountentryDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Bankaccountentry.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new BankaccountentryDAOImpl
	 *
	 */
	public BankaccountentryDAOImpl() {
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
	 * JPQL Query - findBankaccountentryByPrimaryKey
	 *
	 */
	@Transactional
	public Bankaccountentry findBankaccountentryByPrimaryKey(String id) throws DataAccessException {

		return findBankaccountentryByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountentryByPrimaryKey
	 *
	 */

	@Transactional
	public Bankaccountentry findBankaccountentryByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBankaccountentryByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Bankaccountentry) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findBankaccountentryById
	 *
	 */
	@Transactional
	public Bankaccountentry findBankaccountentryById(String id) throws DataAccessException {
		return findBankaccountentryById(id, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountentryById
	 *
	 */

	@Transactional
	public Bankaccountentry findBankaccountentryById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBankaccountentryById", startResult, maxRows, id);
			return (com.hejiascm.domain.Bankaccountentry) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findBankaccountentryByBankAccountInfoContaining
	 *
	 */
	@Transactional
	public Set<Bankaccountentry> findBankaccountentryByBankAccountInfoContaining(String bankAccountInfo) throws DataAccessException {

		return findBankaccountentryByBankAccountInfoContaining(bankAccountInfo, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountentryByBankAccountInfoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountentry> findBankaccountentryByBankAccountInfoContaining(String bankAccountInfo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountentryByBankAccountInfoContaining", startResult, maxRows, bankAccountInfo);
		return new LinkedHashSet<Bankaccountentry>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountentryByTypeContaining
	 *
	 */
	@Transactional
	public Set<Bankaccountentry> findBankaccountentryByTypeContaining(String type) throws DataAccessException {

		return findBankaccountentryByTypeContaining(type, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountentryByTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountentry> findBankaccountentryByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountentryByTypeContaining", startResult, maxRows, type);
		return new LinkedHashSet<Bankaccountentry>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountentryByFiendlyName
	 *
	 */
	@Transactional
	public Set<Bankaccountentry> findBankaccountentryByFiendlyName(String fiendlyName) throws DataAccessException {

		return findBankaccountentryByFiendlyName(fiendlyName, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountentryByFiendlyName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountentry> findBankaccountentryByFiendlyName(String fiendlyName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountentryByFiendlyName", startResult, maxRows, fiendlyName);
		return new LinkedHashSet<Bankaccountentry>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountentryByBankAccountInfo
	 *
	 */
	@Transactional
	public Set<Bankaccountentry> findBankaccountentryByBankAccountInfo(String bankAccountInfo) throws DataAccessException {

		return findBankaccountentryByBankAccountInfo(bankAccountInfo, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountentryByBankAccountInfo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountentry> findBankaccountentryByBankAccountInfo(String bankAccountInfo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountentryByBankAccountInfo", startResult, maxRows, bankAccountInfo);
		return new LinkedHashSet<Bankaccountentry>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllBankaccountentrys
	 *
	 */
	@Transactional
	public Set<Bankaccountentry> findAllBankaccountentrys() throws DataAccessException {

		return findAllBankaccountentrys(-1, -1);
	}

	/**
	 * JPQL Query - findAllBankaccountentrys
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountentry> findAllBankaccountentrys(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllBankaccountentrys", startResult, maxRows);
		return new LinkedHashSet<Bankaccountentry>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountentryByFiendlyNameContaining
	 *
	 */
	@Transactional
	public Set<Bankaccountentry> findBankaccountentryByFiendlyNameContaining(String fiendlyName) throws DataAccessException {

		return findBankaccountentryByFiendlyNameContaining(fiendlyName, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountentryByFiendlyNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountentry> findBankaccountentryByFiendlyNameContaining(String fiendlyName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountentryByFiendlyNameContaining", startResult, maxRows, fiendlyName);
		return new LinkedHashSet<Bankaccountentry>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountentryByType
	 *
	 */
	@Transactional
	public Set<Bankaccountentry> findBankaccountentryByType(String type) throws DataAccessException {

		return findBankaccountentryByType(type, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountentryByType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountentry> findBankaccountentryByType(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountentryByType", startResult, maxRows, type);
		return new LinkedHashSet<Bankaccountentry>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Bankaccountentry entity) {
		return true;
	}
}
