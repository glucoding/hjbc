package com.hejiascm.web.rest;

import com.hejiascm.dao.TermDAO;
import com.hejiascm.dao.TradecontractDAO;

import com.hejiascm.domain.Term;
import com.hejiascm.domain.Tradecontract;

import com.hejiascm.service.TermService;

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
 * Spring Rest controller that handles CRUD requests for Term entities
 * 
 */

@Controller("TermRestController")
public class TermRestController {

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
	 * Delete an existing Term entity
	 * 
	 */
	@RequestMapping(value = "/Term/{term_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTerm(@PathVariable String term_id) {
		Term term = termDAO.findTermByPrimaryKey(term_id);
		termService.deleteTerm(term);
	}

	/**
	 * View an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Term/{term_id}/tradecontract/{tradecontract_id}", method = RequestMethod.GET)
	@ResponseBody
	public Tradecontract loadTermTradecontract(@PathVariable String term_id, @PathVariable String related_tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id, -1, -1);

		return tradecontract;
	}

	/**
	 * Save an existing Term entity
	 * 
	 */
	@RequestMapping(value = "/Term", method = RequestMethod.PUT)
	@ResponseBody
	public Term saveTerm(@RequestBody Term term) {
		termService.saveTerm(term);
		return termDAO.findTermByPrimaryKey(term.getId());
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Term/{term_id}/tradecontract/{tradecontract_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTermTradecontract(@PathVariable String term_id, @PathVariable String related_tradecontract_id) {
		termService.deleteTermTradecontract(term_id, related_tradecontract_id);
	}

	/**
	 * Create a new Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Term/{term_id}/tradecontract", method = RequestMethod.POST)
	@ResponseBody
	public Tradecontract newTermTradecontract(@PathVariable String term_id, @RequestBody Tradecontract tradecontract) {
		termService.saveTermTradecontract(term_id, tradecontract);
		return tradecontractDAO.findTradecontractByPrimaryKey(tradecontract.getId());
	}

	/**
	 * Get Tradecontract entity by Term
	 * 
	 */
	@RequestMapping(value = "/Term/{term_id}/tradecontract", method = RequestMethod.GET)
	@ResponseBody
	public Tradecontract getTermTradecontract(@PathVariable String term_id) {
		return termDAO.findTermByPrimaryKey(term_id).getTradecontract();
	}

	/**
	 * Show all Term entities
	 * 
	 */
	@RequestMapping(value = "/Term", method = RequestMethod.GET)
	@ResponseBody
	public List<Term> listTerms() {
		return new java.util.ArrayList<Term>(termService.loadTerms());
	}

	/**
	 * Create a new Term entity
	 * 
	 */
	@RequestMapping(value = "/Term", method = RequestMethod.POST)
	@ResponseBody
	public Term newTerm(@RequestBody Term term) {
		termService.saveTerm(term);
		return termDAO.findTermByPrimaryKey(term.getId());
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Term/{term_id}/tradecontract", method = RequestMethod.PUT)
	@ResponseBody
	public Tradecontract saveTermTradecontract(@PathVariable String term_id, @RequestBody Tradecontract tradecontract) {
		termService.saveTermTradecontract(term_id, tradecontract);
		return tradecontractDAO.findTradecontractByPrimaryKey(tradecontract.getId());
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
	 * Select an existing Term entity
	 * 
	 */
	@RequestMapping(value = "/Term/{term_id}", method = RequestMethod.GET)
	@ResponseBody
	public Term loadTerm(@PathVariable String term_id) {
		return termDAO.findTermByPrimaryKey(term_id);
	}
}