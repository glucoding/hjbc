package com.hejiascm.web.rest;

import com.hejiascm.dao.OrderDAO;
import com.hejiascm.dao.OrderattachmentDAO;

import com.hejiascm.domain.Order;
import com.hejiascm.domain.Orderattachment;

import com.hejiascm.service.OrderattachmentService;

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
 * Spring Rest controller that handles CRUD requests for Orderattachment entities
 * 
 */

@Controller("OrderattachmentRestController")
public class OrderattachmentRestController {

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
	 * Show all Orderattachment entities
	 * 
	 */
	@RequestMapping(value = "/Orderattachment", method = RequestMethod.GET)
	@ResponseBody
	public List<Orderattachment> listOrderattachments() {
		return new java.util.ArrayList<Orderattachment>(orderattachmentService.loadOrderattachments());
	}

	/**
	 * Create a new Order entity
	 * 
	 */
	@RequestMapping(value = "/Orderattachment/{orderattachment_id}/order", method = RequestMethod.POST)
	@ResponseBody
	public Order newOrderattachmentOrder(@PathVariable String orderattachment_id, @RequestBody Order order) {
		orderattachmentService.saveOrderattachmentOrder(orderattachment_id, order);
		return orderDAO.findOrderByPrimaryKey(order.getId());
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Orderattachment/{orderattachment_id}/order", method = RequestMethod.PUT)
	@ResponseBody
	public Order saveOrderattachmentOrder(@PathVariable String orderattachment_id, @RequestBody Order order) {
		orderattachmentService.saveOrderattachmentOrder(orderattachment_id, order);
		return orderDAO.findOrderByPrimaryKey(order.getId());
	}

	/**
	 * Save an existing Orderattachment entity
	 * 
	 */
	@RequestMapping(value = "/Orderattachment", method = RequestMethod.PUT)
	@ResponseBody
	public Orderattachment saveOrderattachment(@RequestBody Orderattachment orderattachment) {
		orderattachmentService.saveOrderattachment(orderattachment);
		return orderattachmentDAO.findOrderattachmentByPrimaryKey(orderattachment.getId());
	}

	/**
	 * Get Order entity by Orderattachment
	 * 
	 */
	@RequestMapping(value = "/Orderattachment/{orderattachment_id}/order", method = RequestMethod.GET)
	@ResponseBody
	public Order getOrderattachmentOrder(@PathVariable String orderattachment_id) {
		return orderattachmentDAO.findOrderattachmentByPrimaryKey(orderattachment_id).getOrder();
	}

	/**
	 * Select an existing Orderattachment entity
	 * 
	 */
	@RequestMapping(value = "/Orderattachment/{orderattachment_id}", method = RequestMethod.GET)
	@ResponseBody
	public Orderattachment loadOrderattachment(@PathVariable String orderattachment_id) {
		return orderattachmentDAO.findOrderattachmentByPrimaryKey(orderattachment_id);
	}

	/**
	 * Create a new Orderattachment entity
	 * 
	 */
	@RequestMapping(value = "/Orderattachment", method = RequestMethod.POST)
	@ResponseBody
	public Orderattachment newOrderattachment(@RequestBody Orderattachment orderattachment) {
		orderattachmentService.saveOrderattachment(orderattachment);
		return orderattachmentDAO.findOrderattachmentByPrimaryKey(orderattachment.getId());
	}

	/**
	 * Delete an existing Orderattachment entity
	 * 
	 */
	@RequestMapping(value = "/Orderattachment/{orderattachment_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderattachment(@PathVariable String orderattachment_id) {
		Orderattachment orderattachment = orderattachmentDAO.findOrderattachmentByPrimaryKey(orderattachment_id);
		orderattachmentService.deleteOrderattachment(orderattachment);
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Orderattachment/{orderattachment_id}/order/{order_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderattachmentOrder(@PathVariable String orderattachment_id, @PathVariable String related_order_id) {
		orderattachmentService.deleteOrderattachmentOrder(orderattachment_id, related_order_id);
	}

	/**
	 * View an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Orderattachment/{orderattachment_id}/order/{order_id}", method = RequestMethod.GET)
	@ResponseBody
	public Order loadOrderattachmentOrder(@PathVariable String orderattachment_id, @PathVariable String related_order_id) {
		Order order = orderDAO.findOrderByPrimaryKey(related_order_id, -1, -1);

		return order;
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