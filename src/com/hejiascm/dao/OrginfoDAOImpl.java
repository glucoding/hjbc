package com.hejiascm.dao;

import com.hejiascm.domain.Orginfo;

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
 * DAO to manage Orginfo entities.
 * 
 */
@Repository("OrginfoDAO")
@Transactional
public class OrginfoDAOImpl extends AbstractJpaDao<Orginfo> implements
		OrginfoDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Orginfo.class }));

	/**
	 * EntityManager injected by Spring for persistence unit HJDB
	 *
	 */
	@PersistenceContext(unitName = "HJDB")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OrginfoDAOImpl
	 *
	 */
	public OrginfoDAOImpl() {
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
	 * JPQL Query - findOrginfoByOrgTypeContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByOrgTypeContaining(String orgType) throws DataAccessException {

		return findOrginfoByOrgTypeContaining(orgType, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByOrgTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByOrgTypeContaining(String orgType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByOrgTypeContaining", startResult, maxRows, orgType);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByOrgAddress
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByOrgAddress(String orgAddress) throws DataAccessException {

		return findOrginfoByOrgAddress(orgAddress, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByOrgAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByOrgAddress(String orgAddress, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByOrgAddress", startResult, maxRows, orgAddress);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByRegistrationIdContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByRegistrationIdContaining(String registrationId) throws DataAccessException {

		return findOrginfoByRegistrationIdContaining(registrationId, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByRegistrationIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByRegistrationIdContaining(String registrationId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByRegistrationIdContaining", startResult, maxRows, registrationId);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByTaxCodeContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByTaxCodeContaining(String taxCode) throws DataAccessException {

		return findOrginfoByTaxCodeContaining(taxCode, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByTaxCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByTaxCodeContaining(String taxCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByTaxCodeContaining", startResult, maxRows, taxCode);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByEstablishDate
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByEstablishDate(java.util.Calendar establishDate) throws DataAccessException {

		return findOrginfoByEstablishDate(establishDate, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByEstablishDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByEstablishDate(java.util.Calendar establishDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByEstablishDate", startResult, maxRows, establishDate);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByOpid
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByOpid(String opid) throws DataAccessException {

		return findOrginfoByOpid(opid, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByOpid
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByOpid(String opid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByOpid", startResult, maxRows, opid);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByTaxCode
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByTaxCode(String taxCode) throws DataAccessException {

		return findOrginfoByTaxCode(taxCode, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByTaxCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByTaxCode(String taxCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByTaxCode", startResult, maxRows, taxCode);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByNameContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByNameContaining(String name) throws DataAccessException {

		return findOrginfoByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoById
	 *
	 */
	@Transactional
	public Orginfo findOrginfoById(String id) throws DataAccessException {

		return findOrginfoById(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoById
	 *
	 */

	@Transactional
	public Orginfo findOrginfoById(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrginfoById", startResult, maxRows, id);
			return (com.hejiascm.domain.Orginfo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrginfoByOrgAddressContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByOrgAddressContaining(String orgAddress) throws DataAccessException {

		return findOrginfoByOrgAddressContaining(orgAddress, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByOrgAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByOrgAddressContaining(String orgAddress, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByOrgAddressContaining", startResult, maxRows, orgAddress);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByEmailContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByEmailContaining(String email) throws DataAccessException {

		return findOrginfoByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByOrgType
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByOrgType(String orgType) throws DataAccessException {

		return findOrginfoByOrgType(orgType, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByOrgType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByOrgType(String orgType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByOrgType", startResult, maxRows, orgType);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByPrimaryKey
	 *
	 */
	@Transactional
	public Orginfo findOrginfoByPrimaryKey(String id) throws DataAccessException {

		return findOrginfoByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByPrimaryKey
	 *
	 */

	@Transactional
	public Orginfo findOrginfoByPrimaryKey(String id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOrginfoByPrimaryKey", startResult, maxRows, id);
			return (com.hejiascm.domain.Orginfo) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOrginfoByTelContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByTelContaining(String tel) throws DataAccessException {

		return findOrginfoByTelContaining(tel, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByTelContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByTelContaining(String tel, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByTelContaining", startResult, maxRows, tel);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoBySummaryContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoBySummaryContaining(String summary) throws DataAccessException {

		return findOrginfoBySummaryContaining(summary, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoBySummaryContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoBySummaryContaining(String summary, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoBySummaryContaining", startResult, maxRows, summary);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllOrginfos
	 *
	 */
	@Transactional
	public Set<Orginfo> findAllOrginfos() throws DataAccessException {

		return findAllOrginfos(-1, -1);
	}

	/**
	 * JPQL Query - findAllOrginfos
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findAllOrginfos(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOrginfos", startResult, maxRows);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByValidityTermContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByValidityTermContaining(String validityTerm) throws DataAccessException {

		return findOrginfoByValidityTermContaining(validityTerm, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByValidityTermContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByValidityTermContaining(String validityTerm, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByValidityTermContaining", startResult, maxRows, validityTerm);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByPasswordContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByPasswordContaining(String password) throws DataAccessException {

		return findOrginfoByPasswordContaining(password, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByPasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByPasswordContaining", startResult, maxRows, password);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByTel
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByTel(String tel) throws DataAccessException {

		return findOrginfoByTel(tel, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByTel
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByTel(String tel, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByTel", startResult, maxRows, tel);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByEstablishDateBefore
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByEstablishDateBefore(java.util.Calendar establishDate) throws DataAccessException {

		return findOrginfoByEstablishDateBefore(establishDate, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByEstablishDateBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByEstablishDateBefore(java.util.Calendar establishDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByEstablishDateBefore", startResult, maxRows, establishDate);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByName
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByName(String name) throws DataAccessException {

		return findOrginfoByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByName", startResult, maxRows, name);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByRegistrationAmount
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByRegistrationAmount(Integer registrationAmount) throws DataAccessException {

		return findOrginfoByRegistrationAmount(registrationAmount, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByRegistrationAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByRegistrationAmount(Integer registrationAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByRegistrationAmount", startResult, maxRows, registrationAmount);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByPassword
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByPassword(String password) throws DataAccessException {

		return findOrginfoByPassword(password, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByPassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByPassword(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByPassword", startResult, maxRows, password);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByMobile
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByMobile(String mobile) throws DataAccessException {

		return findOrginfoByMobile(mobile, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByMobile
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByMobile(String mobile, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByMobile", startResult, maxRows, mobile);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByRegistrationId
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByRegistrationId(String registrationId) throws DataAccessException {

		return findOrginfoByRegistrationId(registrationId, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByRegistrationId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByRegistrationId(String registrationId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByRegistrationId", startResult, maxRows, registrationId);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByOrgRep
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByOrgRep(String orgRep) throws DataAccessException {

		return findOrginfoByOrgRep(orgRep, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByOrgRep
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByOrgRep(String orgRep, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByOrgRep", startResult, maxRows, orgRep);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByBusinessScope
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByBusinessScope(String businessScope) throws DataAccessException {

		return findOrginfoByBusinessScope(businessScope, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByBusinessScope
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByBusinessScope(String businessScope, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByBusinessScope", startResult, maxRows, businessScope);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByOrgCodeContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByOrgCodeContaining(String orgCode) throws DataAccessException {

		return findOrginfoByOrgCodeContaining(orgCode, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByOrgCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByOrgCodeContaining(String orgCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByOrgCodeContaining", startResult, maxRows, orgCode);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByOrgRepContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByOrgRepContaining(String orgRep) throws DataAccessException {

		return findOrginfoByOrgRepContaining(orgRep, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByOrgRepContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByOrgRepContaining(String orgRep, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByOrgRepContaining", startResult, maxRows, orgRep);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByOrgCode
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByOrgCode(String orgCode) throws DataAccessException {

		return findOrginfoByOrgCode(orgCode, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByOrgCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByOrgCode(String orgCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByOrgCode", startResult, maxRows, orgCode);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByRole
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByRole(Integer role) throws DataAccessException {

		return findOrginfoByRole(role, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByRole
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByRole(Integer role, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByRole", startResult, maxRows, role);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByIdContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByIdContaining(String id) throws DataAccessException {

		return findOrginfoByIdContaining(id, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByIdContaining(String id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByIdContaining", startResult, maxRows, id);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByOpidContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByOpidContaining(String opid) throws DataAccessException {

		return findOrginfoByOpidContaining(opid, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByOpidContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByOpidContaining(String opid, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByOpidContaining", startResult, maxRows, opid);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByValidityTerm
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByValidityTerm(String validityTerm) throws DataAccessException {

		return findOrginfoByValidityTerm(validityTerm, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByValidityTerm
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByValidityTerm(String validityTerm, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByValidityTerm", startResult, maxRows, validityTerm);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByBusinessScopeContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByBusinessScopeContaining(String businessScope) throws DataAccessException {

		return findOrginfoByBusinessScopeContaining(businessScope, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByBusinessScopeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByBusinessScopeContaining(String businessScope, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByBusinessScopeContaining", startResult, maxRows, businessScope);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoBySummary
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoBySummary(String summary) throws DataAccessException {

		return findOrginfoBySummary(summary, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoBySummary
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoBySummary(String summary, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoBySummary", startResult, maxRows, summary);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByAdmin
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByAdmin(String admin) throws DataAccessException {

		return findOrginfoByAdmin(admin, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByAdmin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByAdmin(String admin, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByAdmin", startResult, maxRows, admin);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByTaxpayerIdContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByTaxpayerIdContaining(String taxpayerId) throws DataAccessException {

		return findOrginfoByTaxpayerIdContaining(taxpayerId, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByTaxpayerIdContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByTaxpayerIdContaining(String taxpayerId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByTaxpayerIdContaining", startResult, maxRows, taxpayerId);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByEstablishDateAfter
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByEstablishDateAfter(java.util.Calendar establishDate) throws DataAccessException {

		return findOrginfoByEstablishDateAfter(establishDate, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByEstablishDateAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByEstablishDateAfter(java.util.Calendar establishDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByEstablishDateAfter", startResult, maxRows, establishDate);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByAdminContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByAdminContaining(String admin) throws DataAccessException {

		return findOrginfoByAdminContaining(admin, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByAdminContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByAdminContaining(String admin, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByAdminContaining", startResult, maxRows, admin);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByState
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByState(Integer state) throws DataAccessException {

		return findOrginfoByState(state, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByState
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByState(Integer state, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByState", startResult, maxRows, state);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByMobileContaining
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByMobileContaining(String mobile) throws DataAccessException {

		return findOrginfoByMobileContaining(mobile, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByMobileContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByMobileContaining(String mobile, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByMobileContaining", startResult, maxRows, mobile);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByTaxpayerId
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByTaxpayerId(String taxpayerId) throws DataAccessException {

		return findOrginfoByTaxpayerId(taxpayerId, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByTaxpayerId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByTaxpayerId(String taxpayerId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByTaxpayerId", startResult, maxRows, taxpayerId);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * JPQL Query - findOrginfoByEmail
	 *
	 */
	@Transactional
	public Set<Orginfo> findOrginfoByEmail(String email) throws DataAccessException {

		return findOrginfoByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findOrginfoByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Orginfo> findOrginfoByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOrginfoByEmail", startResult, maxRows, email);
		return new LinkedHashSet<Orginfo>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Orginfo entity) {
		return true;
	}
}
