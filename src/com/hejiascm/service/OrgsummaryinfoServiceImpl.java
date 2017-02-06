package com.hejiascm.service;

import com.hejiascm.dao.OrgsummaryinfoDAO;

import com.hejiascm.domain.Orgsummaryinfo;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Orgsummaryinfo entities
 * 
 */

@Service("OrgsummaryinfoService")
@Transactional
public class OrgsummaryinfoServiceImpl implements OrgsummaryinfoService {

	/**
	 * DAO injected by Spring that manages Orgsummaryinfo entities
	 * 
	 */
	@Autowired
	private OrgsummaryinfoDAO orgsummaryinfoDAO;

	/**
	 * Instantiates a new OrgsummaryinfoServiceImpl.
	 *
	 */
	public OrgsummaryinfoServiceImpl() {
	}

	/**
	 * Return a count of all Orgsummaryinfo entity
	 * 
	 */
	@Transactional
	public Integer countOrgsummaryinfos() {
		return ((Long) orgsummaryinfoDAO.createQuerySingleResult("select count(o) from Orgsummaryinfo o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Orgsummaryinfo entity
	 * 
	 */
	@Transactional
	public void deleteOrgsummaryinfo(Orgsummaryinfo orgsummaryinfo) {
		orgsummaryinfoDAO.remove(orgsummaryinfo);
		orgsummaryinfoDAO.flush();
	}

	/**
	 * Return all Orgsummaryinfo entity
	 * 
	 */
	@Transactional
	public List<Orgsummaryinfo> findAllOrgsummaryinfos(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Orgsummaryinfo>(orgsummaryinfoDAO.findAllOrgsummaryinfos(startResult, maxRows));
	}

	/**
	 * Save an existing Orgsummaryinfo entity
	 * 
	 */
	@Transactional
	public void saveOrgsummaryinfo(Orgsummaryinfo orgsummaryinfo) {
		Orgsummaryinfo existingOrgsummaryinfo = orgsummaryinfoDAO.findOrgsummaryinfoByPrimaryKey(orgsummaryinfo.getId());

		if (existingOrgsummaryinfo != null) {
			if (existingOrgsummaryinfo != orgsummaryinfo) {
				existingOrgsummaryinfo.setId(orgsummaryinfo.getId());
				existingOrgsummaryinfo.setName(orgsummaryinfo.getName());
				existingOrgsummaryinfo.setRole(orgsummaryinfo.getRole());
			}
			orgsummaryinfo = orgsummaryinfoDAO.store(existingOrgsummaryinfo);
		} else {
			orgsummaryinfo = orgsummaryinfoDAO.store(orgsummaryinfo);
		}
		orgsummaryinfoDAO.flush();
	}

	/**
	 */
	@Transactional
	public Orgsummaryinfo findOrgsummaryinfoByPrimaryKey(String id) {
		return orgsummaryinfoDAO.findOrgsummaryinfoByPrimaryKey(id);
	}

	/**
	 * Load an existing Orgsummaryinfo entity
	 * 
	 */
	@Transactional
	public Set<Orgsummaryinfo> loadOrgsummaryinfos() {
		return orgsummaryinfoDAO.findAllOrgsummaryinfos();
	}
}
