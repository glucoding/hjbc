package com.hejiascm.web.rest;

import com.hejiascm.dao.ParticipantDAO;
import com.hejiascm.dao.TradecontractDAO;

import com.hejiascm.domain.Participant;
import com.hejiascm.domain.Tradecontract;

import com.hejiascm.service.ParticipantService;

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
 * Spring Rest controller that handles CRUD requests for Participant entities
 * 
 */

@Controller("ParticipantRestController")
public class ParticipantRestController {

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
	 * View an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Participant/{participant_id}/tradecontract/{tradecontract_id}", method = RequestMethod.GET)
	@ResponseBody
	public Tradecontract loadParticipantTradecontract(@PathVariable String participant_id, @PathVariable String related_tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id, -1, -1);

		return tradecontract;
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Participant/{participant_id}/tradecontract", method = RequestMethod.PUT)
	@ResponseBody
	public Tradecontract saveParticipantTradecontract(@PathVariable String participant_id, @RequestBody Tradecontract tradecontract) {
		participantService.saveParticipantTradecontract(participant_id, tradecontract);
		return tradecontractDAO.findTradecontractByPrimaryKey(tradecontract.getId());
	}

	/**
	 * Select an existing Participant entity
	 * 
	 */
	@RequestMapping(value = "/Participant/{participant_id}", method = RequestMethod.GET)
	@ResponseBody
	public Participant loadParticipant(@PathVariable String participant_id) {
		return participantDAO.findParticipantByPrimaryKey(participant_id);
	}

	/**
	 * Show all Participant entities
	 * 
	 */
	@RequestMapping(value = "/Participant", method = RequestMethod.GET)
	@ResponseBody
	public List<Participant> listParticipants() {
		return new java.util.ArrayList<Participant>(participantService.loadParticipants());
	}

	/**
	 * Save an existing Participant entity
	 * 
	 */
	@RequestMapping(value = "/Participant", method = RequestMethod.PUT)
	@ResponseBody
	public Participant saveParticipant(@RequestBody Participant participant) {
		participantService.saveParticipant(participant);
		return participantDAO.findParticipantByPrimaryKey(participant.getId());
	}

	/**
	 * Get Tradecontract entity by Participant
	 * 
	 */
	@RequestMapping(value = "/Participant/{participant_id}/tradecontract", method = RequestMethod.GET)
	@ResponseBody
	public Tradecontract getParticipantTradecontract(@PathVariable String participant_id) {
		return participantDAO.findParticipantByPrimaryKey(participant_id).getTradecontract();
	}

	/**
	 * Delete an existing Participant entity
	 * 
	 */
	@RequestMapping(value = "/Participant/{participant_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteParticipant(@PathVariable String participant_id) {
		Participant participant = participantDAO.findParticipantByPrimaryKey(participant_id);
		participantService.deleteParticipant(participant);
	}

	/**
	 * Create a new Participant entity
	 * 
	 */
	@RequestMapping(value = "/Participant", method = RequestMethod.POST)
	@ResponseBody
	public Participant newParticipant(@RequestBody Participant participant) {
		participantService.saveParticipant(participant);
		return participantDAO.findParticipantByPrimaryKey(participant.getId());
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Participant/{participant_id}/tradecontract/{tradecontract_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteParticipantTradecontract(@PathVariable String participant_id, @PathVariable String related_tradecontract_id) {
		participantService.deleteParticipantTradecontract(participant_id, related_tradecontract_id);
	}

	/**
	 * Create a new Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Participant/{participant_id}/tradecontract", method = RequestMethod.POST)
	@ResponseBody
	public Tradecontract newParticipantTradecontract(@PathVariable String participant_id, @RequestBody Tradecontract tradecontract) {
		participantService.saveParticipantTradecontract(participant_id, tradecontract);
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
}