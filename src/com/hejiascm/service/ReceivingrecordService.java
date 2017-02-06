package com.hejiascm.service;

import com.hejiascm.domain.Receivingattachment;
import com.hejiascm.domain.Receivinggoods;
import com.hejiascm.domain.Receivingrecord;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Receivingrecord entities
 * 
 */
public interface ReceivingrecordService {

	/**
	 * Return all Receivingrecord entity
	 * 
	 */
	public List<Receivingrecord> findAllReceivingrecords(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Receivingrecord entity
	 * 
	 */
	public Integer countReceivingrecords();

	/**
	 * Delete an existing Receivingattachment entity
	 * 
	 */
	public Receivingrecord deleteReceivingrecordReceivingattachments(String receivingrecord_id, String related_receivingattachments_id);

	/**
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	public void deleteReceivingrecord(Receivingrecord receivingrecord);

	/**
	 * Load an existing Receivingrecord entity
	 * 
	 */
	public Set<Receivingrecord> loadReceivingrecords();

	/**
	 * Save an existing Receivinggoods entity
	 * 
	 */
	public Receivingrecord saveReceivingrecordReceivinggoodses(String id, Receivinggoods related_receivinggoodses);

	/**
	 * Delete an existing Receivinggoods entity
	 * 
	 */
	public Receivingrecord deleteReceivingrecordReceivinggoodses(String receivingrecord_id_1, String related_receivinggoodses_id);

	/**
	 */
	public Receivingrecord findReceivingrecordByPrimaryKey(String id_1);

	/**
	 * Save an existing Receivingrecord entity
	 * 
	 */
	public void saveReceivingrecord(Receivingrecord receivingrecord_1);

	/**
	 * Save an existing Receivingattachment entity
	 * 
	 */
	public Receivingrecord saveReceivingrecordReceivingattachments(String id_2, Receivingattachment related_receivingattachments);
}