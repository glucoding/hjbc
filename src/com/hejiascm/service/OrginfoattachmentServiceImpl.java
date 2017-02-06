package com.hejiascm.service;

import com.hejiascm.dao.OrginfoDAO;
import com.hejiascm.dao.OrginfoattachmentDAO;

import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.Orginfoattachment;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Orginfoattachment entities
 * 
 */

@Service("OrginfoattachmentService")
@Transactional
public class OrginfoattachmentServiceImpl implements OrginfoattachmentService {

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

	/**
	 * Instantiates a new OrginfoattachmentServiceImpl.
	 *
	 */
	public OrginfoattachmentServiceImpl() {
	}

	/**
	 * Return all Orginfoattachment entity
	 * 
	 */
	@Transactional
	public List<Orginfoattachment> findAllOrginfoattachments(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Orginfoattachment>(orginfoattachmentDAO.findAllOrginfoattachments(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Orginfoattachment findOrginfoattachmentByPrimaryKey(String id) {
		return orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(id);
	}

	/**
	 * Load an existing Orginfoattachment entity
	 * 
	 */
	@Transactional
	public Set<Orginfoattachment> loadOrginfoattachments() {
		return orginfoattachmentDAO.findAllOrginfoattachments();
	}

	/**
	 * Delete an existing Orginfoattachment entity
	 * 
	 */
	@Transactional
	public void deleteOrginfoattachment(Orginfoattachment orginfoattachment) {
		orginfoattachmentDAO.remove(orginfoattachment);
		orginfoattachmentDAO.flush();
	}

	/**
	 * Save an existing Orginfoattachment entity
	 * 
	 */
	@Transactional
	public void saveOrginfoattachment(Orginfoattachment orginfoattachment) {
		Orginfoattachment existingOrginfoattachment = orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(orginfoattachment.getId());

		if (existingOrginfoattachment != null) {
			if (existingOrginfoattachment != orginfoattachment) {
				existingOrginfoattachment.setId(orginfoattachment.getId());
				existingOrginfoattachment.setAddress(orginfoattachment.getAddress());
			}
			orginfoattachment = orginfoattachmentDAO.store(existingOrginfoattachment);
		} else {
			orginfoattachment = orginfoattachmentDAO.store(orginfoattachment);
		}
		orginfoattachmentDAO.flush();
	}

	/**
	 * Return a count of all Orginfoattachment entity
	 * 
	 */
	@Transactional
	public Integer countOrginfoattachments() {
		return ((Long) orginfoattachmentDAO.createQuerySingleResult("select count(o) from Orginfoattachment o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Orginfo entity
	 * 
	 */
	@Transactional
	public Orginfoattachment saveOrginfoattachmentOrginfo(String id, Orginfo related_orginfo) {
		Orginfoattachment orginfoattachment = orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(id, -1, -1);
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

		orginfoattachment.setOrginfo(related_orginfo);
		related_orginfo.getOrginfoattachments().add(orginfoattachment);
		orginfoattachment = orginfoattachmentDAO.store(orginfoattachment);
		orginfoattachmentDAO.flush();

		related_orginfo = orginfoDAO.store(related_orginfo);
		orginfoDAO.flush();

		return orginfoattachment;
	}

	/**
	 * Delete an existing Orginfo entity
	 * 
	 */
	@Transactional
	public Orginfoattachment deleteOrginfoattachmentOrginfo(String orginfoattachment_id, String related_orginfo_id) {
		Orginfoattachment orginfoattachment = orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(orginfoattachment_id, -1, -1);
		Orginfo related_orginfo = orginfoDAO.findOrginfoByPrimaryKey(related_orginfo_id, -1, -1);

		orginfoattachment.setOrginfo(null);
		related_orginfo.getOrginfoattachments().remove(orginfoattachment);
		orginfoattachment = orginfoattachmentDAO.store(orginfoattachment);
		orginfoattachmentDAO.flush();

		related_orginfo = orginfoDAO.store(related_orginfo);
		orginfoDAO.flush();

		orginfoDAO.remove(related_orginfo);
		orginfoDAO.flush();

		return orginfoattachment;
	}
}
