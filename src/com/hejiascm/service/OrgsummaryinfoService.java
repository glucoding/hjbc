package com.hejiascm.service;

import com.hejiascm.domain.Orgsummaryinfo;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Orgsummaryinfo entities
 * 
 */
public interface OrgsummaryinfoService {

	/**
	 * Return a count of all Orgsummaryinfo entity
	 * 
	 */
	public Integer countOrgsummaryinfos();

	/**
	 * Delete an existing Orgsummaryinfo entity
	 * 
	 */
	public void deleteOrgsummaryinfo(Orgsummaryinfo orgsummaryinfo);

	/**
	 * Return all Orgsummaryinfo entity
	 * 
	 */
	public List<Orgsummaryinfo> findAllOrgsummaryinfos(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Orgsummaryinfo entity
	 * 
	 */
	public void saveOrgsummaryinfo(Orgsummaryinfo orgsummaryinfo_1);

	/**
	 */
	public Orgsummaryinfo findOrgsummaryinfoByPrimaryKey(String id);

	/**
	 * Load an existing Orgsummaryinfo entity
	 * 
	 */
	public Set<Orgsummaryinfo> loadOrgsummaryinfos();
}