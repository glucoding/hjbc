package com.hejiascm.service;

import com.hejiascm.domain.Receivingattachment;
import com.hejiascm.domain.Receivingrecord;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Receivingattachment entities
 * 
 */
public interface ReceivingattachmentService {

	/**
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	public Receivingattachment deleteReceivingattachmentReceivingrecord(String receivingattachment_id, String related_receivingrecord_id);

	/**
	 * Load an existing Receivingattachment entity
	 * 
	 */
	public Set<Receivingattachment> loadReceivingattachments();

	/**
	 * Return a count of all Receivingattachment entity
	 * 
	 */
	public Integer countReceivingattachments();

	/**
	 * Save an existing Receivingrecord entity
	 * 
	 */
	public Receivingattachment saveReceivingattachmentReceivingrecord(String id, Receivingrecord related_receivingrecord);

	/**
	 * Save an existing Receivingattachment entity
	 * 
	 */
	public void saveReceivingattachment(Receivingattachment receivingattachment);

	/**
	 * Delete an existing Receivingattachment entity
	 * 
	 */
	public void deleteReceivingattachment(Receivingattachment receivingattachment_1);

	/**
	 * Return all Receivingattachment entity
	 * 
	 */
	public List<Receivingattachment> findAllReceivingattachments(Integer startResult, Integer maxRows);

	/**
	 */
	public Receivingattachment findReceivingattachmentByPrimaryKey(String id_1);
}