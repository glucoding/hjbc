package com.hejiascm.web.rest;

import com.hejiascm.blockchain.interfaces.OrganizationDAO;
import com.hejiascm.domains.org._OrgInfo;
import com.hejiascm.util.MiscTool;
import com.hejiascm.util.TimestampPropertyEditor;
import com.ibm.crl.bc.hejia.sdk.common.DocStatus;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.organization.OrgInfo;
import com.ibm.crl.bc.hejia.sdk.organization.OrgRegisterResponse;
import com.ibm.crl.bc.hejia.sdk.organization.OrgSummaryInfo;
import com.ibm.crl.bc.hejia.sdk.organization.OrgUpdateRequest;

import java.sql.Timestamp;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	private OrganizationDAO orgDAO;

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
	@RequestMapping(value = "/bcOrgInfo/query", method = RequestMethod.POST)
	@ResponseBody
	public OrgInfo[] getOrgs(@RequestBody QueryObject q, HttpServletResponse response) {
		OrgInfo[] orgs = orgDAO.getOrgs(q.getQ().replaceAll("\'", "\""));
		if(orgs != null){
			return orgs;
		}else{
			//response.setStatus(499);
			return new OrgInfo[0];
		}
	}
	
	/**
	 * Block chain (R)
	 * Show all Orginfo entities from Block Chain
	 * 
	 */
	@RequestMapping(value = "/bcSumOrgs", method = RequestMethod.GET)
	@ResponseBody
	public OrgSummaryInfo[] getSumOrgs(HttpServletResponse response) {
		OrgSummaryInfo[] osum = orgDAO.getOrgList();
		if(osum != null){
			return osum;
		}else{
			//response.setStatus(499);
			return new OrgSummaryInfo[0];
		}
	}
	
	/**
	 * Block chain(CU)
	 * Register new organization or change the values of existing organization
	 * @param orginfo
	 * @return Orginfo
	 */
	@RequestMapping(value = "/bcOrgInfo", method = RequestMethod.POST)
	@ResponseBody
	public OrgRegisterResponse registerBcOrginfo(@RequestBody _OrgInfo org, HttpServletResponse response) {
		OrgRegisterResponse ores = orgDAO.register(org);
		if(ores != null){
			return ores;
		}else{
			//response.setStatus(499);
			return null;
		}
	}

	/**
	 * Block chain(Rid)
	 * @param id
	 * @return Orginfo
	 */
	@RequestMapping(value = "/bcOrgInfoById/{id}", method = RequestMethod.GET, produces="application/json;charset=UTF-8")
	@ResponseBody
	public _OrgInfo getById(@PathVariable String id, HttpServletResponse response) {
		_OrgInfo o = orgDAO.getOrgById(id);
		if(o != null){
			return o;
		}else{
			//response.setStatus(499);
			return null;
		}
	}
	
	/**
	 * Block chain(D)
	 * Deactivate an existing Orginfo entity
	 * @param Organization id
	 */
	@RequestMapping(value = "/bcOrgInfo/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deActivate(@PathVariable String id) {
		orgDAO.deActivate(id);
	}
	
	@RequestMapping(value = "/bcOrgInfo/approveUpdate/{orgId}/{requestId}", method = RequestMethod.GET)
	@ResponseBody
	public void approveUpdate(@PathVariable String orgId, @PathVariable String requestId, HttpServletRequest req) {
		orgDAO.approveUpdate(orgId, requestId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcOrgInfo/cancelUpdate/{requestId}", method = RequestMethod.GET)
	@ResponseBody
	public void cancelUpdate(@PathVariable String orgId, @PathVariable String requestId, HttpServletRequest req) {
		orgDAO.cancelUpdate(requestId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcOrgInfo/getAllUpdateRequest", method = RequestMethod.GET)
	@ResponseBody
	public OrgUpdateRequest[] getAllUpdateRequest(HttpServletRequest req, HttpServletResponse response) {
		OrgUpdateRequest[] ours = orgDAO.getAllUpdateRequest( MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(ours != null){
			return ours;
		}else{
			return new OrgUpdateRequest[0];
		}
	}
	
	@RequestMapping(value = "/bcOrgInfo/getMyUpdateRequest", method = RequestMethod.GET)
	@ResponseBody
	public OrgUpdateRequest[] getMyUpdateRequest(HttpServletRequest req, HttpServletResponse response) {
		OrgUpdateRequest[] ours = orgDAO.getMyUpdateRequests(DocStatus.ALL, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		System.out.println("The udpate retrieving request received");
		if(ours != null){
			return ours;
		}else{
			return new OrgUpdateRequest[0];
		}
	}
	
	@RequestMapping(value = "/bcOrgInfo/leave/{orgId}", method = RequestMethod.POST)
	@ResponseBody
	public void leave(@PathVariable String orgId, @RequestBody RemarkObject r, HttpServletRequest req) {
		orgDAO.leave(orgId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcOrgInfo/rejectUpdate/{orgId}/{requestId}", method = RequestMethod.GET)
	@ResponseBody
	public void rejectUdpate(@PathVariable String orgId, @PathVariable String requestId, HttpServletRequest req) {
		orgDAO.rejectUpdate(orgId, requestId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcOrgInfo/submitUpdateRequest/{orgId}", method = RequestMethod.POST)
	@ResponseBody
	public OrgUpdateRequest submitUpdateRequest(@PathVariable String orgId, @RequestBody  _OrgInfo orgInfo, HttpServletRequest req, HttpServletResponse response) {
		OrgUpdateRequest our = orgDAO.submitUpdateRequest(orgId, MiscTool.getCurrentTime(), orgInfo,  MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(our != null){
			return our;
		}else{
			return null;
		}
	}
	
	@RequestMapping(value = "/bcOrgInfo/update/{orgId}", method = RequestMethod.POST)
	@ResponseBody
	public void update(@PathVariable String orgId, @RequestBody Properties props, HttpServletRequest req) {
		orgDAO.update(orgId, props.getProps(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcOrgInfo/getUpdateRequestById/{requestId}", method = RequestMethod.GET)
	@ResponseBody
	public OrgUpdateRequest getUpdateRequestById(@PathVariable String requestId, HttpServletRequest req, HttpServletResponse response) {
		OrgUpdateRequest our = orgDAO.getUpdateRequestById(requestId,  MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(our != null){
			return our;
		}else{
			return null;
		}
	}
}