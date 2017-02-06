package com.hejiascm.web.rest;

import com.hejiascm.dao.OperationDAO;
import com.hejiascm.dao.TradecontractDAO;

import com.hejiascm.domain.Operation;
import com.hejiascm.domain.Tradecontract;

import com.hejiascm.service.OperationService;

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
 * Spring Rest controller that handles CRUD requests for Operation entities
 * 
 */

@Controller("OperationRestController")
public class OperationRestController {

	/**
	 * DAO injected by Spring that manages Operation entities
	 * 
	 */
	@Autowired
	private OperationDAO operationDAO;

	/**
	 * DAO injected by Spring that manages Tradecontract entities
	 * 
	 */
	@Autowired
	private TradecontractDAO tradecontractDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Operation entities
	 * 
	 */
	@Autowired
	private OperationService operationService;

	/**
	 * Save an existing Operation entity
	 * 
	 */
	@RequestMapping(value = "/Operation", method = RequestMethod.PUT)
	@ResponseBody
	public Operation saveOperation(@RequestBody Operation operation) {
		operationService.saveOperation(operation);
		return operationDAO.findOperationByPrimaryKey(operation.getId());
	}

	/**
	 * Show all Operation entities
	 * 
	 */
	@RequestMapping(value = "/Operation", method = RequestMethod.GET)
	@ResponseBody
	public List<Operation> listOperations() {
		return new java.util.ArrayList<Operation>(operationService.loadOperations());
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Operation/{operation_id}/tradecontract", method = RequestMethod.PUT)
	@ResponseBody
	public Tradecontract saveOperationTradecontract(@PathVariable String operation_id, @RequestBody Tradecontract tradecontract) {
		operationService.saveOperationTradecontract(operation_id, tradecontract);
		return tradecontractDAO.findTradecontractByPrimaryKey(tradecontract.getId());
	}

	/**
	 * View an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Operation/{operation_id}/tradecontract/{tradecontract_id}", method = RequestMethod.GET)
	@ResponseBody
	public Tradecontract loadOperationTradecontract(@PathVariable String operation_id, @PathVariable String related_tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id, -1, -1);

		return tradecontract;
	}

	/**
	 * Create a new Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Operation/{operation_id}/tradecontract", method = RequestMethod.POST)
	@ResponseBody
	public Tradecontract newOperationTradecontract(@PathVariable String operation_id, @RequestBody Tradecontract tradecontract) {
		operationService.saveOperationTradecontract(operation_id, tradecontract);
		return tradecontractDAO.findTradecontractByPrimaryKey(tradecontract.getId());
	}

	/**
	 * Get Tradecontract entity by Operation
	 * 
	 */
	@RequestMapping(value = "/Operation/{operation_id}/tradecontract", method = RequestMethod.GET)
	@ResponseBody
	public Tradecontract getOperationTradecontract(@PathVariable String operation_id) {
		return operationDAO.findOperationByPrimaryKey(operation_id).getTradecontract();
	}

	/**
	 * Create a new Operation entity
	 * 
	 */
	@RequestMapping(value = "/Operation", method = RequestMethod.POST)
	@ResponseBody
	public Operation newOperation(@RequestBody Operation operation) {
		operationService.saveOperation(operation);
		return operationDAO.findOperationByPrimaryKey(operation.getId());
	}

	/**
	 * Select an existing Operation entity
	 * 
	 */
	@RequestMapping(value = "/Operation/{operation_id}", method = RequestMethod.GET)
	@ResponseBody
	public Operation loadOperation(@PathVariable String operation_id) {
		return operationDAO.findOperationByPrimaryKey(operation_id);
	}

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
	 * Delete an existing Operation entity
	 * 
	 */
	@RequestMapping(value = "/Operation/{operation_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOperation(@PathVariable String operation_id) {
		Operation operation = operationDAO.findOperationByPrimaryKey(operation_id);
		operationService.deleteOperation(operation);
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Operation/{operation_id}/tradecontract/{tradecontract_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOperationTradecontract(@PathVariable String operation_id, @PathVariable String related_tradecontract_id) {
		operationService.deleteOperationTradecontract(operation_id, related_tradecontract_id);
	}
}