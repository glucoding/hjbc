package com.hejiascm.web;

import com.hejiascm.dao.ContractgoodsDAO;
import com.hejiascm.dao.OperationDAO;
import com.hejiascm.dao.ParticipantDAO;
import com.hejiascm.dao.TermDAO;
import com.hejiascm.dao.TradecontractDAO;
import com.hejiascm.dao.TradecontractattachmentDAO;

import com.hejiascm.domain.Contractgoods;
import com.hejiascm.domain.Operation;
import com.hejiascm.domain.Participant;
import com.hejiascm.domain.Term;
import com.hejiascm.domain.Tradecontract;
import com.hejiascm.domain.Tradecontractattachment;

import com.hejiascm.service.TradecontractService;

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
 * Spring MVC controller that handles CRUD requests for Tradecontract entities
 * 
 */

@Controller("TradecontractController")
public class TradecontractController {

	/**
	 * DAO injected by Spring that manages Contractgoods entities
	 * 
	 */
	@Autowired
	private ContractgoodsDAO contractgoodsDAO;

	/**
	 * DAO injected by Spring that manages Operation entities
	 * 
	 */
	@Autowired
	private OperationDAO operationDAO;

	/**
	 * DAO injected by Spring that manages Participant entities
	 * 
	 */
	@Autowired
	private ParticipantDAO participantDAO;

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
	 * DAO injected by Spring that manages Tradecontractattachment entities
	 * 
	 */
	@Autowired
	private TradecontractattachmentDAO tradecontractattachmentDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Tradecontract entities
	 * 
	 */
	@Autowired
	private TradecontractService tradecontractService;

