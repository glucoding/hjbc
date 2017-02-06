package com.hejiascm.web;

import com.hejiascm.dao.BankaccountinfoDAO;
import com.hejiascm.dao.OrginfoDAO;

import com.hejiascm.domain.Bankaccountinfo;
import com.hejiascm.domain.Orginfo;

import com.hejiascm.service.BankaccountinfoService;

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
 * Spring MVC controller that handles CRUD requests for Bankaccountinfo entities
 * 
 */

@Controller("BankaccountinfoController")
public class BankaccountinfoController {

	/**
	 * DAO injected by Spring that manages Bankaccountinfo entities
	 * 
	 */
	@Autowired
	private BankaccountinfoDAO bankaccountinfoDAO;

	/**
	 * DAO injected by Spring that manages Orginfo entities
	 * 
	 */
	@Autowired
	private OrginfoDAO orginfoDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Bankaccountinfo entities
	 * 
	 */
	@Autowired
	private BankaccountinfoService bankaccountinfoService;

	/**
	 * Select the Bankaccountinfo entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteBankaccountinfo")
	public ModelAndView confirmDeleteBankaccountinfo(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankaccountinfo", bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(idKey));
		mav.setViewName("bankaccountinfo/deleteBankaccountinfo.jsp");

		return mav;
	}

	/**
	 * Select the child Orginfo entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteBankaccountinfoOrginfo")
	public ModelAndView confirmDeleteBankaccountinfoOrginfo(@RequestParam String bankaccountinfo_id, @RequestParam String related_orginfo_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orginfo", orginfoDAO.findOrginfoByPrimaryKey(related_orginfo_id));
		mav.addObject("bankaccountinfo_id", bankaccountinfo_id);
		mav.setViewName("bankaccountinfo/orginfo/deleteOrginfo.jsp");

		return mav;
	}

	/**
	 * Save an existing Bankaccountinfo entity
	 * 
	 */
	@RequestMapping("/saveBankaccountinfo")
	public String saveBankaccountinfo(@ModelAttribute Bankaccountinfo bankaccountinfo) {
		bankaccountinfoService.saveBankaccountinfo(bankaccountinfo);
		return "forward:/indexBankaccountinfo";
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
	 * Create a new Bankaccountinfo entity
	 * 
	 */
	@RequestMapping("/newBankaccountinfo")
	public ModelAndView newBankaccountinfo() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankaccountinfo", new Bankaccountinfo());
		mav.addObject("newFlag", true);
		mav.setViewName("bankaccountinfo/editBankaccountinfo.jsp");

		return mav;
	}

	/**
	 * Select an existing Bankaccountinfo entity
	 * 
	 */
	@RequestMapping("/selectBankaccountinfo")
	public ModelAndView selectBankaccountinfo(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankaccountinfo", bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(idKey));
		mav.setViewName("bankaccountinfo/viewBankaccountinfo.jsp");

		return mav;
	}

