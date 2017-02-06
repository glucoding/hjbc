package com.hejiascm.web.rest;

import com.hejiascm.dao.OrginfoDAO;
import com.hejiascm.dao.OrginfoattachmentDAO;

import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.Orginfoattachment;

import com.hejiascm.service.OrginfoattachmentService;

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
 * Spring Rest controller that handles CRUD requests for Orginfoattachment entities
 * 
 */

@Controller("OrginfoattachmentRestController")
public class OrginfoattachmentRestController {

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
	 * Service injected by Spring that provides CRUD operations for Orginfoattachment entities
	 * 
	 */
	@Autowired
	private OrginfoattachmentService orginfoattachmentService;

	/**
	 * Show all Orginfoattachment entities
	 * 
	 */
	@RequestMapping(value = "/Orginfoattachment", method = RequestMethod.GET)
	@ResponseBody
	public List<Orginfoattachment> listOrginfoattachments() {
		return new java.util.ArrayList<Orginfoattachment>(orginfoattachmentService.loadOrginfoattachments());
	}

	/**
	 * Get Orginfo entity by Orginfoattachment
	 * 
	 */
	@RequestMapping(value = "/Orginfoattachment/{orginfoattachment_id}/orginfo", method = RequestMethod.GET)
	@ResponseBody
	public Orginfo getOrginfoattachmentOrginfo(@PathVariable String orginfoattachment_id) {
		return orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(orginfoattachment_id).getOrginfo();
	}

	/**
	 * Select an existing Orginfoattachment entity
	 * 
	 */
	@RequestMapping(value = "/Orginfoattachment/{orginfoattachment_id}", method = RequestMethod.GET)
	@ResponseBody
	public Orginfoattachment loadOrginfoattachment(@PathVariable String orginfoattachment_id) {
		return orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(orginfoattachment_id);
	}

	/**
	 * Delete an existing Orginfo entity
	 * 
	 */
	@RequestMapping(value = "/Orginfoattachment/{orginfoattachment_id}/orginfo/{orginfo_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrginfoattachmentOrginfo(@PathVariable String orginfoattachment_id, @PathVariable String related_orginfo_id) {
		orginfoattachmentService.deleteOrginfoattachmentOrginfo(orginfoattachment_id, related_orginfo_id);
	}

	/**
	 * Save an existing Orginfoattachment entity
	 * 
	 */
	@RequestMapping(value = "/Orginfoattachment", method = RequestMethod.PUT)
	@ResponseBody
	public Orginfoattachment saveOrginfoattachment(@RequestBody Orginfoattachment orginfoattachment) {
		orginfoattachmentService.saveOrginfoattachment(orginfoattachment);
		return orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(orginfoattachment.getId());
	}

	/**
	 * View an existing Orginfo entity
	 * 
	 */
	@RequestMapping(value = "/Orginfoattachment/{orginfoattachment_id}/orginfo/{orginfo_id}", method = RequestMethod.GET)
	@ResponseBody
	public Orginfo loadOrginfoattachmentOrginfo(@PathVariable String orginfoattachment_id, @PathVariable String related_orginfo_id) {
		Orginfo orginfo = orginfoDAO.findOrginfoByPrimaryKey(related_orginfo_id, -1, -1);

		return orginfo;
	}

	/**
	 * Create a new Orginfoattachment entity
	 * 
	 */
	@RequestMapping(value = "/Orginfoattachment", method = RequestMethod.POST)
	@ResponseBody
	public Orginfoattachment newOrginfoattachment(@RequestBody Orginfoattachment orginfoattachment) {
		orginfoattachmentService.saveOrginfoattachment(orginfoattachment);
		return orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(orginfoattachment.getId());
	}

	/**
	 * Delete an existing Orginfoattachment entity
	 * 
	 */
	@RequestMapping(value = "/Orginfoattachment/{orginfoattachment_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrginfoattachment(@PathVariable String orginfoattachment_id) {
		Orginfoattachment orginfoattachment = orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(orginfoattachment_id);
		orginfoattachmentService.deleteOrginfoattachment(orginfoattachment);
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
	 * Create a new Orginfo entity
	 * 
	 */
	@RequestMapping(value = "/Orginfoattachment/{orginfoattachment_id}/orginfo", method = RequestMethod.POST)
	@ResponseBody
	public Orginfo newOrginfoattachmentOrginfo(@PathVariable String orginfoattachment_id, @RequestBody Orginfo orginfo) {
		orginfoattachmentService.saveOrginfoattachmentOrginfo(orginfoattachment_id, orginfo);
		return orginfoDAO.findOrginfoByPrimaryKey(orginfo.getId());
	}

	/**
	 * Save an existing Orginfo entity
	 * 
	 */
	@RequestMapping(value = "/Orginfoattachment/{orginfoattachment_id}/orginfo", method = RequestMethod.PUT)
	@ResponseBody
	public Orginfo saveOrginfoattachmentOrginfo(@PathVariable String orginfoattachment_id, @RequestBody Orginfo orginfo) {
		orginfoattachmentService.saveOrginfoattachmentOrginfo(orginfoattachment_id, orginfo);
		return orginfoDAO.findOrginfoByPrimaryKey(orginfo.getId());
	}
}