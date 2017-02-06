package com.hejiascm.web.rest;

import com.hejiascm.dao.TradecontractDAO;
import com.hejiascm.dao.TradecontractattachmentDAO;

import com.hejiascm.domain.Tradecontract;
import com.hejiascm.domain.Tradecontractattachment;

import com.hejiascm.service.TradecontractattachmentService;

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
 * Spring Rest controller that handles CRUD requests for Tradecontractattachment entities
 * 
 */

@Controller("TradecontractattachmentRestController")
public class TradecontractattachmentRestController {

	/**
	 * DAO injected by Spring that manages Tradecontract entities
	 * 
	 */
	@Autowired
	private TradecontractDAO tradecontractDAO;

	/**
	 * DAO injected by Spring that manages Tradecontractattachment entities
	 * 
	 */
	@Autowired
	private TradecontractattachmentDAO tradecontractattachmentDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Tradecontractattachment entities
	 * 
	 */
	@Autowired
	private TradecontractattachmentService tradecontractattachmentService;

	/**
	 * Create a new Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontractattachment/{tradecontractattachment_id}/tradecontract", method = RequestMethod.POST)
	@ResponseBody
	public Tradecontract newTradecontractattachmentTradecontract(@PathVariable String tradecontractattachment_id, @RequestBody Tradecontract tradecontract) {
		tradecontractattachmentService.saveTradecontractattachmentTradecontract(tradecontractattachment_id, tradecontract);
		return tradecontractDAO.findTradecontractByPrimaryKey(tradecontract.getId());
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
	 * Save an existing Tradecontractattachment entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontractattachment", method = RequestMethod.PUT)
	@ResponseBody
	public Tradecontractattachment saveTradecontractattachment(@RequestBody Tradecontractattachment tradecontractattachment) {
		tradecontractattachmentService.saveTradecontractattachment(tradecontractattachment);
		return tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(tradecontractattachment.getId());
	}

	/**
	 * View an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontractattachment/{tradecontractattachment_id}/tradecontract/{tradecontract_id}", method = RequestMethod.GET)
	@ResponseBody
	public Tradecontract loadTradecontractattachmentTradecontract(@PathVariable String tradecontractattachment_id, @PathVariable String related_tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id, -1, -1);

		return tradecontract;
	}

	/**
	 * Show all Tradecontractattachment entities
	 * 
	 */
	@RequestMapping(value = "/Tradecontractattachment", method = RequestMethod.GET)
	@ResponseBody
	public List<Tradecontractattachment> listTradecontractattachments() {
		return new java.util.ArrayList<Tradecontractattachment>(tradecontractattachmentService.loadTradecontractattachments());
	}

	/**
	 * Delete an existing Tradecontractattachment entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontractattachment/{tradecontractattachment_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTradecontractattachment(@PathVariable String tradecontractattachment_id) {
		Tradecontractattachment tradecontractattachment = tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(tradecontractattachment_id);
		tradecontractattachmentService.deleteTradecontractattachment(tradecontractattachment);
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontractattachment/{tradecontractattachment_id}/tradecontract", method = RequestMethod.PUT)
	@ResponseBody
	public Tradecontract saveTradecontractattachmentTradecontract(@PathVariable String tradecontractattachment_id, @RequestBody Tradecontract tradecontract) {
		tradecontractattachmentService.saveTradecontractattachmentTradecontract(tradecontractattachment_id, tradecontract);
		return tradecontractDAO.findTradecontractByPrimaryKey(tradecontract.getId());
	}

	/**
	 * Create a new Tradecontractattachment entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontractattachment", method = RequestMethod.POST)
	@ResponseBody
	public Tradecontractattachment newTradecontractattachment(@RequestBody Tradecontractattachment tradecontractattachment) {
		tradecontractattachmentService.saveTradecontractattachment(tradecontractattachment);
		return tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(tradecontractattachment.getId());
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontractattachment/{tradecontractattachment_id}/tradecontract/{tradecontract_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTradecontractattachmentTradecontract(@PathVariable String tradecontractattachment_id, @PathVariable String related_tradecontract_id) {
		tradecontractattachmentService.deleteTradecontractattachmentTradecontract(tradecontractattachment_id, related_tradecontract_id);
	}

	/**
	 * Get Tradecontract entity by Tradecontractattachment
	 * 
	 */
	@RequestMapping(value = "/Tradecontractattachment/{tradecontractattachment_id}/tradecontract", method = RequestMethod.GET)
	@ResponseBody
	public Tradecontract getTradecontractattachmentTradecontract(@PathVariable String tradecontractattachment_id) {
		return tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(tradecontractattachment_id).getTradecontract();
	}

	/**
	 * Select an existing Tradecontractattachment entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontractattachment/{tradecontractattachment_id}", method = RequestMethod.GET)
	@ResponseBody
	public Tradecontractattachment loadTradecontractattachment(@PathVariable String tradecontractattachment_id) {
		return tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(tradecontractattachment_id);
	}
}