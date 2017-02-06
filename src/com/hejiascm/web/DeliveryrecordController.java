package com.hejiascm.web;

import com.hejiascm.dao.DeliveryattachmentDAO;
import com.hejiascm.dao.DeliverygoodsDAO;
import com.hejiascm.dao.DeliveryrecordDAO;

import com.hejiascm.domain.Deliveryattachment;
import com.hejiascm.domain.Deliverygoods;
import com.hejiascm.domain.Deliveryrecord;

import com.hejiascm.service.DeliveryrecordService;

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
 * Spring MVC controller that handles CRUD requests for Deliveryrecord entities
 * 
 */

@Controller("DeliveryrecordController")
public class DeliveryrecordController {

	/**
	 * DAO injected by Spring that manages Deliveryattachment entities
	 * 
	 */
	@Autowired
	private DeliveryattachmentDAO deliveryattachmentDAO;

	/**
	 * DAO injected by Spring that manages Deliverygoods entities
	 * 
	 */
	@Autowired
	private DeliverygoodsDAO deliverygoodsDAO;

	/**
	 * DAO injected by Spring that manages Deliveryrecord entities
	 * 
	 */
	@Autowired
	private DeliveryrecordDAO deliveryrecordDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Deliveryrecord entities
	 * 
	 */
	@Autowired
	private DeliveryrecordService deliveryrecordService;

	/**
	 * Select the child Deliverygoods entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDeliveryrecordDeliverygoodses")
	public ModelAndView confirmDeleteDeliveryrecordDeliverygoodses(@RequestParam String deliveryrecord_id, @RequestParam String related_deliverygoodses_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliverygoods", deliverygoodsDAO.findDeliverygoodsByPrimaryKey(related_deliverygoodses_id));
		mav.addObject("deliveryrecord_id", deliveryrecord_id);
		mav.setViewName("deliveryrecord/deliverygoodses/deleteDeliverygoodses.jsp");

		return mav;
	}

	/**
	 * Select the Deliveryrecord entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDeliveryrecord")
	public ModelAndView confirmDeleteDeliveryrecord(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryrecord", deliveryrecordDAO.findDeliveryrecordByPrimaryKey(idKey));
		mav.setViewName("deliveryrecord/deleteDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Deliveryrecord entities
	 * 
	 */
	public String indexDeliveryrecord() {
		return "redirect:/indexDeliveryrecord";
	}

