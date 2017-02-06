package com.hejiascm.web.rest;

import com.hejiascm.dao.ReceivingattachmentDAO;
import com.hejiascm.dao.ReceivingrecordDAO;

import com.hejiascm.domain.Receivingattachment;
import com.hejiascm.domain.Receivingrecord;

import com.hejiascm.service.ReceivingattachmentService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Receivingattachment entities
 * 
 */

@Controller("ReceivingattachmentRestController")
public class ReceivingattachmentRestController {

	/**
	 * DAO injected by Spring that manages Receivingattachment entities
	 * 
	 */
	@Autowired
	private ReceivingattachmentDAO receivingattachmentDAO;

	/**
	 * DAO injected by Spring that manages Receivingrecord entities
	 * 
	 */
	@Autowired
	private ReceivingrecordDAO receivingrecordDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Receivingattachment entities
	 * 
	 */
	@Autowired
	private ReceivingattachmentService receivingattachmentService;

	/**
	 * View an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping(value = "/Receivingattachment/{receivingattachment_id}/receivingrecord/{receivingrecord_id}", method = RequestMethod.GET)
	@ResponseBody
	public Receivingrecord loadReceivingattachmentReceivingrecord(@PathVariable String receivingattachment_id, @PathVariable String related_receivingrecord_id) {
		Receivingrecord receivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(related_receivingrecord_id, -1, -1);

		return receivingrecord;
	}

	/**
	 * Create a new Receivingattachment entity
	 * 
	 */
	@RequestMapping(value = "/Receivingattachment", method = RequestMethod.POST)
	@ResponseBody
	public Receivingattachment newReceivingattachment(@RequestBody Receivingattachment receivingattachment) {
		receivingattachmentService.saveReceivingattachment(receivingattachment);
		return receivingattachmentDAO.findReceivingattachmentByPrimaryKey(receivingattachment.getId());
	}

	/**
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping(value = "/Receivingattachment/{receivingattachment_id}/receivingrecord/{receivingrecord_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteReceivingattachmentReceivingrecord(@PathVariable String receivingattachment_id, @PathVariable String related_receivingrecord_id) {
		receivingattachmentService.deleteReceivingattachmentReceivingrecord(receivingattachment_id, related_receivingrecord_id);
	}

	/**
	 * Save an existing Receivingattachment entity
	 * 
	 */
	@RequestMapping(value = "/Receivingattachment", method = RequestMethod.PUT)
	@ResponseBody
	public Receivingattachment saveReceivingattachment(@RequestBody Receivingattachment receivingattachment) {
		receivingattachmentService.saveReceivingattachment(receivingattachment);
		return receivingattachmentDAO.findReceivingattachmentByPrimaryKey(receivingattachment.getId());
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Get Receivingrecord entity by Receivingattachment
	 * 
	 */
	@RequestMapping(value = "/Receivingattachment/{receivingattachment_id}/receivingrecord", method = RequestMethod.GET)
	@ResponseBody
	public Receivingrecord getReceivingattachmentReceivingrecord(@PathVariable String receivingattachment_id) {
		return receivingattachmentDAO.findReceivingattachmentByPrimaryKey(receivingattachment_id).getReceivingrecord();
	}

	/**
	 * Select an existing Receivingattachment entity
	 * 
	 */
	@RequestMapping(value = "/Receivingattachment/{receivingattachment_id}", method = RequestMethod.GET)
	@ResponseBody
	public Receivingattachment loadReceivingattachment(@PathVariable String receivingattachment_id) {
		return receivingattachmentDAO.findReceivingattachmentByPrimaryKey(receivingattachment_id);
	}

	/**
	 * Save an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping(value = "/Receivingattachment/{receivingattachment_id}/receivingrecord", method = RequestMethod.PUT)
	@ResponseBody
	public Receivingrecord saveReceivingattachmentReceivingrecord(@PathVariable String receivingattachment_id, @RequestBody Receivingrecord receivingrecord) {
		receivingattachmentService.saveReceivingattachmentReceivingrecord(receivingattachment_id, receivingrecord);
		return receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord.getId());
	}

	/**
	 * Show all Receivingattachment entities
	 * 
	 */
	@RequestMapping(value = "/Receivingattachment", method = RequestMethod.GET)
	@ResponseBody
	public List<Receivingattachment> listReceivingattachments() {
		return new java.util.ArrayList<Receivingattachment>(receivingattachmentService.loadReceivingattachments());
	}

	/**
	 * Delete an existing Receivingattachment entity
	 * 
	 */
	@RequestMapping(value = "/Receivingattachment/{receivingattachment_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteReceivingattachment(@PathVariable String receivingattachment_id) {
		Receivingattachment receivingattachment = receivingattachmentDAO.findReceivingattachmentByPrimaryKey(receivingattachment_id);
		receivingattachmentService.deleteReceivingattachment(receivingattachment);
	}

	/**
	 * Create a new Receivingrecord entity
	 * 
	 */
	@RequestMapping(value = "/Receivingattachment/{receivingattachment_id}/receivingrecord", method = RequestMethod.POST)
	@ResponseBody
	public Receivingrecord newReceivingattachmentReceivingrecord(@PathVariable String receivingattachment_id, @RequestBody Receivingrecord receivingrecord) {
		receivingattachmentService.saveReceivingattachmentReceivingrecord(receivingattachment_id, receivingrecord);
		return receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord.getId());
	}
}