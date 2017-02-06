package com.hejiascm.web;

import com.hejiascm.dao.BankaccountentryDAO;

import com.hejiascm.domain.Bankaccountentry;

import com.hejiascm.service.BankaccountentryService;

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
 * Spring MVC controller that handles CRUD requests for Bankaccountentry entities
 * 
 */

@Controller("BankaccountentryController")
public class BankaccountentryController {

	/**
	 * DAO injected by Spring that manages Bankaccountentry entities
	 * 
	 */
	@Autowired
	private BankaccountentryDAO bankaccountentryDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Bankaccountentry entities
	 * 
	 */
	@Autowired
	private BankaccountentryService bankaccountentryService;

	/**
	 * Show all Bankaccountentry entities
	 * 
	 */
	@RequestMapping("/indexBankaccountentry")
	public ModelAndView listBankaccountentrys() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankaccountentrys", bankaccountentryService.loadBankaccountentrys());

		mav.setViewName("bankaccountentry/listBankaccountentrys.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Bankaccountentry entities
	 * 
	 */
	public String indexBankaccountentry() {
		return "redirect:/indexBankaccountentry";
	}

	/**
	 * Select the Bankaccountentry entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteBankaccountentry")
	public ModelAndView confirmDeleteBankaccountentry(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankaccountentry", bankaccountentryDAO.findBankaccountentryByPrimaryKey(idKey));
		mav.setViewName("bankaccountentry/deleteBankaccountentry.jsp");

		return mav;
	}

	/**
	 * Create a new Bankaccountentry entity
	 * 
	 */
	@RequestMapping("/newBankaccountentry")
	public ModelAndView newBankaccountentry() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankaccountentry", new Bankaccountentry());
		mav.addObject("newFlag", true);
		mav.setViewName("bankaccountentry/editBankaccountentry.jsp");

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

	/**
	 * Select an existing Bankaccountentry entity
	 * 
	 */
	@RequestMapping("/selectBankaccountentry")
	public ModelAndView selectBankaccountentry(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankaccountentry", bankaccountentryDAO.findBankaccountentryByPrimaryKey(idKey));
		mav.setViewName("bankaccountentry/viewBankaccountentry.jsp");

		return mav;
	}

	/**
	 * Delete an existing Bankaccountentry entity
	 * 
	 */
	@RequestMapping("/deleteBankaccountentry")
	public String deleteBankaccountentry(@RequestParam String idKey) {
		Bankaccountentry bankaccountentry = bankaccountentryDAO.findBankaccountentryByPrimaryKey(idKey);
		bankaccountentryService.deleteBankaccountentry(bankaccountentry);
		return "forward:/indexBankaccountentry";
	}

	/**
	 */
	@RequestMapping("/bankaccountentryController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing Bankaccountentry entity
	 * 
	 */
	@RequestMapping("/editBankaccountentry")
	public ModelAndView editBankaccountentry(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankaccountentry", bankaccountentryDAO.findBankaccountentryByPrimaryKey(idKey));
		mav.setViewName("bankaccountentry/editBankaccountentry.jsp");

		return mav;
	}

	/**
	 * Save an existing Bankaccountentry entity
	 * 
	 */
	@RequestMapping("/saveBankaccountentry")
	public String saveBankaccountentry(@ModelAttribute Bankaccountentry bankaccountentry) {
		bankaccountentryService.saveBankaccountentry(bankaccountentry);
		return "forward:/indexBankaccountentry";
	}
}