	/**
	 * Delete an existing Deliveryattachment entity
	 * 
	 */
	@RequestMapping("/deleteDeliveryrecordDeliveryattachments")
	public ModelAndView deleteDeliveryrecordDeliveryattachments(@RequestParam String deliveryrecord_id, @RequestParam String related_deliveryattachments_id) {
		ModelAndView mav = new ModelAndView();

		Deliveryrecord deliveryrecord = deliveryrecordService.deleteDeliveryrecordDeliveryattachments(deliveryrecord_id, related_deliveryattachments_id);

		mav.addObject("deliveryrecord_id", deliveryrecord_id);
		mav.addObject("deliveryrecord", deliveryrecord);
		mav.setViewName("deliveryrecord/viewDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Edit an existing Deliverygoods entity
	 * 
	 */
	@RequestMapping("/editDeliveryrecordDeliverygoodses")
	public ModelAndView editDeliveryrecordDeliverygoodses(@RequestParam String deliveryrecord_id, @RequestParam String deliverygoodses_id) {
		Deliverygoods deliverygoods = deliverygoodsDAO.findDeliverygoodsByPrimaryKey(deliverygoodses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("deliveryrecord_id", deliveryrecord_id);
		mav.addObject("deliverygoods", deliverygoods);
		mav.setViewName("deliveryrecord/deliverygoodses/editDeliverygoodses.jsp");

		return mav;
	}

	/**
	 * Show all Deliveryattachment entities by Deliveryrecord
	 * 
	 */
	@RequestMapping("/listDeliveryrecordDeliveryattachments")
	public ModelAndView listDeliveryrecordDeliveryattachments(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryrecord", deliveryrecordDAO.findDeliveryrecordByPrimaryKey(idKey));
		mav.setViewName("deliveryrecord/deliveryattachments/listDeliveryattachments.jsp");

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
	 * View an existing Deliveryattachment entity
	 * 
	 */
	@RequestMapping("/selectDeliveryrecordDeliveryattachments")
	public ModelAndView selectDeliveryrecordDeliveryattachments(@RequestParam String deliveryrecord_id, @RequestParam String deliveryattachments_id) {
		Deliveryattachment deliveryattachment = deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(deliveryattachments_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("deliveryrecord_id", deliveryrecord_id);
		mav.addObject("deliveryattachment", deliveryattachment);
		mav.setViewName("deliveryrecord/deliveryattachments/viewDeliveryattachments.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/deliveryrecordController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * View an existing Deliverygoods entity
	 * 
	 */
	@RequestMapping("/selectDeliveryrecordDeliverygoodses")
	public ModelAndView selectDeliveryrecordDeliverygoodses(@RequestParam String deliveryrecord_id, @RequestParam String deliverygoodses_id) {
		Deliverygoods deliverygoods = deliverygoodsDAO.findDeliverygoodsByPrimaryKey(deliverygoodses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("deliveryrecord_id", deliveryrecord_id);
		mav.addObject("deliverygoods", deliverygoods);
		mav.setViewName("deliveryrecord/deliverygoodses/viewDeliverygoodses.jsp");

		return mav;
	}

	/**
	 * Delete an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/deleteDeliveryrecord")
	public String deleteDeliveryrecord(@RequestParam String idKey) {
		Deliveryrecord deliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(idKey);
		deliveryrecordService.deleteDeliveryrecord(deliveryrecord);
		return "forward:/indexDeliveryrecord";
	}

	/**
	 * Edit an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/editDeliveryrecord")
	public ModelAndView editDeliveryrecord(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryrecord", deliveryrecordDAO.findDeliveryrecordByPrimaryKey(idKey));
		mav.setViewName("deliveryrecord/editDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Delete an existing Deliverygoods entity
	 * 
	 */
	@RequestMapping("/deleteDeliveryrecordDeliverygoodses")
	public ModelAndView deleteDeliveryrecordDeliverygoodses(@RequestParam String deliveryrecord_id, @RequestParam String related_deliverygoodses_id) {
		ModelAndView mav = new ModelAndView();

		Deliveryrecord deliveryrecord = deliveryrecordService.deleteDeliveryrecordDeliverygoodses(deliveryrecord_id, related_deliverygoodses_id);

		mav.addObject("deliveryrecord_id", deliveryrecord_id);
		mav.addObject("deliveryrecord", deliveryrecord);
		mav.setViewName("deliveryrecord/viewDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Create a new Deliverygoods entity
	 * 
	 */
	@RequestMapping("/newDeliveryrecordDeliverygoodses")
	public ModelAndView newDeliveryrecordDeliverygoodses(@RequestParam String deliveryrecord_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("deliveryrecord_id", deliveryrecord_id);
		mav.addObject("deliverygoods", new Deliverygoods());
		mav.addObject("newFlag", true);
		mav.setViewName("deliveryrecord/deliverygoodses/editDeliverygoodses.jsp");

		return mav;
	}

	/**
	 * Edit an existing Deliveryattachment entity
	 * 
	 */
	@RequestMapping("/editDeliveryrecordDeliveryattachments")
	public ModelAndView editDeliveryrecordDeliveryattachments(@RequestParam String deliveryrecord_id, @RequestParam String deliveryattachments_id) {
		Deliveryattachment deliveryattachment = deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(deliveryattachments_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("deliveryrecord_id", deliveryrecord_id);
		mav.addObject("deliveryattachment", deliveryattachment);
		mav.setViewName("deliveryrecord/deliveryattachments/editDeliveryattachments.jsp");

		return mav;
	}

	/**
	 * Show all Deliverygoods entities by Deliveryrecord
	 * 
	 */
	@RequestMapping("/listDeliveryrecordDeliverygoodses")
	public ModelAndView listDeliveryrecordDeliverygoodses(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryrecord", deliveryrecordDAO.findDeliveryrecordByPrimaryKey(idKey));
		mav.setViewName("deliveryrecord/deliverygoodses/listDeliverygoodses.jsp");

		return mav;
	}

	/**
	 * Create a new Deliveryattachment entity
	 * 
	 */
	@RequestMapping("/newDeliveryrecordDeliveryattachments")
	public ModelAndView newDeliveryrecordDeliveryattachments(@RequestParam String deliveryrecord_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("deliveryrecord_id", deliveryrecord_id);
		mav.addObject("deliveryattachment", new Deliveryattachment());
		mav.addObject("newFlag", true);
		mav.setViewName("deliveryrecord/deliveryattachments/editDeliveryattachments.jsp");

		return mav;
	}

	/**
	 * Save an existing Deliveryattachment entity
	 * 
	 */
	@RequestMapping("/saveDeliveryrecordDeliveryattachments")
	public ModelAndView saveDeliveryrecordDeliveryattachments(@RequestParam String deliveryrecord_id, @ModelAttribute Deliveryattachment deliveryattachments) {
		Deliveryrecord parent_deliveryrecord = deliveryrecordService.saveDeliveryrecordDeliveryattachments(deliveryrecord_id, deliveryattachments);

		ModelAndView mav = new ModelAndView();
		mav.addObject("deliveryrecord_id", deliveryrecord_id);
		mav.addObject("deliveryrecord", parent_deliveryrecord);
		mav.setViewName("deliveryrecord/viewDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Save an existing Deliverygoods entity
	 * 
	 */
	@RequestMapping("/saveDeliveryrecordDeliverygoodses")
	public ModelAndView saveDeliveryrecordDeliverygoodses(@RequestParam String deliveryrecord_id, @ModelAttribute Deliverygoods deliverygoodses) {
		Deliveryrecord parent_deliveryrecord = deliveryrecordService.saveDeliveryrecordDeliverygoodses(deliveryrecord_id, deliverygoodses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("deliveryrecord_id", deliveryrecord_id);
		mav.addObject("deliveryrecord", parent_deliveryrecord);
		mav.setViewName("deliveryrecord/viewDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Save an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/saveDeliveryrecord")
	public String saveDeliveryrecord(@ModelAttribute Deliveryrecord deliveryrecord) {
		deliveryrecordService.saveDeliveryrecord(deliveryrecord);
		return "forward:/indexDeliveryrecord";
	}

	/**
	 * Select the child Deliveryattachment entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDeliveryrecordDeliveryattachments")
	public ModelAndView confirmDeleteDeliveryrecordDeliveryattachments(@RequestParam String deliveryrecord_id, @RequestParam String related_deliveryattachments_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryattachment", deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(related_deliveryattachments_id));
		mav.addObject("deliveryrecord_id", deliveryrecord_id);
		mav.setViewName("deliveryrecord/deliveryattachments/deleteDeliveryattachments.jsp");

		return mav;
	}

	/**
	 * Create a new Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/newDeliveryrecord")
	public ModelAndView newDeliveryrecord() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryrecord", new Deliveryrecord());
		mav.addObject("newFlag", true);
		mav.setViewName("deliveryrecord/editDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Select an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/selectDeliveryrecord")
	public ModelAndView selectDeliveryrecord(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryrecord", deliveryrecordDAO.findDeliveryrecordByPrimaryKey(idKey));
		mav.setViewName("deliveryrecord/viewDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Show all Deliveryrecord entities
	 * 
	 */
	@RequestMapping("/indexDeliveryrecord")
	public ModelAndView listDeliveryrecords() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryrecords", deliveryrecordService.loadDeliveryrecords());

		mav.setViewName("deliveryrecord/listDeliveryrecords.jsp");

		return mav;
	}
}