package com.hejiascm.service;

import com.hejiascm.blockchain.dao.BcOrgInfoDAO;
import com.hejiascm.dao.BankaccountinfoDAO;
import com.hejiascm.dao.OrginfoDAO;
import com.hejiascm.dao.OrginfoattachmentDAO;
import com.hejiascm.domain.Bankaccountinfo;
import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.Orginfoattachment;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Orginfo entities
 * 
 */

@Service("OrginfoService")
@Transactional
public class OrginfoServiceImpl implements OrginfoService {

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
	 * DAO injected by Spring that manages Orginfoattachment entities
	 * 
	 */
	@Autowired
	private OrginfoattachmentDAO orginfoattachmentDAO;
	
	@Autowired
	private BcOrgInfoDAO bcOrgInfoDAO;

	/**
	 * Instantiates a new OrginfoServiceImpl.
	 *
	 */
	public OrginfoServiceImpl() {
	}

	/**
	 * Save an existing Bankaccountinfo entity
	 * 
	 */
	@Transactional
	public Orginfo saveOrginfoBankaccountinfos(String id, Bankaccountinfo related_bankaccountinfos) {
		Orginfo orginfo = orginfoDAO.findOrginfoByPrimaryKey(id, -1, -1);
		Bankaccountinfo existingbankaccountinfos = bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(related_bankaccountinfos.getId());

		// copy into the existing record to preserve existing relationships
		if (existingbankaccountinfos != null) {
			existingbankaccountinfos.setId(related_bankaccountinfos.getId());
			existingbankaccountinfos.setFriendlyName(related_bankaccountinfos.getFriendlyName());
			existingbankaccountinfos.setType(related_bankaccountinfos.getType());
			existingbankaccountinfos.setOrgFullName(related_bankaccountinfos.getOrgFullName());
			existingbankaccountinfos.setBankName(related_bankaccountinfos.getBankName());
			existingbankaccountinfos.setBankAccount(related_bankaccountinfos.getBankAccount());
			existingbankaccountinfos.setBankId(related_bankaccountinfos.getBankId());
			related_bankaccountinfos = existingbankaccountinfos;
		} else {
			related_bankaccountinfos = bankaccountinfoDAO.store(related_bankaccountinfos);
			bankaccountinfoDAO.flush();
		}

		related_bankaccountinfos.setOrginfo(orginfo);
		orginfo.getBankaccountinfos().add(related_bankaccountinfos);
		related_bankaccountinfos = bankaccountinfoDAO.store(related_bankaccountinfos);
		bankaccountinfoDAO.flush();

		orginfo = orginfoDAO.store(orginfo);
		orginfoDAO.flush();

		return orginfo;
	}

	/**
	 * Save an existing Orginfo entity
	 * 
	 */
	@Transactional
	public void saveOrginfo(Orginfo orginfo) {
		Orginfo existingOrginfo = orginfoDAO.findOrginfoByPrimaryKey(orginfo.getId());

		if (existingOrginfo != null) {
			if (existingOrginfo != orginfo) {
				existingOrginfo.setId(orginfo.getId());
				existingOrginfo.setName(orginfo.getName());
				existingOrginfo.setTaxpayerId(orginfo.getTaxpayerId());
				existingOrginfo.setRole(orginfo.getRole());
				existingOrginfo.setSummary(orginfo.getSummary());
				existingOrginfo.setState(orginfo.getState());
				existingOrginfo.setOrgType(orginfo.getOrgType());
				existingOrginfo.setOrgAddress(orginfo.getOrgAddress());
				existingOrginfo.setOrgRep(orginfo.getOrgRep());
				existingOrginfo.setEstablishDate(orginfo.getEstablishDate());
				existingOrginfo.setValidityTerm(orginfo.getValidityTerm());
				existingOrginfo.setBusinessScope(orginfo.getBusinessScope());
				existingOrginfo.setOrgCode(orginfo.getOrgCode());
				existingOrginfo.setTaxCode(orginfo.getTaxCode());
				existingOrginfo.setTel(orginfo.getTel());
				existingOrginfo.setOpid(orginfo.getOpid());
				existingOrginfo.setRegistrationId(orginfo.getRegistrationId());
				existingOrginfo.setRegistrationAmount(orginfo.getRegistrationAmount());
				existingOrginfo.setAdmin(orginfo.getAdmin());
				existingOrginfo.setEmail(orginfo.getEmail());
				existingOrginfo.setMobile(orginfo.getMobile());
				existingOrginfo.setPassword(orginfo.getPassword());
			}
			orginfo = orginfoDAO.store(existingOrginfo);
		} else {
			System.out.println("before storing: " + orginfo.getName());
			orginfo = orginfoDAO.store(orginfo);
		}
		orginfoDAO.flush();
	}
	
