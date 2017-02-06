package com.hejiascm.web;

import com.hejiascm.dao.TradecontractDAO;
import com.hejiascm.dao.TradecontractattachmentDAO;

import com.hejiascm.domain.Tradecontract;
import com.hejiascm.domain.Tradecontractattachment;

import com.hejiascm.service.TradecontractattachmentService;

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
 * Spring MVC controller that handles CRUD requests for Tradecontractattachment entities
 * 
 */

@Controller("TradecontractattachmentController")
public class TradecontractattachmentController {

	/**
	 * DAO injected by Spring that manages Tradecontract entities
	 * 
	 */
	@Autowired
	private TradecontractDAO tradecontractDAO;

	/**
	 * DAO injected by Spring that manages Tradecontractattachment entities
	 * 
	 */
	@Autowired
	private TradecontractattachmentDAO tradecontractattachmentDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Tradecontractattachment entities
	 * 
	 */
	@Autowired
	private TradecontractattachmentService tradecontractattachmentService;

	/**
	 * Entry point to show all Tradecontractattachment entities
	 * 
	 */
	public String indexTradecontractattachment() {
		return "redirect:/indexTradecontractattachment";
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/saveTradecontractattachmentTradecontract")
	public ModelAndView saveTradecontractattachmentTradecontract(@RequestParam String tradecontractattachment_id, @ModelAttribute Tradecontract tradecontract) {
		Tradecontractattachment parent_tradecontractattachment = tradecontractattachmentService.saveTradecontractattachmentTradecontract(tradecontractattachment_id, tradecontract);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontractattachment_id", tradecontractattachment_id);
		mav.addObject("tradecontractattachment", parent_tradecontractattachment);
		mav.setViewName("tradecontractattachment/viewTradecontractattachment.jsp");

		return mav;
	}

	/**
	 * View an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/selectTradecontractattachmentTradecontract")
	public ModelAndView selectTradecontractattachmentTradecontract(@RequestParam String tradecontractattachment_id, @RequestParam String tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontractattachment_id", tradecontractattachment_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("tradecontractattachment/tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Select an existing Tradecontractattachment entity
	 * 
	 */
	@RequestMapping("/selectTradecontractattachment")
	public ModelAndView selectTradecontractattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontractattachment", tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(idKey));
		mav.setViewName("tradecontractattachment/viewTradecontractattachment.jsp");

		return mav;
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/deleteTradecontractattachmentTradecontract")
	public ModelAndView deleteTradecontractattachmentTradecontract(@RequestParam String tradecontractattachment_id, @RequestParam String related_tradecontract_id) {
		ModelAndView mav = new ModelAndView();

		Tradecontractattachment tradecontractattachment = tradecontractattachmentService.deleteTradecontractattachmentTradecontract(tradecontractattachment_id, related_tradecontract_id);

		mav.addObject("tradecontractattachment_id", tradecontractattachment_id);
		mav.addObject("tradecontractattachment", tradecontractattachment);
		mav.setViewName("tradecontractattachment/viewTradecontractattachment.jsp");

		return mav;
	}

	/**
	 * Show all Tradecontract entities by Tradecontractattachment
	 * 
	 */
	@RequestMapping("/listTradecontractattachmentTradecontract")
	public ModelAndView listTradecontractattachmentTradecontract(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontractattachment", tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(idKey));
		mav.setViewName("tradecontractattachment/tradecontract/listTradecontract.jsp");

		return mav;
	}

	/**
	 * Edit an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/editTradecontractattachmentTradecontract")
	public ModelAndView editTradecontractattachmentTradecontract(@RequestParam String tradecontractattachment_id, @RequestParam String tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontractattachment_id", tradecontractattachment_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("tradecontractattachment/tradecontract/editTradecontract.jsp");

		return mav;
	}

	/**
	 * Delete an existing Tradecontractattachment entity
	 * 
	 */
	@RequestMapping("/deleteTradecontractattachment")
	public String deleteTradecontractattachment(@RequestParam String idKey) {
		Tradecontractattachment tradecontractattachment = tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(idKey);
		tradecontractattachmentService.deleteTradecontractattachment(tradecontractattachment);
		return "forward:/indexTradecontractattachment";
	}

	/**
	 * Edit an existing Tradecontractattachment entity
	 * 
	 */
	@RequestMapping("/editTradecontractattachment")
	public ModelAndView editTradecontractattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontractattachment", tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(idKey));
		mav.setViewName("tradecontractattachment/editTradecontractattachment.jsp");

		return mav;
	}

	/**
	 * Select the child Tradecontract entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTradecontractattachmentTradecontract")
	public ModelAndView confirmDeleteTradecontractattachmentTradecontract(@RequestParam String tradecontractattachment_id, @RequestParam String related_tradecontract_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontract", tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id));
		mav.addObject("tradecontractattachment_id", tradecontractattachment_id);
		mav.setViewName("tradecontractattachment/tradecontract/deleteTradecontract.jsp");

		return mav;
	}

	/**
	 * Select the Tradecontractattachment entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTradecontractattachment")
	public ModelAndView confirmDeleteTradecontractattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontractattachment", tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(idKey));
		mav.setViewName("tradecontractattachment/deleteTradecontractattachment.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/tradecontractattachmentController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new Tradecontractattachment entity
	 * 
	 */
	@RequestMapping("/newTradecontractattachment")
	public ModelAndView newTradecontractattachment() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontractattachment", new Tradecontractattachment());
		mav.addObject("newFlag", true);
		mav.setViewName("tradecontractattachment/editTradecontractattachment.jsp");

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
	 * Show all Tradecontractattachment entities
	 * 
	 */
	@RequestMapping("/indexTradecontractattachment")
	public ModelAndView listTradecontractattachments() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontractattachments", tradecontractattachmentService.loadTradecontractattachments());

		mav.setViewName("tradecontractattachment/listTradecontractattachments.jsp");

		return mav;
	}

	/**
	 * Create a new Tradecontract entity
	 * 
	 */
	@RequestMapping("/newTradecontractattachmentTradecontract")
	public ModelAndView newTradecontractattachmentTradecontract(@RequestParam String tradecontractattachment_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontractattachment_id", tradecontractattachment_id);
		mav.addObject("tradecontract", new Tradecontract());
		mav.addObject("newFlag", true);
		mav.setViewName("tradecontractattachment/tradecontract/editTradecontract.jsp");

		return mav;
	}

	/**
	 * Save an existing Tradecontractattachment entity
	 * 
	 */
	@RequestMapping("/saveTradecontractattachment")
	public String saveTradecontractattachment(@ModelAttribute Tradecontractattachment tradecontractattachment) {
		tradecontractattachmentService.saveTradecontractattachment(tradecontractattachment);
		return "forward:/indexTradecontractattachment";
	}
}