	/**
	 * Select the child Term entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTradecontractTerms")
	public ModelAndView confirmDeleteTradecontractTerms(@RequestParam String tradecontract_id, @RequestParam String related_terms_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("term", termDAO.findTermByPrimaryKey(related_terms_id));
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.setViewName("tradecontract/terms/deleteTerms.jsp");

		return mav;
	}

	/**
	 * View an existing Contractgoods entity
	 * 
	 */
	@RequestMapping("/selectTradecontractContractgoodses")
	public ModelAndView selectTradecontractContractgoodses(@RequestParam String tradecontract_id, @RequestParam String contractgoodses_id) {
		Contractgoods contractgoods = contractgoodsDAO.findContractgoodsByPrimaryKey(contractgoodses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("contractgoods", contractgoods);
		mav.setViewName("tradecontract/contractgoodses/viewContractgoodses.jsp");

		return mav;
	}

	/**
	 * Select the child Participant entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTradecontractParticipants")
	public ModelAndView confirmDeleteTradecontractParticipants(@RequestParam String tradecontract_id, @RequestParam String related_participants_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("participant", participantDAO.findParticipantByPrimaryKey(related_participants_id));
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.setViewName("tradecontract/participants/deleteParticipants.jsp");

		return mav;
	}

	/**
	 * Save an existing Operation entity
	 * 
	 */
	@RequestMapping("/saveTradecontractOperations")
	public ModelAndView saveTradecontractOperations(@RequestParam String tradecontract_id, @ModelAttribute Operation operations) {
		Tradecontract parent_tradecontract = tradecontractService.saveTradecontractOperations(tradecontract_id, operations);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("tradecontract", parent_tradecontract);
		mav.setViewName("tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Edit an existing Operation entity
	 * 
	 */
	@RequestMapping("/editTradecontractOperations")
	public ModelAndView editTradecontractOperations(@RequestParam String tradecontract_id, @RequestParam String operations_id) {
		Operation operation = operationDAO.findOperationByPrimaryKey(operations_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("operation", operation);
		mav.setViewName("tradecontract/operations/editOperations.jsp");

		return mav;
	}

	/**
	 * View an existing Term entity
	 * 
	 */
	@RequestMapping("/selectTradecontractTerms")
	public ModelAndView selectTradecontractTerms(@RequestParam String tradecontract_id, @RequestParam String terms_id) {
		Term term = termDAO.findTermByPrimaryKey(terms_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("term", term);
		mav.setViewName("tradecontract/terms/viewTerms.jsp");

		return mav;
	}

	/**
	 * Delete an existing Operation entity
	 * 
	 */
	@RequestMapping("/deleteTradecontractOperations")
	public ModelAndView deleteTradecontractOperations(@RequestParam String tradecontract_id, @RequestParam String related_operations_id) {
		ModelAndView mav = new ModelAndView();

		Tradecontract tradecontract = tradecontractService.deleteTradecontractOperations(tradecontract_id, related_operations_id);

		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Create a new Operation entity
	 * 
	 */
	@RequestMapping("/newTradecontractOperations")
	public ModelAndView newTradecontractOperations(@RequestParam String tradecontract_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("operation", new Operation());
		mav.addObject("newFlag", true);
		mav.setViewName("tradecontract/operations/editOperations.jsp");

		return mav;
	}

	/**
	 * View an existing Participant entity
	 * 
	 */
	@RequestMapping("/selectTradecontractParticipants")
	public ModelAndView selectTradecontractParticipants(@RequestParam String tradecontract_id, @RequestParam String participants_id) {
		Participant participant = participantDAO.findParticipantByPrimaryKey(participants_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("participant", participant);
		mav.setViewName("tradecontract/participants/viewParticipants.jsp");

		return mav;
	}

	/**
	 * Create a new Contractgoods entity
	 * 
	 */
	@RequestMapping("/newTradecontractContractgoodses")
	public ModelAndView newTradecontractContractgoodses(@RequestParam String tradecontract_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("contractgoods", new Contractgoods());
		mav.addObject("newFlag", true);
		mav.setViewName("tradecontract/contractgoodses/editContractgoodses.jsp");

		return mav;
	}

	/**
	 * Show all Contractgoods entities by Tradecontract
	 * 
	 */
	@RequestMapping("/listTradecontractContractgoodses")
	public ModelAndView listTradecontractContractgoodses(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontract", tradecontractDAO.findTradecontractByPrimaryKey(idKey));
		mav.setViewName("tradecontract/contractgoodses/listContractgoodses.jsp");

		return mav;
	}

	/**
	 * Show all Term entities by Tradecontract
	 * 
	 */
	@RequestMapping("/listTradecontractTerms")
	public ModelAndView listTradecontractTerms(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontract", tradecontractDAO.findTradecontractByPrimaryKey(idKey));
		mav.setViewName("tradecontract/terms/listTerms.jsp");

		return mav;
	}

	/**
	 * Show all Operation entities by Tradecontract
	 * 
	 */
	@RequestMapping("/listTradecontractOperations")
	public ModelAndView listTradecontractOperations(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontract", tradecontractDAO.findTradecontractByPrimaryKey(idKey));
		mav.setViewName("tradecontract/operations/listOperations.jsp");

		return mav;
	}

	/**
	 * Edit an existing Tradecontractattachment entity
	 * 
	 */
	@RequestMapping("/editTradecontractTradecontractattachments")
	public ModelAndView editTradecontractTradecontractattachments(@RequestParam String tradecontract_id, @RequestParam String tradecontractattachments_id) {
		Tradecontractattachment tradecontractattachment = tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(tradecontractattachments_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("tradecontractattachment", tradecontractattachment);
		mav.setViewName("tradecontract/tradecontractattachments/editTradecontractattachments.jsp");

		return mav;
	}

	/**
	 * View an existing Tradecontractattachment entity
	 * 
	 */
	@RequestMapping("/selectTradecontractTradecontractattachments")
	public ModelAndView selectTradecontractTradecontractattachments(@RequestParam String tradecontract_id, @RequestParam String tradecontractattachments_id) {
		Tradecontractattachment tradecontractattachment = tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(tradecontractattachments_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("tradecontractattachment", tradecontractattachment);
		mav.setViewName("tradecontract/tradecontractattachments/viewTradecontractattachments.jsp");

		return mav;
	}

	/**
	 * Save an existing Participant entity
	 * 
	 */
	@RequestMapping("/saveTradecontractParticipants")
	public ModelAndView saveTradecontractParticipants(@RequestParam String tradecontract_id, @ModelAttribute Participant participants) {
		Tradecontract parent_tradecontract = tradecontractService.saveTradecontractParticipants(tradecontract_id, participants);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("tradecontract", parent_tradecontract);
		mav.setViewName("tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Show all Tradecontractattachment entities by Tradecontract
	 * 
	 */
	@RequestMapping("/listTradecontractTradecontractattachments")
	public ModelAndView listTradecontractTradecontractattachments(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontract", tradecontractDAO.findTradecontractByPrimaryKey(idKey));
		mav.setViewName("tradecontract/tradecontractattachments/listTradecontractattachments.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/tradecontractController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new Tradecontract entity
	 * 
	 */
	@RequestMapping("/newTradecontract")
	public ModelAndView newTradecontract() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontract", new Tradecontract());
		mav.addObject("newFlag", true);
		mav.setViewName("tradecontract/editTradecontract.jsp");

		return mav;
	}

	/**
	 * Select an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/selectTradecontract")
	public ModelAndView selectTradecontract(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontract", tradecontractDAO.findTradecontractByPrimaryKey(idKey));
		mav.setViewName("tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Delete an existing Term entity
	 * 
	 */
	@RequestMapping("/deleteTradecontractTerms")
	public ModelAndView deleteTradecontractTerms(@RequestParam String tradecontract_id, @RequestParam String related_terms_id) {
		ModelAndView mav = new ModelAndView();

		Tradecontract tradecontract = tradecontractService.deleteTradecontractTerms(tradecontract_id, related_terms_id);

		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Select the child Contractgoods entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTradecontractContractgoodses")
	public ModelAndView confirmDeleteTradecontractContractgoodses(@RequestParam String tradecontract_id, @RequestParam String related_contractgoodses_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("contractgoods", contractgoodsDAO.findContractgoodsByPrimaryKey(related_contractgoodses_id));
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.setViewName("tradecontract/contractgoodses/deleteContractgoodses.jsp");

		return mav;
	}

	/**
	 * Edit an existing Contractgoods entity
	 * 
	 */
	@RequestMapping("/editTradecontractContractgoodses")
	public ModelAndView editTradecontractContractgoodses(@RequestParam String tradecontract_id, @RequestParam String contractgoodses_id) {
		Contractgoods contractgoods = contractgoodsDAO.findContractgoodsByPrimaryKey(contractgoodses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("contractgoods", contractgoods);
		mav.setViewName("tradecontract/contractgoodses/editContractgoodses.jsp");

		return mav;
	}

	/**
	 * Show all Tradecontract entities
	 * 
	 */
	@RequestMapping("/indexTradecontract")
	public ModelAndView listTradecontracts() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontracts", tradecontractService.loadTradecontracts());

		mav.setViewName("tradecontract/listTradecontracts.jsp");

		return mav;
	}

	/**
	 * Create a new Participant entity
	 * 
	 */
	@RequestMapping("/newTradecontractParticipants")
	public ModelAndView newTradecontractParticipants(@RequestParam String tradecontract_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("participant", new Participant());
		mav.addObject("newFlag", true);
		mav.setViewName("tradecontract/participants/editParticipants.jsp");

		return mav;
	}

	/**
	 * Delete an existing Contractgoods entity
	 * 
	 */
	@RequestMapping("/deleteTradecontractContractgoodses")
	public ModelAndView deleteTradecontractContractgoodses(@RequestParam String tradecontract_id, @RequestParam String related_contractgoodses_id) {
		ModelAndView mav = new ModelAndView();

		Tradecontract tradecontract = tradecontractService.deleteTradecontractContractgoodses(tradecontract_id, related_contractgoodses_id);

		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Save an existing Term entity
	 * 
	 */
	@RequestMapping("/saveTradecontractTerms")
	public ModelAndView saveTradecontractTerms(@RequestParam String tradecontract_id, @ModelAttribute Term terms) {
		Tradecontract parent_tradecontract = tradecontractService.saveTradecontractTerms(tradecontract_id, terms);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("tradecontract", parent_tradecontract);
		mav.setViewName("tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Show all Participant entities by Tradecontract
	 * 
	 */
	@RequestMapping("/listTradecontractParticipants")
	public ModelAndView listTradecontractParticipants(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontract", tradecontractDAO.findTradecontractByPrimaryKey(idKey));
		mav.setViewName("tradecontract/participants/listParticipants.jsp");

		return mav;
	}

	/**
	 * Select the child Tradecontractattachment entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTradecontractTradecontractattachments")
	public ModelAndView confirmDeleteTradecontractTradecontractattachments(@RequestParam String tradecontract_id, @RequestParam String related_tradecontractattachments_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontractattachment", tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(related_tradecontractattachments_id));
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.setViewName("tradecontract/tradecontractattachments/deleteTradecontractattachments.jsp");

		return mav;
	}

	/**
	 * Create a new Tradecontractattachment entity
	 * 
	 */
	@RequestMapping("/newTradecontractTradecontractattachments")
	public ModelAndView newTradecontractTradecontractattachments(@RequestParam String tradecontract_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("tradecontractattachment", new Tradecontractattachment());
		mav.addObject("newFlag", true);
		mav.setViewName("tradecontract/tradecontractattachments/editTradecontractattachments.jsp");

		return mav;
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/saveTradecontract")
	public String saveTradecontract(@ModelAttribute Tradecontract tradecontract) {
		tradecontractService.saveTradecontract(tradecontract);
		return "forward:/indexTradecontract";
	}

	/**
	 * Delete an existing Tradecontractattachment entity
	 * 
	 */
	@RequestMapping("/deleteTradecontractTradecontractattachments")
	public ModelAndView deleteTradecontractTradecontractattachments(@RequestParam String tradecontract_id, @RequestParam String related_tradecontractattachments_id) {
		ModelAndView mav = new ModelAndView();

		Tradecontract tradecontract = tradecontractService.deleteTradecontractTradecontractattachments(tradecontract_id, related_tradecontractattachments_id);

		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Edit an existing Term entity
	 * 
	 */
	@RequestMapping("/editTradecontractTerms")
	public ModelAndView editTradecontractTerms(@RequestParam String tradecontract_id, @RequestParam String terms_id) {
		Term term = termDAO.findTermByPrimaryKey(terms_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("term", term);
		mav.setViewName("tradecontract/terms/editTerms.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Tradecontract entities
	 * 
	 */
	public String indexTradecontract() {
		return "redirect:/indexTradecontract";
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
	 * View an existing Operation entity
	 * 
	 */
	@RequestMapping("/selectTradecontractOperations")
	public ModelAndView selectTradecontractOperations(@RequestParam String tradecontract_id, @RequestParam String operations_id) {
		Operation operation = operationDAO.findOperationByPrimaryKey(operations_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("operation", operation);
		mav.setViewName("tradecontract/operations/viewOperations.jsp");

		return mav;
	}

	/**
	 * Edit an existing Participant entity
	 * 
	 */
	@RequestMapping("/editTradecontractParticipants")
	public ModelAndView editTradecontractParticipants(@RequestParam String tradecontract_id, @RequestParam String participants_id) {
		Participant participant = participantDAO.findParticipantByPrimaryKey(participants_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("participant", participant);
		mav.setViewName("tradecontract/participants/editParticipants.jsp");

		return mav;
	}

	/**
	 * Delete an existing Participant entity
	 * 
	 */
	@RequestMapping("/deleteTradecontractParticipants")
	public ModelAndView deleteTradecontractParticipants(@RequestParam String tradecontract_id, @RequestParam String related_participants_id) {
		ModelAndView mav = new ModelAndView();

		Tradecontract tradecontract = tradecontractService.deleteTradecontractParticipants(tradecontract_id, related_participants_id);

		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("tradecontract", tradecontract);
		mav.setViewName("tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Select the Tradecontract entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTradecontract")
	public ModelAndView confirmDeleteTradecontract(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontract", tradecontractDAO.findTradecontractByPrimaryKey(idKey));
		mav.setViewName("tradecontract/deleteTradecontract.jsp");

		return mav;
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/deleteTradecontract")
	public String deleteTradecontract(@RequestParam String idKey) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(idKey);
		tradecontractService.deleteTradecontract(tradecontract);
		return "forward:/indexTradecontract";
	}

	/**
	 * Save an existing Contractgoods entity
	 * 
	 */
	@RequestMapping("/saveTradecontractContractgoodses")
	public ModelAndView saveTradecontractContractgoodses(@RequestParam String tradecontract_id, @ModelAttribute Contractgoods contractgoodses) {
		Tradecontract parent_tradecontract = tradecontractService.saveTradecontractContractgoodses(tradecontract_id, contractgoodses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("tradecontract", parent_tradecontract);
		mav.setViewName("tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Save an existing Tradecontractattachment entity
	 * 
	 */
	@RequestMapping("/saveTradecontractTradecontractattachments")
	public ModelAndView saveTradecontractTradecontractattachments(@RequestParam String tradecontract_id, @ModelAttribute Tradecontractattachment tradecontractattachments) {
		Tradecontract parent_tradecontract = tradecontractService.saveTradecontractTradecontractattachments(tradecontract_id, tradecontractattachments);

		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("tradecontract", parent_tradecontract);
		mav.setViewName("tradecontract/viewTradecontract.jsp");

		return mav;
	}

	/**
	 * Create a new Term entity
	 * 
	 */
	@RequestMapping("/newTradecontractTerms")
	public ModelAndView newTradecontractTerms(@RequestParam String tradecontract_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.addObject("term", new Term());
		mav.addObject("newFlag", true);
		mav.setViewName("tradecontract/terms/editTerms.jsp");

		return mav;
	}

	/**
	 * Edit an existing Tradecontract entity
	 * 
	 */
	@RequestMapping("/editTradecontract")
	public ModelAndView editTradecontract(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("tradecontract", tradecontractDAO.findTradecontractByPrimaryKey(idKey));
		mav.setViewName("tradecontract/editTradecontract.jsp");

		return mav;
	}

	/**
	 * Select the child Operation entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTradecontractOperations")
	public ModelAndView confirmDeleteTradecontractOperations(@RequestParam String tradecontract_id, @RequestParam String related_operations_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("operation", operationDAO.findOperationByPrimaryKey(related_operations_id));
		mav.addObject("tradecontract_id", tradecontract_id);
		mav.setViewName("tradecontract/operations/deleteOperations.jsp");

		return mav;
	}
}