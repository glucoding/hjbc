package com.hejiascm.web;

import com.hejiascm.dao.OperationDAO;
import com.hejiascm.dao.TradecontractDAO;

import com.hejiascm.domain.Operation;
import com.hejiascm.domain.Tradecontract;

import com.hejiascm.service.OperationService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Operation entities
 * 
 */

@Controller("OperationController")
public class OperationController {

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
	 * Show all Tradecontract entities by Operation
	 * 
	 */
	@RequestMapping("/listOperationTradecontract")
	public ModelAndView listOperationTradecontract(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("operation", operationDAO.findOperationByPrimaryKey(idKey));
		mav.setViewName("operation/tradecontract/listTradecontract.jsp");

		return mav;
	}

	/**
	 * Select the Operation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOperation")
	public ModelAndView confirmDeleteOperation(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("operation", operationDAO.findOperationByPrimaryKey(idKey));
		mav.setViewName("operation/deleteOperation.jsp");

		return mav;
	}

	/**
	 * Create a new Tradecontract entity
	 * 
	 */
	@RequestMapping("/newOperationTradecontract")
	public ModelAndView newOperationTradecontract(@RequestParam String operation_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("operation_id", operation_id);
		mav.addObject("tradecontract", new Tradecontract());
		mav.addObject("newFlag", true);
		mav.setViewName("operation/tradecontract/editTradecontract.jsp");

		return mav;
	}

	/**
	 * Delete an existing Operation entity
	 * 
	 */
	@RequestMapping("/deleteOperation")
	public String deleteOperation(@RequestParam String idKey) {
		Operation operation = operationDAO.findOperationByPrimaryKey(idKey);
		operationService.deleteOperation(operation);
		return "forward:/indexOperation";
	}

	/**
	 * Edit an existing Operation entity
	 * 
	 */
	@RequestMapping("/editOperation")
	public ModelAndView editOperation(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("operation", operationDAO.findOperationByPrimaryKey(idKey));
		mav.setViewName("operation/editOperation.jsp");

		return mav;
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/saveOperationTradecontract")
	public ModelAndView saveOperationTradecontract(@RequestParam String operation_id, @ModelAttribute Tradecontract tradecontract) {
		Operation parent_operation = operationService.saveOperationTradecontract(operation_id, tradecontract);

		ModelAndView mav = new ModelAndView();
		mav.addObject("operation_id", operation_id);
		mav.addObject("operation", parent_operation);
		mav.setViewName("operation/viewOperation.jsp");

		return mav;
	}

	/**
	 * Show all Operation entities
	 * 
	 */
	@RequestMapping("/indexOperation")
	public ModelAndView listOperations() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("operations", operationService.loadOperations());

		mav.setViewName("operation/listOperations.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/operationController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

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
	 * Select the child Tradecontract entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOperationTradecontract")
	public ModelAndView confirmDeleteOperationTradecontract(@RequestParam String operation_id, @RequestParam String related_tradecontract_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontract", tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id));
		mav.addObject("operation_id", operation_id);
		mav.setViewName("operation/tradecontract/deleteTradecontract.jsp");

		return mav;
	}

	/**
	 * Save an existing Operation entity
	 * 
	 */
	@RequestMapping("/saveOperation")
	public String saveOperation(@ModelAttribute Operation operation) {
		operationService.saveOperation(operation);
		return "forward:/indexOperation";
	}

	/**
	 * Entry point to show all Operation entities
	 * 
	 */
	public String indexOperation() {
		return "redirect:/indexOperation";
	}

	/**
	 * View an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/selectOperationTradecontract")
	public ModelAndView selectOperationTradecontract(@RequestParam String operation_id, @RequestParam String tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("operation_id", operation_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("operation/tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Select an existing Operation entity
	 * 
	 */
	@RequestMapping("/selectOperation")
	public ModelAndView selectOperation(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("operation", operationDAO.findOperationByPrimaryKey(idKey));
		mav.setViewName("operation/viewOperation.jsp");

		return mav;
	}

	/**
	 * Create a new Operation entity
	 * 
	 */
	@RequestMapping("/newOperation")
	public ModelAndView newOperation() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("operation", new Operation());
		mav.addObject("newFlag", true);
		mav.setViewName("operation/editOperation.jsp");

		return mav;
	}

	/**
	 * Edit an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/editOperationTradecontract")
	public ModelAndView editOperationTradecontract(@RequestParam String operation_id, @RequestParam String tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("operation_id", operation_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("operation/tradecontract/editTradecontract.jsp");

		return mav;
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/deleteOperationTradecontract")
	public ModelAndView deleteOperationTradecontract(@RequestParam String operation_id, @RequestParam String related_tradecontract_id) {
		ModelAndView mav = new ModelAndView();

		Operation operation = operationService.deleteOperationTradecontract(operation_id, related_tradecontract_id);

		mav.addObject("operation_id", operation_id);
		mav.addObject("operation", operation);
		mav.setViewName("operation/viewOperation.jsp");

		return mav;
	}
}