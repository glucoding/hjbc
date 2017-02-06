package com.hejiascm.web;

import com.hejiascm.dao.OrgsummaryinfoDAO;

import com.hejiascm.domain.Orgsummaryinfo;

import com.hejiascm.service.OrgsummaryinfoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Orgsummaryinfo entities
 * 
 */

@Controller("OrgsummaryinfoController")
public class OrgsummaryinfoController {

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
	 * Save an existing Orgsummaryinfo entity
	 * 
	 */
	@RequestMapping("/saveOrgsummaryinfo")
	public String saveOrgsummaryinfo(@ModelAttribute Orgsummaryinfo orgsummaryinfo) {
		orgsummaryinfoService.saveOrgsummaryinfo(orgsummaryinfo);
		return "forward:/indexOrgsummaryinfo";
	}

	/**
	 * Select the Orgsummaryinfo entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrgsummaryinfo")
	public ModelAndView confirmDeleteOrgsummaryinfo(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orgsummaryinfo", orgsummaryinfoDAO.findOrgsummaryinfoByPrimaryKey(idKey));
		mav.setViewName("orgsummaryinfo/deleteOrgsummaryinfo.jsp");

		return mav;
	}

	/**
	 * Edit an existing Orgsummaryinfo entity
	 * 
	 */
	@RequestMapping("/editOrgsummaryinfo")
	public ModelAndView editOrgsummaryinfo(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orgsummaryinfo", orgsummaryinfoDAO.findOrgsummaryinfoByPrimaryKey(idKey));
		mav.setViewName("orgsummaryinfo/editOrgsummaryinfo.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Orgsummaryinfo entities
	 * 
	 */
	public String indexOrgsummaryinfo() {
		return "redirect:/indexOrgsummaryinfo";
	}

	/**
	 * Delete an existing Orgsummaryinfo entity
	 * 
	 */
	@RequestMapping("/deleteOrgsummaryinfo")
	public String deleteOrgsummaryinfo(@RequestParam String idKey) {
		Orgsummaryinfo orgsummaryinfo = orgsummaryinfoDAO.findOrgsummaryinfoByPrimaryKey(idKey);
		orgsummaryinfoService.deleteOrgsummaryinfo(orgsummaryinfo);
		return "forward:/indexOrgsummaryinfo";
	}

	/**
	 * Show all Orgsummaryinfo entities
	 * 
	 */
	@RequestMapping("/indexOrgsummaryinfo")
	public ModelAndView listOrgsummaryinfos() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orgsummaryinfos", orgsummaryinfoService.loadOrgsummaryinfos());

		mav.setViewName("orgsummaryinfo/listOrgsummaryinfos.jsp");

		return mav;
	}

	/**
	 * Select an existing Orgsummaryinfo entity
	 * 
	 */
	@RequestMapping("/selectOrgsummaryinfo")
	public ModelAndView selectOrgsummaryinfo(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orgsummaryinfo", orgsummaryinfoDAO.findOrgsummaryinfoByPrimaryKey(idKey));
		mav.setViewName("orgsummaryinfo/viewOrgsummaryinfo.jsp");

		return mav;
	}

	/**
	 * Create a new Orgsummaryinfo entity
	 * 
	 */
	@RequestMapping("/newOrgsummaryinfo")
	public ModelAndView newOrgsummaryinfo() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orgsummaryinfo", new Orgsummaryinfo());
		mav.addObject("newFlag", true);
		mav.setViewName("orgsummaryinfo/editOrgsummaryinfo.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/orgsummaryinfoController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

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
}