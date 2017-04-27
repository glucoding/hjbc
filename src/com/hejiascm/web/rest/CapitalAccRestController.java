package com.hejiascm.web.rest;

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

import com.hejiascm.blockchain.interfaces.CapitalAccDAO;
import com.hejiascm.util.MiscTool;
import com.ibm.crl.bc.hejia.sdk.capitalacc.BankTransferRecord;
import com.ibm.crl.bc.hejia.sdk.capitalacc.CapitalAccount;
import com.ibm.crl.bc.hejia.sdk.capitalacc.SubAccount;
import com.ibm.crl.bc.hejia.sdk.common.TransferRecord;

@Controller("CapitalAccRestController")
public class CapitalAccRestController {
	@Autowired
	CapitalAccDAO capDAO;
	
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
	 * @param String id, String orderFormId, String contractId, String contractVersion
	 * @return List<Order>
	 * 
	 */
	@RequestMapping(value = "/bcCapitalAcc/capital", method = RequestMethod.POST)
	@ResponseBody
	public String createCapitalAccount(@RequestBody CapitalAccount ca, HttpServletRequest req, HttpServletResponse res) {
		String capId = capDAO.createCapitalAccount(ca, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(capId != null){
			return capId;
		}else{
			res.setStatus(456);
			return "创建主账户失败";
		}
	}
	
	@RequestMapping(value = "/bcCapitalAcc/sub", method = RequestMethod.POST)
	@ResponseBody
	public String createSubAccount(@RequestBody SubAccount sub, HttpServletRequest req, HttpServletResponse res) {
		String subId = capDAO.createSubAccount(sub, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(subId != null){
			return subId;
		}else{
			res.setStatus(456);
			return "创建附属账户失败";
		}
	}
	
	@RequestMapping(value = "/bcCapitalAcc/withdraw", method = RequestMethod.POST)
	@ResponseBody
	public String createWithdrawTransfer(@RequestBody TransferRecord tr, HttpServletRequest req, HttpServletResponse res) {
		String trId = capDAO.createWithdrawTransfer(tr, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(trId != null){
			return trId;
		}else{
			res.setStatus(456);
			return "创建出金记录失败";
		}
	}
	
	@RequestMapping(value = "/bcCapitalAcc/bankTransfer/{id}", method = RequestMethod.GET)
	@ResponseBody
	public BankTransferRecord getTransferById(@PathVariable String id, HttpServletRequest req, HttpServletResponse res) {
		BankTransferRecord btr = capDAO.getBankTransferRecordById(id.replaceAll("_", "#"), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(btr != null){
			return btr;
		}else{
			//res.setStatus(456);
			return null;
		}
	}
	
	@RequestMapping(value = "/bcCapitalAcc/bankTransfer/query", method = RequestMethod.POST)
	@ResponseBody
	public BankTransferRecord[] getTransfers(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		BankTransferRecord[] btrs = capDAO.getBankTransferRecords(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(btrs != null){
			return btrs;
		}else{
			//res.setStatus(456);
			return new BankTransferRecord[0];
		}
	}
	
	@RequestMapping(value = "/bcCapitalAcc/capital/{orgId}", method = RequestMethod.GET)
	@ResponseBody
	public CapitalAccount getCapById(@PathVariable String orgId, HttpServletRequest req, HttpServletResponse res) {
		CapitalAccount ca = capDAO.getCapitalAccountByOrgId(orgId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(ca != null){
			return ca;
		}else{
			//res.setStatus(456);
			return null;
		}
	}
	
	@RequestMapping(value = "/bcCapitalAcc/sub/update", method = RequestMethod.POST)
	@ResponseBody
	public void updateCap(@RequestBody SubAccount sub, HttpServletRequest req, HttpServletResponse res) {
		capDAO.updateSubAccount(sub, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcCapitalAcc/sub/{orgId}", method = RequestMethod.GET)
	@ResponseBody
	public SubAccount getSubById(@PathVariable String orgId, HttpServletRequest req, HttpServletResponse res) {
		SubAccount sub = capDAO.getSubAccountById(orgId, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(sub != null){
			return sub;
		}else{
			//res.setStatus(456);
			return null;
		}
	}
	
	@RequestMapping(value = "/bcCapitalAcc/bankTransfer", method = RequestMethod.POST)
	@ResponseBody
	public String submitBankTransfer(@RequestBody BankTransferRecord btr, HttpServletRequest req, HttpServletResponse res) {
		String btrId = capDAO.submitBankTransferRecord(btr, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(btrId != null){
			return btrId;
		}else{
			res.setStatus(456);
			return "创建银行转账记录失败";
		}
	}
	
	@RequestMapping(value = "/bcCapitalAcc/Transfer/{id}", method = RequestMethod.GET)
	@ResponseBody
	public TransferRecord getTrById(@PathVariable String id, HttpServletRequest req, HttpServletResponse res) {
		TransferRecord tr = capDAO.getTransferRecordById(id.replaceAll("_", "#"), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(tr != null){
			return tr;
		}else{
			//res.setStatus(456);
			return null;
		}
	}
	
	@RequestMapping(value = "/bcCapitalAcc/Transfer/query", method = RequestMethod.POST)
	@ResponseBody
	public TransferRecord[] getTrs(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		System.out.println(q.getQ() + ":" + req.getHeader("Authorization"));
		TransferRecord[] trs = capDAO.getTransferRecords(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(trs != null){
			return trs;
		}else{
			//res.setStatus(456);
			return new TransferRecord[0];
		}
	}
	
	@RequestMapping(value = "/bcCapitalAcc/succeeded", method = RequestMethod.POST)
	@ResponseBody
	public String succeed(@RequestBody BankTransferRecord btr, HttpServletRequest req, HttpServletResponse res) {
		String id = capDAO.succeedToTransfer(btr,  MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(id != null){
			return id;
		}else{
			res.setStatus(456);
			return "创建银行转账记录失败";
		}
	}
	
	@RequestMapping(value = "/bcCapitalAcc/process/{transferId}/{serial}", method = RequestMethod.POST)
	@ResponseBody
	public void process(@RequestBody RemarkObject r,@PathVariable String transferId, @PathVariable String serial, HttpServletRequest req, HttpServletResponse res) {
		System.out.println("********"+transferId);
		capDAO.processTransferRecord(transferId.replaceAll("_", "#"), r.getR(), serial, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcCapitalAcc/fail/{transferId}", method = RequestMethod.POST)
	@ResponseBody
	public void fail(@RequestBody RemarkObject r,@PathVariable String transferId, HttpServletRequest req, HttpServletResponse res) {
		capDAO.failToTransfer(transferId.replaceAll("_", "#"), r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}

}
