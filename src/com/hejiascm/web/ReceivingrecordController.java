package com.hejiascm.web;

import com.hejiascm.dao.ReceivingattachmentDAO;
import com.hejiascm.dao.ReceivinggoodsDAO;
import com.hejiascm.dao.ReceivingrecordDAO;

import com.hejiascm.domain.Receivingattachment;
import com.hejiascm.domain.Receivinggoods;
import com.hejiascm.domain.Receivingrecord;

import com.hejiascm.service.ReceivingrecordService;

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
 * Spring MVC controller that handles CRUD requests for Receivingrecord entities
 * 
 */

@Controller("ReceivingrecordController")
public class ReceivingrecordController {

	/**
	 * DAO injected by Spring that manages Receivingattachment entities
	 * 
	 */
	@Autowired
	private ReceivingattachmentDAO receivingattachmentDAO;

	/**
	 * DAO injected by Spring that manages Receivinggoods entities
	 * 
	 */
	@Autowired
	private ReceivinggoodsDAO receivinggoodsDAO;

	/**
	 * DAO injected by Spring that manages Receivingrecord entities
	 * 
	 */
	@Autowired
	private ReceivingrecordDAO receivingrecordDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Receivingrecord entities
	 * 
	 */
	@Autowired
	private ReceivingrecordService receivingrecordService;

	/**
	 * Save an existing Receivingattachment entity
	 * 
	 */
	@RequestMapping("/saveReceivingrecordReceivingattachments")
	public ModelAndView saveReceivingrecordReceivingattachments(@RequestParam String receivingrecord_id, @ModelAttribute Receivingattachment receivingattachments) {
		Receivingrecord parent_receivingrecord = receivingrecordService.saveReceivingrecordReceivingattachments(receivingrecord_id, receivingattachments);

		ModelAndView mav = new ModelAndView();
		mav.addObject("receivingrecord_id", receivingrecord_id);
		mav.addObject("receivingrecord", parent_receivingrecord);
		mav.setViewName("receivingrecord/viewReceivingrecord.jsp");

		return mav;
	}

	/**
	 * Show all Receivinggoods entities by Receivingrecord
	 * 
	 */
	@RequestMapping("/listReceivingrecordReceivinggoodses")
	public ModelAndView listReceivingrecordReceivinggoodses(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingrecord", receivingrecordDAO.findReceivingrecordByPrimaryKey(idKey));
		mav.setViewName("receivingrecord/receivinggoodses/listReceivinggoodses.jsp");

		return mav;
	}

	/**
	 * Edit an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping("/editReceivingrecord")
	public ModelAndView editReceivingrecord(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingrecord", receivingrecordDAO.findReceivingrecordByPrimaryKey(idKey));
		mav.setViewName("receivingrecord/editReceivingrecord.jsp");

		return mav;
	}

	/**
	 * Delete an existing Receivingattachment entity
	 * 
	 */
	@RequestMapping("/deleteReceivingrecordReceivingattachments")
	public ModelAndView deleteReceivingrecordReceivingattachments(@RequestParam String receivingrecord_id, @RequestParam String related_receivingattachments_id) {
		ModelAndView mav = new ModelAndView();

		Receivingrecord receivingrecord = receivingrecordService.deleteReceivingrecordReceivingattachments(receivingrecord_id, related_receivingattachments_id);

		mav.addObject("receivingrecord_id", receivingrecord_id);
		mav.addObject("receivingrecord", receivingrecord);
		mav.setViewName("receivingrecord/viewReceivingrecord.jsp");

		return mav;
	}

