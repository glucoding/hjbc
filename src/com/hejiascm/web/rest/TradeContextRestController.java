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

import com.hejiascm.blockchain.interfaces.TradeContextDAO;
import com.hejiascm.domains.tradecontract._TradeContract;
import com.hejiascm.util.MiscTool;
import com.hejiascm.util.TimestampPropertyEditor;
import com.hejiascm.util.TradeContextHelper;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.common.TradeContext;

@Controller("TradeContextRestController")
public class TradeContextRestController {
	@Autowired
	private TradeContextDAO tcDAO;

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
	
	@RequestMapping(value = "/bcTradeContext/getAll", method = RequestMethod.POST)
	@ResponseBody
	public String[] getAll(@RequestBody TradeContext tc, HttpServletRequest req, HttpServletResponse res) {
		String[] ids = tcDAO.getAll(tc, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(ids != null){
			return ids;
		}else{
			//res.setStatus(499);
			return new String[0];
		}
	}
	
	@RequestMapping(value = "/bcTradeContext/getDetail", method = RequestMethod.POST)
	@ResponseBody
	public Property[] getDetail(@RequestBody TradeContext[] tcs, HttpServletRequest req, HttpServletResponse res) {
		Property[] ps = tcDAO.getDetail(tcs, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(ps != null){
			return ps;
		}else{
			//res.setStatus(499);
			return new Property[0];
		}
	}
	
	@RequestMapping(value = "/bcTradeContext/grant", method = RequestMethod.POST)
	@ResponseBody
	public void grant(@RequestBody TradeContextHelper tcHelper,  HttpServletRequest req, HttpServletResponse res) {
		tcDAO.grant(tcHelper.getTradeContexts(), tcHelper.getOrgIds(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcTradeContext/revoke", method = RequestMethod.POST)
	@ResponseBody
	public void revoke(@RequestBody TradeContextHelper tcHelper,  HttpServletRequest req, HttpServletResponse res) {
		tcDAO.revoke(tcHelper.getTradeContexts(), tcHelper.getOrgIds(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcTradeContext/getGranted/{orgId}", method = RequestMethod.GET)
	@ResponseBody
	public TradeContext[] getGranted(@PathVariable String orgId, HttpServletRequest req, HttpServletResponse res) {
		TradeContext[] ts = tcDAO.getGranted(orgId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(ts != null){
			return ts;
		}else{
			//res.setStatus(499);
			return new TradeContext[0];
		}
	}
	
	@RequestMapping(value = "/bcTradeContext/getDetailStatistics", method = RequestMethod.POST)
	@ResponseBody
	public Property[] getDetailStatistics(@RequestBody TradeContextHelper tcp, HttpServletRequest req, HttpServletResponse res) {
		Property[] ts = tcDAO.getDetailStatistics(tcp.getTradeContexts(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(ts != null){
			return ts;
		}else{
			//res.setStatus(499);
			return new Property[0];
		}
	}

}
