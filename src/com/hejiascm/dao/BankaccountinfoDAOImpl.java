package com.hejiascm.dao;

import com.hejiascm.domain.Bankaccountinfo;

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
 * DAO to manage Bankaccountinfo entities.
 * 
 */
@Repository("BankaccountinfoDAO")
@Transactional
public class BankaccountinfoDAOImpl extends AbstractJpaDao<Bankaccountinfo>
		implements BankaccountinfoDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Bankaccountinfo.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new BankaccountinfoDAOImpl
	 *
	 */
	public BankaccountinfoDAOImpl() {
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
	 * JPQL Query - findBankaccountinfoByBankAccount
	 *
	 */
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByBankAccount(String bankAccount) throws DataAccessException {

		return findBankaccountinfoByBankAccount(bankAccount, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoByBankAccount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByBankAccount(String bankAccount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountinfoByBankAccount", startResult, maxRows, bankAccount);
		return new LinkedHashSet<Bankaccountinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllBankaccountinfos
	 *
	 */
	@Transactional
	public Set<Bankaccountinfo> findAllBankaccountinfos() throws DataAccessException {

		return findAllBankaccountinfos(-1, -1);
	}

	/**
	 * JPQL Query - findAllBankaccountinfos
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountinfo> findAllBankaccountinfos(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllBankaccountinfos", startResult, maxRows);
		return new LinkedHashSet<Bankaccountinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountinfoByBankNameContaining
	 *
	 */
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByBankNameContaining(String bankName) throws DataAccessException {

		return findBankaccountinfoByBankNameContaining(bankName, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoByBankNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByBankNameContaining(String bankName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountinfoByBankNameContaining", startResult, maxRows, bankName);
		return new LinkedHashSet<Bankaccountinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountinfoByPrimaryKey
	 *
	 */
	@Transactional
	public Bankaccountinfo findBankaccountinfoByPrimaryKey(String id) throws DataAccessException {

		return findBankaccountinfoByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoByPrimaryKey
	 *
	 */

	@Transactional
	public Bankaccountinfo findBankaccountinfoByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBankaccountinfoByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Bankaccountinfo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findBankaccountinfoByBankId
	 *
	 */
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByBankId(String bankId) throws DataAccessException {

		return findBankaccountinfoByBankId(bankId, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoByBankId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByBankId(String bankId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountinfoByBankId", startResult, maxRows, bankId);
		return new LinkedHashSet<Bankaccountinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountinfoByType
	 *
	 */
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByType(String type) throws DataAccessException {

		return findBankaccountinfoByType(type, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoByType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByType(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountinfoByType", startResult, maxRows, type);
		return new LinkedHashSet<Bankaccountinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountinfoByBankAccountContaining
	 *
	 */
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByBankAccountContaining(String bankAccount) throws DataAccessException {

		return findBankaccountinfoByBankAccountContaining(bankAccount, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoByBankAccountContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByBankAccountContaining(String bankAccount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountinfoByBankAccountContaining", startResult, maxRows, bankAccount);
		return new LinkedHashSet<Bankaccountinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountinfoByTypeContaining
	 *
	 */
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByTypeContaining(String type) throws DataAccessException {

		return findBankaccountinfoByTypeContaining(type, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoByTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountinfoByTypeContaining", startResult, maxRows, type);
		return new LinkedHashSet<Bankaccountinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountinfoByBankIdContaining
	 *
	 */
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByBankIdContaining(String bankId) throws DataAccessException {

		return findBankaccountinfoByBankIdContaining(bankId, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoByBankIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByBankIdContaining(String bankId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountinfoByBankIdContaining", startResult, maxRows, bankId);
		return new LinkedHashSet<Bankaccountinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountinfoByFriendlyNameContaining
	 *
	 */
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByFriendlyNameContaining(String friendlyName) throws DataAccessException {

		return findBankaccountinfoByFriendlyNameContaining(friendlyName, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoByFriendlyNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByFriendlyNameContaining(String friendlyName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountinfoByFriendlyNameContaining", startResult, maxRows, friendlyName);
		return new LinkedHashSet<Bankaccountinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountinfoById
	 *
	 */
	@Transactional
	public Bankaccountinfo findBankaccountinfoById(String id) throws DataAccessException {

		return findBankaccountinfoById(id, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoById
	 *
	 */

	@Transactional
	public Bankaccountinfo findBankaccountinfoById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBankaccountinfoById", startResult, maxRows, id);
			return (com.hejiascm.domain.Bankaccountinfo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findBankaccountinfoByFriendlyName
	 *
	 */
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByFriendlyName(String friendlyName) throws DataAccessException {

		return findBankaccountinfoByFriendlyName(friendlyName, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoByFriendlyName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByFriendlyName(String friendlyName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountinfoByFriendlyName", startResult, maxRows, friendlyName);
		return new LinkedHashSet<Bankaccountinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountinfoByBankName
	 *
	 */
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByBankName(String bankName) throws DataAccessException {

		return findBankaccountinfoByBankName(bankName, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoByBankName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByBankName(String bankName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountinfoByBankName", startResult, maxRows, bankName);
		return new LinkedHashSet<Bankaccountinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountinfoByOrgFullName
	 *
	 */
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByOrgFullName(String orgFullName) throws DataAccessException {

		return findBankaccountinfoByOrgFullName(orgFullName, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoByOrgFullName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByOrgFullName(String orgFullName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountinfoByOrgFullName", startResult, maxRows, orgFullName);
		return new LinkedHashSet<Bankaccountinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountinfoByIdContaining
	 *
	 */
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByIdContaining(String id) throws DataAccessException {

		return findBankaccountinfoByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountinfoByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Bankaccountinfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankaccountinfoByOrgFullNameContaining
	 *
	 */
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByOrgFullNameContaining(String orgFullName) throws DataAccessException {

		return findBankaccountinfoByOrgFullNameContaining(orgFullName, -1, -1);
	}

	/**
	 * JPQL Query - findBankaccountinfoByOrgFullNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bankaccountinfo> findBankaccountinfoByOrgFullNameContaining(String orgFullName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankaccountinfoByOrgFullNameContaining", startResult, maxRows, orgFullName);
		return new LinkedHashSet<Bankaccountinfo>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Bankaccountinfo entity) {
		return true;
	}
}
