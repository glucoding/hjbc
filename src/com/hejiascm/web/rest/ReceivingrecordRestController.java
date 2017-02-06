package com.hejiascm.web.rest;

import com.hejiascm.dao.ReceivingattachmentDAO;
import com.hejiascm.dao.ReceivinggoodsDAO;
import com.hejiascm.dao.ReceivingrecordDAO;

import com.hejiascm.domain.Receivingattachment;
import com.hejiascm.domain.Receivinggoods;
import com.hejiascm.domain.Receivingrecord;

import com.hejiascm.service.ReceivingrecordService;

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
 * Spring Rest controller that handles CRUD requests for Receivingrecord entities
 * 
 */

@Controller("ReceivingrecordRestController")
public class ReceivingrecordRestController {

	/**
	 * DAO injected by Spring that manages Receivingattachment entities
	 * 
	 */
	@Autowired
	private ReceivingattachmentDAO receivingattachmentDAO;

	/**
	 * DAO injected by Spring that manages Receivinggoods entities
	 * 
	 */
	@Autowired
	private ReceivinggoodsDAO receivinggoodsDAO;

	/**
	 * DAO injected by Spring that manages Receivingrecord entities
	 * 
	 */
	@Autowired
	private ReceivingrecordDAO receivingrecordDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Receivingrecord entities
	 * 
	 */
	@Autowired
	private ReceivingrecordService receivingrecordService;

	/**
	 * Create a new Receivingattachment entity
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord/{receivingrecord_id}/receivingattachments", method = RequestMethod.POST)
	@ResponseBody
	public Receivingattachment newReceivingrecordReceivingattachments(@PathVariable String receivingrecord_id, @RequestBody Receivingattachment receivingattachment) {
		receivingrecordService.saveReceivingrecordReceivingattachments(receivingrecord_id, receivingattachment);
		return receivingattachmentDAO.findReceivingattachmentByPrimaryKey(receivingattachment.getId());
	}

	/**
	 * Delete an existing Receivinggoods entity
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord/{receivingrecord_id}/receivinggoodses/{receivinggoods_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteReceivingrecordReceivinggoodses(@PathVariable String receivingrecord_id, @PathVariable String related_receivinggoodses_id) {
		receivingrecordService.deleteReceivingrecordReceivinggoodses(receivingrecord_id, related_receivinggoodses_id);
	}

	/**
	 * View an existing Receivingattachment entity
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord/{receivingrecord_id}/receivingattachments/{receivingattachment_id}", method = RequestMethod.GET)
	@ResponseBody
	public Receivingattachment loadReceivingrecordReceivingattachments(@PathVariable String receivingrecord_id, @PathVariable String related_receivingattachments_id) {
		Receivingattachment receivingattachment = receivingattachmentDAO.findReceivingattachmentByPrimaryKey(related_receivingattachments_id, -1, -1);

		return receivingattachment;
	}

	/**
	 * Show all Receivingattachment entities by Receivingrecord
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord/{receivingrecord_id}/receivingattachments", method = RequestMethod.GET)
	@ResponseBody
	public List<Receivingattachment> getReceivingrecordReceivingattachments(@PathVariable String receivingrecord_id) {
		return new java.util.ArrayList<Receivingattachment>(receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord_id).getReceivingattachments());
	}

	/**
	 * Create a new Receivingrecord entity
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord", method = RequestMethod.POST)
	@ResponseBody
	public Receivingrecord newReceivingrecord(@RequestBody Receivingrecord receivingrecord) {
		receivingrecordService.saveReceivingrecord(receivingrecord);
		return receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord.getId());
	}

	/**
	 * Create a new Receivinggoods entity
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord/{receivingrecord_id}/receivinggoodses", method = RequestMethod.POST)
	@ResponseBody
	public Receivinggoods newReceivingrecordReceivinggoodses(@PathVariable String receivingrecord_id, @RequestBody Receivinggoods receivinggoods) {
		receivingrecordService.saveReceivingrecordReceivinggoodses(receivingrecord_id, receivinggoods);
		return receivinggoodsDAO.findReceivinggoodsByPrimaryKey(receivinggoods.getId());
	}

	/**
	 * Show all Receivingrecord entities
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord", method = RequestMethod.GET)
	@ResponseBody
	public List<Receivingrecord> listReceivingrecords() {
		return new java.util.ArrayList<Receivingrecord>(receivingrecordService.loadReceivingrecords());
	}

	/**
	 * Show all Receivinggoods entities by Receivingrecord
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord/{receivingrecord_id}/receivinggoodses", method = RequestMethod.GET)
	@ResponseBody
	public List<Receivinggoods> getReceivingrecordReceivinggoodses(@PathVariable String receivingrecord_id) {
		return new java.util.ArrayList<Receivinggoods>(receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord_id).getReceivinggoodses());
	}

	/**
	 * Save an existing Receivingattachment entity
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord/{receivingrecord_id}/receivingattachments", method = RequestMethod.PUT)
	@ResponseBody
	public Receivingattachment saveReceivingrecordReceivingattachments(@PathVariable String receivingrecord_id, @RequestBody Receivingattachment receivingattachments) {
		receivingrecordService.saveReceivingrecordReceivingattachments(receivingrecord_id, receivingattachments);
		return receivingattachmentDAO.findReceivingattachmentByPrimaryKey(receivingattachments.getId());
	}

	/**
	 * Select an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord/{receivingrecord_id}", method = RequestMethod.GET)
	@ResponseBody
	public Receivingrecord loadReceivingrecord(@PathVariable String receivingrecord_id) {
		return receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord_id);
	}

	/**
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord/{receivingrecord_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteReceivingrecord(@PathVariable String receivingrecord_id) {
		Receivingrecord receivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord_id);
		receivingrecordService.deleteReceivingrecord(receivingrecord);
	}

	/**
	 * Save an existing Receivinggoods entity
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord/{receivingrecord_id}/receivinggoodses", method = RequestMethod.PUT)
	@ResponseBody
	public Receivinggoods saveReceivingrecordReceivinggoodses(@PathVariable String receivingrecord_id, @RequestBody Receivinggoods receivinggoodses) {
		receivingrecordService.saveReceivingrecordReceivinggoodses(receivingrecord_id, receivinggoodses);
		return receivinggoodsDAO.findReceivinggoodsByPrimaryKey(receivinggoodses.getId());
	}

	/**
	 * Delete an existing Receivingattachment entity
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord/{receivingrecord_id}/receivingattachments/{receivingattachment_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteReceivingrecordReceivingattachments(@PathVariable String receivingrecord_id, @PathVariable String related_receivingattachments_id) {
		receivingrecordService.deleteReceivingrecordReceivingattachments(receivingrecord_id, related_receivingattachments_id);
	}

	/**
	 * View an existing Receivinggoods entity
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord/{receivingrecord_id}/receivinggoodses/{receivinggoods_id}", method = RequestMethod.GET)
	@ResponseBody
	public Receivinggoods loadReceivingrecordReceivinggoodses(@PathVariable String receivingrecord_id, @PathVariable String related_receivinggoodses_id) {
		Receivinggoods receivinggoods = receivinggoodsDAO.findReceivinggoodsByPrimaryKey(related_receivinggoodses_id, -1, -1);

		return receivinggoods;
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
	 * Save an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping(value = "/Receivingrecord", method = RequestMethod.PUT)
	@ResponseBody
	public Receivingrecord saveReceivingrecord(@RequestBody Receivingrecord receivingrecord) {
		receivingrecordService.saveReceivingrecord(receivingrecord);
		return receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord.getId());
	}
}