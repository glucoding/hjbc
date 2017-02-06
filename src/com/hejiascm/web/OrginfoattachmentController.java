package com.hejiascm.web;

import com.hejiascm.dao.OrginfoDAO;
import com.hejiascm.dao.OrginfoattachmentDAO;

import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.Orginfoattachment;

import com.hejiascm.service.OrginfoattachmentService;

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
 * Spring MVC controller that handles CRUD requests for Orginfoattachment entities
 * 
 */

@Controller("OrginfoattachmentController")
public class OrginfoattachmentController {

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
	 * View an existing Orginfo entity
	 * 
	 */
	@RequestMapping("/selectOrginfoattachmentOrginfo")
	public ModelAndView selectOrginfoattachmentOrginfo(@RequestParam String orginfoattachment_id, @RequestParam String orginfo_id) {
		Orginfo orginfo = orginfoDAO.findOrginfoByPrimaryKey(orginfo_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orginfoattachment_id", orginfoattachment_id);
		mav.addObject("orginfo", orginfo);
		mav.setViewName("orginfoattachment/orginfo/viewOrginfo.jsp");

		return mav;
	}

	/**
	 * Select the child Orginfo entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrginfoattachmentOrginfo")
	public ModelAndView confirmDeleteOrginfoattachmentOrginfo(@RequestParam String orginfoattachment_id, @RequestParam String related_orginfo_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfo", orginfoDAO.findOrginfoByPrimaryKey(related_orginfo_id));
		mav.addObject("orginfoattachment_id", orginfoattachment_id);
		mav.setViewName("orginfoattachment/orginfo/deleteOrginfo.jsp");

		return mav;
	}

	/**
	 * Save an existing Orginfo entity
	 * 
	 */
	@RequestMapping("/saveOrginfoattachmentOrginfo")
	public ModelAndView saveOrginfoattachmentOrginfo(@RequestParam String orginfoattachment_id, @ModelAttribute Orginfo orginfo) {
		Orginfoattachment parent_orginfoattachment = orginfoattachmentService.saveOrginfoattachmentOrginfo(orginfoattachment_id, orginfo);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orginfoattachment_id", orginfoattachment_id);
		mav.addObject("orginfoattachment", parent_orginfoattachment);
		mav.setViewName("orginfoattachment/viewOrginfoattachment.jsp");

		return mav;
	}

	/**
	 * Select an existing Orginfoattachment entity
	 * 
	 */
	@RequestMapping("/selectOrginfoattachment")
	public ModelAndView selectOrginfoattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfoattachment", orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(idKey));
		mav.setViewName("orginfoattachment/viewOrginfoattachment.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Orginfoattachment entities
	 * 
	 */
	public String indexOrginfoattachment() {
		return "redirect:/indexOrginfoattachment";
	}

	/**
	 * Delete an existing Orginfoattachment entity
	 * 
	 */
	@RequestMapping("/deleteOrginfoattachment")
	public String deleteOrginfoattachment(@RequestParam String idKey) {
		Orginfoattachment orginfoattachment = orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(idKey);
		orginfoattachmentService.deleteOrginfoattachment(orginfoattachment);
		return "forward:/indexOrginfoattachment";
	}

	/**
	 * Create a new Orginfoattachment entity
	 * 
	 */
	@RequestMapping("/newOrginfoattachment")
	public ModelAndView newOrginfoattachment() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfoattachment", new Orginfoattachment());
		mav.addObject("newFlag", true);
		mav.setViewName("orginfoattachment/editOrginfoattachment.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/orginfoattachmentController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select the Orginfoattachment entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrginfoattachment")
	public ModelAndView confirmDeleteOrginfoattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfoattachment", orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(idKey));
		mav.setViewName("orginfoattachment/deleteOrginfoattachment.jsp");

		return mav;
	}

	/**
	 * Delete an existing Orginfo entity
	 * 
	 */
	@RequestMapping("/deleteOrginfoattachmentOrginfo")
	public ModelAndView deleteOrginfoattachmentOrginfo(@RequestParam String orginfoattachment_id, @RequestParam String related_orginfo_id) {
		ModelAndView mav = new ModelAndView();

		Orginfoattachment orginfoattachment = orginfoattachmentService.deleteOrginfoattachmentOrginfo(orginfoattachment_id, related_orginfo_id);

		mav.addObject("orginfoattachment_id", orginfoattachment_id);
		mav.addObject("orginfoattachment", orginfoattachment);
		mav.setViewName("orginfoattachment/viewOrginfoattachment.jsp");

		return mav;
	}

	/**
	 * Edit an existing Orginfoattachment entity
	 * 
	 */
	@RequestMapping("/editOrginfoattachment")
	public ModelAndView editOrginfoattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfoattachment", orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(idKey));
		mav.setViewName("orginfoattachment/editOrginfoattachment.jsp");

		return mav;
	}

	/**
	 * Show all Orginfo entities by Orginfoattachment
	 * 
	 */
	@RequestMapping("/listOrginfoattachmentOrginfo")
	public ModelAndView listOrginfoattachmentOrginfo(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfoattachment", orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(idKey));
		mav.setViewName("orginfoattachment/orginfo/listOrginfo.jsp");

		return mav;
	}

	/**
	 * Save an existing Orginfoattachment entity
	 * 
	 */
	@RequestMapping("/saveOrginfoattachment")
	public String saveOrginfoattachment(@ModelAttribute Orginfoattachment orginfoattachment) {
		orginfoattachmentService.saveOrginfoattachment(orginfoattachment);
		return "forward:/indexOrginfoattachment";
	}

	/**
	 * Edit an existing Orginfo entity
	 * 
	 */
	@RequestMapping("/editOrginfoattachmentOrginfo")
	public ModelAndView editOrginfoattachmentOrginfo(@RequestParam String orginfoattachment_id, @RequestParam String orginfo_id) {
		Orginfo orginfo = orginfoDAO.findOrginfoByPrimaryKey(orginfo_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orginfoattachment_id", orginfoattachment_id);
		mav.addObject("orginfo", orginfo);
		mav.setViewName("orginfoattachment/orginfo/editOrginfo.jsp");

		return mav;
	}

	/**
	 * Show all Orginfoattachment entities
	 * 
	 */
	@RequestMapping("/indexOrginfoattachment")
	public ModelAndView listOrginfoattachments() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfoattachments", orginfoattachmentService.loadOrginfoattachments());

		mav.setViewName("orginfoattachment/listOrginfoattachments.jsp");

		return mav;
	}

	/**
	 * Create a new Orginfo entity
	 * 
	 */
	@RequestMapping("/newOrginfoattachmentOrginfo")
	public ModelAndView newOrginfoattachmentOrginfo(@RequestParam String orginfoattachment_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("orginfoattachment_id", orginfoattachment_id);
		mav.addObject("orginfo", new Orginfo());
		mav.addObject("newFlag", true);
		mav.setViewName("orginfoattachment/orginfo/editOrginfo.jsp");

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