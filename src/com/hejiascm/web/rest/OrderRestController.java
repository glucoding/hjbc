package com.hejiascm.web.rest;

import com.hejiascm.blockchain.dao.BcOrderDAO;
import com.hejiascm.dao.OrderDAO;
import com.hejiascm.dao.OrderattachmentDAO;
import com.hejiascm.dao.OrdergoodsDAO;
import com.hejiascm.domain.Order;
import com.hejiascm.domain.Orderattachment;
import com.hejiascm.domain.Ordergoods;
import com.hejiascm.domain.Tradecontract;
import com.hejiascm.service.OrderService;
import com.hejiascm.util.MiscTool;

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
 * Spring Rest controller that handles CRUD requests for Order entities
 * 
 */

@Controller("OrderRestController")
public class OrderRestController {

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
	 * DAO injected by Spring that manages Ordergoods entities
	 * 
	 */
	@Autowired
	private OrdergoodsDAO ordergoodsDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Order entities
	 * 
	 */
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private BcOrderDAO bcOrderDAO;

	/**
	 * Create a new Ordergoods entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/ordergoodses", method = RequestMethod.POST)
	@ResponseBody
	public Ordergoods newOrderOrdergoodses(@PathVariable String order_id, @RequestBody Ordergoods ordergoods) {
		orderService.saveOrderOrdergoodses(order_id, ordergoods);
		return ordergoodsDAO.findOrdergoodsByPrimaryKey(ordergoods.getId());
	}

	/**
	 * View an existing Ordergoods entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/ordergoodses/{ordergoods_id}", method = RequestMethod.GET)
	@ResponseBody
	public Ordergoods loadOrderOrdergoodses(@PathVariable String order_id, @PathVariable String related_ordergoodses_id) {
		Ordergoods ordergoods = ordergoodsDAO.findOrdergoodsByPrimaryKey(related_ordergoodses_id, -1, -1);

		return ordergoods;
	}

	/**
	 * Save an existing Ordergoods entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/ordergoodses", method = RequestMethod.PUT)
	@ResponseBody
	public Ordergoods saveOrderOrdergoodses(@PathVariable String order_id, @RequestBody Ordergoods ordergoodses) {
		orderService.saveOrderOrdergoodses(order_id, ordergoodses);
		return ordergoodsDAO.findOrdergoodsByPrimaryKey(ordergoodses.getId());
	}

	/**
	 * Save an existing Orderattachment entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/orderattachments", method = RequestMethod.PUT)
	@ResponseBody
	public Orderattachment saveOrderOrderattachments(@PathVariable String order_id, @RequestBody Orderattachment orderattachments) {
		orderService.saveOrderOrderattachments(order_id, orderattachments);
		return orderattachmentDAO.findOrderattachmentByPrimaryKey(orderattachments.getId());
	}

	/**
	 * Delete an existing Ordergoods entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/ordergoodses/{ordergoods_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderOrdergoodses(@PathVariable String order_id, @PathVariable String related_ordergoodses_id) {
		orderService.deleteOrderOrdergoodses(order_id, related_ordergoodses_id);
	}

	/**
	 * View an existing Orderattachment entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/orderattachments/{orderattachment_id}", method = RequestMethod.GET)
	@ResponseBody
	public Orderattachment loadOrderOrderattachments(@PathVariable String order_id, @PathVariable String related_orderattachments_id) {
		Orderattachment orderattachment = orderattachmentDAO.findOrderattachmentByPrimaryKey(related_orderattachments_id, -1, -1);

		return orderattachment;
	}

	/**
	 * Create a new Orderattachment entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/orderattachments", method = RequestMethod.POST)
	@ResponseBody
	public Orderattachment newOrderOrderattachments(@PathVariable String order_id, @RequestBody Orderattachment orderattachment) {
		orderService.saveOrderOrderattachments(order_id, orderattachment);
		return orderattachmentDAO.findOrderattachmentByPrimaryKey(orderattachment.getId());
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Order", method = RequestMethod.PUT)
	@ResponseBody
	public Order saveOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
		return orderDAO.findOrderByPrimaryKey(order.getId());
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrder(@PathVariable String order_id) {
		Order order = orderDAO.findOrderByPrimaryKey(order_id);
		orderService.deleteOrder(order);
	}

	/**
	 * Show all Ordergoods entities by Order
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/ordergoodses", method = RequestMethod.GET)
	@ResponseBody
	public List<Ordergoods> getOrderOrdergoodses(@PathVariable String order_id) {
		return new java.util.ArrayList<Ordergoods>(orderDAO.findOrderByPrimaryKey(order_id).getOrdergoodses());
	}

	/**
	 * Delete an existing Orderattachment entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/orderattachments/{orderattachment_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOrderOrderattachments(@PathVariable String order_id, @PathVariable String related_orderattachments_id) {
		orderService.deleteOrderOrderattachments(order_id, related_orderattachments_id);
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
	 * Create a new Order entity
	 * 
	 */
	@RequestMapping(value = "/Order", method = RequestMethod.POST)
	@ResponseBody
	public Order newOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
		return orderDAO.findOrderByPrimaryKey(order.getId());
	}

	/**
	 * Select an existing Order entity
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}", method = RequestMethod.GET)
	@ResponseBody
	public Order loadOrder(@PathVariable String order_id) {
		return orderDAO.findOrderByPrimaryKey(order_id);
	}

	/**
	 * Show all Order entities
	 * 
	 */
	@RequestMapping(value = "/Order", method = RequestMethod.GET)
	@ResponseBody
	public List<Order> listOrders() {
		return new java.util.ArrayList<Order>(orderService.loadOrders());
	}

	/**
	 * Show all Orderattachment entities by Order
	 * 
	 */
	@RequestMapping(value = "/Order/{order_id}/orderattachments", method = RequestMethod.GET)
	@ResponseBody
	public List<Orderattachment> getOrderOrderattachments(@PathVariable String order_id) {
		return new java.util.ArrayList<Orderattachment>(orderDAO.findOrderByPrimaryKey(order_id).getOrderattachments());
	}
	
	/**
	 * Block chain
	 * @param String id, String orderFormId, String contractId, String contractVersion
	 * @return List<Order>
	 * 
	 */
	@RequestMapping(value = "/bcOrder/{id}/{orderFormId}/{contractId}/{contractVersion}", method = RequestMethod.GET)
	@ResponseBody
	public List<Order> listBcOrders(@PathVariable String id, @PathVariable String orderFormId, @PathVariable String contractId, @PathVariable String contractVersion) {
		return bcOrderDAO.getBcOrder(id, orderFormId, contractId, contractVersion);
	}
	
	/**
	 * Block chain
	 * @param Order
	 * @return String orderId
	 */
	@RequestMapping(value = "/bcTradeOrder", method = RequestMethod.POST)
	@ResponseBody
	public String newBcTradeOrder(@RequestBody Order order) {
		return bcOrderDAO.submitBcOrder(order);
	}
	
	/**
	 * Block chain
	 * @param Tradecontract
	 * @return String contractId
	 */
	@RequestMapping(value = "/bcConfirmTradeOrder/{id}/{orderFormId}/{contractId}/{contractVersion}", method = RequestMethod.POST)
	@ResponseBody
	public void confirmBcTradecontract(@PathVariable String id, @PathVariable String orderFormId, @PathVariable String contractId, @PathVariable String contractVersion) {
		bcOrderDAO.confirmBcOrder(id, orderFormId, contractId, contractVersion);
	}
}