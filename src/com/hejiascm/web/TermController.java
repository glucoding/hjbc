package com.hejiascm.web;

import com.hejiascm.dao.TermDAO;
import com.hejiascm.dao.TradecontractDAO;

import com.hejiascm.domain.Term;
import com.hejiascm.domain.Tradecontract;

import com.hejiascm.service.TermService;

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
 * Spring MVC controller that handles CRUD requests for Term entities
 * 
 */

@Controller("TermController")
public class TermController {

	/**
	 * DAO injected by Spring that manages Term entities
	 * 
	 */
	@Autowired
	private TermDAO termDAO;

	/**
	 * DAO injected by Spring that manages Tradecontract entities
	 * 
	 */
	@Autowired
	private TradecontractDAO tradecontractDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Term entities
	 * 
	 */
	@Autowired
	private TermService termService;

	/**
	 * Edit an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/editTermTradecontract")
	public ModelAndView editTermTradecontract(@RequestParam String term_id, @RequestParam String tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("term_id", term_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("term/tradecontract/editTradecontract.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Term entities
	 * 
	 */
	public String indexTerm() {
		return "redirect:/indexTerm";
	}

	/**
	 * View an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/selectTermTradecontract")
	public ModelAndView selectTermTradecontract(@RequestParam String term_id, @RequestParam String tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("term_id", term_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("term/tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Show all Tradecontract entities by Term
	 * 
	 */
	@RequestMapping("/listTermTradecontract")
	public ModelAndView listTermTradecontract(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("term", termDAO.findTermByPrimaryKey(idKey));
		mav.setViewName("term/tradecontract/listTradecontract.jsp");

		return mav;
	}

	/**
	 * Create a new Term entity
	 * 
	 */
	@RequestMapping("/newTerm")
	public ModelAndView newTerm() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("term", new Term());
		mav.addObject("newFlag", true);
		mav.setViewName("term/editTerm.jsp");

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
	@RequestMapping("/confirmDeleteTermTradecontract")
	public ModelAndView confirmDeleteTermTradecontract(@RequestParam String term_id, @RequestParam String related_tradecontract_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontract", tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id));
		mav.addObject("term_id", term_id);
		mav.setViewName("term/tradecontract/deleteTradecontract.jsp");

		return mav;
	}

	/**
	 * Create a new Tradecontract entity
	 * 
	 */
	@RequestMapping("/newTermTradecontract")
	public ModelAndView newTermTradecontract(@RequestParam String term_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("term_id", term_id);
		mav.addObject("tradecontract", new Tradecontract());
		mav.addObject("newFlag", true);
		mav.setViewName("term/tradecontract/editTradecontract.jsp");

		return mav;
	}

	/**
	 * Select the Term entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTerm")
	public ModelAndView confirmDeleteTerm(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("term", termDAO.findTermByPrimaryKey(idKey));
		mav.setViewName("term/deleteTerm.jsp");

		return mav;
	}

	/**
	 * Delete an existing Term entity
	 * 
	 */
	@RequestMapping("/deleteTerm")
	public String deleteTerm(@RequestParam String idKey) {
		Term term = termDAO.findTermByPrimaryKey(idKey);
		termService.deleteTerm(term);
		return "forward:/indexTerm";
	}

	/**
	 * Save an existing Term entity
	 * 
	 */
	@RequestMapping("/saveTerm")
	public String saveTerm(@ModelAttribute Term term) {
		termService.saveTerm(term);
		return "forward:/indexTerm";
	}

	/**
	 */
	@RequestMapping("/termController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing Term entity
	 * 
	 */
	@RequestMapping("/editTerm")
	public ModelAndView editTerm(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("term", termDAO.findTermByPrimaryKey(idKey));
		mav.setViewName("term/editTerm.jsp");

		return mav;
	}

	/**
	 * Show all Term entities
	 * 
	 */
	@RequestMapping("/indexTerm")
	public ModelAndView listTerms() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("terms", termService.loadTerms());

		mav.setViewName("term/listTerms.jsp");

		return mav;
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/saveTermTradecontract")
	public ModelAndView saveTermTradecontract(@RequestParam String term_id, @ModelAttribute Tradecontract tradecontract) {
		Term parent_term = termService.saveTermTradecontract(term_id, tradecontract);

		ModelAndView mav = new ModelAndView();
		mav.addObject("term_id", term_id);
		mav.addObject("term", parent_term);
		mav.setViewName("term/viewTerm.jsp");

		return mav;
	}

	/**
	 * Select an existing Term entity
	 * 
	 */
	@RequestMapping("/selectTerm")
	public ModelAndView selectTerm(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("term", termDAO.findTermByPrimaryKey(idKey));
		mav.setViewName("term/viewTerm.jsp");

		return mav;
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/deleteTermTradecontract")
	public ModelAndView deleteTermTradecontract(@RequestParam String term_id, @RequestParam String related_tradecontract_id) {
		ModelAndView mav = new ModelAndView();

		Term term = termService.deleteTermTradecontract(term_id, related_tradecontract_id);

		mav.addObject("term_id", term_id);
		mav.addObject("term", term);
		mav.setViewName("term/viewTerm.jsp");

		return mav;
	}
}