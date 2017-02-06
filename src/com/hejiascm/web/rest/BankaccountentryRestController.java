package com.hejiascm.web.rest;

import com.hejiascm.dao.BankaccountentryDAO;

import com.hejiascm.domain.Bankaccountentry;

import com.hejiascm.service.BankaccountentryService;

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
 * Spring Rest controller that handles CRUD requests for Bankaccountentry entities
 * 
 */

@Controller("BankaccountentryRestController")
public class BankaccountentryRestController {

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
	 * Save an existing Bankaccountentry entity
	 * 
	 */
	@RequestMapping(value = "/Bankaccountentry", method = RequestMethod.PUT)
	@ResponseBody
	public Bankaccountentry saveBankaccountentry(@RequestBody Bankaccountentry bankaccountentry) {
		bankaccountentryService.saveBankaccountentry(bankaccountentry);
		return bankaccountentryDAO.findBankaccountentryByPrimaryKey(bankaccountentry.getId());
	}

	/**
	 * Select an existing Bankaccountentry entity
	 * 
	 */
	@RequestMapping(value = "/Bankaccountentry/{bankaccountentry_id}", method = RequestMethod.GET)
	@ResponseBody
	public Bankaccountentry loadBankaccountentry(@PathVariable String bankaccountentry_id) {
		System.out.println("fuck u id:" + bankaccountentry_id);
		return bankaccountentryDAO.findBankaccountentryByPrimaryKey(bankaccountentry_id);
	}

	/**
	 * Delete an existing Bankaccountentry entity
	 * 
	 */
	@RequestMapping(value = "/Bankaccountentry/{bankaccountentry_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBankaccountentry(@PathVariable String bankaccountentry_id) {
		Bankaccountentry bankaccountentry = bankaccountentryDAO.findBankaccountentryByPrimaryKey(bankaccountentry_id);
		bankaccountentryService.deleteBankaccountentry(bankaccountentry);
	}

	/**
	 * Create a new Bankaccountentry entity
	 * 
	 */
	@RequestMapping(value = "/Bankaccountentry", method = RequestMethod.POST)
	@ResponseBody
	public Bankaccountentry newBankaccountentry(@RequestBody Bankaccountentry bankaccountentry) {
		bankaccountentryService.saveBankaccountentry(bankaccountentry);
		return bankaccountentryDAO.findBankaccountentryByPrimaryKey(bankaccountentry.getId());
	}

	/**
	 * Show all Bankaccountentry entities
	 * 
	 */
	@RequestMapping(value = "/Bankaccountentry", method = RequestMethod.GET)
	@ResponseBody
	public List<Bankaccountentry> listBankaccountentrys() {
		return new java.util.ArrayList<Bankaccountentry>(bankaccountentryService.loadBankaccountentrys());
	}
}