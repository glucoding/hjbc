package com.hejiascm.web.rest;

import com.hejiascm.blockchain.BcTradeContractDAO;
import com.hejiascm.domain.Tradecontract;
import com.hejiascm.util.TimestampPropertyEditor;

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
 * Spring Rest controller that handles CRUD requests for Tradecontract entities
 * 
 */
@Controller("TradecontractRestController")
public class TradecontractRestController {
	@Autowired
	private BcTradeContractDAO bcTradeContractDAO;

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
	 * Block chain
	 * @param String id, String version
	 * @return List<Tradecontract>
	 * 
	 */
	@RequestMapping(value = "/bcTradecontract/{id}/{ver}/{maxTime}/{minTime}/{parId}/{exeStatus}/{changeStatus}/{orgId}", method = RequestMethod.GET)
	@ResponseBody
	public List<Tradecontract> listBcTradecontracts(@PathVariable String id, @PathVariable String ver, @PathVariable String maxTime, @PathVariable String minTime, @PathVariable String parId, @PathVariable String exeStatus, @PathVariable String changeStatus, @PathVariable String orgId) {
		return bcTradeContractDAO.getTradeContracts(id, ver, maxTime, minTime, parId, exeStatus, changeStatus, orgId);
	}
	
	/**
	 * Block chain
	 * @param Tradecontract
	 * @return String contractId
	 */
	@RequestMapping(value = "/bcTradecontract", method = RequestMethod.POST)
	@ResponseBody
	public void newBcTradecontract(@RequestBody Tradecontract tradecontract) {
		bcTradeContractDAO.submitBcContract(tradecontract);
	}
	
	/**
	 * Block chain
	 * @param Tradecontract
	 * @return String contractId
	 */
	@RequestMapping(value = "/bcConfirmTradecontract/{id}/{ver}", method = RequestMethod.POST)
	@ResponseBody
	public void confirmBcTradecontract(@PathVariable String id, @PathVariable String ver) {
		bcTradeContractDAO.confirmBcTradeContract(id, ver);
	}
}