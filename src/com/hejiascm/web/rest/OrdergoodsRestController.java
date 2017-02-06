package com.hejiascm.web.rest;

import com.hejiascm.dao.OrderDAO;
import com.hejiascm.dao.OrdergoodsDAO;

import com.hejiascm.domain.Order;
import com.hejiascm.domain.Ordergoods;

import com.hejiascm.service.OrdergoodsService;

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
 * Spring Rest controller that handles CRUD requests for Ordergoods entities
 * 
 */

@Controller("OrdergoodsRestController")
public class OrdergoodsRestController {

	/**
	 * DAO injected by Spring that manages Order entities
	 * 
	 */
	@Autowired
	private OrderDAO orderDAO;

	/**
	 * DAO injected by Spring that manages Ordergoods entities
	 * 
	 */
	@Autowired
	private OrdergoodsDAO ordergoodsDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Ordergoods entities
	 * 
	 */
	@Autowired
	private OrdergoodsService ordergoodsService;

	/**
	 * Show all Ordergoods entities
	 * 
	 */
	@RequestMapping(value = "/Ordergoods", method = RequestMethod.GET)
	@ResponseBody
	public List<Ordergoods> listOrdergoodss() {
		return new java.util.ArrayList<Ordergoods>(ordergoodsService.loadOrdergoodss());
	}

	/**
	 * Delete an existing Ordergoods entity
	 * 
	 */
	@RequestMapping(value = "/Ordergoods/{ordergoods_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrdergoods(@PathVariable String ordergoods_id) {
		Ordergoods ordergoods = ordergoodsDAO.findOrdergoodsByPrimaryKey(ordergoods_id);
		ordergoodsService.deleteOrdergoods(ordergoods);
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Ordergoods/{ordergoods_id}/order", method = RequestMethod.PUT)
	@ResponseBody
	public Order saveOrdergoodsOrder(@PathVariable String ordergoods_id, @RequestBody Order order) {
		ordergoodsService.saveOrdergoodsOrder(ordergoods_id, order);
		return orderDAO.findOrderByPrimaryKey(order.getId());
	}

	/**
	 * View an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Ordergoods/{ordergoods_id}/order/{order_id}", method = RequestMethod.GET)
	@ResponseBody
	public Order loadOrdergoodsOrder(@PathVariable String ordergoods_id, @PathVariable String related_order_id) {
		Order order = orderDAO.findOrderByPrimaryKey(related_order_id, -1, -1);

		return order;
	}

	/**
	 * Select an existing Ordergoods entity
	 * 
	 */
	@RequestMapping(value = "/Ordergoods/{ordergoods_id}", method = RequestMethod.GET)
	@ResponseBody
	public Ordergoods loadOrdergoods(@PathVariable String ordergoods_id) {
		return ordergoodsDAO.findOrdergoodsByPrimaryKey(ordergoods_id);
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
	 * Create a new Ordergoods entity
	 * 
	 */
	@RequestMapping(value = "/Ordergoods", method = RequestMethod.POST)
	@ResponseBody
	public Ordergoods newOrdergoods(@RequestBody Ordergoods ordergoods) {
		ordergoodsService.saveOrdergoods(ordergoods);
		return ordergoodsDAO.findOrdergoodsByPrimaryKey(ordergoods.getId());
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Ordergoods/{ordergoods_id}/order/{order_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrdergoodsOrder(@PathVariable String ordergoods_id, @PathVariable String related_order_id) {
		ordergoodsService.deleteOrdergoodsOrder(ordergoods_id, related_order_id);
	}

	/**
	 * Save an existing Ordergoods entity
	 * 
	 */
	@RequestMapping(value = "/Ordergoods", method = RequestMethod.PUT)
	@ResponseBody
	public Ordergoods saveOrdergoods(@RequestBody Ordergoods ordergoods) {
		ordergoodsService.saveOrdergoods(ordergoods);
		return ordergoodsDAO.findOrdergoodsByPrimaryKey(ordergoods.getId());
	}

	/**
	 * Create a new Order entity
	 * 
	 */
	@RequestMapping(value = "/Ordergoods/{ordergoods_id}/order", method = RequestMethod.POST)
	@ResponseBody
	public Order newOrdergoodsOrder(@PathVariable String ordergoods_id, @RequestBody Order order) {
		ordergoodsService.saveOrdergoodsOrder(ordergoods_id, order);
		return orderDAO.findOrderByPrimaryKey(order.getId());
	}

	/**
	 * Get Order entity by Ordergoods
	 * 
	 */
	@RequestMapping(value = "/Ordergoods/{ordergoods_id}/order", method = RequestMethod.GET)
	@ResponseBody
	public Order getOrdergoodsOrder(@PathVariable String ordergoods_id) {
		return ordergoodsDAO.findOrdergoodsByPrimaryKey(ordergoods_id).getOrder();
	}
}