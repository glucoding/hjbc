package com.hejiascm.web.rest;

import com.hejiascm.blockchain.BcOrgInfoDAO;
import com.hejiascm.domain.Orginfo;
import com.hejiascm.util.TimestampPropertyEditor;
import com.ibm.crl.bc.hejia.sdk.organization.OrgRegisterResponse;

import java.sql.Timestamp;
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
 * Spring Rest controller that handles CRUD requests for Orginfo entities
 * 
 */

@Controller("OrginfoRestController")
public class OrginfoRestController {
	@Autowired
	private BcOrgInfoDAO bcOrginfoDAO;

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
	 * Block chain(RA)
	 * Show all Orginfo entities from Block Chain
	 * 
	 */
	@RequestMapping(value = "/bcOrginfo", method = RequestMethod.GET)
	@ResponseBody
	public List<Orginfo> listBcOrginfos() {
		return bcOrginfoDAO.findAllBcOrginfos();
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
}