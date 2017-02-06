package com.hejiascm.web;

import com.hejiascm.dao.ReceivinggoodsDAO;
import com.hejiascm.dao.ReceivingrecordDAO;

import com.hejiascm.domain.Receivinggoods;
import com.hejiascm.domain.Receivingrecord;

import com.hejiascm.service.ReceivinggoodsService;

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
 * Spring MVC controller that handles CRUD requests for Receivinggoods entities
 * 
 */

@Controller("ReceivinggoodsController")
public class ReceivinggoodsController {

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
	 * Service injected by Spring that provides CRUD operations for Receivinggoods entities
	 * 
	 */
	@Autowired
	private ReceivinggoodsService receivinggoodsService;

	/**
	 * Select the Receivinggoods entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteReceivinggoods")
	public ModelAndView confirmDeleteReceivinggoods(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivinggoods", receivinggoodsDAO.findReceivinggoodsByPrimaryKey(idKey));
		mav.setViewName("receivinggoods/deleteReceivinggoods.jsp");

		return mav;
	}

	/**
	 * Edit an existing Receivinggoods entity
	 * 
	 */
	@RequestMapping("/editReceivinggoods")
	public ModelAndView editReceivinggoods(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivinggoods", receivinggoodsDAO.findReceivinggoodsByPrimaryKey(idKey));
		mav.setViewName("receivinggoods/editReceivinggoods.jsp");

		return mav;
	}

	/**
	 * Show all Receivinggoods entities
	 * 
	 */
	@RequestMapping("/indexReceivinggoods")
	public ModelAndView listReceivinggoodss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivinggoodss", receivinggoodsService.loadReceivinggoodss());

		mav.setViewName("receivinggoods/listReceivinggoodss.jsp");

		return mav;
	}

	/**
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping("/deleteReceivinggoodsReceivingrecord")
	public ModelAndView deleteReceivinggoodsReceivingrecord(@RequestParam String receivinggoods_id, @RequestParam String related_receivingrecord_id) {
		ModelAndView mav = new ModelAndView();

		Receivinggoods receivinggoods = receivinggoodsService.deleteReceivinggoodsReceivingrecord(receivinggoods_id, related_receivingrecord_id);

		mav.addObject("receivinggoods_id", receivinggoods_id);
		mav.addObject("receivinggoods", receivinggoods);
		mav.setViewName("receivinggoods/viewReceivinggoods.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Receivinggoods entities
	 * 
	 */
	public String indexReceivinggoods() {
		return "redirect:/indexReceivinggoods";
	}

	/**
	 * Edit an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping("/editReceivinggoodsReceivingrecord")
	public ModelAndView editReceivinggoodsReceivingrecord(@RequestParam String receivinggoods_id, @RequestParam String receivingrecord_id) {
		Receivingrecord receivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("receivinggoods_id", receivinggoods_id);
		mav.addObject("receivingrecord", receivingrecord);
		mav.setViewName("receivinggoods/receivingrecord/editReceivingrecord.jsp");

		return mav;
	}

	/**
	 * View an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping("/selectReceivinggoodsReceivingrecord")
	public ModelAndView selectReceivinggoodsReceivingrecord(@RequestParam String receivinggoods_id, @RequestParam String receivingrecord_id) {
		Receivingrecord receivingrecord = receivingrecordDAO.findReceivingrecordByPrimaryKey(receivingrecord_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("receivinggoods_id", receivinggoods_id);
		mav.addObject("receivingrecord", receivingrecord);
		mav.setViewName("receivinggoods/receivingrecord/viewReceivingrecord.jsp");

		return mav;
	}

	/**
	 * Save an existing Receivinggoods entity
	 * 
	 */
	@RequestMapping("/saveReceivinggoods")
	public String saveReceivinggoods(@ModelAttribute Receivinggoods receivinggoods) {
		receivinggoodsService.saveReceivinggoods(receivinggoods);
		return "forward:/indexReceivinggoods";
	}

	/**
	 * Save an existing Receivingrecord entity
	 * 
	 */
	@RequestMapping("/saveReceivinggoodsReceivingrecord")
	public ModelAndView saveReceivinggoodsReceivingrecord(@RequestParam String receivinggoods_id, @ModelAttribute Receivingrecord receivingrecord) {
		Receivinggoods parent_receivinggoods = receivinggoodsService.saveReceivinggoodsReceivingrecord(receivinggoods_id, receivingrecord);

		ModelAndView mav = new ModelAndView();
		mav.addObject("receivinggoods_id", receivinggoods_id);
		mav.addObject("receivinggoods", parent_receivinggoods);
		mav.setViewName("receivinggoods/viewReceivinggoods.jsp");

		return mav;
	}

	/**
	 * Show all Receivingrecord entities by Receivinggoods
	 * 
	 */
	@RequestMapping("/listReceivinggoodsReceivingrecord")
	public ModelAndView listReceivinggoodsReceivingrecord(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivinggoods", receivinggoodsDAO.findReceivinggoodsByPrimaryKey(idKey));
		mav.setViewName("receivinggoods/receivingrecord/listReceivingrecord.jsp");

		return mav;
	}

	/**
	 * Create a new Receivingrecord entity
	 * 
	 */
	@RequestMapping("/newReceivinggoodsReceivingrecord")
	public ModelAndView newReceivinggoodsReceivingrecord(@RequestParam String receivinggoods_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("receivinggoods_id", receivinggoods_id);
		mav.addObject("receivingrecord", new Receivingrecord());
		mav.addObject("newFlag", true);
		mav.setViewName("receivinggoods/receivingrecord/editReceivingrecord.jsp");

		return mav;
	}

	/**
	 * Create a new Receivinggoods entity
	 * 
	 */
	@RequestMapping("/newReceivinggoods")
	public ModelAndView newReceivinggoods() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivinggoods", new Receivinggoods());
		mav.addObject("newFlag", true);
		mav.setViewName("receivinggoods/editReceivinggoods.jsp");

		return mav;
	}

	/**
	 * Delete an existing Receivinggoods entity
	 * 
	 */
	@RequestMapping("/deleteReceivinggoods")
	public String deleteReceivinggoods(@RequestParam String idKey) {
		Receivinggoods receivinggoods = receivinggoodsDAO.findReceivinggoodsByPrimaryKey(idKey);
		receivinggoodsService.deleteReceivinggoods(receivinggoods);
		return "forward:/indexReceivinggoods";
	}

	/**
	 * Select the child Receivingrecord entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteReceivinggoodsReceivingrecord")
	public ModelAndView confirmDeleteReceivinggoodsReceivingrecord(@RequestParam String receivinggoods_id, @RequestParam String related_receivingrecord_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivingrecord", receivingrecordDAO.findReceivingrecordByPrimaryKey(related_receivingrecord_id));
		mav.addObject("receivinggoods_id", receivinggoods_id);
		mav.setViewName("receivinggoods/receivingrecord/deleteReceivingrecord.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/receivinggoodsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select an existing Receivinggoods entity
	 * 
	 */
	@RequestMapping("/selectReceivinggoods")
	public ModelAndView selectReceivinggoods(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("receivinggoods", receivinggoodsDAO.findReceivinggoodsByPrimaryKey(idKey));
		mav.setViewName("receivinggoods/viewReceivinggoods.jsp");

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
}