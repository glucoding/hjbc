package com.hejiascm.web.rest;

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

import com.hejiascm.blockchain.BcPreAccountingDAO;
import com.hejiascm.domain.Preaccounting;
import com.hejiascm.util.TimestampPropertyEditor;

@Controller("PreaccountingRestController")
public class PreaccountingRestController {
	@Autowired
	BcPreAccountingDAO bcPreAccountingDAO;
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
	@RequestMapping(value = "/bcPreaccounting", method = RequestMethod.GET)
	@ResponseBody
	public List<Preaccounting> listPreAccounting() {
		return bcPreAccountingDAO.bcGetPreAccountings();
	}
	
	/**
	 * Block chain(CU)
	 * Register new organization or change the values of existing organization
	 * @param orginfo
	 * @return Orginfo
	 */
	@RequestMapping(value = "/bcPreaccounting", method = RequestMethod.POST)
	@ResponseBody
	public void submitPreAccounting(@RequestBody Preaccounting pa) {
		bcPreAccountingDAO.bcSubmitPreAccounting(pa);
	}
	
	/**
	 * Block chain(D)
	 * Deactivate an existing Orginfo entity
	 * @param Organization id
	 */
	@RequestMapping(value = "/bcPreaccounting/{preId}/{note}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deletePreAccounting(@PathVariable String preId, @PathVariable String notes) {
		bcPreAccountingDAO.bcWithdrawPreAccounting(preId, notes);
	}
}
