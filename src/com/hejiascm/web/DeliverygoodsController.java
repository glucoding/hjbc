package com.hejiascm.web;

import com.hejiascm.dao.DeliverygoodsDAO;
import com.hejiascm.dao.DeliveryrecordDAO;

import com.hejiascm.domain.Deliverygoods;
import com.hejiascm.domain.Deliveryrecord;

import com.hejiascm.service.DeliverygoodsService;

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
 * Spring MVC controller that handles CRUD requests for Deliverygoods entities
 * 
 */

@Controller("DeliverygoodsController")
public class DeliverygoodsController {

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
	 * Service injected by Spring that provides CRUD operations for Deliverygoods entities
	 * 
	 */
	@Autowired
	private DeliverygoodsService deliverygoodsService;

	/**
	 * Save an existing Deliverygoods entity
	 * 
	 */
	@RequestMapping("/saveDeliverygoods")
	public String saveDeliverygoods(@ModelAttribute Deliverygoods deliverygoods) {
		deliverygoodsService.saveDeliverygoods(deliverygoods);
		return "forward:/indexDeliverygoods";
	}

	/**
	 * Select the Deliverygoods entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDeliverygoods")
	public ModelAndView confirmDeleteDeliverygoods(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliverygoods", deliverygoodsDAO.findDeliverygoodsByPrimaryKey(idKey));
		mav.setViewName("deliverygoods/deleteDeliverygoods.jsp");

		return mav;
	}

	/**
	 * Select an existing Deliverygoods entity
	 * 
	 */
	@RequestMapping("/selectDeliverygoods")
	public ModelAndView selectDeliverygoods(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliverygoods", deliverygoodsDAO.findDeliverygoodsByPrimaryKey(idKey));
		mav.setViewName("deliverygoods/viewDeliverygoods.jsp");

		return mav;
	}

	/**
	 * View an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/selectDeliverygoodsDeliveryrecord")
	public ModelAndView selectDeliverygoodsDeliveryrecord(@RequestParam String deliverygoods_id, @RequestParam String deliveryrecord_id) {
		Deliveryrecord deliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("deliverygoods_id", deliverygoods_id);
		mav.addObject("deliveryrecord", deliveryrecord);
		mav.setViewName("deliverygoods/deliveryrecord/viewDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Deliverygoods entities
	 * 
	 */
	public String indexDeliverygoods() {
		return "redirect:/indexDeliverygoods";
	}

	/**
	 * Select the child Deliveryrecord entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDeliverygoodsDeliveryrecord")
	public ModelAndView confirmDeleteDeliverygoodsDeliveryrecord(@RequestParam String deliverygoods_id, @RequestParam String related_deliveryrecord_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliveryrecord", deliveryrecordDAO.findDeliveryrecordByPrimaryKey(related_deliveryrecord_id));
		mav.addObject("deliverygoods_id", deliverygoods_id);
		mav.setViewName("deliverygoods/deliveryrecord/deleteDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Delete an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/deleteDeliverygoodsDeliveryrecord")
	public ModelAndView deleteDeliverygoodsDeliveryrecord(@RequestParam String deliverygoods_id, @RequestParam String related_deliveryrecord_id) {
		ModelAndView mav = new ModelAndView();

		Deliverygoods deliverygoods = deliverygoodsService.deleteDeliverygoodsDeliveryrecord(deliverygoods_id, related_deliveryrecord_id);

		mav.addObject("deliverygoods_id", deliverygoods_id);
		mav.addObject("deliverygoods", deliverygoods);
		mav.setViewName("deliverygoods/viewDeliverygoods.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/deliverygoodsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing Deliverygoods entity
	 * 
	 */
	@RequestMapping("/deleteDeliverygoods")
	public String deleteDeliverygoods(@RequestParam String idKey) {
		Deliverygoods deliverygoods = deliverygoodsDAO.findDeliverygoodsByPrimaryKey(idKey);
		deliverygoodsService.deleteDeliverygoods(deliverygoods);
		return "forward:/indexDeliverygoods";
	}

	/**
	 * Save an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/saveDeliverygoodsDeliveryrecord")
	public ModelAndView saveDeliverygoodsDeliveryrecord(@RequestParam String deliverygoods_id, @ModelAttribute Deliveryrecord deliveryrecord) {
		Deliverygoods parent_deliverygoods = deliverygoodsService.saveDeliverygoodsDeliveryrecord(deliverygoods_id, deliveryrecord);

		ModelAndView mav = new ModelAndView();
		mav.addObject("deliverygoods_id", deliverygoods_id);
		mav.addObject("deliverygoods", parent_deliverygoods);
		mav.setViewName("deliverygoods/viewDeliverygoods.jsp");

		return mav;
	}

	/**
	 * Edit an existing Deliverygoods entity
	 * 
	 */
	@RequestMapping("/editDeliverygoods")
	public ModelAndView editDeliverygoods(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliverygoods", deliverygoodsDAO.findDeliverygoodsByPrimaryKey(idKey));
		mav.setViewName("deliverygoods/editDeliverygoods.jsp");

		return mav;
	}

	/**
	 * Show all Deliverygoods entities
	 * 
	 */
	@RequestMapping("/indexDeliverygoods")
	public ModelAndView listDeliverygoodss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliverygoodss", deliverygoodsService.loadDeliverygoodss());

		mav.setViewName("deliverygoods/listDeliverygoodss.jsp");

		return mav;
	}

	/**
	 * Create a new Deliverygoods entity
	 * 
	 */
	@RequestMapping("/newDeliverygoods")
	public ModelAndView newDeliverygoods() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliverygoods", new Deliverygoods());
		mav.addObject("newFlag", true);
		mav.setViewName("deliverygoods/editDeliverygoods.jsp");

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
	 * Create a new Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/newDeliverygoodsDeliveryrecord")
	public ModelAndView newDeliverygoodsDeliveryrecord(@RequestParam String deliverygoods_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("deliverygoods_id", deliverygoods_id);
		mav.addObject("deliveryrecord", new Deliveryrecord());
		mav.addObject("newFlag", true);
		mav.setViewName("deliverygoods/deliveryrecord/editDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Edit an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping("/editDeliverygoodsDeliveryrecord")
	public ModelAndView editDeliverygoodsDeliveryrecord(@RequestParam String deliverygoods_id, @RequestParam String deliveryrecord_id) {
		Deliveryrecord deliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("deliverygoods_id", deliverygoods_id);
		mav.addObject("deliveryrecord", deliveryrecord);
		mav.setViewName("deliverygoods/deliveryrecord/editDeliveryrecord.jsp");

		return mav;
	}

	/**
	 * Show all Deliveryrecord entities by Deliverygoods
	 * 
	 */
	@RequestMapping("/listDeliverygoodsDeliveryrecord")
	public ModelAndView listDeliverygoodsDeliveryrecord(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("deliverygoods", deliverygoodsDAO.findDeliverygoodsByPrimaryKey(idKey));
		mav.setViewName("deliverygoods/deliveryrecord/listDeliveryrecord.jsp");

		return mav;
	}
}