	/**
	 * Edit an existing Orginfo entity
	 * 
	 */
	@RequestMapping("/editBankaccountinfoOrginfo")
	public ModelAndView editBankaccountinfoOrginfo(@RequestParam String bankaccountinfo_id, @RequestParam String orginfo_id) {
		Orginfo orginfo = orginfoDAO.findOrginfoByPrimaryKey(orginfo_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("bankaccountinfo_id", bankaccountinfo_id);
		mav.addObject("orginfo", orginfo);
		mav.setViewName("bankaccountinfo/orginfo/editOrginfo.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/bankaccountinfoController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing Bankaccountinfo entity
	 * 
	 */
	@RequestMapping("/deleteBankaccountinfo")
	public String deleteBankaccountinfo(@RequestParam String idKey) {
		Bankaccountinfo bankaccountinfo = bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(idKey);
		bankaccountinfoService.deleteBankaccountinfo(bankaccountinfo);
		return "forward:/indexBankaccountinfo";
	}

	/**
	 * Entry point to show all Bankaccountinfo entities
	 * 
	 */
	public String indexBankaccountinfo() {
		return "redirect:/indexBankaccountinfo";
	}

	/**
	 * Show all Bankaccountinfo entities
	 * 
	 */
	@RequestMapping("/indexBankaccountinfo")
	public ModelAndView listBankaccountinfos() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankaccountinfos", bankaccountinfoService.loadBankaccountinfos());

		mav.setViewName("bankaccountinfo/listBankaccountinfos.jsp");

		return mav;
	}

	/**
	 * Edit an existing Bankaccountinfo entity
	 * 
	 */
	@RequestMapping("/editBankaccountinfo")
	public ModelAndView editBankaccountinfo(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankaccountinfo", bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(idKey));
		mav.setViewName("bankaccountinfo/editBankaccountinfo.jsp");

		return mav;
	}

	/**
	 * Delete an existing Orginfo entity
	 * 
	 */
	@RequestMapping("/deleteBankaccountinfoOrginfo")
	public ModelAndView deleteBankaccountinfoOrginfo(@RequestParam String bankaccountinfo_id, @RequestParam String related_orginfo_id) {
		ModelAndView mav = new ModelAndView();

		Bankaccountinfo bankaccountinfo = bankaccountinfoService.deleteBankaccountinfoOrginfo(bankaccountinfo_id, related_orginfo_id);

		mav.addObject("bankaccountinfo_id", bankaccountinfo_id);
		mav.addObject("bankaccountinfo", bankaccountinfo);
		mav.setViewName("bankaccountinfo/viewBankaccountinfo.jsp");

		return mav;
	}

	/**
	 * Create a new Orginfo entity
	 * 
	 */
	@RequestMapping("/newBankaccountinfoOrginfo")
	public ModelAndView newBankaccountinfoOrginfo(@RequestParam String bankaccountinfo_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("bankaccountinfo_id", bankaccountinfo_id);
		mav.addObject("orginfo", new Orginfo());
		mav.addObject("newFlag", true);
		mav.setViewName("bankaccountinfo/orginfo/editOrginfo.jsp");

		return mav;
	}

	/**
	 * Show all Orginfo entities by Bankaccountinfo
	 * 
	 */
	@RequestMapping("/listBankaccountinfoOrginfo")
	public ModelAndView listBankaccountinfoOrginfo(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankaccountinfo", bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(idKey));
		mav.setViewName("bankaccountinfo/orginfo/listOrginfo.jsp");

		return mav;
	}

	/**
	 * View an existing Orginfo entity
	 * 
	 */
	@RequestMapping("/selectBankaccountinfoOrginfo")
	public ModelAndView selectBankaccountinfoOrginfo(@RequestParam String bankaccountinfo_id, @RequestParam String orginfo_id) {
		Orginfo orginfo = orginfoDAO.findOrginfoByPrimaryKey(orginfo_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("bankaccountinfo_id", bankaccountinfo_id);
		mav.addObject("orginfo", orginfo);
		mav.setViewName("bankaccountinfo/orginfo/viewOrginfo.jsp");

		return mav;
	}

	/**
	 * Save an existing Orginfo entity
	 * 
	 */
	@RequestMapping("/saveBankaccountinfoOrginfo")
	public ModelAndView saveBankaccountinfoOrginfo(@RequestParam String bankaccountinfo_id, @ModelAttribute Orginfo orginfo) {
		Bankaccountinfo parent_bankaccountinfo = bankaccountinfoService.saveBankaccountinfoOrginfo(bankaccountinfo_id, orginfo);

		ModelAndView mav = new ModelAndView();
		mav.addObject("bankaccountinfo_id", bankaccountinfo_id);
		mav.addObject("bankaccountinfo", parent_bankaccountinfo);
		mav.setViewName("bankaccountinfo/viewBankaccountinfo.jsp");

		return mav;
	}
}