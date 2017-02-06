package com.hejiascm.web.rest;

import com.hejiascm.blockchain.dao.BcTradeContractDAO;
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
import com.hejiascm.util.MiscTool;
import com.hejiascm.util.TimestampPropertyEditor;

import java.sql.Timestamp;
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
 * Spring Rest controller that handles CRUD requests for Tradecontract entities
 * 
 */

@Controller("TradecontractRestController")
public class TradecontractRestController {

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
	
	@Autowired
	private BcTradeContractDAO bcTradeContractDAO;

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
	 * Delete an existing Tradecontractattachment entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/tradecontractattachments/{tradecontractattachment_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTradecontractTradecontractattachments(@PathVariable String tradecontract_id, @PathVariable String related_tradecontractattachments_id) {
		tradecontractService.deleteTradecontractTradecontractattachments(tradecontract_id, related_tradecontractattachments_id);
	}

	/**
	 * Create a new Operation entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/operations", method = RequestMethod.POST)
	@ResponseBody
	public Operation newTradecontractOperations(@PathVariable String tradecontract_id, @RequestBody Operation operation) {
		tradecontractService.saveTradecontractOperations(tradecontract_id, operation);
		return operationDAO.findOperationByPrimaryKey(operation.getId());
	}

	/**
	 * Create a new Participant entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/participants", method = RequestMethod.POST)
	@ResponseBody
	public Participant newTradecontractParticipants(@PathVariable String tradecontract_id, @RequestBody Participant participant) {
		tradecontractService.saveTradecontractParticipants(tradecontract_id, participant);
		return participantDAO.findParticipantByPrimaryKey(participant.getId());
	}

	/**
	 * Save an existing Term entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/terms", method = RequestMethod.PUT)
	@ResponseBody
	public Term saveTradecontractTerms(@PathVariable String tradecontract_id, @RequestBody Term terms) {
		tradecontractService.saveTradecontractTerms(tradecontract_id, terms);
		return termDAO.findTermByPrimaryKey(terms.getId());
	}

	/**
	 * View an existing Contractgoods entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/contractgoodses/{contractgoods_id}", method = RequestMethod.GET)
	@ResponseBody
	public Contractgoods loadTradecontractContractgoodses(@PathVariable String tradecontract_id, @PathVariable String related_contractgoodses_id) {
		Contractgoods contractgoods = contractgoodsDAO.findContractgoodsByPrimaryKey(related_contractgoodses_id, -1, -1);

		return contractgoods;
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
		binder.registerCustomEditor(Timestamp.class,new TimestampPropertyEditor());
	}

	/**
	 * Show all Contractgoods entities by Tradecontract
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/contractgoodses", method = RequestMethod.GET)
	@ResponseBody
	public List<Contractgoods> getTradecontractContractgoodses(@PathVariable String tradecontract_id) {
		return new java.util.ArrayList<Contractgoods>(tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id).getContractgoodses());
	}

	/**
	 * View an existing Term entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/terms/{term_id}", method = RequestMethod.GET)
	@ResponseBody
	public Term loadTradecontractTerms(@PathVariable String tradecontract_id, @PathVariable String related_terms_id) {
		Term term = termDAO.findTermByPrimaryKey(related_terms_id, -1, -1);

		return term;
	}

	/**
	 * Show all Operation entities by Tradecontract
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/operations", method = RequestMethod.GET)
	@ResponseBody
	public List<Operation> getTradecontractOperations(@PathVariable String tradecontract_id) {
		return new java.util.ArrayList<Operation>(tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id).getOperations());
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract", method = RequestMethod.PUT)
	@ResponseBody
	public Tradecontract saveTradecontract(@RequestBody Tradecontract tradecontract) {
		tradecontractService.saveTradecontract(tradecontract);
		return tradecontractDAO.findTradecontractByPrimaryKey(tradecontract.getId());
	}

	/**
	 * Delete an existing Operation entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/operations/{operation_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTradecontractOperations(@PathVariable String tradecontract_id, @PathVariable String related_operations_id) {
		tradecontractService.deleteTradecontractOperations(tradecontract_id, related_operations_id);
	}

	/**
	 * View an existing Tradecontractattachment entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/tradecontractattachments/{tradecontractattachment_id}", method = RequestMethod.GET)
	@ResponseBody
	public Tradecontractattachment loadTradecontractTradecontractattachments(@PathVariable String tradecontract_id, @PathVariable String related_tradecontractattachments_id) {
		Tradecontractattachment tradecontractattachment = tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(related_tradecontractattachments_id, -1, -1);

		return tradecontractattachment;
	}

	/**
	 * View an existing Participant entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/participants/{participant_id}", method = RequestMethod.GET)
	@ResponseBody
	public Participant loadTradecontractParticipants(@PathVariable String tradecontract_id, @PathVariable String related_participants_id) {
		Participant participant = participantDAO.findParticipantByPrimaryKey(related_participants_id, -1, -1);

		return participant;
	}

	/**
	 * Show all Tradecontractattachment entities by Tradecontract
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/tradecontractattachments", method = RequestMethod.GET)
	@ResponseBody
	public List<Tradecontractattachment> getTradecontractTradecontractattachments(@PathVariable String tradecontract_id) {
		return new java.util.ArrayList<Tradecontractattachment>(tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id).getTradecontractattachments());
	}

	/**
	 * View an existing Operation entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/operations/{operation_id}", method = RequestMethod.GET)
	@ResponseBody
	public Operation loadTradecontractOperations(@PathVariable String tradecontract_id, @PathVariable String related_operations_id) {
		Operation operation = operationDAO.findOperationByPrimaryKey(related_operations_id, -1, -1);

		return operation;
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTradecontract(@PathVariable String tradecontract_id) {
		Tradecontract tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id);
		tradecontractService.deleteTradecontract(tradecontract);
	}

	/**
	 * Create a new Term entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/terms", method = RequestMethod.POST)
	@ResponseBody
	public Term newTradecontractTerms(@PathVariable String tradecontract_id, @RequestBody Term term) {
		tradecontractService.saveTradecontractTerms(tradecontract_id, term);
		return termDAO.findTermByPrimaryKey(term.getId());
	}

	/**
	 * Delete an existing Term entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/terms/{term_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTradecontractTerms(@PathVariable String tradecontract_id, @PathVariable String related_terms_id) {
		tradecontractService.deleteTradecontractTerms(tradecontract_id, related_terms_id);
	}

	/**
	 * Save an existing Operation entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/operations", method = RequestMethod.PUT)
	@ResponseBody
	public Operation saveTradecontractOperations(@PathVariable String tradecontract_id, @RequestBody Operation operations) {
		tradecontractService.saveTradecontractOperations(tradecontract_id, operations);
		return operationDAO.findOperationByPrimaryKey(operations.getId());
	}

	/**
	 * Select an existing Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}", method = RequestMethod.GET)
	@ResponseBody
	public Tradecontract loadTradecontract(@PathVariable String tradecontract_id) {
		return tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id);
	}

	/**
	 * Save an existing Contractgoods entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/contractgoodses", method = RequestMethod.PUT)
	@ResponseBody
	public Contractgoods saveTradecontractContractgoodses(@PathVariable String tradecontract_id, @RequestBody Contractgoods contractgoodses) {
		tradecontractService.saveTradecontractContractgoodses(tradecontract_id, contractgoodses);
		return contractgoodsDAO.findContractgoodsByPrimaryKey(contractgoodses.getId());
	}

	/**
	 * Delete an existing Participant entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/participants/{participant_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTradecontractParticipants(@PathVariable String tradecontract_id, @PathVariable String related_participants_id) {
		tradecontractService.deleteTradecontractParticipants(tradecontract_id, related_participants_id);
	}

	/**
	 * Show all Participant entities by Tradecontract
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/participants", method = RequestMethod.GET)
	@ResponseBody
	public List<Participant> getTradecontractParticipants(@PathVariable String tradecontract_id) {
		return new java.util.ArrayList<Participant>(tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id).getParticipants());
	}

	/**
	 * Create a new Tradecontract entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract", method = RequestMethod.POST)
	@ResponseBody
	public Tradecontract newTradecontract(@RequestBody Tradecontract tradecontract) {
		tradecontractService.saveTradecontract(tradecontract);
		return tradecontractDAO.findTradecontractByPrimaryKey(tradecontract.getId());
	}

	/**
	 * Show all Term entities by Tradecontract
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/terms", method = RequestMethod.GET)
	@ResponseBody
	public List<Term> getTradecontractTerms(@PathVariable String tradecontract_id) {
		return new java.util.ArrayList<Term>(tradecontractDAO.findTradecontractByPrimaryKey(tradecontract_id).getTerms());
	}

	/**
	 * Create a new Contractgoods entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/contractgoodses", method = RequestMethod.POST)
	@ResponseBody
	public Contractgoods newTradecontractContractgoodses(@PathVariable String tradecontract_id, @RequestBody Contractgoods contractgoods) {
		tradecontractService.saveTradecontractContractgoodses(tradecontract_id, contractgoods);
		return contractgoodsDAO.findContractgoodsByPrimaryKey(contractgoods.getId());
	}

	/**
	 * Save an existing Tradecontractattachment entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/tradecontractattachments", method = RequestMethod.PUT)
	@ResponseBody
	public Tradecontractattachment saveTradecontractTradecontractattachments(@PathVariable String tradecontract_id, @RequestBody Tradecontractattachment tradecontractattachments) {
		tradecontractService.saveTradecontractTradecontractattachments(tradecontract_id, tradecontractattachments);
		return tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(tradecontractattachments.getId());
	}

	/**
	 * Show all Tradecontract entities
	 * 
	 */
	@RequestMapping(value = "/Tradecontract", method = RequestMethod.GET)
	@ResponseBody
	public List<Tradecontract> listTradecontracts() {
		return new java.util.ArrayList<Tradecontract>(tradecontractService.loadTradecontracts());
	}

	/**
	 * Create a new Tradecontractattachment entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/tradecontractattachments", method = RequestMethod.POST)
	@ResponseBody
	public Tradecontractattachment newTradecontractTradecontractattachments(@PathVariable String tradecontract_id, @RequestBody Tradecontractattachment tradecontractattachment) {
		tradecontractService.saveTradecontractTradecontractattachments(tradecontract_id, tradecontractattachment);
		return tradecontractattachmentDAO.findTradecontractattachmentByPrimaryKey(tradecontractattachment.getId());
	}

	/**
	 * Save an existing Participant entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/participants", method = RequestMethod.PUT)
	@ResponseBody
	public Participant saveTradecontractParticipants(@PathVariable String tradecontract_id, @RequestBody Participant participants) {
		tradecontractService.saveTradecontractParticipants(tradecontract_id, participants);
		return participantDAO.findParticipantByPrimaryKey(participants.getId());
	}

	/**
	 * Delete an existing Contractgoods entity
	 * 
	 */
	@RequestMapping(value = "/Tradecontract/{tradecontract_id}/contractgoodses/{contractgoods_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTradecontractContractgoodses(@PathVariable String tradecontract_id, @PathVariable String related_contractgoodses_id) {
		tradecontractService.deleteTradecontractContractgoodses(tradecontract_id, related_contractgoodses_id);
	}
	
	/**
	 * Block chain
	 * @param String id, String version
	 * @return List<Tradecontract>
	 * 
	 */
	@RequestMapping(value = "/bcTradecontract/{id}/{version}", method = RequestMethod.GET)
	@ResponseBody
	public List<Tradecontract> listBcTradecontracts(@PathVariable String id, @PathVariable String version) {
		return bcTradeContractDAO.findBcContractById( id, version);
	}
	
	/**
	 * Block chain
	 * @param Tradecontract
	 * @return String contractId
	 */
	@RequestMapping(value = "/bcTradecontract", method = RequestMethod.POST)
	@ResponseBody
	public String newBcTradecontract(@RequestBody Tradecontract tradecontract) {
		return bcTradeContractDAO.submitBcContract(tradecontract);
	}
	
	/**
	 * Block chain
	 * @param Tradecontract
	 * @return String contractId
	 */
	@RequestMapping(value = "/bcConfirmTradecontract/{id}/{ver}", method = RequestMethod.POST)
	@ResponseBody
	public void confirmBcTradecontract(@PathVariable String id, @PathVariable String ver) {
		String opId = "get operator id here";
		String opTime = MiscTool.timeStampToString(new Timestamp(System.currentTimeMillis()));
		bcTradeContractDAO.confirmBcTradeContract(id, ver, opId, opTime);
	}
}