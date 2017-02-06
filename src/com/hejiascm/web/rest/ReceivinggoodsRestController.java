package com.hejiascm.web.rest;

import com.hejiascm.dao.ReceivinggoodsDAO;
import com.hejiascm.dao.ReceivingrecordDAO;

import com.hejiascm.domain.Receivinggoods;
import com.hejiascm.domain.Receivingrecord;

import com.hejiascm.service.ReceivinggoodsService;

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
 * Spring Rest controller that handles CRUD requests for Receivinggoods entities
 * 
 */

@Controller("ReceivinggoodsRestController")
public class ReceivinggoodsRestController {

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
	 * Service injected by Spring that provides CRUD operations for Receivinggoods entities
	 * 
	 */
	@Autowired
	private ReceivinggoodsService receivinggoodsService;

	/**
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping(value = "/Receivinggoods/{receivinggoods_id}/receivingrecord/{receivingrecord_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteReceivinggoodsReceivingrecord(@PathVariable String receivinggoods_id, @PathVariable String related_receivingrecord_id) {
		receivinggoodsService.deleteReceivinggoodsReceivingrecord(receivinggoods_id, related_receivingrecord_id);
	}

	/**
	 * Create a new Receivingrecord entity
	 * 
	 */
	@RequestMapping(value = "/Receivinggoods/{receivinggoods_id}/receivingrecord", method = RequestMethod.POST)
	@ResponseBody
	public Receivingrecord newReceivinggoodsReceivingrecord(@PathVariable String receivinggoods_id, @RequestBody Receivingrecord receivingrecord) {
		receivinggoodsService.saveReceivinggoodsReceivingrecord(receivinggoods_id, receivingrecord);
		return receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord.getId());
	}

	/**
	 * Get Receivingrecord entity by Receivinggoods
	 * 
	 */
	@RequestMapping(value = "/Receivinggoods/{receivinggoods_id}/receivingrecord", method = RequestMethod.GET)
	@ResponseBody
	public Receivingrecord getReceivinggoodsReceivingrecord(@PathVariable String receivinggoods_id) {
		return receivinggoodsDAO.findReceivinggoodsByPrimaryKey(receivinggoods_id).getReceivingrecord();
	}

	/**
	 * Show all Receivinggoods entities
	 * 
	 */
	@RequestMapping(value = "/Receivinggoods", method = RequestMethod.GET)
	@ResponseBody
	public List<Receivinggoods> listReceivinggoodss() {
		return new java.util.ArrayList<Receivinggoods>(receivinggoodsService.loadReceivinggoodss());
	}

	/**
	 * Create a new Receivinggoods entity
	 * 
	 */
	@RequestMapping(value = "/Receivinggoods", method = RequestMethod.POST)
	@ResponseBody
	public Receivinggoods newReceivinggoods(@RequestBody Receivinggoods receivinggoods) {
		receivinggoodsService.saveReceivinggoods(receivinggoods);
		return receivinggoodsDAO.findReceivinggoodsByPrimaryKey(receivinggoods.getId());
	}

	/**
	 * View an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping(value = "/Receivinggoods/{receivinggoods_id}/receivingrecord/{receivingrecord_id}", method = RequestMethod.GET)
	@ResponseBody
	public Receivingrecord loadReceivinggoodsReceivingrecord(@PathVariable String receivinggoods_id, @PathVariable String related_receivingrecord_id) {
		Receivingrecord receivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(related_receivingrecord_id, -1, -1);

		return receivingrecord;
	}

	/**
	 * Save an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping(value = "/Receivinggoods/{receivinggoods_id}/receivingrecord", method = RequestMethod.PUT)
	@ResponseBody
	public Receivingrecord saveReceivinggoodsReceivingrecord(@PathVariable String receivinggoods_id, @RequestBody Receivingrecord receivingrecord) {
		receivinggoodsService.saveReceivinggoodsReceivingrecord(receivinggoods_id, receivingrecord);
		return receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord.getId());
	}

	/**
	 * Save an existing Receivinggoods entity
	 * 
	 */
	@RequestMapping(value = "/Receivinggoods", method = RequestMethod.PUT)
	@ResponseBody
	public Receivinggoods saveReceivinggoods(@RequestBody Receivinggoods receivinggoods) {
		receivinggoodsService.saveReceivinggoods(receivinggoods);
		return receivinggoodsDAO.findReceivinggoodsByPrimaryKey(receivinggoods.getId());
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
	 * Delete an existing Receivinggoods entity
	 * 
	 */
	@RequestMapping(value = "/Receivinggoods/{receivinggoods_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteReceivinggoods(@PathVariable String receivinggoods_id) {
		Receivinggoods receivinggoods = receivinggoodsDAO.findReceivinggoodsByPrimaryKey(receivinggoods_id);
		receivinggoodsService.deleteReceivinggoods(receivinggoods);
	}

	/**
	 * Select an existing Receivinggoods entity
	 * 
	 */
	@RequestMapping(value = "/Receivinggoods/{receivinggoods_id}", method = RequestMethod.GET)
	@ResponseBody
	public Receivinggoods loadReceivinggoods(@PathVariable String receivinggoods_id) {
		return receivinggoodsDAO.findReceivinggoodsByPrimaryKey(receivinggoods_id);
	}
}