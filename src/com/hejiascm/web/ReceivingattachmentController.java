package com.hejiascm.web;

import com.hejiascm.dao.ReceivingattachmentDAO;
import com.hejiascm.dao.ReceivingrecordDAO;

import com.hejiascm.domain.Receivingattachment;
import com.hejiascm.domain.Receivingrecord;

import com.hejiascm.service.ReceivingattachmentService;

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
 * Spring MVC controller that handles CRUD requests for Receivingattachment entities
 * 
 */

@Controller("ReceivingattachmentController")
public class ReceivingattachmentController {

	/**
	 * DAO injected by Spring that manages Receivingattachment entities
	 * 
	 */
	@Autowired
	private ReceivingattachmentDAO receivingattachmentDAO;

	/**
	 * DAO injected by Spring that manages Receivingrecord entities
	 * 
	 */
	@Autowired
	private ReceivingrecordDAO receivingrecordDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Receivingattachment entities
	 * 
	 */
	@Autowired
	private ReceivingattachmentService receivingattachmentService;

	/**
	 * Save an existing Receivingattachment entity
	 * 
	 */
	@RequestMapping("/saveReceivingattachment")
	public String saveReceivingattachment(@ModelAttribute Receivingattachment receivingattachment) {
		receivingattachmentService.saveReceivingattachment(receivingattachment);
		return "forward:/indexReceivingattachment";
	}

	/**
	 * Save an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping("/saveReceivingattachmentReceivingrecord")
	public ModelAndView saveReceivingattachmentReceivingrecord(@RequestParam String receivingattachment_id, @ModelAttribute Receivingrecord receivingrecord) {
		Receivingattachment parent_receivingattachment = receivingattachmentService.saveReceivingattachmentReceivingrecord(receivingattachment_id, receivingrecord);

		ModelAndView mav = new ModelAndView();
		mav.addObject("receivingattachment_id", receivingattachment_id);
		mav.addObject("receivingattachment", parent_receivingattachment);
		mav.setViewName("receivingattachment/viewReceivingattachment.jsp");

		return mav;
	}

	/**
	 * Edit an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping("/editReceivingattachmentReceivingrecord")
	public ModelAndView editReceivingattachmentReceivingrecord(@RequestParam String receivingattachment_id, @RequestParam String receivingrecord_id) {
		Receivingrecord receivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("receivingattachment_id", receivingattachment_id);
		mav.addObject("receivingrecord", receivingrecord);
		mav.setViewName("receivingattachment/receivingrecord/editReceivingrecord.jsp");

		return mav;
	}

	/**
	 * View an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping("/selectReceivingattachmentReceivingrecord")
	public ModelAndView selectReceivingattachmentReceivingrecord(@RequestParam String receivingattachment_id, @RequestParam String receivingrecord_id) {
		Receivingrecord receivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("receivingattachment_id", receivingattachment_id);
		mav.addObject("receivingrecord", receivingrecord);
		mav.setViewName("receivingattachment/receivingrecord/viewReceivingrecord.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Receivingattachment entities
	 * 
	 */
	public String indexReceivingattachment() {
		return "redirect:/indexReceivingattachment";
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
	 * Show all Receivingattachment entities
	 * 
	 */
	@RequestMapping("/indexReceivingattachment")
	public ModelAndView listReceivingattachments() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingattachments", receivingattachmentService.loadReceivingattachments());

		mav.setViewName("receivingattachment/listReceivingattachments.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/receivingattachmentController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Show all Receivingrecord entities by Receivingattachment
	 * 
	 */
	@RequestMapping("/listReceivingattachmentReceivingrecord")
	public ModelAndView listReceivingattachmentReceivingrecord(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingattachment", receivingattachmentDAO.findReceivingattachmentByPrimaryKey(idKey));
		mav.setViewName("receivingattachment/receivingrecord/listReceivingrecord.jsp");

		return mav;
	}

	/**
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping("/deleteReceivingattachmentReceivingrecord")
	public ModelAndView deleteReceivingattachmentReceivingrecord(@RequestParam String receivingattachment_id, @RequestParam String related_receivingrecord_id) {
		ModelAndView mav = new ModelAndView();

		Receivingattachment receivingattachment = receivingattachmentService.deleteReceivingattachmentReceivingrecord(receivingattachment_id, related_receivingrecord_id);

		mav.addObject("receivingattachment_id", receivingattachment_id);
		mav.addObject("receivingattachment", receivingattachment);
		mav.setViewName("receivingattachment/viewReceivingattachment.jsp");

		return mav;
	}

	/**
	 * Edit an existing Receivingattachment entity
	 * 
	 */
	@RequestMapping("/editReceivingattachment")
	public ModelAndView editReceivingattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingattachment", receivingattachmentDAO.findReceivingattachmentByPrimaryKey(idKey));
		mav.setViewName("receivingattachment/editReceivingattachment.jsp");

		return mav;
	}

	/**
	 * Create a new Receivingrecord entity
	 * 
	 */
	@RequestMapping("/newReceivingattachmentReceivingrecord")
	public ModelAndView newReceivingattachmentReceivingrecord(@RequestParam String receivingattachment_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("receivingattachment_id", receivingattachment_id);
		mav.addObject("receivingrecord", new Receivingrecord());
		mav.addObject("newFlag", true);
		mav.setViewName("receivingattachment/receivingrecord/editReceivingrecord.jsp");

		return mav;
	}

	/**
	 * Delete an existing Receivingattachment entity
	 * 
	 */
	@RequestMapping("/deleteReceivingattachment")
	public String deleteReceivingattachment(@RequestParam String idKey) {
		Receivingattachment receivingattachment = receivingattachmentDAO.findReceivingattachmentByPrimaryKey(idKey);
		receivingattachmentService.deleteReceivingattachment(receivingattachment);
		return "forward:/indexReceivingattachment";
	}

	/**
	 * Select the child Receivingrecord entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteReceivingattachmentReceivingrecord")
	public ModelAndView confirmDeleteReceivingattachmentReceivingrecord(@RequestParam String receivingattachment_id, @RequestParam String related_receivingrecord_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingrecord", receivingrecordDAO.findReceivingrecordByPrimaryKey(related_receivingrecord_id));
		mav.addObject("receivingattachment_id", receivingattachment_id);
		mav.setViewName("receivingattachment/receivingrecord/deleteReceivingrecord.jsp");

		return mav;
	}

	/**
	 * Select the Receivingattachment entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteReceivingattachment")
	public ModelAndView confirmDeleteReceivingattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingattachment", receivingattachmentDAO.findReceivingattachmentByPrimaryKey(idKey));
		mav.setViewName("receivingattachment/deleteReceivingattachment.jsp");

		return mav;
	}

	/**
	 * Create a new Receivingattachment entity
	 * 
	 */
	@RequestMapping("/newReceivingattachment")
	public ModelAndView newReceivingattachment() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingattachment", new Receivingattachment());
		mav.addObject("newFlag", true);
		mav.setViewName("receivingattachment/editReceivingattachment.jsp");

		return mav;
	}

	/**
	 * Select an existing Receivingattachment entity
	 * 
	 */
	@RequestMapping("/selectReceivingattachment")
	public ModelAndView selectReceivingattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingattachment", receivingattachmentDAO.findReceivingattachmentByPrimaryKey(idKey));
		mav.setViewName("receivingattachment/viewReceivingattachment.jsp");

		return mav;
	}
}