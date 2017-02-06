package com.hejiascm.service;

import com.hejiascm.dao.BankaccountinfoDAO;
import com.hejiascm.dao.OrginfoDAO;

import com.hejiascm.domain.Bankaccountinfo;
import com.hejiascm.domain.Orginfo;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Bankaccountinfo entities
 * 
 */

@Service("BankaccountinfoService")
@Transactional
public class BankaccountinfoServiceImpl implements BankaccountinfoService {

	/**
	 * DAO injected by Spring that manages Bankaccountinfo entities
	 * 
	 */
	@Autowired
	private BankaccountinfoDAO bankaccountinfoDAO;

	/**
	 * DAO injected by Spring that manages Orginfo entities
	 * 
	 */
	@Autowired
	private OrginfoDAO orginfoDAO;

	/**
	 * Instantiates a new BankaccountinfoServiceImpl.
	 *
	 */
	public BankaccountinfoServiceImpl() {
	}

	/**
	 * Return all Bankaccountinfo entity
	 * 
	 */
	@Transactional
	public List<Bankaccountinfo> findAllBankaccountinfos(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Bankaccountinfo>(bankaccountinfoDAO.findAllBankaccountinfos(startResult, maxRows));
	}

	/**
	 * Save an existing Orginfo entity
	 * 
	 */
	@Transactional
	public Bankaccountinfo saveBankaccountinfoOrginfo(String id, Orginfo related_orginfo) {
		Bankaccountinfo bankaccountinfo = bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(id, -1, -1);
		Orginfo existingorginfo = orginfoDAO.findOrginfoByPrimaryKey(related_orginfo.getId());

		// copy into the existing record to preserve existing relationships
		if (existingorginfo != null) {
			existingorginfo.setId(related_orginfo.getId());
			existingorginfo.setName(related_orginfo.getName());
			existingorginfo.setTaxpayerId(related_orginfo.getTaxpayerId());
			existingorginfo.setRole(related_orginfo.getRole());
			existingorginfo.setSummary(related_orginfo.getSummary());
			existingorginfo.setState(related_orginfo.getState());
			existingorginfo.setOrgType(related_orginfo.getOrgType());
			existingorginfo.setOrgAddress(related_orginfo.getOrgAddress());
			existingorginfo.setOrgRep(related_orginfo.getOrgRep());
			existingorginfo.setEstablishDate(related_orginfo.getEstablishDate());
			existingorginfo.setValidityTerm(related_orginfo.getValidityTerm());
			existingorginfo.setBusinessScope(related_orginfo.getBusinessScope());
			existingorginfo.setOrgCode(related_orginfo.getOrgCode());
			existingorginfo.setTaxCode(related_orginfo.getTaxCode());
			existingorginfo.setTel(related_orginfo.getTel());
			existingorginfo.setOpid(related_orginfo.getOpid());
			existingorginfo.setRegistrationId(related_orginfo.getRegistrationId());
			existingorginfo.setRegistrationAmount(related_orginfo.getRegistrationAmount());
			existingorginfo.setAdmin(related_orginfo.getAdmin());
			existingorginfo.setEmail(related_orginfo.getEmail());
			existingorginfo.setMobile(related_orginfo.getMobile());
			existingorginfo.setPassword(related_orginfo.getPassword());
			related_orginfo = existingorginfo;
		} else {
			related_orginfo = orginfoDAO.store(related_orginfo);
			orginfoDAO.flush();
		}

		bankaccountinfo.setOrginfo(related_orginfo);
		related_orginfo.getBankaccountinfos().add(bankaccountinfo);
		bankaccountinfo = bankaccountinfoDAO.store(bankaccountinfo);
		bankaccountinfoDAO.flush();

		related_orginfo = orginfoDAO.store(related_orginfo);
		orginfoDAO.flush();

		return bankaccountinfo;
	}

	/**
	 * Delete an existing Orginfo entity
	 * 
	 */
	@Transactional
	public Bankaccountinfo deleteBankaccountinfoOrginfo(String bankaccountinfo_id, String related_orginfo_id) {
		Bankaccountinfo bankaccountinfo = bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(bankaccountinfo_id, -1, -1);
		Orginfo related_orginfo = orginfoDAO.findOrginfoByPrimaryKey(related_orginfo_id, -1, -1);

		bankaccountinfo.setOrginfo(null);
		related_orginfo.getBankaccountinfos().remove(bankaccountinfo);
		bankaccountinfo = bankaccountinfoDAO.store(bankaccountinfo);
		bankaccountinfoDAO.flush();

		related_orginfo = orginfoDAO.store(related_orginfo);
		orginfoDAO.flush();

		orginfoDAO.remove(related_orginfo);
		orginfoDAO.flush();

		return bankaccountinfo;
	}

	/**
	 * Load an existing Bankaccountinfo entity
	 * 
	 */
	@Transactional
	public Set<Bankaccountinfo> loadBankaccountinfos() {
		return bankaccountinfoDAO.findAllBankaccountinfos();
	}

	/**
	 * Delete an existing Bankaccountinfo entity
	 * 
	 */
	@Transactional
	public void deleteBankaccountinfo(Bankaccountinfo bankaccountinfo) {
		bankaccountinfoDAO.remove(bankaccountinfo);
		bankaccountinfoDAO.flush();
	}

	/**
	 * Return a count of all Bankaccountinfo entity
	 * 
	 */
	@Transactional
	public Integer countBankaccountinfos() {
		return ((Long) bankaccountinfoDAO.createQuerySingleResult("select count(o) from Bankaccountinfo o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Bankaccountinfo entity
	 * 
	 */
	@Transactional
	public void saveBankaccountinfo(Bankaccountinfo bankaccountinfo) {
		Bankaccountinfo existingBankaccountinfo = bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(bankaccountinfo.getId());

		if (existingBankaccountinfo != null) {
			if (existingBankaccountinfo != bankaccountinfo) {
				existingBankaccountinfo.setId(bankaccountinfo.getId());
				existingBankaccountinfo.setFriendlyName(bankaccountinfo.getFriendlyName());
				existingBankaccountinfo.setType(bankaccountinfo.getType());
				existingBankaccountinfo.setOrgFullName(bankaccountinfo.getOrgFullName());
				existingBankaccountinfo.setBankName(bankaccountinfo.getBankName());
				existingBankaccountinfo.setBankAccount(bankaccountinfo.getBankAccount());
				existingBankaccountinfo.setBankId(bankaccountinfo.getBankId());
			}
			bankaccountinfo = bankaccountinfoDAO.store(existingBankaccountinfo);
		} else {
			bankaccountinfo = bankaccountinfoDAO.store(bankaccountinfo);
		}
		bankaccountinfoDAO.flush();
	}

	/**
	 */
	@Transactional
	public Bankaccountinfo findBankaccountinfoByPrimaryKey(String id) {
		return bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(id);
	}
}
