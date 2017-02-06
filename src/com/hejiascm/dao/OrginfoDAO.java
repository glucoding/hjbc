package com.hejiascm.dao;

import com.hejiascm.domain.Orginfo;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Orginfo entities.
 * 
 */
public interface OrginfoDAO extends JpaDao<Orginfo> {

	/**
	 * JPQL Query - findOrginfoByOrgTypeContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgTypeContaining(String orgType) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgTypeContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgTypeContaining(String orgType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgAddress
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgAddress(String orgAddress) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgAddress
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgAddress(String orgAddress, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByRegistrationIdContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByRegistrationIdContaining(String registrationId) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByRegistrationIdContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByRegistrationIdContaining(String registrationId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByTaxCodeContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByTaxCodeContaining(String taxCode) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByTaxCodeContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByTaxCodeContaining(String taxCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByEstablishDate
	 *
	 */
	public Set<Orginfo> findOrginfoByEstablishDate(java.util.Calendar establishDate) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByEstablishDate
	 *
	 */
	public Set<Orginfo> findOrginfoByEstablishDate(Calendar establishDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOpid
	 *
	 */
	public Set<Orginfo> findOrginfoByOpid(String opid) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOpid
	 *
	 */
	public Set<Orginfo> findOrginfoByOpid(String opid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByTaxCode
	 *
	 */
	public Set<Orginfo> findOrginfoByTaxCode(String taxCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByTaxCode
	 *
	 */
	public Set<Orginfo> findOrginfoByTaxCode(String taxCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByNameContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByNameContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoById
	 *
	 */
	public Orginfo findOrginfoById(String id) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoById
	 *
	 */
	public Orginfo findOrginfoById(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgAddressContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgAddressContaining(String orgAddress_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgAddressContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgAddressContaining(String orgAddress_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByEmailContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByEmailContaining(String email) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByEmailContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgType
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgType(String orgType_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgType
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgType(String orgType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByPrimaryKey
	 *
	 */
	public Orginfo findOrginfoByPrimaryKey(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByPrimaryKey
	 *
	 */
	public Orginfo findOrginfoByPrimaryKey(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByTelContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByTelContaining(String tel) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByTelContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByTelContaining(String tel, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoBySummaryContaining
	 *
	 */
	public Set<Orginfo> findOrginfoBySummaryContaining(String summary) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoBySummaryContaining
	 *
	 */
	public Set<Orginfo> findOrginfoBySummaryContaining(String summary, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOrginfos
	 *
	 */
	public Set<Orginfo> findAllOrginfos() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrginfos
	 *
	 */
	public Set<Orginfo> findAllOrginfos(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByValidityTermContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByValidityTermContaining(String validityTerm) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByValidityTermContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByValidityTermContaining(String validityTerm, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByPasswordContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByPasswordContaining(String password) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByPasswordContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByTel
	 *
	 */
	public Set<Orginfo> findOrginfoByTel(String tel_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByTel
	 *
	 */
	public Set<Orginfo> findOrginfoByTel(String tel_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByEstablishDateBefore
	 *
	 */
	public Set<Orginfo> findOrginfoByEstablishDateBefore(java.util.Calendar establishDate_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByEstablishDateBefore
	 *
	 */
	public Set<Orginfo> findOrginfoByEstablishDateBefore(Calendar establishDate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByName
	 *
	 */
	public Set<Orginfo> findOrginfoByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByName
	 *
	 */
	public Set<Orginfo> findOrginfoByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByRegistrationAmount
	 *
	 */
	public Set<Orginfo> findOrginfoByRegistrationAmount(Integer registrationAmount) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByRegistrationAmount
	 *
	 */
	public Set<Orginfo> findOrginfoByRegistrationAmount(Integer registrationAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByPassword
	 *
	 */
	public Set<Orginfo> findOrginfoByPassword(String password_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByPassword
	 *
	 */
	public Set<Orginfo> findOrginfoByPassword(String password_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByMobile
	 *
	 */
	public Set<Orginfo> findOrginfoByMobile(String mobile) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByMobile
	 *
	 */
	public Set<Orginfo> findOrginfoByMobile(String mobile, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByRegistrationId
	 *
	 */
	public Set<Orginfo> findOrginfoByRegistrationId(String registrationId_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByRegistrationId
	 *
	 */
	public Set<Orginfo> findOrginfoByRegistrationId(String registrationId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgRep
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgRep(String orgRep) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgRep
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgRep(String orgRep, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByBusinessScope
	 *
	 */
	public Set<Orginfo> findOrginfoByBusinessScope(String businessScope) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByBusinessScope
	 *
	 */
	public Set<Orginfo> findOrginfoByBusinessScope(String businessScope, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgCodeContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgCodeContaining(String orgCode) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgCodeContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgCodeContaining(String orgCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgRepContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgRepContaining(String orgRep_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgRepContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgRepContaining(String orgRep_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgCode
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgCode(String orgCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOrgCode
	 *
	 */
	public Set<Orginfo> findOrginfoByOrgCode(String orgCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByRole
	 *
	 */
	public Set<Orginfo> findOrginfoByRole(Integer role) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByRole
	 *
	 */
	public Set<Orginfo> findOrginfoByRole(Integer role, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByIdContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByIdContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOpidContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByOpidContaining(String opid_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByOpidContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByOpidContaining(String opid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByValidityTerm
	 *
	 */
	public Set<Orginfo> findOrginfoByValidityTerm(String validityTerm_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByValidityTerm
	 *
	 */
	public Set<Orginfo> findOrginfoByValidityTerm(String validityTerm_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByBusinessScopeContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByBusinessScopeContaining(String businessScope_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByBusinessScopeContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByBusinessScopeContaining(String businessScope_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoBySummary
	 *
	 */
	public Set<Orginfo> findOrginfoBySummary(String summary_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoBySummary
	 *
	 */
	public Set<Orginfo> findOrginfoBySummary(String summary_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByAdmin
	 *
	 */
	public Set<Orginfo> findOrginfoByAdmin(String admin) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByAdmin
	 *
	 */
	public Set<Orginfo> findOrginfoByAdmin(String admin, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByTaxpayerIdContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByTaxpayerIdContaining(String taxpayerId) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByTaxpayerIdContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByTaxpayerIdContaining(String taxpayerId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByEstablishDateAfter
	 *
	 */
	public Set<Orginfo> findOrginfoByEstablishDateAfter(java.util.Calendar establishDate_2) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByEstablishDateAfter
	 *
	 */
	public Set<Orginfo> findOrginfoByEstablishDateAfter(Calendar establishDate_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByAdminContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByAdminContaining(String admin_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByAdminContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByAdminContaining(String admin_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByState
	 *
	 */
	public Set<Orginfo> findOrginfoByState(Integer state) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByState
	 *
	 */
	public Set<Orginfo> findOrginfoByState(Integer state, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByMobileContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByMobileContaining(String mobile_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByMobileContaining
	 *
	 */
	public Set<Orginfo> findOrginfoByMobileContaining(String mobile_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByTaxpayerId
	 *
	 */
	public Set<Orginfo> findOrginfoByTaxpayerId(String taxpayerId_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByTaxpayerId
	 *
	 */
	public Set<Orginfo> findOrginfoByTaxpayerId(String taxpayerId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByEmail
	 *
	 */
	public Set<Orginfo> findOrginfoByEmail(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrginfoByEmail
	 *
	 */
	public Set<Orginfo> findOrginfoByEmail(String email_1, int startResult, int maxRows) throws DataAccessException;

}