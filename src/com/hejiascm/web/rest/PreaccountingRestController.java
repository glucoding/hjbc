package com.hejiascm.web.rest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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

import com.hejiascm.blockchain.interfaces.PreAccountingDAO;
import com.hejiascm.util.MiscTool;
import com.hejiascm.util.TimestampPropertyEditor;
import com.ibm.crl.bc.hejia.sdk.accounting.PreAccounting;

@Controller("PreaccountingRestController")
public class PreaccountingRestController {
	@Autowired
	PreAccountingDAO paDAO;
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
	@RequestMapping(value = "/bcPreAccounting/query", method = RequestMethod.POST)
	@ResponseBody
	public List<PreAccounting> listPreAccounting(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		List<PreAccounting> pres =  paDAO.getPreAccountings(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(pres != null){
			return pres;
		}else{
			//res.setStatus(499);
			return new ArrayList<PreAccounting>();
		}
	}
	
	@RequestMapping(value = "/bcPreAccounting/confirm/{preId}", method = RequestMethod.POST)
	@ResponseBody
	public void confirmPreAccounting(@PathVariable String preId, @RequestBody RemarkObject r, HttpServletRequest req, HttpServletResponse res) {
		paDAO.confirmPreAccounting(preId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	/**
	 * Block chain(D)
	 * Deactivate an existing Orginfo entity
	 * @param Organization id
	 */
	@RequestMapping(value = "/bcPreAccounting/withdraw/{preId}", method = RequestMethod.POST)
	@ResponseBody
	public void deletePreAccounting(@PathVariable String preId, @RequestBody RemarkObject r, HttpServletRequest req, HttpServletResponse res) {
		paDAO.withdrawPreAccounting(preId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcPreAccounting/generate", method = RequestMethod.GET)
	@ResponseBody
	public void generate(HttpServletRequest req, HttpServletResponse res) {
		paDAO.generatePreAccounting(MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
}