	/**
	 * Save an existing Orginfo entity
	 * 
	 */
	@Transactional
	public void registerBcOrginfo(Orginfo orginfo) {
		Orginfo existingOrginfo = bcOrgInfoDAO.findBcOrginfoById(orginfo.getId());

		if (existingOrginfo != null) {
			System.out.println("Organization existed");
		} else {
			bcOrgInfoDAO.registerBcOrginfo(orginfo);
		}
	}

	/**
	 * Return all Orginfo entity
	 * 
	 */
	@Transactional
	public List<Orginfo> findAllOrginfos(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Orginfo>(orginfoDAO.findAllOrginfos(startResult, maxRows));
	}

	/**
	 * Delete an existing Orginfo entity
	 * 
	 */
	@Transactional
	public void deleteOrginfo(Orginfo orginfo) {
		orginfoDAO.remove(orginfo);
		orginfoDAO.flush();
	}

	/**
	 */
	@Transactional
	public Orginfo findOrginfoByPrimaryKey(String id) {
		return orginfoDAO.findOrginfoByPrimaryKey(id);
	}

	/**
	 * Load an existing Orginfo entity
	 * 
	 */
	@Transactional
	public Set<Orginfo> loadOrginfos() {
		return orginfoDAO.findAllOrginfos();
	}
	
	/**
	 * Return all Orginfo from Block Chain
	 */
	public List<Orginfo> loadBcOrginfos(){
		return null;
	}

	/**
	 * Delete an existing Bankaccountinfo entity
	 * 
	 */
	@Transactional
	public Orginfo deleteOrginfoBankaccountinfos(String orginfo_id, String related_bankaccountinfos_id) {
		Bankaccountinfo related_bankaccountinfos = bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(related_bankaccountinfos_id, -1, -1);

		Orginfo orginfo = orginfoDAO.findOrginfoByPrimaryKey(orginfo_id, -1, -1);

		related_bankaccountinfos.setOrginfo(null);
		orginfo.getBankaccountinfos().remove(related_bankaccountinfos);

		bankaccountinfoDAO.remove(related_bankaccountinfos);
		bankaccountinfoDAO.flush();

		return orginfo;
	}

	/**
	 * Delete an existing Orginfoattachment entity
	 * 
	 */
	@Transactional
	public Orginfo deleteOrginfoOrginfoattachments(String orginfo_id, String related_orginfoattachments_id) {
		Orginfoattachment related_orginfoattachments = orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(related_orginfoattachments_id, -1, -1);

		Orginfo orginfo = orginfoDAO.findOrginfoByPrimaryKey(orginfo_id, -1, -1);

		related_orginfoattachments.setOrginfo(null);
		orginfo.getOrginfoattachments().remove(related_orginfoattachments);

		orginfoattachmentDAO.remove(related_orginfoattachments);
		orginfoattachmentDAO.flush();

		return orginfo;
	}

	/**
	 * Return a count of all Orginfo entity
	 * 
	 */
	@Transactional
	public Integer countOrginfos() {
		return ((Long) orginfoDAO.createQuerySingleResult("select count(o) from Orginfo o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Orginfoattachment entity
	 * 
	 */
	@Transactional
	public Orginfo saveOrginfoOrginfoattachments(String id, Orginfoattachment related_orginfoattachments) {
		Orginfo orginfo = orginfoDAO.findOrginfoByPrimaryKey(id, -1, -1);
		Orginfoattachment existingorginfoattachments = orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(related_orginfoattachments.getId());

		// copy into the existing record to preserve existing relationships
		if (existingorginfoattachments != null) {
			existingorginfoattachments.setId(related_orginfoattachments.getId());
			existingorginfoattachments.setAddress(related_orginfoattachments.getAddress());
			related_orginfoattachments = existingorginfoattachments;
		} else {
			related_orginfoattachments = orginfoattachmentDAO.store(related_orginfoattachments);
			orginfoattachmentDAO.flush();
		}

		related_orginfoattachments.setOrginfo(orginfo);
		orginfo.getOrginfoattachments().add(related_orginfoattachments);
		related_orginfoattachments = orginfoattachmentDAO.store(related_orginfoattachments);
		orginfoattachmentDAO.flush();

		orginfo = orginfoDAO.store(orginfo);
		orginfoDAO.flush();

		return orginfo;
	}
}
