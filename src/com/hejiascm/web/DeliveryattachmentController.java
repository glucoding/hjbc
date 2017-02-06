package com.hejiascm.web;

import com.hejiascm.dao.DeliveryattachmentDAO;
import com.hejiascm.dao.DeliveryrecordDAO;

import com.hejiascm.domain.Deliveryattachment;
import com.hejiascm.domain.Deliveryrecord;

import com.hejiascm.service.DeliveryattachmentService;

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
 * Spring MVC controller that handles CRUD requests for Deliveryattachment entities
 * 
 */

@Controller("DeliveryattachmentController")
public class DeliveryattachmentController {

	/**
	 * DAO injected by Spring that manages Deliveryattachment entities
	 * 
	 */
	@Autowired
	private DeliveryattachmentDAO deliveryattachmentDAO;

	/**
	 * DAO injected by Spring that manages Deliveryrecord entities
	 * 
	 */
	@Autowired
	private DeliveryrecordDAO deliveryrecordDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Deliveryattachment entities
	 * 
	 */
	@Autowired
	private DeliveryattachmentService deliveryattachmentService;

	/**
	 * Create a new Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/newDeliveryattachmentDeliveryrecord")
	public ModelAndView newDeliveryattachmentDeliveryrecord(@RequestParam String deliveryattachment_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("deliveryattachment_id", deliveryattachment_id);
		mav.addObject("deliveryrecord", new Deliveryrecord());
		mav.addObject("newFlag", true);
		mav.setViewName("deliveryattachment/deliveryrecord/editDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Deliveryattachment entities
	 * 
	 */
	public String indexDeliveryattachment() {
		return "redirect:/indexDeliveryattachment";
	}

	/**
	 * Edit an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/editDeliveryattachmentDeliveryrecord")
	public ModelAndView editDeliveryattachmentDeliveryrecord(@RequestParam String deliveryattachment_id, @RequestParam String deliveryrecord_id) {
		Deliveryrecord deliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("deliveryattachment_id", deliveryattachment_id);
		mav.addObject("deliveryrecord", deliveryrecord);
		mav.setViewName("deliveryattachment/deliveryrecord/editDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Save an existing Deliveryattachment entity
	 * 
	 */
	@RequestMapping("/saveDeliveryattachment")
	public String saveDeliveryattachment(@ModelAttribute Deliveryattachment deliveryattachment) {
		deliveryattachmentService.saveDeliveryattachment(deliveryattachment);
		return "forward:/indexDeliveryattachment";
	}

	/**
	 * Create a new Deliveryattachment entity
	 * 
	 */
	@RequestMapping("/newDeliveryattachment")
	public ModelAndView newDeliveryattachment() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryattachment", new Deliveryattachment());
		mav.addObject("newFlag", true);
		mav.setViewName("deliveryattachment/editDeliveryattachment.jsp");

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
	 */
	@RequestMapping("/deliveryattachmentController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing Deliveryattachment entity
	 * 
	 */
	@RequestMapping("/deleteDeliveryattachment")
	public String deleteDeliveryattachment(@RequestParam String idKey) {
		Deliveryattachment deliveryattachment = deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(idKey);
		deliveryattachmentService.deleteDeliveryattachment(deliveryattachment);
		return "forward:/indexDeliveryattachment";
	}

	/**
	 * Edit an existing Deliveryattachment entity
	 * 
	 */
	@RequestMapping("/editDeliveryattachment")
	public ModelAndView editDeliveryattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryattachment", deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(idKey));
		mav.setViewName("deliveryattachment/editDeliveryattachment.jsp");

		return mav;
	}

	/**
	 * Delete an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/deleteDeliveryattachmentDeliveryrecord")
	public ModelAndView deleteDeliveryattachmentDeliveryrecord(@RequestParam String deliveryattachment_id, @RequestParam String related_deliveryrecord_id) {
		ModelAndView mav = new ModelAndView();

		Deliveryattachment deliveryattachment = deliveryattachmentService.deleteDeliveryattachmentDeliveryrecord(deliveryattachment_id, related_deliveryrecord_id);

		mav.addObject("deliveryattachment_id", deliveryattachment_id);
		mav.addObject("deliveryattachment", deliveryattachment);
		mav.setViewName("deliveryattachment/viewDeliveryattachment.jsp");

		return mav;
	}

	/**
	 * Show all Deliveryrecord entities by Deliveryattachment
	 * 
	 */
	@RequestMapping("/listDeliveryattachmentDeliveryrecord")
	public ModelAndView listDeliveryattachmentDeliveryrecord(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryattachment", deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(idKey));
		mav.setViewName("deliveryattachment/deliveryrecord/listDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Select an existing Deliveryattachment entity
	 * 
	 */
	@RequestMapping("/selectDeliveryattachment")
	public ModelAndView selectDeliveryattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryattachment", deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(idKey));
		mav.setViewName("deliveryattachment/viewDeliveryattachment.jsp");

		return mav;
	}

	/**
	 * Select the child Deliveryrecord entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDeliveryattachmentDeliveryrecord")
	public ModelAndView confirmDeleteDeliveryattachmentDeliveryrecord(@RequestParam String deliveryattachment_id, @RequestParam String related_deliveryrecord_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryrecord", deliveryrecordDAO.findDeliveryrecordByPrimaryKey(related_deliveryrecord_id));
		mav.addObject("deliveryattachment_id", deliveryattachment_id);
		mav.setViewName("deliveryattachment/deliveryrecord/deleteDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Select the Deliveryattachment entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDeliveryattachment")
	public ModelAndView confirmDeleteDeliveryattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryattachment", deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(idKey));
		mav.setViewName("deliveryattachment/deleteDeliveryattachment.jsp");

		return mav;
	}

	/**
	 * Show all Deliveryattachment entities
	 * 
	 */
	@RequestMapping("/indexDeliveryattachment")
	public ModelAndView listDeliveryattachments() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryattachments", deliveryattachmentService.loadDeliveryattachments());

		mav.setViewName("deliveryattachment/listDeliveryattachments.jsp");

		return mav;
	}

	/**
	 * Save an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/saveDeliveryattachmentDeliveryrecord")
	public ModelAndView saveDeliveryattachmentDeliveryrecord(@RequestParam String deliveryattachment_id, @ModelAttribute Deliveryrecord deliveryrecord) {
		Deliveryattachment parent_deliveryattachment = deliveryattachmentService.saveDeliveryattachmentDeliveryrecord(deliveryattachment_id, deliveryrecord);

		ModelAndView mav = new ModelAndView();
		mav.addObject("deliveryattachment_id", deliveryattachment_id);
		mav.addObject("deliveryattachment", parent_deliveryattachment);
		mav.setViewName("deliveryattachment/viewDeliveryattachment.jsp");

		return mav;
	}

	/**
	 * View an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/selectDeliveryattachmentDeliveryrecord")
	public ModelAndView selectDeliveryattachmentDeliveryrecord(@RequestParam String deliveryattachment_id, @RequestParam String deliveryrecord_id) {
		Deliveryrecord deliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("deliveryattachment_id", deliveryattachment_id);
		mav.addObject("deliveryrecord", deliveryrecord);
		mav.setViewName("deliveryattachment/deliveryrecord/viewDeliveryrecord.jsp");

		return mav;
	}
}