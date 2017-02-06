package com.hejiascm.web;

import com.hejiascm.dao.OrderDAO;
import com.hejiascm.dao.OrderattachmentDAO;

import com.hejiascm.domain.Order;
import com.hejiascm.domain.Orderattachment;

import com.hejiascm.service.OrderattachmentService;

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
 * Spring MVC controller that handles CRUD requests for Orderattachment entities
 * 
 */

@Controller("OrderattachmentController")
public class OrderattachmentController {

	/**
	 * DAO injected by Spring that manages Order entities
	 * 
	 */
	@Autowired
	private OrderDAO orderDAO;

	/**
	 * DAO injected by Spring that manages Orderattachment entities
	 * 
	 */
	@Autowired
	private OrderattachmentDAO orderattachmentDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Orderattachment entities
	 * 
	 */
	@Autowired
	private OrderattachmentService orderattachmentService;

	/**
	 * Save an existing Order entity
	 * 
	 */
	@RequestMapping("/saveOrderattachmentOrder")
	public ModelAndView saveOrderattachmentOrder(@RequestParam String orderattachment_id, @ModelAttribute Order order) {
		Orderattachment parent_orderattachment = orderattachmentService.saveOrderattachmentOrder(orderattachment_id, order);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderattachment_id", orderattachment_id);
		mav.addObject("orderattachment", parent_orderattachment);
		mav.setViewName("orderattachment/viewOrderattachment.jsp");

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
	 * Edit an existing Orderattachment entity
	 * 
	 */
	@RequestMapping("/editOrderattachment")
	public ModelAndView editOrderattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderattachment", orderattachmentDAO.findOrderattachmentByPrimaryKey(idKey));
		mav.setViewName("orderattachment/editOrderattachment.jsp");

		return mav;
	}

	/**
	 * Select the Orderattachment entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderattachment")
	public ModelAndView confirmDeleteOrderattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderattachment", orderattachmentDAO.findOrderattachmentByPrimaryKey(idKey));
		mav.setViewName("orderattachment/deleteOrderattachment.jsp");

		return mav;
	}

	/**
	 * Create a new Order entity
	 * 
	 */
	@RequestMapping("/newOrderattachmentOrder")
	public ModelAndView newOrderattachmentOrder(@RequestParam String orderattachment_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("orderattachment_id", orderattachment_id);
		mav.addObject("order", new Order());
		mav.addObject("newFlag", true);
		mav.setViewName("orderattachment/order/editOrder.jsp");

		return mav;
	}

	/**
	 * Select an existing Orderattachment entity
	 * 
	 */
	@RequestMapping("/selectOrderattachment")
	public ModelAndView selectOrderattachment(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderattachment", orderattachmentDAO.findOrderattachmentByPrimaryKey(idKey));
		mav.setViewName("orderattachment/viewOrderattachment.jsp");

		return mav;
	}

	/**
	 * Show all Orderattachment entities
	 * 
	 */
	@RequestMapping("/indexOrderattachment")
	public ModelAndView listOrderattachments() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderattachments", orderattachmentService.loadOrderattachments());

		mav.setViewName("orderattachment/listOrderattachments.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Orderattachment entities
	 * 
	 */
	public String indexOrderattachment() {
		return "redirect:/indexOrderattachment";
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@RequestMapping("/deleteOrderattachmentOrder")
	public ModelAndView deleteOrderattachmentOrder(@RequestParam String orderattachment_id, @RequestParam String related_order_id) {
		ModelAndView mav = new ModelAndView();

		Orderattachment orderattachment = orderattachmentService.deleteOrderattachmentOrder(orderattachment_id, related_order_id);

		mav.addObject("orderattachment_id", orderattachment_id);
		mav.addObject("orderattachment", orderattachment);
		mav.setViewName("orderattachment/viewOrderattachment.jsp");

		return mav;
	}

	/**
	 * Save an existing Orderattachment entity
	 * 
	 */
	@RequestMapping("/saveOrderattachment")
	public String saveOrderattachment(@ModelAttribute Orderattachment orderattachment) {
		orderattachmentService.saveOrderattachment(orderattachment);
		return "forward:/indexOrderattachment";
	}

	/**
	 * Select the child Order entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderattachmentOrder")
	public ModelAndView confirmDeleteOrderattachmentOrder(@RequestParam String orderattachment_id, @RequestParam String related_order_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(related_order_id));
		mav.addObject("orderattachment_id", orderattachment_id);
		mav.setViewName("orderattachment/order/deleteOrder.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/orderattachmentController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new Orderattachment entity
	 * 
	 */
	@RequestMapping("/newOrderattachment")
	public ModelAndView newOrderattachment() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderattachment", new Orderattachment());
		mav.addObject("newFlag", true);
		mav.setViewName("orderattachment/editOrderattachment.jsp");

		return mav;
	}

	/**
	 * Show all Order entities by Orderattachment
	 * 
	 */
	@RequestMapping("/listOrderattachmentOrder")
	public ModelAndView listOrderattachmentOrder(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderattachment", orderattachmentDAO.findOrderattachmentByPrimaryKey(idKey));
		mav.setViewName("orderattachment/order/listOrder.jsp");

		return mav;
	}

	/**
	 * Delete an existing Orderattachment entity
	 * 
	 */
	@RequestMapping("/deleteOrderattachment")
	public String deleteOrderattachment(@RequestParam String idKey) {
		Orderattachment orderattachment = orderattachmentDAO.findOrderattachmentByPrimaryKey(idKey);
		orderattachmentService.deleteOrderattachment(orderattachment);
		return "forward:/indexOrderattachment";
	}

	/**
	 * Edit an existing Order entity
	 * 
	 */
	@RequestMapping("/editOrderattachmentOrder")
	public ModelAndView editOrderattachmentOrder(@RequestParam String orderattachment_id, @RequestParam String order_id) {
		Order order = orderDAO.findOrderByPrimaryKey(order_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderattachment_id", orderattachment_id);
		mav.addObject("order", order);
		mav.setViewName("orderattachment/order/editOrder.jsp");

		return mav;
	}

	/**
	 * View an existing Order entity
	 * 
	 */
	@RequestMapping("/selectOrderattachmentOrder")
	public ModelAndView selectOrderattachmentOrder(@RequestParam String orderattachment_id, @RequestParam String order_id) {
		Order order = orderDAO.findOrderByPrimaryKey(order_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("orderattachment_id", orderattachment_id);
		mav.addObject("order", order);
		mav.setViewName("orderattachment/order/viewOrder.jsp");

		return mav;
	}
}