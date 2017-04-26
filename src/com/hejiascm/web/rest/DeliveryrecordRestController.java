package com.hejiascm.web.rest;

import com.hejiascm.blockchain.interfaces.DeliveryRecordDAO;
import com.hejiascm.domains.logistics._DeliveryRecord;
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

@Controller("DeliveryrecordRestController")
public class DeliveryrecordRestController {
	
	@Autowired
	private DeliveryRecordDAO drDAO;

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
	@RequestMapping(value = "/bcDeliveryRecord/query", method = RequestMethod.POST)
	@ResponseBody
	public List<_DeliveryRecord> getRecords(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		List<_DeliveryRecord> records = drDAO.getDeliveryRecords(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(records != null){
			return records;
		}else{
			//res.setStatus(499);
			return new ArrayList<_DeliveryRecord>();
		}
	}
	
	/**
	 * Block chain
	 * @param Deliveryrecord
	 * @return String deliveryRecordId
	 */
	@RequestMapping(value = "/bcDeliveryRecord", method = RequestMethod.POST)
	@ResponseBody
	public String submitRecord(@RequestBody _DeliveryRecord dr, HttpServletRequest req, HttpServletResponse res) {
		String result = drDAO.submitDeliveryRecord(dr, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(result != null){
			return result;
		}else{
			res.setStatus(499);
			return "创建发货单失败";
		}
	}
}