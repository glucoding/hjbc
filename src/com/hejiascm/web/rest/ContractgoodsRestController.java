package com.hejiascm.web.rest;

import com.hejiascm.dao.ContractgoodsDAO;
import com.hejiascm.dao.TradecontractDAO;

import com.hejiascm.domain.Contractgoods;
import com.hejiascm.domain.Tradecontract;

import com.hejiascm.service.ContractgoodsService;

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
 * Spring Rest controller that handles CRUD requests for Contractgoods entities
 * 
 */

@Controller("ContractgoodsRestController")
public class ContractgoodsRestController {

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
	 * Save an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Contractgoods/{contractgoods_id}/tradecontract", method = RequestMethod.PUT)
	@ResponseBody
	public Tradecontract saveContractgoodsTradecontract(@PathVariable String contractgoods_id, @RequestBody Tradecontract tradecontract) {
		contractgoodsService.saveContractgoodsTradecontract(contractgoods_id, tradecontract);
		return tradecontractDAO.findTradecontractByPrimaryKey(tradecontract.getId());
	}

	/**
	 * Create a new Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Contractgoods/{contractgoods_id}/tradecontract", method = RequestMethod.POST)
	@ResponseBody
	public Tradecontract newContractgoodsTradecontract(@PathVariable String contractgoods_id, @RequestBody Tradecontract tradecontract) {
		contractgoodsService.saveContractgoodsTradecontract(contractgoods_id, tradecontract);
		return tradecontractDAO.findTradecontractByPrimaryKey(tradecontract.getId());
	}

	/**
	 * Show all Contractgoods entities
	 * 
	 */
	@RequestMapping(value = "/Contractgoods", method = RequestMethod.GET)
	@ResponseBody
	public List<Contractgoods> listContractgoodss() {
		return new java.util.ArrayList<Contractgoods>(contractgoodsService.loadContractgoodss());
	}

	/**
	 * Select an existing Contractgoods entity
	 * 
	 */
	@RequestMapping(value = "/Contractgoods/{contractgoods_id}", method = RequestMethod.GET)
	@ResponseBody
	public Contractgoods loadContractgoods(@PathVariable String contractgoods_id) {
		return contractgoodsDAO.findContractgoodsByPrimaryKey(contractgoods_id);
	}

	/**
	 * Create a new Contractgoods entity
	 * 
	 */
	@RequestMapping(value = "/Contractgoods", method = RequestMethod.POST)
	@ResponseBody
	public Contractgoods newContractgoods(@RequestBody Contractgoods contractgoods) {
		contractgoodsService.saveContractgoods(contractgoods);
		return contractgoodsDAO.findContractgoodsByPrimaryKey(contractgoods.getId());
	}

	/**
	 * View an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Contractgoods/{contractgoods_id}/tradecontract/{tradecontract_id}", method = RequestMethod.GET)
	@ResponseBody
	public Tradecontract loadContractgoodsTradecontract(@PathVariable String contractgoods_id, @PathVariable String related_tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id, -1, -1);

		return tradecontract;
	}

	/**
	 * Delete an existing Contractgoods entity
	 * 
	 */
	@RequestMapping(value = "/Contractgoods/{contractgoods_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteContractgoods(@PathVariable String contractgoods_id) {
		Contractgoods contractgoods = contractgoodsDAO.findContractgoodsByPrimaryKey(contractgoods_id);
		contractgoodsService.deleteContractgoods(contractgoods);
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Contractgoods/{contractgoods_id}/tradecontract/{tradecontract_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteContractgoodsTradecontract(@PathVariable String contractgoods_id, @PathVariable String related_tradecontract_id) {
		contractgoodsService.deleteContractgoodsTradecontract(contractgoods_id, related_tradecontract_id);
	}

	/**
	 * Get Tradecontract entity by Contractgoods
	 * 
	 */
	@RequestMapping(value = "/Contractgoods/{contractgoods_id}/tradecontract", method = RequestMethod.GET)
	@ResponseBody
	public Tradecontract getContractgoodsTradecontract(@PathVariable String contractgoods_id) {
		return contractgoodsDAO.findContractgoodsByPrimaryKey(contractgoods_id).getTradecontract();
	}

	/**
	 * Save an existing Contractgoods entity
	 * 
	 */
	@RequestMapping(value = "/Contractgoods", method = RequestMethod.PUT)
	@ResponseBody
	public Contractgoods saveContractgoods(@RequestBody Contractgoods contractgoods) {
		contractgoodsService.saveContractgoods(contractgoods);
		return contractgoodsDAO.findContractgoodsByPrimaryKey(contractgoods.getId());
	}
}