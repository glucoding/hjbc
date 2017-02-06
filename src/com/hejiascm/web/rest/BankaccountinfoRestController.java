package com.hejiascm.web.rest;

import com.hejiascm.dao.BankaccountinfoDAO;
import com.hejiascm.dao.OrginfoDAO;

import com.hejiascm.domain.Bankaccountinfo;
import com.hejiascm.domain.Orginfo;

import com.hejiascm.service.BankaccountinfoService;

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
 * Spring Rest controller that handles CRUD requests for Bankaccountinfo entities
 * 
 */

@Controller("BankaccountinfoRestController")
public class BankaccountinfoRestController {

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
	 * Save an existing Bankaccountinfo entity
	 * 
	 */
	@RequestMapping(value = "/Bankaccountinfo", method = RequestMethod.PUT)
	@ResponseBody
	public Bankaccountinfo saveBankaccountinfo(@RequestBody Bankaccountinfo bankaccountinfo) {
		bankaccountinfoService.saveBankaccountinfo(bankaccountinfo);
		return bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(bankaccountinfo.getId());
	}

	/**
	 * Save an existing Orginfo entity
	 * 
	 */
	@RequestMapping(value = "/Bankaccountinfo/{bankaccountinfo_id}/orginfo", method = RequestMethod.PUT)
	@ResponseBody
	public Orginfo saveBankaccountinfoOrginfo(@PathVariable String bankaccountinfo_id, @RequestBody Orginfo orginfo) {
		bankaccountinfoService.saveBankaccountinfoOrginfo(bankaccountinfo_id, orginfo);
		return orginfoDAO.findOrginfoByPrimaryKey(orginfo.getId());
	}

	/**
	 * Delete an existing Bankaccountinfo entity
	 * 
	 */
	@RequestMapping(value = "/Bankaccountinfo/{bankaccountinfo_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBankaccountinfo(@PathVariable String bankaccountinfo_id) {
		Bankaccountinfo bankaccountinfo = bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(bankaccountinfo_id);
		bankaccountinfoService.deleteBankaccountinfo(bankaccountinfo);
	}

	/**
	 * Get Orginfo entity by Bankaccountinfo
	 * 
	 */
	@RequestMapping(value = "/Bankaccountinfo/{bankaccountinfo_id}/orginfo", method = RequestMethod.GET)
	@ResponseBody
	public Orginfo getBankaccountinfoOrginfo(@PathVariable String bankaccountinfo_id) {
		return bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(bankaccountinfo_id).getOrginfo();
	}

	/**
	 * View an existing Orginfo entity
	 * 
	 */
	@RequestMapping(value = "/Bankaccountinfo/{bankaccountinfo_id}/orginfo/{orginfo_id}", method = RequestMethod.GET)
	@ResponseBody
	public Orginfo loadBankaccountinfoOrginfo(@PathVariable String bankaccountinfo_id, @PathVariable String related_orginfo_id) {
		Orginfo orginfo = orginfoDAO.findOrginfoByPrimaryKey(related_orginfo_id, -1, -1);

		return orginfo;
	}

	/**
	 * Create a new Bankaccountinfo entity
	 * 
	 */
	@RequestMapping(value = "/Bankaccountinfo", method = RequestMethod.POST)
	@ResponseBody
	public Bankaccountinfo newBankaccountinfo(@RequestBody Bankaccountinfo bankaccountinfo) {
		bankaccountinfoService.saveBankaccountinfo(bankaccountinfo);
		return bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(bankaccountinfo.getId());
	}

	/**
	 * Show all Bankaccountinfo entities
	 * 
	 */
	@RequestMapping(value = "/Bankaccountinfo", method = RequestMethod.GET)
	@ResponseBody
	public List<Bankaccountinfo> listBankaccountinfos() {
		return new java.util.ArrayList<Bankaccountinfo>(bankaccountinfoService.loadBankaccountinfos());
	}

	/**
	 * Select an existing Bankaccountinfo entity
	 * 
	 */
	@RequestMapping(value = "/Bankaccountinfo/{bankaccountinfo_id}", method = RequestMethod.GET)
	@ResponseBody
	public Bankaccountinfo loadBankaccountinfo(@PathVariable String bankaccountinfo_id) {
		return bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(bankaccountinfo_id);
	}

	/**
	 * Create a new Orginfo entity
	 * 
	 */
	@RequestMapping(value = "/Bankaccountinfo/{bankaccountinfo_id}/orginfo", method = RequestMethod.POST)
	@ResponseBody
	public Orginfo newBankaccountinfoOrginfo(@PathVariable String bankaccountinfo_id, @RequestBody Orginfo orginfo) {
		bankaccountinfoService.saveBankaccountinfoOrginfo(bankaccountinfo_id, orginfo);
		return orginfoDAO.findOrginfoByPrimaryKey(orginfo.getId());
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
	 * Delete an existing Orginfo entity
	 * 
	 */
	@RequestMapping(value = "/Bankaccountinfo/{bankaccountinfo_id}/orginfo/{orginfo_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBankaccountinfoOrginfo(@PathVariable String bankaccountinfo_id, @PathVariable String related_orginfo_id) {
		bankaccountinfoService.deleteBankaccountinfoOrginfo(bankaccountinfo_id, related_orginfo_id);
	}
}