package com.hejiascm.web;

import com.hejiascm.dao.ParticipantDAO;
import com.hejiascm.dao.TradecontractDAO;

import com.hejiascm.domain.Participant;
import com.hejiascm.domain.Tradecontract;

import com.hejiascm.service.ParticipantService;

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
 * Spring MVC controller that handles CRUD requests for Participant entities
 * 
 */

@Controller("ParticipantController")
public class ParticipantController {

	/**
	 * DAO injected by Spring that manages Participant entities
	 * 
	 */
	@Autowired
	private ParticipantDAO participantDAO;

	/**
	 * DAO injected by Spring that manages Tradecontract entities
	 * 
	 */
	@Autowired
	private TradecontractDAO tradecontractDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Participant entities
	 * 
	 */
	@Autowired
	private ParticipantService participantService;

	/**
	 * Show all Participant entities
	 * 
	 */
	@RequestMapping("/indexParticipant")
	public ModelAndView listParticipants() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("participants", participantService.loadParticipants());

		mav.setViewName("participant/listParticipants.jsp");

		return mav;
	}

	/**
	 * Edit an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/editParticipantTradecontract")
	public ModelAndView editParticipantTradecontract(@RequestParam String participant_id, @RequestParam String tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("participant_id", participant_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("participant/tradecontract/editTradecontract.jsp");

		return mav;
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/deleteParticipantTradecontract")
	public ModelAndView deleteParticipantTradecontract(@RequestParam String participant_id, @RequestParam String related_tradecontract_id) {
		ModelAndView mav = new ModelAndView();

		Participant participant = participantService.deleteParticipantTradecontract(participant_id, related_tradecontract_id);

		mav.addObject("participant_id", participant_id);
		mav.addObject("participant", participant);
		mav.setViewName("participant/viewParticipant.jsp");

		return mav;
	}

	/**
	 * Save an existing Participant entity
	 * 
	 */
	@RequestMapping("/saveParticipant")
	public String saveParticipant(@ModelAttribute Participant participant) {
		participantService.saveParticipant(participant);
		return "forward:/indexParticipant";
	}

	/**
	 * Create a new Tradecontract entity
	 * 
	 */
	@RequestMapping("/newParticipantTradecontract")
	public ModelAndView newParticipantTradecontract(@RequestParam String participant_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("participant_id", participant_id);
		mav.addObject("tradecontract", new Tradecontract());
		mav.addObject("newFlag", true);
		mav.setViewName("participant/tradecontract/editTradecontract.jsp");

		return mav;
	}

	/**
	 * Delete an existing Participant entity
	 * 
	 */
	@RequestMapping("/deleteParticipant")
	public String deleteParticipant(@RequestParam String idKey) {
		Participant participant = participantDAO.findParticipantByPrimaryKey(idKey);
		participantService.deleteParticipant(participant);
		return "forward:/indexParticipant";
	}

	/**
	 * Select the Participant entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteParticipant")
	public ModelAndView confirmDeleteParticipant(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("participant", participantDAO.findParticipantByPrimaryKey(idKey));
		mav.setViewName("participant/deleteParticipant.jsp");

		return mav;
	}

	/**
	 * Create a new Participant entity
	 * 
	 */
	@RequestMapping("/newParticipant")
	public ModelAndView newParticipant() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("participant", new Participant());
		mav.addObject("newFlag", true);
		mav.setViewName("participant/editParticipant.jsp");

		return mav;
	}

	/**
	 * View an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/selectParticipantTradecontract")
	public ModelAndView selectParticipantTradecontract(@RequestParam String participant_id, @RequestParam String tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("participant_id", participant_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("participant/tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Show all Tradecontract entities by Participant
	 * 
	 */
	@RequestMapping("/listParticipantTradecontract")
	public ModelAndView listParticipantTradecontract(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("participant", participantDAO.findParticipantByPrimaryKey(idKey));
		mav.setViewName("participant/tradecontract/listTradecontract.jsp");

		return mav;
	}

	/**
	 * Select an existing Participant entity
	 * 
	 */
	@RequestMapping("/selectParticipant")
	public ModelAndView selectParticipant(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("participant", participantDAO.findParticipantByPrimaryKey(idKey));
		mav.setViewName("participant/viewParticipant.jsp");

		return mav;
	}

	/**
	 * Edit an existing Participant entity
	 * 
	 */
	@RequestMapping("/editParticipant")
	public ModelAndView editParticipant(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("participant", participantDAO.findParticipantByPrimaryKey(idKey));
		mav.setViewName("participant/editParticipant.jsp");

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
	@RequestMapping("/confirmDeleteParticipantTradecontract")
	public ModelAndView confirmDeleteParticipantTradecontract(@RequestParam String participant_id, @RequestParam String related_tradecontract_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontract", tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id));
		mav.addObject("participant_id", participant_id);
		mav.setViewName("participant/tradecontract/deleteTradecontract.jsp");

		return mav;
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/saveParticipantTradecontract")
	public ModelAndView saveParticipantTradecontract(@RequestParam String participant_id, @ModelAttribute Tradecontract tradecontract) {
		Participant parent_participant = participantService.saveParticipantTradecontract(participant_id, tradecontract);

		ModelAndView mav = new ModelAndView();
		mav.addObject("participant_id", participant_id);
		mav.addObject("participant", parent_participant);
		mav.setViewName("participant/viewParticipant.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Participant entities
	 * 
	 */
	public String indexParticipant() {
		return "redirect:/indexParticipant";
	}

	/**
	 */
	@RequestMapping("/participantController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}
}