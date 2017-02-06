package com.hejiascm.service;

import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.Orginfoattachment;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Orginfoattachment entities
 * 
 */
public interface OrginfoattachmentService {

	/**
	 * Return all Orginfoattachment entity
	 * 
	 */
	public List<Orginfoattachment> findAllOrginfoattachments(Integer startResult, Integer maxRows);

	/**
	 */
	public Orginfoattachment findOrginfoattachmentByPrimaryKey(String id);

	/**
	 * Load an existing Orginfoattachment entity
	 * 
	 */
	public Set<Orginfoattachment> loadOrginfoattachments();

	/**
	 * Delete an existing Orginfoattachment entity
	 * 
	 */
	public void deleteOrginfoattachment(Orginfoattachment orginfoattachment);

	/**
	 * Save an existing Orginfoattachment entity
	 * 
	 */
	public void saveOrginfoattachment(Orginfoattachment orginfoattachment_1);

	/**
	 * Return a count of all Orginfoattachment entity
	 * 
	 */
	public Integer countOrginfoattachments();

	/**
	 * Save an existing Orginfo entity
	 * 
	 */
	public Orginfoattachment saveOrginfoattachmentOrginfo(String id_1, Orginfo related_orginfo);

	/**
	 * Delete an existing Orginfo entity
	 * 
	 */
	public Orginfoattachment deleteOrginfoattachmentOrginfo(String orginfoattachment_id, String related_orginfo_id);
}