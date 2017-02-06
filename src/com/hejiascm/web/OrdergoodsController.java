package com.hejiascm.web;

import com.hejiascm.dao.OrderDAO;
import com.hejiascm.dao.OrdergoodsDAO;

import com.hejiascm.domain.Order;
import com.hejiascm.domain.Ordergoods;

import com.hejiascm.service.OrdergoodsService;

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
 * Spring MVC controller that handles CRUD requests for Ordergoods entities
 * 
 */

@Controller("OrdergoodsController")
public class OrdergoodsController {

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
	 * Select the child Order entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrdergoodsOrder")
	public ModelAndView confirmDeleteOrdergoodsOrder(@RequestParam String ordergoods_id, @RequestParam String related_order_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("order", orderDAO.findOrderByPrimaryKey(related_order_id));
		mav.addObject("ordergoods_id", ordergoods_id);
		mav.setViewName("ordergoods/order/deleteOrder.jsp");

		return mav;
	}

	/**
	 * Show all Order entities by Ordergoods
	 * 
	 */
	@RequestMapping("/listOrdergoodsOrder")
	public ModelAndView listOrdergoodsOrder(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordergoods", ordergoodsDAO.findOrdergoodsByPrimaryKey(idKey));
		mav.setViewName("ordergoods/order/listOrder.jsp");

		return mav;
	}

	/**
	 * View an existing Order entity
	 * 
	 */
	@RequestMapping("/selectOrdergoodsOrder")
	public ModelAndView selectOrdergoodsOrder(@RequestParam String ordergoods_id, @RequestParam String order_id) {
		Order order = orderDAO.findOrderByPrimaryKey(order_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ordergoods_id", ordergoods_id);
		mav.addObject("order", order);
		mav.setViewName("ordergoods/order/viewOrder.jsp");

		return mav;
	}

	/**
	 * Select the Ordergoods entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOrdergoods")
	public ModelAndView confirmDeleteOrdergoods(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordergoods", ordergoodsDAO.findOrdergoodsByPrimaryKey(idKey));
		mav.setViewName("ordergoods/deleteOrdergoods.jsp");

		return mav;
	}

	/**
	 * Show all Ordergoods entities
	 * 
	 */
	@RequestMapping("/indexOrdergoods")
	public ModelAndView listOrdergoodss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordergoodss", ordergoodsService.loadOrdergoodss());

		mav.setViewName("ordergoods/listOrdergoodss.jsp");

		return mav;
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@RequestMapping("/deleteOrdergoodsOrder")
	public ModelAndView deleteOrdergoodsOrder(@RequestParam String ordergoods_id, @RequestParam String related_order_id) {
		ModelAndView mav = new ModelAndView();

		Ordergoods ordergoods = ordergoodsService.deleteOrdergoodsOrder(ordergoods_id, related_order_id);

		mav.addObject("ordergoods_id", ordergoods_id);
		mav.addObject("ordergoods", ordergoods);
		mav.setViewName("ordergoods/viewOrdergoods.jsp");

		return mav;
	}

	/**
	 * Edit an existing Order entity
	 * 
	 */
	@RequestMapping("/editOrdergoodsOrder")
	public ModelAndView editOrdergoodsOrder(@RequestParam String ordergoods_id, @RequestParam String order_id) {
		Order order = orderDAO.findOrderByPrimaryKey(order_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ordergoods_id", ordergoods_id);
		mav.addObject("order", order);
		mav.setViewName("ordergoods/order/editOrder.jsp");

		return mav;
	}

	/**
	 * Edit an existing Ordergoods entity
	 * 
	 */
	@RequestMapping("/editOrdergoods")
	public ModelAndView editOrdergoods(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordergoods", ordergoodsDAO.findOrdergoodsByPrimaryKey(idKey));
		mav.setViewName("ordergoods/editOrdergoods.jsp");

		return mav;
	}

	/**
	 * Select an existing Ordergoods entity
	 * 
	 */
	@RequestMapping("/selectOrdergoods")
	public ModelAndView selectOrdergoods(@RequestParam String idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordergoods", ordergoodsDAO.findOrdergoodsByPrimaryKey(idKey));
		mav.setViewName("ordergoods/viewOrdergoods.jsp");

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
	@RequestMapping("/ordergoodsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing Ordergoods entity
	 * 
	 */
	@RequestMapping("/saveOrdergoods")
	public String saveOrdergoods(@ModelAttribute Ordergoods ordergoods) {
		ordergoodsService.saveOrdergoods(ordergoods);
		return "forward:/indexOrdergoods";
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@RequestMapping("/saveOrdergoodsOrder")
	public ModelAndView saveOrdergoodsOrder(@RequestParam String ordergoods_id, @ModelAttribute Order order) {
		Ordergoods parent_ordergoods = ordergoodsService.saveOrdergoodsOrder(ordergoods_id, order);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ordergoods_id", ordergoods_id);
		mav.addObject("ordergoods", parent_ordergoods);
		mav.setViewName("ordergoods/viewOrdergoods.jsp");

		return mav;
	}

	/**
	 * Create a new Order entity
	 * 
	 */
	@RequestMapping("/newOrdergoodsOrder")
	public ModelAndView newOrdergoodsOrder(@RequestParam String ordergoods_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ordergoods_id", ordergoods_id);
		mav.addObject("order", new Order());
		mav.addObject("newFlag", true);
		mav.setViewName("ordergoods/order/editOrder.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Ordergoods entities
	 * 
	 */
	public String indexOrdergoods() {
		return "redirect:/indexOrdergoods";
	}

	/**
	 * Create a new Ordergoods entity
	 * 
	 */
	@RequestMapping("/newOrdergoods")
	public ModelAndView newOrdergoods() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ordergoods", new Ordergoods());
		mav.addObject("newFlag", true);
		mav.setViewName("ordergoods/editOrdergoods.jsp");

		return mav;
	}

	/**
	 * Delete an existing Ordergoods entity
	 * 
	 */
	@RequestMapping("/deleteOrdergoods")
	public String deleteOrdergoods(@RequestParam String idKey) {
		Ordergoods ordergoods = ordergoodsDAO.findOrdergoodsByPrimaryKey(idKey);
		ordergoodsService.deleteOrdergoods(ordergoods);
		return "forward:/indexOrdergoods";
	}
}