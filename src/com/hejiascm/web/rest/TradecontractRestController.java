package com.hejiascm.web.rest;

import com.hejiascm.blockchain.interfaces.ContractDAO;
import com.hejiascm.domains.tradecontract._TradeContract;
import com.hejiascm.util.MiscTool;
import com.hejiascm.util.TimestampPropertyEditor;

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

/**
 * Spring Rest controller that handles CRUD requests for Tradecontract entities
 * 
 */
@Controller("TradecontractRestController")
public class TradecontractRestController {
	@Autowired
	private ContractDAO contractDAO;

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
	@RequestMapping(value = "/bcTradeContract/query", method = RequestMethod.POST)
	@ResponseBody
	public List<_TradeContract> getContracts(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		System.out.println(q.getQ());
		List<_TradeContract> cons = contractDAO.getTradeContracts(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(cons != null){
			return cons;
		}else{
			//res.setStatus(499);
			return new ArrayList<_TradeContract>();
		}
	}
	
	/**
	 * Block chain
	 * @param Tradecontract
	 * @return String contractId
	 */
	@RequestMapping(value = "/bcTradeContract", method = RequestMethod.POST)
	@ResponseBody
	public String newBcTradecontract(@RequestBody _TradeContract contract, HttpServletRequest req, HttpServletResponse res) {
		String result = contractDAO.submitTradeContract(contract, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(result != null){
			return result;
		}else{
			res.setStatus(499);
			return "合同创建失败，请联系系统管理员";
		}
	}
	
	/**
	 * Block chain
	 * @param Tradecontract
	 * @return String contractId
	 */
	@RequestMapping(value = "/bcConfirmTradeContract/{id}/{ver}", method = RequestMethod.POST)
	@ResponseBody
	public void confirmBcTradecontract(@PathVariable String id, @PathVariable String ver, HttpServletRequest req, HttpServletResponse res) {
		contractDAO.confirmTradeContract(id, ver.replaceAll("_", "."), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcTradeContract/reject/{id}/{ver}", method = RequestMethod.POST)
	@ResponseBody
	public void rejectContract(@PathVariable String id, @PathVariable String ver, @RequestBody RemarkObject r, HttpServletRequest req, HttpServletResponse res) {
		contractDAO.rejectTradeContract(id, ver.replaceAll("_", "."), r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
}