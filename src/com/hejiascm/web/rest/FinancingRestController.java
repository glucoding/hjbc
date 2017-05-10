package com.hejiascm.web.rest;

import com.hejiascm.blockchain.interfaces.FinancingDAO;
import com.hejiascm.domains.financing._FinancingExecution;
import com.hejiascm.util.FatherToChildUtils;
import com.hejiascm.util.MiscTool;
import com.ibm.crl.bc.hejia.sdk.common.BankAccountInfo;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.TransferRecord;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingContract;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingExecution;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingIntention;
import com.ibm.crl.bc.hejia.sdk.financing.FinancingRequest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
 * Spring Rest controller that handles CRUD requests for Financingcontract entities
 * 
 */

@Controller("FinancingcontractRestController")
public class FinancingRestController {
	@Autowired
	FinancingDAO finDAO;

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
	@RequestMapping(value = "/bcFinancingRequest/close/{reqId}", method = RequestMethod.POST)
	@ResponseBody
	public void closeReq(@PathVariable String reqId, @RequestBody RemarkObject  r, HttpServletRequest req) {
		finDAO.closeRequest(reqId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcFinancingContract/confirm/{finConId}", method = RequestMethod.POST)
	@ResponseBody
	public void confirmContract(@PathVariable String finConId, @RequestBody RemarkObject r, HttpServletRequest req) {
		finDAO.confirmContract(finConId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcLoanRecord/confirm/{finConId}/{transferId}", method = RequestMethod.GET)
	@ResponseBody
	public void confirmLoanRecord(@PathVariable String finConId, @PathVariable String transferId, HttpServletRequest req) {
		finDAO.confirmLoanRecord(finConId, transferId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcRepaymentRecord/confirm/{finConId}/{transferId}", method = RequestMethod.GET)
	@ResponseBody
	public void confirmRepaymentRecord(@PathVariable String finConId, @PathVariable String transferId, HttpServletRequest req) {
		finDAO.confirmRepaymentRecord(finConId, transferId.replaceAll("_", "#"), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcFinancingRequest/confirm/{requestId}", method = RequestMethod.POST)
	@ResponseBody
	public void confirmRequest(@PathVariable String requestId, @RequestBody RemarkObject r, HttpServletRequest req) {
		finDAO.confirmRequest(requestId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcFinancingContract/{finInstId}", method = RequestMethod.POST)
	@ResponseBody
	public String createContract(@RequestBody FinancingContract fc, @PathVariable String finInstId, HttpServletRequest req, HttpServletResponse res) {
		String result = finDAO.createContract(fc, finInstId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(result != null){
			return result;
		}else{
			res.setStatus(499);
			return "创建融资合同失败";
		}
	}
	
	@RequestMapping(value = "/bcLoanRecord/{finConId}", method = RequestMethod.POST)
	@ResponseBody
	public String createLoanRecord(@RequestBody TransferRecord tr, @PathVariable String finConId, HttpServletRequest req, HttpServletResponse res) {
		String result = finDAO.createLoanRecord(tr, finConId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(result != null){
			return result;
		}else{
			res.setStatus(499);
			return "创建放款记录失败";
		}
	}
	
	@RequestMapping(value = "/bcRepaymentRecord/{finConId}", method = RequestMethod.POST)
	@ResponseBody
	public String createRepaymentRecord(@RequestBody TransferRecord tr, @PathVariable String finConId, HttpServletRequest req, HttpServletResponse res) {
		String result = finDAO.createRepaymentRecord(tr, finConId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(result != null){
			return result;
		}else{
			res.setStatus(499);
			return "创建还款记录失败";
		}
	}
	
	@RequestMapping(value = "/bcFinancingRequest", method = RequestMethod.POST)
	@ResponseBody
	public String createRequest(@RequestBody FinancingRequest fr, HttpServletRequest req, HttpServletResponse res) {
		String result = finDAO.createRequest(fr, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(result != null){
			return result;
		}else{
			res.setStatus(499);
			return "创建融资申请失败";
		}
	}
	
	@RequestMapping(value = "/bcFinancingRequest/disclose/{requestId}", method = RequestMethod.POST)
	@ResponseBody
	public void discloseRequest(@PathVariable String requestId, @RequestBody RemarkObject r, HttpServletRequest req) {
		finDAO.discloseRequest(requestId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcFinancingContract/{finConId}", method = RequestMethod.GET)
	@ResponseBody
	public FinancingContract getContractById(@PathVariable String finConId, HttpServletRequest req, HttpServletResponse res) {
		FinancingContract fc = finDAO.getContractById(finConId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(fc != null){
			return fc;
		}else{
			//res.setStatus(499);
			return  null;
		}
	}
	
	@RequestMapping(value = "/bcFinancingContract/query", method = RequestMethod.POST)
	@ResponseBody
	public FinancingContract[] getContracts(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		FinancingContract[] fcs = finDAO.getContracts(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(fcs != null){
			return fcs;
		}else{
			//res.setStatus(499);
			return  null;
		}
	}
	
	@RequestMapping(value = "/bcFinancingExecution/{finConId}", method = RequestMethod.GET)
	@ResponseBody
	public FinancingExecution getExecutionByConId(@PathVariable String finConId, HttpServletRequest req, HttpServletResponse res) {
		FinancingExecution fe = finDAO.getExecutionByContractId(finConId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(fe != null){
			return fe;
		}else{
			//res.setStatus(499);
			return  null;
		}
	}
	
	@RequestMapping(value = "/bcFinancingExecution/query", method = RequestMethod.POST)
	@ResponseBody
	public FinancingExecution[] getExecutions(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		FinancingExecution[] fes = finDAO.getExecutions(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(fes != null){
			return fes;
		}else{
			//res.setStatus(499);
			return  null;
		}
	}
	
	@RequestMapping(value = "/bcFinancingExecution/queryWithoutHash", method = RequestMethod.POST)
	@ResponseBody
	public _FinancingExecution[] getExecutionsWithoutHash(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		FinancingExecution[] fes = finDAO.getExecutions(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		_FinancingExecution[] fesNew = new _FinancingExecution[fes.length];
		int i = 0;
		for(FinancingExecution fe:fes){
			_FinancingExecution feNew = new _FinancingExecution();
			FatherToChildUtils.fatherToChild(fe, feNew);
			
			HashMap<String, Currency> map = fe.getUnconfirmedRepayments();
			Iterator iter = map.entrySet().iterator();
			String[] ids = new String[map.size()];
			int j = 0;
			while (iter.hasNext()) {
				Map.Entry<String,Currency> entry = (Map.Entry<String, Currency>) iter.next();
				//Currency val = entry.getValue();
				ids[j] =  entry.getKey();
				j++;
			}
			feNew.setUnConfirmedRepaymentList(ids);
			fesNew[i] = feNew;
			i++;
		}
		
		return fesNew;
	}
	
	@RequestMapping(value = "/bcLoanRecord/{finConId}", method = RequestMethod.GET)
	@ResponseBody
	public TransferRecord[] getLoanRecords(@PathVariable String finConId, HttpServletRequest req, HttpServletResponse res) {
		TransferRecord[] trs = finDAO.getLoanRecords(finConId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(trs != null){
			return trs;
		}else{
			//res.setStatus(499);
			return  new TransferRecord[0];
		}
	}
	
	@RequestMapping(value = "/bcRepaymentRecord/{finConId}", method = RequestMethod.GET)
	@ResponseBody
	public TransferRecord[] getRepaymentRecords(@PathVariable String finConId, HttpServletRequest req, HttpServletResponse res) {
		TransferRecord[] trs = finDAO.getRepaymentRecords(finConId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(trs != null){
			return trs;
		}else{
			//res.setStatus(499);
			return  null;
		}
	}
	
	@RequestMapping(value = "/bcFinancingRequest/{requestId}", method = RequestMethod.GET)
	@ResponseBody
	public FinancingRequest getRequstById(@PathVariable String requestId, HttpServletRequest req, HttpServletResponse res) {
		FinancingRequest fr = finDAO.getRequestById(requestId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(fr != null){
			return fr;
		}else{
			//res.setStatus(499);
			return  null;
		}
	}
	
	@RequestMapping(value = "/bcFinancingRequest/query", method = RequestMethod.POST)
	@ResponseBody
	public FinancingRequest[] getRequests(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		FinancingRequest[] frs = finDAO.getRequests(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(frs != null){
			return frs;
		}else{
			//res.setStatus(499);
			return  new FinancingRequest[0];
		}
	}
	
	@RequestMapping(value = "/bcFinancingContract/reject/{finConId}", method = RequestMethod.POST)
	@ResponseBody
	public void rejectContract(@PathVariable String finConId, @RequestBody RemarkObject r, HttpServletRequest req) {
		finDAO.rejectContract(finConId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcFinancingRequest/reject/{requestId}", method = RequestMethod.POST)
	@ResponseBody
	public void rejectRequest(@PathVariable String requestId, @RequestBody RemarkObject r, HttpServletRequest req) {
		finDAO.rejectRequest(requestId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcRepaymentRecord/terminate/{finConId}", method = RequestMethod.POST)
	@ResponseBody
	public void terminateRepayment(@PathVariable String finConId, @RequestBody RemarkObject r, HttpServletRequest req) {
		finDAO.terminateRepayment(finConId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcFinancingContract/updateParticipant/{finConId}/{name}", method = RequestMethod.POST)
	@ResponseBody
	public void updateConParticipant(@RequestBody BankAccountInfo bInfo, @PathVariable String finConId, @PathVariable String name, HttpServletRequest req) {
		finDAO.updateContractParticipant(finConId, name, bInfo, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	/*
	 * Newly added functions after 4.7
	 */
	
	@RequestMapping(value = "/bcFinancingRequest/cancelIntention/{finIntId}", method = RequestMethod.POST)
	@ResponseBody
	public void cancelIntention(@PathVariable String finIntId, @RequestBody RemarkObject r, HttpServletRequest req) {
		finDAO.cancelIntention(finIntId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcFinancingRequest/cancelRequest/{finReqId}", method = RequestMethod.POST)
	@ResponseBody
	public void cancelRequest(@PathVariable String finReqId, @RequestBody RemarkObject r, HttpServletRequest req) {
		finDAO.cancelRequest(finReqId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcFinancingRequest/createIntention", method = RequestMethod.POST)
	@ResponseBody
	public String createIntention(@RequestBody FinancingIntention fi, HttpServletRequest req, HttpServletResponse res) {
		String result = finDAO.createIntention(fi, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(result != null){
			return result;
		}else{
			res.setStatus(499);
			return "创建融资意向失败";
		}
	}
	
	@RequestMapping(value = "/bcFinancingRequest/getIntentionById/{finIntId}", method = RequestMethod.GET)
	@ResponseBody
	public FinancingIntention getIntentionById(@PathVariable String finIntId, HttpServletRequest req, HttpServletResponse res) {
		FinancingIntention fi = finDAO.getIntentionById(finIntId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(fi != null){
			return fi;
		}else{
			//res.setStatus(499);
			return  null;
		}
	}
	
	@RequestMapping(value = "/bcFinancingRequest/getIntentions/query", method = RequestMethod.POST)
	@ResponseBody
	public FinancingIntention[] getIntentions(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		FinancingIntention[] fis = finDAO.getIntentions(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(fis != null){
			return fis;
		}else{
			//res.setStatus(499);
			return  new FinancingIntention[0];
		}
	}
	
	@RequestMapping(value = "/bcFinancingRequest/getIntentionsByFinReq/{finReqId}", method = RequestMethod.GET)
	@ResponseBody
	public FinancingIntention[] getIntentionsByFinReq(@PathVariable String finReqId, HttpServletRequest req, HttpServletResponse res) {
		FinancingIntention[] fis = finDAO.getIntentionsByFinRequest(finReqId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(fis != null){
			return fis;
		}else{
			//res.setStatus(499);
			return  new FinancingIntention[0];
		}
	}
	
	@RequestMapping(value = "/bcFinancingRequest/selectIntention/{finIntId}", method = RequestMethod.POST)
	@ResponseBody
	public void selectIntention(@PathVariable String finIntId, @RequestBody RemarkObject r, HttpServletRequest req) {
		finDAO.selectIntention(finIntId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcFinancingRequest/unselectIntention/{finIntId}", method = RequestMethod.POST)
	@ResponseBody
	public void unselectIntention(@PathVariable String finIntId, @RequestBody RemarkObject r, HttpServletRequest req) {
		finDAO.unselectIntention(finIntId, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcFinancingContract/updateIntention", method = RequestMethod.POST)
	@ResponseBody
	public void updateIntention(@RequestBody FinancingIntention fi,HttpServletRequest req) {
		finDAO.updateIntention(fi, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
}