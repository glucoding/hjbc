package com.hejiascm.service;

import com.hejiascm.dao.BankaccountentryDAO;

import com.hejiascm.domain.Bankaccountentry;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Bankaccountentry entities
 * 
 */

@Service("BankaccountentryService")
@Transactional
public class BankaccountentryServiceImpl implements BankaccountentryService {

	/**
	 * DAO injected by Spring that manages Bankaccountentry entities
	 * 
	 */
	@Autowired
	private BankaccountentryDAO bankaccountentryDAO;

	/**
	 * Instantiates a new BankaccountentryServiceImpl.
	 *
	 */
	public BankaccountentryServiceImpl() {
	}

	/**
	 * Return a count of all Bankaccountentry entity
	 * 
	 */
	@Transactional
	public Integer countBankaccountentrys() {
		return ((Long) bankaccountentryDAO.createQuerySingleResult("select count(o) from Bankaccountentry o").getSingleResult()).intValue();
	}

	/**
	 * Return all Bankaccountentry entity
	 * 
	 */
	@Transactional
	public List<Bankaccountentry> findAllBankaccountentrys(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Bankaccountentry>(bankaccountentryDAO.findAllBankaccountentrys(startResult, maxRows));
	}

	/**
	 * Save an existing Bankaccountentry entity
	 * 
	 */
	@Transactional
	public void saveBankaccountentry(Bankaccountentry bankaccountentry) {
		Bankaccountentry existingBankaccountentry = bankaccountentryDAO.findBankaccountentryByPrimaryKey(bankaccountentry.getId());

		if (existingBankaccountentry != null) {
			if (existingBankaccountentry != bankaccountentry) {
				existingBankaccountentry.setId(bankaccountentry.getId());
				existingBankaccountentry.setFiendlyName(bankaccountentry.getFiendlyName());
				existingBankaccountentry.setType(bankaccountentry.getType());
				existingBankaccountentry.setBankAccountInfo(bankaccountentry.getBankAccountInfo());
			}
			bankaccountentry = bankaccountentryDAO.store(existingBankaccountentry);
		} else {
			bankaccountentry = bankaccountentryDAO.store(bankaccountentry);
		}
		bankaccountentryDAO.flush();
	}

	/**
	 */
	@Transactional
	public Bankaccountentry findBankaccountentryByPrimaryKey(String id) {
		return bankaccountentryDAO.findBankaccountentryByPrimaryKey(id);
	}

	/**
	 * Delete an existing Bankaccountentry entity
	 * 
	 */
	@Transactional
	public void deleteBankaccountentry(Bankaccountentry bankaccountentry) {
		bankaccountentryDAO.remove(bankaccountentry);
		bankaccountentryDAO.flush();
	}

	/**
	 * Load an existing Bankaccountentry entity
	 * 
	 */
	@Transactional
	public Set<Bankaccountentry> loadBankaccountentrys() {
		return bankaccountentryDAO.findAllBankaccountentrys();
	}
}