	/**
	 * Edit an existing Receivingattachment entity
	 * 
	 */
	@RequestMapping("/editReceivingrecordReceivingattachments")
	public ModelAndView editReceivingrecordReceivingattachments(@RequestParam String receivingrecord_id, @RequestParam String receivingattachments_id) {
		Receivingattachment receivingattachment = receivingattachmentDAO.findReceivingattachmentByPrimaryKey(receivingattachments_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("receivingrecord_id", receivingrecord_id);
		mav.addObject("receivingattachment", receivingattachment);
		mav.setViewName("receivingrecord/receivingattachments/editReceivingattachments.jsp");

		return mav;
	}

	/**
	 * View an existing Receivingattachment entity
	 * 
	 */
	@RequestMapping("/selectReceivingrecordReceivingattachments")
	public ModelAndView selectReceivingrecordReceivingattachments(@RequestParam String receivingrecord_id, @RequestParam String receivingattachments_id) {
		Receivingattachment receivingattachment = receivingattachmentDAO.findReceivingattachmentByPrimaryKey(receivingattachments_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("receivingrecord_id", receivingrecord_id);
		mav.addObject("receivingattachment", receivingattachment);
		mav.setViewName("receivingrecord/receivingattachments/viewReceivingattachments.jsp");

		return mav;
	}

	/**
	 * View an existing Receivinggoods entity
	 * 
	 */
	@RequestMapping("/selectReceivingrecordReceivinggoodses")
	public ModelAndView selectReceivingrecordReceivinggoodses(@RequestParam String receivingrecord_id, @RequestParam String receivinggoodses_id) {
		Receivinggoods receivinggoods = receivinggoodsDAO.findReceivinggoodsByPrimaryKey(receivinggoodses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("receivingrecord_id", receivingrecord_id);
		mav.addObject("receivinggoods", receivinggoods);
		mav.setViewName("receivingrecord/receivinggoodses/viewReceivinggoodses.jsp");

		return mav;
	}

	/**
	 * Show all Receivingrecord entities
	 * 
	 */
	@RequestMapping("/indexReceivingrecord")
	public ModelAndView listReceivingrecords() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingrecords", receivingrecordService.loadReceivingrecords());

		mav.setViewName("receivingrecord/listReceivingrecords.jsp");

		return mav;
	}

	/**
	 * Select the Receivingrecord entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteReceivingrecord")
	public ModelAndView confirmDeleteReceivingrecord(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingrecord", receivingrecordDAO.findReceivingrecordByPrimaryKey(idKey));
		mav.setViewName("receivingrecord/deleteReceivingrecord.jsp");

		return mav;
	}

	/**
	 * Create a new Receivingrecord entity
	 * 
	 */
	@RequestMapping("/newReceivingrecord")
	public ModelAndView newReceivingrecord() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingrecord", new Receivingrecord());
		mav.addObject("newFlag", true);
		mav.setViewName("receivingrecord/editReceivingrecord.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/receivingrecordController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping("/deleteReceivingrecord")
	public String deleteReceivingrecord(@RequestParam String idKey) {
		Receivingrecord receivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(idKey);
		receivingrecordService.deleteReceivingrecord(receivingrecord);
		return "forward:/indexReceivingrecord";
	}

	/**
	 * Create a new Receivinggoods entity
	 * 
	 */
	@RequestMapping("/newReceivingrecordReceivinggoodses")
	public ModelAndView newReceivingrecordReceivinggoodses(@RequestParam String receivingrecord_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("receivingrecord_id", receivingrecord_id);
		mav.addObject("receivinggoods", new Receivinggoods());
		mav.addObject("newFlag", true);
		mav.setViewName("receivingrecord/receivinggoodses/editReceivinggoodses.jsp");

		return mav;
	}

	/**
	 * Select an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping("/selectReceivingrecord")
	public ModelAndView selectReceivingrecord(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingrecord", receivingrecordDAO.findReceivingrecordByPrimaryKey(idKey));
		mav.setViewName("receivingrecord/viewReceivingrecord.jsp");

		return mav;
	}

	/**
	 * Save an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping("/saveReceivingrecord")
	public String saveReceivingrecord(@ModelAttribute Receivingrecord receivingrecord) {
		receivingrecordService.saveReceivingrecord(receivingrecord);
		return "forward:/indexReceivingrecord";
	}

	/**
	 * Delete an existing Receivinggoods entity
	 * 
	 */
	@RequestMapping("/deleteReceivingrecordReceivinggoodses")
	public ModelAndView deleteReceivingrecordReceivinggoodses(@RequestParam String receivingrecord_id, @RequestParam String related_receivinggoodses_id) {
		ModelAndView mav = new ModelAndView();

		Receivingrecord receivingrecord = receivingrecordService.deleteReceivingrecordReceivinggoodses(receivingrecord_id, related_receivinggoodses_id);

		mav.addObject("receivingrecord_id", receivingrecord_id);
		mav.addObject("receivingrecord", receivingrecord);
		mav.setViewName("receivingrecord/viewReceivingrecord.jsp");

		return mav;
	}

	/**
	 * Select the child Receivinggoods entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteReceivingrecordReceivinggoodses")
	public ModelAndView confirmDeleteReceivingrecordReceivinggoodses(@RequestParam String receivingrecord_id, @RequestParam String related_receivinggoodses_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivinggoods", receivinggoodsDAO.findReceivinggoodsByPrimaryKey(related_receivinggoodses_id));
		mav.addObject("receivingrecord_id", receivingrecord_id);
		mav.setViewName("receivingrecord/receivinggoodses/deleteReceivinggoodses.jsp");

		return mav;
	}

	/**
	 * Show all Receivingattachment entities by Receivingrecord
	 * 
	 */
	@RequestMapping("/listReceivingrecordReceivingattachments")
	public ModelAndView listReceivingrecordReceivingattachments(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingrecord", receivingrecordDAO.findReceivingrecordByPrimaryKey(idKey));
		mav.setViewName("receivingrecord/receivingattachments/listReceivingattachments.jsp");

		return mav;
	}

	/**
	 * Create a new Receivingattachment entity
	 * 
	 */
	@RequestMapping("/newReceivingrecordReceivingattachments")
	public ModelAndView newReceivingrecordReceivingattachments(@RequestParam String receivingrecord_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("receivingrecord_id", receivingrecord_id);
		mav.addObject("receivingattachment", new Receivingattachment());
		mav.addObject("newFlag", true);
		mav.setViewName("receivingrecord/receivingattachments/editReceivingattachments.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Receivingrecord entities
	 * 
	 */
	public String indexReceivingrecord() {
		return "redirect:/indexReceivingrecord";
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
	 * Select the child Receivingattachment entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteReceivingrecordReceivingattachments")
	public ModelAndView confirmDeleteReceivingrecordReceivingattachments(@RequestParam String receivingrecord_id, @RequestParam String related_receivingattachments_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingattachment", receivingattachmentDAO.findReceivingattachmentByPrimaryKey(related_receivingattachments_id));
		mav.addObject("receivingrecord_id", receivingrecord_id);
		mav.setViewName("receivingrecord/receivingattachments/deleteReceivingattachments.jsp");

		return mav;
	}

	/**
	 * Save an existing Receivinggoods entity
	 * 
	 */
	@RequestMapping("/saveReceivingrecordReceivinggoodses")
	public ModelAndView saveReceivingrecordReceivinggoodses(@RequestParam String receivingrecord_id, @ModelAttribute Receivinggoods receivinggoodses) {
		Receivingrecord parent_receivingrecord = receivingrecordService.saveReceivingrecordReceivinggoodses(receivingrecord_id, receivinggoodses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("receivingrecord_id", receivingrecord_id);
		mav.addObject("receivingrecord", parent_receivingrecord);
		mav.setViewName("receivingrecord/viewReceivingrecord.jsp");

		return mav;
	}

	/**
	 * Edit an existing Receivinggoods entity
	 * 
	 */
	@RequestMapping("/editReceivingrecordReceivinggoodses")
	public ModelAndView editReceivingrecordReceivinggoodses(@RequestParam String receivingrecord_id, @RequestParam String receivinggoodses_id) {
		Receivinggoods receivinggoods = receivinggoodsDAO.findReceivinggoodsByPrimaryKey(receivinggoodses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("receivingrecord_id", receivingrecord_id);
		mav.addObject("receivinggoods", receivinggoods);
		mav.setViewName("receivingrecord/receivinggoodses/editReceivinggoodses.jsp");

		return mav;
	}
}