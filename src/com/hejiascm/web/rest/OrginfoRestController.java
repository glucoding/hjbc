package com.hejiascm.web.rest;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.hejiascm.blockchain.dao.BcOrgInfoDAO;
import com.hejiascm.dao.BankaccountinfoDAO;
import com.hejiascm.dao.OrginfoDAO;
import com.hejiascm.dao.OrginfoattachmentDAO;
import com.hejiascm.domain.Bankaccountinfo;
import com.hejiascm.domain.Orginfo;
import com.hejiascm.domain.Orginfoattachment;
import com.hejiascm.service.OrginfoService;
import com.hejiascm.util.TimestampPropertyEditor;
import com.ibm.crl.bc.hejia.sdk.organization.OrgRegisterResponse;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Orginfo entities
 * 
 */

@Controller("OrginfoRestController")
public class OrginfoRestController {

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
	 * DAO injected by Spring that manages Orginfoattachment entities
	 * 
	 */
	@Autowired
	private OrginfoattachmentDAO orginfoattachmentDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Orginfo entities
	 * 
	 */
	@Autowired
	private OrginfoService orginfoService;
	
	@Autowired
	private BcOrgInfoDAO bcOrginfoDAO;

	/**
	 * Delete an existing Bankaccountinfo entity
	 * 
	 */
	@RequestMapping(value = "/Orginfo/{orginfo_id}/bankaccountinfos/{bankaccountinfo_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrginfoBankaccountinfos(@PathVariable String orginfo_id, @PathVariable String related_bankaccountinfos_id) {
		orginfoService.deleteOrginfoBankaccountinfos(orginfo_id, related_bankaccountinfos_id);
	}

	/**
	 * View an existing Bankaccountinfo entity
	 * 
	 */
	@RequestMapping(value = "/Orginfo/{orginfo_id}/bankaccountinfos/{bankaccountinfo_id}", method = RequestMethod.GET)
	@ResponseBody
	public Bankaccountinfo loadOrginfoBankaccountinfos(@PathVariable String orginfo_id, @PathVariable String related_bankaccountinfos_id) {
		Bankaccountinfo bankaccountinfo = bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(related_bankaccountinfos_id, -1, -1);

		return bankaccountinfo;
	}

	/**
	 * Show all Orginfoattachment entities by Orginfo
	 * 
	 */
	@RequestMapping(value = "/Orginfo/{orginfo_id}/orginfoattachments", method = RequestMethod.GET)
	@ResponseBody
	public List<Orginfoattachment> getOrginfoOrginfoattachments(@PathVariable String orginfo_id) {
		return new java.util.ArrayList<Orginfoattachment>(orginfoDAO.findOrginfoByPrimaryKey(orginfo_id).getOrginfoattachments());
	}

	/**
	 * Save an existing Orginfo entity
	 * 
	 */
	@RequestMapping(value = "/Orginfo", method = RequestMethod.PUT)
	@ResponseBody
	public Orginfo saveOrginfo(@RequestBody Orginfo orginfo) {
		orginfoService.saveOrginfo(orginfo);
		return orginfoDAO.findOrginfoByPrimaryKey(orginfo.getId());
	}

	/**
	 * Create a new Orginfo entity
	 * 
	 */
	@RequestMapping(value = "/Orginfo", method = RequestMethod.POST)
	@ResponseBody
	public Orginfo newOrginfo(@RequestBody Orginfo orginfo) {
		System.out.println("$$$$$$$$$$$$"+orginfo.getName());
		orginfoService.saveOrginfo(orginfo);
		return orginfoDAO.findOrginfoByPrimaryKey(orginfo.getId());
	}

	/**
	 * Create a new Bankaccountinfo entity
	 * 
	 */
	@RequestMapping(value = "/Orginfo/{orginfo_id}/bankaccountinfos", method = RequestMethod.POST)
	@ResponseBody
	public Bankaccountinfo newOrginfoBankaccountinfos(@PathVariable String orginfo_id, @RequestBody Bankaccountinfo bankaccountinfo) {
		orginfoService.saveOrginfoBankaccountinfos(orginfo_id, bankaccountinfo);
		return bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(bankaccountinfo.getId());
	}

	/**
	 * Save an existing Orginfoattachment entity
	 *
	 */
	@RequestMapping(value = "/Orginfo/{orginfo_id}/orginfoattachments", method = RequestMethod.PUT)
	@ResponseBody
	public Orginfoattachment saveOrginfoOrginfoattachments(@PathVariable String orginfo_id, @RequestBody Orginfoattachment orginfoattachments) {
		orginfoService.saveOrginfoOrginfoattachments(orginfo_id, orginfoattachments);
		return orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(orginfoattachments.getId());
	}

	/**
	 * Show all Bankaccountinfo entities by Orginfo
	 * 
	 */
	@RequestMapping(value = "/Orginfo/{orginfo_id}/bankaccountinfos", method = RequestMethod.GET)
	@ResponseBody
	public List<Bankaccountinfo> getOrginfoBankaccountinfos(@PathVariable String orginfo_id) {
		return new java.util.ArrayList<Bankaccountinfo>(orginfoDAO.findOrginfoByPrimaryKey(orginfo_id).getBankaccountinfos());
	}

