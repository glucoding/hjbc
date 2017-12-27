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

import com.hejiascm.blockchain.interfaces.PaymentDAO;
import com.hejiascm.domains.payment.PaymentCalculation;
import com.hejiascm.util.MiscTool;
import com.hejiascm.util.TimestampPropertyEditor;
import com.ibm.crl.bc.hejia.sdk.payment.CashPaymentRecord;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentApplication;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentRecord;
import com.ibm.crl.bc.hejia.sdk.payment.PaymentSubRecord;

@Controller("PaymentRestController")
public class PaymentRestController {
	@Autowired
	PaymentDAO pDAO;
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
	@RequestMapping(value = "/bcPaymentApplication/confirm/{appId}", method = RequestMethod.POST)
	@ResponseBody
	public void confirmPaymentApp(@PathVariable String appId,@RequestBody RemarkObject r,  HttpServletRequest req, HttpServletResponse res) {
		 pDAO.confirmPayemntApplication(appId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcPaymentRecord/confirm/{recordId}", method = RequestMethod.POST)
	@ResponseBody
	public String confirmPaymentRecord(@PathVariable String recordId,@RequestBody RemarkObject r,  HttpServletRequest req, HttpServletResponse res) {
		 String result = pDAO.confirmPaymentRecord(recordId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		 return result;
	}
	
	@RequestMapping(value = "/bcPaymentRecord/delete/{recordId}", method = RequestMethod.POST)
	@ResponseBody
	public void deletePaymentRecord(@PathVariable String recordId,@RequestBody RemarkObject r,  HttpServletRequest req, HttpServletResponse res) {
		 pDAO.deletePaymentRecord(recordId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcPaymentApplication/{appId}", method = RequestMethod.GET)
	@ResponseBody
	public PaymentApplication getPaymentApplicationById(@PathVariable String appId, HttpServletRequest req, HttpServletResponse res) {
		 PaymentApplication pa = pDAO.getPaymentApplicationById(appId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		 if(pa != null){
			 return pa;
		 }else{
			 //res.setStatus(456);
			 return null;
		 }
	}
	
	@RequestMapping(value = "/bcPaymentApplication/history/query", method = RequestMethod.POST)
	@ResponseBody
	public List<PaymentApplication> getPaymentApplicationHistory(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		 List<PaymentApplication> pas = pDAO.getPaymentApplicationHistory(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		 if(pas != null){
			 return pas;
		 }else{
			 //res.setStatus(456);
			 return new ArrayList<PaymentApplication>();
		 }
	}
	
	@RequestMapping(value = "/bcPaymentApplication/query", method = RequestMethod.POST)
	@ResponseBody
	public PaymentApplication[] getPaymentApplications(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		 PaymentApplication[] pas = pDAO.getPaymentApplications(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		 if(pas != null){
			 return pas;
		 }else{
			 //res.setStatus(456);
			 return new PaymentApplication[0];
		 }
	}
	
	@RequestMapping(value = "/bcPaymentRecord/{recordId}", method = RequestMethod.GET)
	@ResponseBody
	public PaymentRecord getPaymentRecordById(@PathVariable String recordId, HttpServletRequest req, HttpServletResponse res) {
		 PaymentRecord pa = pDAO.getPaymentRecordById(recordId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		 if(pa != null){
			 return pa;
		 }else{
			// res.setStatus(456);
			 return null;
		 }
	}
	
	@RequestMapping(value = "/bcPaymentRecord/query", method = RequestMethod.POST)
	@ResponseBody
	public PaymentRecord[] getPaymentRecords(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		 PaymentRecord[] prs = pDAO.getPaymentRecords(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		 if(prs != null){
			 return prs;
		 }else{
			 //res.setStatus(456);
			 return new PaymentRecord[0];
		 }
	}
	
	@RequestMapping(value = "/bcPaymentRecord/cash", method = RequestMethod.POST)
	@ResponseBody
	public String submitCashPaymentRecord(@RequestBody CashPaymentRecord cpr, HttpServletRequest req, HttpServletResponse res) {
		 String cprId = pDAO.submitCashPaymentRecord(cpr, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		 if(cprId != null){
			 return cprId;
		 }else{
			 res.setStatus(456);
			 return "提交现金支付记录失败";
		 }
	}
	
	@RequestMapping(value = "/bcPaymentRecord/cashReceived", method = RequestMethod.POST)
	@ResponseBody
	public String submitReceivedCashPaymentRecord(@RequestBody CashPaymentRecord cpr, HttpServletRequest req, HttpServletResponse res) {
		 String cprId = pDAO.submitReceivedCashPaymentRecord(cpr, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		 if(cprId != null){
			 return cprId;
		 }else{
			 res.setStatus(456);
			 return "提交现金支付记录失败";
		 }
	}
	
	@RequestMapping(value = "/bcPaymentApplication", method = RequestMethod.POST)
	@ResponseBody
	public String submitPaymentApplication(@RequestBody PaymentApplication pa, HttpServletRequest req, HttpServletResponse res) {
		 String paId = pDAO.submitPaymentApplication(pa, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		 if(paId != null){
			 return paId;
		 }else{
			 res.setStatus(456);
			 return "提交现金支付申请失败";
		 }
	}
	
	@RequestMapping(value = "/bcPaymentRecord/computeSub", method = RequestMethod.POST)
	@ResponseBody
	public PaymentSubRecord[] computeSub(@RequestBody PaymentCalculation pc, HttpServletRequest req, HttpServletResponse res) {
		 PaymentSubRecord[] psr = pDAO.computePaymentSubRecord(pc, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		 if(psr != null){
			 return psr;
		 }else{
			 res.setStatus(456);
			 return null;
		 }
	}
	
	@RequestMapping(value = "/bcPaymentRecord/reject/{recId}", method = RequestMethod.POST)
	public void rejectPaymentRecord(@PathVariable String recId,@RequestBody RemarkObject r,  HttpServletRequest req, HttpServletResponse res) {
		 pDAO.rejectPaymentRecord(recId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcPaymentApplication/reject/{appId}", method = RequestMethod.POST)
	public void rejectPaymentApplication(@PathVariable String appId,@RequestBody RemarkObject r,  HttpServletRequest req, HttpServletResponse res) {
		 pDAO.rejectPaymentApplication(appId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcPaymentRecord/directReceivedCashPayment", method = RequestMethod.POST)
	@ResponseBody
	public String submitDirectReceivedCashPayment(@RequestBody CashPaymentRecord cpr,  HttpServletRequest req, HttpServletResponse res) {
		String result = null; 
		result = pDAO.submitDirectReceivedCashPaymentRecord(cpr,  MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(result != null){
			return result;
		}else{
			//res.setStatus(456);
			return "";
		}
	}
}
