package com.hejiascm.web;

import com.hejiascm.dao.ContractgoodsDAO;
import com.hejiascm.dao.TradecontractDAO;

import com.hejiascm.domain.Contractgoods;
import com.hejiascm.domain.Tradecontract;

import com.hejiascm.service.ContractgoodsService;

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
 * Spring MVC controller that handles CRUD requests for Contractgoods entities
 * 
 */

@Controller("ContractgoodsController")
public class ContractgoodsController {

	/**
	 * DAO injected by Spring that manages Contractgoods entities
	 * 
	 */
	@Autowired
	private ContractgoodsDAO contractgoodsDAO;

	/**
	 * DAO injected by Spring that manages Tradecontract entities
	 * 
	 */
	@Autowired
	private TradecontractDAO tradecontractDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Contractgoods entities
	 * 
	 */
	@Autowired
	private ContractgoodsService contractgoodsService;

	/**
	 * Edit an existing Contractgoods entity
	 * 
	 */
	@RequestMapping("/editContractgoods")
	public ModelAndView editContractgoods(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("contractgoods", contractgoodsDAO.findContractgoodsByPrimaryKey(idKey));
		mav.setViewName("contractgoods/editContractgoods.jsp");

		return mav;
	}

	/**
	 * Edit an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/editContractgoodsTradecontract")
	public ModelAndView editContractgoodsTradecontract(@RequestParam String contractgoods_id, @RequestParam String tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("contractgoods_id", contractgoods_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("contractgoods/tradecontract/editTradecontract.jsp");

		return mav;
	}

	/**
	 * Create a new Tradecontract entity
	 * 
	 */
	@RequestMapping("/newContractgoodsTradecontract")
	public ModelAndView newContractgoodsTradecontract(@RequestParam String contractgoods_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("contractgoods_id", contractgoods_id);
		mav.addObject("tradecontract", new Tradecontract());
		mav.addObject("newFlag", true);
		mav.setViewName("contractgoods/tradecontract/editTradecontract.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/contractgoodsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/deleteContractgoodsTradecontract")
	public ModelAndView deleteContractgoodsTradecontract(@RequestParam String contractgoods_id, @RequestParam String related_tradecontract_id) {
		ModelAndView mav = new ModelAndView();

		Contractgoods contractgoods = contractgoodsService.deleteContractgoodsTradecontract(contractgoods_id, related_tradecontract_id);

		mav.addObject("contractgoods_id", contractgoods_id);
		mav.addObject("contractgoods", contractgoods);
		mav.setViewName("contractgoods/viewContractgoods.jsp");

		return mav;
	}

	/**
	 * Show all Contractgoods entities
	 * 
	 */
	@RequestMapping("/indexContractgoods")
	public ModelAndView listContractgoodss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("contractgoodss", contractgoodsService.loadContractgoodss());

		mav.setViewName("contractgoods/listContractgoodss.jsp");

		return mav;
	}

	/**
	 * Show all Tradecontract entities by Contractgoods
	 * 
	 */
	@RequestMapping("/listContractgoodsTradecontract")
	public ModelAndView listContractgoodsTradecontract(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("contractgoods", contractgoodsDAO.findContractgoodsByPrimaryKey(idKey));
		mav.setViewName("contractgoods/tradecontract/listTradecontract.jsp");

		return mav;
	}

	/**
	 * Select an existing Contractgoods entity
	 * 
	 */
	@RequestMapping("/selectContractgoods")
	public ModelAndView selectContractgoods(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("contractgoods", contractgoodsDAO.findContractgoodsByPrimaryKey(idKey));
		mav.setViewName("contractgoods/viewContractgoods.jsp");

		return mav;
	}

	/**
	 * Create a new Contractgoods entity
	 * 
	 */
	@RequestMapping("/newContractgoods")
	public ModelAndView newContractgoods() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("contractgoods", new Contractgoods());
		mav.addObject("newFlag", true);
		mav.setViewName("contractgoods/editContractgoods.jsp");

		return mav;
	}

	/**
	 * View an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/selectContractgoodsTradecontract")
	public ModelAndView selectContractgoodsTradecontract(@RequestParam String contractgoods_id, @RequestParam String tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("contractgoods_id", contractgoods_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("contractgoods/tradecontract/viewTradecontract.jsp");

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
	 * Delete an existing Contractgoods entity
	 * 
	 */
	@RequestMapping("/deleteContractgoods")
	public String deleteContractgoods(@RequestParam String idKey) {
		Contractgoods contractgoods = contractgoodsDAO.findContractgoodsByPrimaryKey(idKey);
		contractgoodsService.deleteContractgoods(contractgoods);
		return "forward:/indexContractgoods";
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/saveContractgoodsTradecontract")
	public ModelAndView saveContractgoodsTradecontract(@RequestParam String contractgoods_id, @ModelAttribute Tradecontract tradecontract) {
		Contractgoods parent_contractgoods = contractgoodsService.saveContractgoodsTradecontract(contractgoods_id, tradecontract);

		ModelAndView mav = new ModelAndView();
		mav.addObject("contractgoods_id", contractgoods_id);
		mav.addObject("contractgoods", parent_contractgoods);
		mav.setViewName("contractgoods/viewContractgoods.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Contractgoods entities
	 * 
	 */
	public String indexContractgoods() {
		return "redirect:/indexContractgoods";
	}

	/**
	 * Select the child Tradecontract entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteContractgoodsTradecontract")
	public ModelAndView confirmDeleteContractgoodsTradecontract(@RequestParam String contractgoods_id, @RequestParam String related_tradecontract_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontract", tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id));
		mav.addObject("contractgoods_id", contractgoods_id);
		mav.setViewName("contractgoods/tradecontract/deleteTradecontract.jsp");

		return mav;
	}

	/**
	 * Select the Contractgoods entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteContractgoods")
	public ModelAndView confirmDeleteContractgoods(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("contractgoods", contractgoodsDAO.findContractgoodsByPrimaryKey(idKey));
		mav.setViewName("contractgoods/deleteContractgoods.jsp");

		return mav;
	}

	/**
	 * Save an existing Contractgoods entity
	 * 
	 */
	@RequestMapping("/saveContractgoods")
	public String saveContractgoods(@ModelAttribute Contractgoods contractgoods) {
		contractgoodsService.saveContractgoods(contractgoods);
		return "forward:/indexContractgoods";
	}
}