	/**
	 * Save an existing Bankaccountinfo entity
	 * 
	 */
	@RequestMapping(value = "/Orginfo/{orginfo_id}/bankaccountinfos", method = RequestMethod.PUT)
	@ResponseBody
	public Bankaccountinfo saveOrginfoBankaccountinfos(@PathVariable String orginfo_id, @RequestBody Bankaccountinfo bankaccountinfos) {
		orginfoService.saveOrginfoBankaccountinfos(orginfo_id, bankaccountinfos);
		return bankaccountinfoDAO.findBankaccountinfoByPrimaryKey(bankaccountinfos.getId());
	}

	/**
	 * Delete an existing Orginfoattachment entity
	 * 
	 */
	@RequestMapping(value = "/Orginfo/{orginfo_id}/orginfoattachments/{orginfoattachment_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrginfoOrginfoattachments(@PathVariable String orginfo_id, @PathVariable String related_orginfoattachments_id) {
		orginfoService.deleteOrginfoOrginfoattachments(orginfo_id, related_orginfoattachments_id);
	}

	/**
	 * Delete an existing Orginfo entity
	 * 
	 */
	@RequestMapping(value = "/Orginfo/{orginfo_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrginfo(@PathVariable String orginfo_id) {
		Orginfo orginfo = orginfoDAO.findOrginfoByPrimaryKey(orginfo_id);
		orginfoService.deleteOrginfo(orginfo);
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
		binder.registerCustomEditor(Timestamp.class,new TimestampPropertyEditor());
	}

	/**
	 * View an existing Orginfoattachment entity
	 * 
	 */
	@RequestMapping(value = "/Orginfo/{orginfo_id}/orginfoattachments/{orginfoattachment_id}", method = RequestMethod.GET)
	@ResponseBody
	public Orginfoattachment loadOrginfoOrginfoattachments(@PathVariable String orginfo_id, @PathVariable String related_orginfoattachments_id) {
		Orginfoattachment orginfoattachment = orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(related_orginfoattachments_id, -1, -1);

		return orginfoattachment;
	}

	/**
	 * Show all Orginfo entities
	 * 
	 */
	@RequestMapping(value = "/Orginfo", method = RequestMethod.GET)
	@ResponseBody
	public List<Orginfo> listOrginfos() {
		return new java.util.ArrayList<Orginfo>(orginfoService.loadOrginfos());
	}
	
	/**
	 * Block chain(RA)
	 * Show all Orginfo entities from Block Chain
	 * 
	 */
	@RequestMapping(value = "/bcOrginfo", method = RequestMethod.GET)
	@ResponseBody
	public List<Orginfo> listBcOrginfos() {
		return new java.util.ArrayList<Orginfo>(orginfoService.loadBcOrginfos());
	}
	
	/**
	 * Block chain (R)
	 * Show all Orginfo entities from Block Chain
	 * 
	 */
	@RequestMapping(value = "/bcSumOrgs", method = RequestMethod.GET)
	@ResponseBody
	public List<Orginfo> listBcSumOrgs() {
		return new java.util.ArrayList<Orginfo>(bcOrginfoDAO.findBcSummaryOrginfos());
	}
	
	/**
	 * Block chain(CU)
	 * Register new organization or change the values of existing organization
	 * @param orginfo
	 * @return Orginfo
	 */
	@RequestMapping(value = "/bcOrginfo", method = RequestMethod.POST)
	@ResponseBody
	public OrgRegisterResponse registerBcOrginfo(@RequestBody Orginfo orginfo) {
		return bcOrginfoDAO.registerBcOrginfo(orginfo);
	}

	/**
	 * Block chain(Rid)
	 * @param id
	 * @return Orginfo
	 */
	@RequestMapping(value = "/bcOrginfo/{orginfo_id}", method = RequestMethod.GET, produces="application/json;charset=UTF-8")
	@ResponseBody
	public Orginfo loadBcOrginfoById(@PathVariable String orginfo_id) {
		return bcOrginfoDAO.findBcOrginfoById(orginfo_id);
	}
	
	/**
	 * Block chain(D)
	 * Deactivate an existing Orginfo entity
	 * @param Organization id
	 */
	@RequestMapping(value = "/bcOrginfo/{orginfo_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deActivateOrginfo(@PathVariable String orginfo_id) {
		bcOrginfoDAO.deactivateBcOrg(orginfo_id);
	}

	/**
	 * Create a new Orginfoattachment entity
	 * 
	 */
	@RequestMapping(value = "/Orginfo/{orginfo_id}/orginfoattachments", method = RequestMethod.POST)
	@ResponseBody
	public Orginfoattachment newOrginfoOrginfoattachments(@PathVariable String orginfo_id, @RequestBody Orginfoattachment orginfoattachment) {
		orginfoService.saveOrginfoOrginfoattachments(orginfo_id, orginfoattachment);
		return orginfoattachmentDAO.findOrginfoattachmentByPrimaryKey(orginfoattachment.getId());
	}

	/**
	 * Select an existing Orginfo entity
	 * 
	 */
	@RequestMapping(value = "/Orginfo/{orginfo_id}", method = RequestMethod.GET)
	@ResponseBody
	public Orginfo loadOrginfo(@PathVariable String orginfo_id) {
		return orginfoDAO.findOrginfoByPrimaryKey(orginfo_id);
	}
}