package com.hejiascm.web.rest;

import com.hejiascm.blockchain.BcFinancingDAO;
import com.hejiascm.domain.Deliveryrecord;
import com.hejiascm.domain.Financingcontract;
import com.hejiascm.domain.Financingexecution;
import com.hejiascm.domain.Finconattachment;
import com.hejiascm.domain.Finconparticipant;
import com.hejiascm.domain.Finconterm;
import com.hejiascm.domain.Fincontradecontext;
import com.hejiascm.domain.Transferrecord;

import java.util.List;
import java.util.Set;

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
 * Spring Rest controller that handles CRUD requests for Financingcontract entities
 * 
 */

@Controller("FinancingcontractRestController")
public class FinancingcontractRestController {
	@Autowired
	BcFinancingDAO bcFinancingDAO;

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
	 * Block chain
	 * @param String id, String contractId, String contractVersion, String ordreId, Strig orderFormId
	 * @return Set<Deliveryrecord>
	 * 
	 */
	@RequestMapping(value = "/bctest", method = RequestMethod.GET)
	@ResponseBody
	public Financingexecution getTest() {
		return bcFinancingDAO.getFE();
	}
	
	@RequestMapping(value = "/bctest2", method = RequestMethod.GET)
	@ResponseBody
	public Transferrecord getTest2() {
		return bcFinancingDAO.getRecord();
	}
	
}