package com.hejiascm.web;

import com.hejiascm.dao.OrderDAO;
import com.hejiascm.dao.OrderattachmentDAO;
import com.hejiascm.dao.OrdergoodsDAO;

import com.hejiascm.domain.Order;
import com.hejiascm.domain.Orderattachment;
import com.hejiascm.domain.Ordergoods;

import com.hejiascm.service.OrderService;

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
 * Spring MVC controller that handles CRUD requests for Order entities
 * 
 */

@Controller("OrderController")
public class OrderController {

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

	/**
	 */
	@RequestMapping("/orderController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * View an existing Ordergoods entity
	 * 
	 */
	@RequestMapping("/selectOrderOrdergoodses")
	public ModelAndView selectOrderOrdergoodses(@RequestParam String order_id, @RequestParam String ordergoodses_id) {
		Ordergoods ordergoods = ordergoodsDAO.findOrdergoodsByPrimaryKey(ordergoodses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("ordergoods", ordergoods);
		mav.setViewName("order/ordergoodses/viewOrdergoodses.jsp");

		return mav;
	}

	/**
	 * Create a new Order entity
	 * 
	 */
	@RequestMapping("/newOrder")
	public ModelAndView newOrder() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", new Order());
		mav.addObject("newFlag", true);
		mav.setViewName("order/editOrder.jsp");

		return mav;
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@RequestMapping("/saveOrder")
	public String saveOrder(@ModelAttribute Order order) {
		orderService.saveOrder(order);
		return "forward:/indexOrder";
	}

	/**
	 * Save an existing Orderattachment entity
	 * 
	 */
	@RequestMapping("/saveOrderOrderattachments")
	public ModelAndView saveOrderOrderattachments(@RequestParam String order_id, @ModelAttribute Orderattachment orderattachments) {
		Order parent_order = orderService.saveOrderOrderattachments(order_id, orderattachments);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("order", parent_order);
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Order entities
	 * 
	 */
	public String indexOrder() {
		return "redirect:/indexOrder";
	}

	/**
	 * Create a new Orderattachment entity
	 * 
	 */
	@RequestMapping("/newOrderOrderattachments")
	public ModelAndView newOrderOrderattachments(@RequestParam String order_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("orderattachment", new Orderattachment());
		mav.addObject("newFlag", true);
		mav.setViewName("order/orderattachments/editOrderattachments.jsp");

		return mav;
	}

	/**
	 * Select an existing Order entity
	 * 
	 */
	@RequestMapping("/selectOrder")
	public ModelAndView selectOrder(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(idKey));
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Select the child Orderattachment entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderOrderattachments")
	public ModelAndView confirmDeleteOrderOrderattachments(@RequestParam String order_id, @RequestParam String related_orderattachments_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orderattachment", orderattachmentDAO.findOrderattachmentByPrimaryKey(related_orderattachments_id));
		mav.addObject("order_id", order_id);
		mav.setViewName("order/orderattachments/deleteOrderattachments.jsp");

		return mav;
	}

	/**
	 * Create a new Ordergoods entity
	 * 
	 */
	@RequestMapping("/newOrderOrdergoodses")
	public ModelAndView newOrderOrdergoodses(@RequestParam String order_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("ordergoods", new Ordergoods());
		mav.addObject("newFlag", true);
		mav.setViewName("order/ordergoodses/editOrdergoodses.jsp");

		return mav;
	}

	/**
	 * Edit an existing Ordergoods entity
	 * 
	 */
	@RequestMapping("/editOrderOrdergoodses")
	public ModelAndView editOrderOrdergoodses(@RequestParam String order_id, @RequestParam String ordergoodses_id) {
		Ordergoods ordergoods = ordergoodsDAO.findOrdergoodsByPrimaryKey(ordergoodses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("ordergoods", ordergoods);
		mav.setViewName("order/ordergoodses/editOrdergoodses.jsp");

		return mav;
	}

	/**
	 * Save an existing Ordergoods entity
	 * 
	 */
	@RequestMapping("/saveOrderOrdergoodses")
	public ModelAndView saveOrderOrdergoodses(@RequestParam String order_id, @ModelAttribute Ordergoods ordergoodses) {
		Order parent_order = orderService.saveOrderOrdergoodses(order_id, ordergoodses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("order", parent_order);
		mav.setViewName("order/viewOrder.jsp");

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
	 * Delete an existing Order entity
	 * 
	 */
	@RequestMapping("/deleteOrder")
	public String deleteOrder(@RequestParam String idKey) {
		Order order = orderDAO.findOrderByPrimaryKey(idKey);
		orderService.deleteOrder(order);
		return "forward:/indexOrder";
	}

	/**
	 * Edit an existing Order entity
	 * 
	 */
	@RequestMapping("/editOrder")
	public ModelAndView editOrder(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(idKey));
		mav.setViewName("order/editOrder.jsp");

		return mav;
	}

	/**
	 * Show all Order entities
	 * 
	 */
	@RequestMapping("/indexOrder")
	public ModelAndView listOrders() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("orders", orderService.loadOrders());

		mav.setViewName("order/listOrders.jsp");

		return mav;
	}

	/**
	 * Delete an existing Orderattachment entity
	 * 
	 */
	@RequestMapping("/deleteOrderOrderattachments")
	public ModelAndView deleteOrderOrderattachments(@RequestParam String order_id, @RequestParam String related_orderattachments_id) {
		ModelAndView mav = new ModelAndView();

		Order order = orderService.deleteOrderOrderattachments(order_id, related_orderattachments_id);

		mav.addObject("order_id", order_id);
		mav.addObject("order", order);
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Show all Orderattachment entities by Order
	 * 
	 */
	@RequestMapping("/listOrderOrderattachments")
	public ModelAndView listOrderOrderattachments(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(idKey));
		mav.setViewName("order/orderattachments/listOrderattachments.jsp");

		return mav;
	}

	/**
	 * Edit an existing Orderattachment entity
	 * 
	 */
	@RequestMapping("/editOrderOrderattachments")
	public ModelAndView editOrderOrderattachments(@RequestParam String order_id, @RequestParam String orderattachments_id) {
		Orderattachment orderattachment = orderattachmentDAO.findOrderattachmentByPrimaryKey(orderattachments_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("orderattachment", orderattachment);
		mav.setViewName("order/orderattachments/editOrderattachments.jsp");

		return mav;
	}

	/**
	 * Select the Order entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrder")
	public ModelAndView confirmDeleteOrder(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(idKey));
		mav.setViewName("order/deleteOrder.jsp");

		return mav;
	}

	/**
	 * View an existing Orderattachment entity
	 * 
	 */
	@RequestMapping("/selectOrderOrderattachments")
	public ModelAndView selectOrderOrderattachments(@RequestParam String order_id, @RequestParam String orderattachments_id) {
		Orderattachment orderattachment = orderattachmentDAO.findOrderattachmentByPrimaryKey(orderattachments_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("order_id", order_id);
		mav.addObject("orderattachment", orderattachment);
		mav.setViewName("order/orderattachments/viewOrderattachments.jsp");

		return mav;
	}

	/**
	 * Show all Ordergoods entities by Order
	 * 
	 */
	@RequestMapping("/listOrderOrdergoodses")
	public ModelAndView listOrderOrdergoodses(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(idKey));
		mav.setViewName("order/ordergoodses/listOrdergoodses.jsp");

		return mav;
	}

	/**
	 * Delete an existing Ordergoods entity
	 * 
	 */
	@RequestMapping("/deleteOrderOrdergoodses")
	public ModelAndView deleteOrderOrdergoodses(@RequestParam String order_id, @RequestParam String related_ordergoodses_id) {
		ModelAndView mav = new ModelAndView();

		Order order = orderService.deleteOrderOrdergoodses(order_id, related_ordergoodses_id);

		mav.addObject("order_id", order_id);
		mav.addObject("order", order);
		mav.setViewName("order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Select the child Ordergoods entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrderOrdergoodses")
	public ModelAndView confirmDeleteOrderOrdergoodses(@RequestParam String order_id, @RequestParam String related_ordergoodses_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordergoods", ordergoodsDAO.findOrdergoodsByPrimaryKey(related_ordergoodses_id));
		mav.addObject("order_id", order_id);
		mav.setViewName("order/ordergoodses/deleteOrdergoodses.jsp");

		return mav;
	}
}