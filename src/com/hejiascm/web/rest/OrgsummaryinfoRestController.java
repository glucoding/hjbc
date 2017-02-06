package com.hejiascm.web.rest;

import com.hejiascm.dao.OrgsummaryinfoDAO;
import com.hejiascm.domain.Orgsummaryinfo;
import com.hejiascm.service.OrgsummaryinfoService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Orgsummaryinfo entities
 * 
 */

@CrossOrigin(origins = "http://localhost:3000")
@Controller("OrgsummaryinfoRestController")
public class OrgsummaryinfoRestController {

	/**
	 * DAO injected by Spring that manages Orgsummaryinfo entities
	 * 
	 */
	@Autowired
	private OrgsummaryinfoDAO orgsummaryinfoDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Orgsummaryinfo entities
	 * 
	 */
	@Autowired
	private OrgsummaryinfoService orgsummaryinfoService;

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
	 * Select an existing Orgsummaryinfo entity
	 * 
	 */
	@RequestMapping(value = "/Orgsummaryinfo/{orgsummaryinfo_id}", method = RequestMethod.GET)
	@ResponseBody
	public Orgsummaryinfo loadOrgsummaryinfo(@PathVariable String orgsummaryinfo_id) {
		return orgsummaryinfoDAO.findOrgsummaryinfoByPrimaryKey(orgsummaryinfo_id);
	}

	/**
	 * Delete an existing Orgsummaryinfo entity
	 * 
	 */
	@RequestMapping(value = "/Orgsummaryinfo/{orgsummaryinfo_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrgsummaryinfo(@PathVariable String orgsummaryinfo_id) {
		Orgsummaryinfo orgsummaryinfo = orgsummaryinfoDAO.findOrgsummaryinfoByPrimaryKey(orgsummaryinfo_id);
		orgsummaryinfoService.deleteOrgsummaryinfo(orgsummaryinfo);
	}

	/**
	 * Save an existing Orgsummaryinfo entity
	 * 
	 */
	@RequestMapping(value = "/Orgsummaryinfo", method = RequestMethod.PUT)
	@ResponseBody
	public Orgsummaryinfo saveOrgsummaryinfo(@RequestBody Orgsummaryinfo orgsummaryinfo) {
		orgsummaryinfoService.saveOrgsummaryinfo(orgsummaryinfo);
		return orgsummaryinfoDAO.findOrgsummaryinfoByPrimaryKey(orgsummaryinfo.getId());
	}

	/**
	 * Create a new Orgsummaryinfo entity
	 * 
	 */
	@RequestMapping(value = "/Orgsummaryinfo", method = RequestMethod.POST)
	@ResponseBody
	public Orgsummaryinfo newOrgsummaryinfo(@RequestBody Orgsummaryinfo orgsummaryinfo) {
		orgsummaryinfoService.saveOrgsummaryinfo(orgsummaryinfo);
		return orgsummaryinfoDAO.findOrgsummaryinfoByPrimaryKey(orgsummaryinfo.getId());
	}

	/**
	 * Show all Orgsummaryinfo entities
	 * 
	 */
	@RequestMapping(value = "/Orgsummaryinfo", method = RequestMethod.GET)
	@ResponseBody
	public List<Orgsummaryinfo> listOrgsummaryinfos() {
		return new java.util.ArrayList<Orgsummaryinfo>(orgsummaryinfoService.loadOrgsummaryinfos());
	}
}