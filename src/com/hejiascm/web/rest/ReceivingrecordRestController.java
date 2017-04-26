package com.hejiascm.web.rest;

import com.hejiascm.blockchain.interfaces.ReceivingRecordDAO;
import com.hejiascm.domains.logistics._ReceivingRecord;
import com.hejiascm.util.MiscTool;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
 * Spring Rest controller that handles CRUD requests for Receivingrecord entities
 * 
 */

@Controller("ReceivingrecordRestController")
public class ReceivingrecordRestController {
	@Autowired
	private ReceivingRecordDAO rrDAO;

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
	 * @param String id, String contractId, String contractVersion, String ordreId, String orderFormId
	 * @return Set<Receivingrecord>
	 * 
	 */
	@RequestMapping(value = "/bcReceivingRecord/query", method = RequestMethod.POST)
	@ResponseBody
	public List<_ReceivingRecord> getRecords(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		List<_ReceivingRecord> records = rrDAO.getReceivingRecords(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		System.out.println(q.getQ());
		if(records != null){
			return records;
		}else{
			//res.setStatus(499);
			return new ArrayList<_ReceivingRecord>();
		}
	}
	
	/**
	 * Block chain
	 * @param Receivingrecord
	 * @return String ReceivingRecordId
	 */
	@RequestMapping(value = "/bcReceivingRecord", method = RequestMethod.POST)
	@ResponseBody
	public String submitRecord(@RequestBody _ReceivingRecord rr, HttpServletRequest req, HttpServletResponse res) {
		String result = rrDAO.submitRecevingRecord(rr, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(result != null){
			return result;
		}else{
			res.setStatus(499);
			return "收货单创建失败";
		}
	}
}