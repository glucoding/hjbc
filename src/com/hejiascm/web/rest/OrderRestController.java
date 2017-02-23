package com.hejiascm.web.rest;

import com.hejiascm.blockchain.BcOrderDAO;
import com.hejiascm.domain.Order;
import com.hejiascm.domain.Orderattachment;
import com.hejiascm.domain.Ordergoods;
import com.hejiascm.domain.Tradecontract;
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
	@Autowired
	private BcOrderDAO bcOrderDAO;

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
	 * Block chain
	 * @param String id, String orderFormId, String contractId, String contractVersion
	 * @return List<Order>
	 * 
	 */
	@RequestMapping(value = "/bcOrder/{id}/{orderFormId}/{contractId}/{contractVersion}/{orgId}/{status}", method = RequestMethod.GET)
	@ResponseBody
	public List<Order> listBcOrders(@PathVariable String id, @PathVariable String orderFormId, @PathVariable String contractId, @PathVariable String contractVersion, @PathVariable String orgId, @PathVariable String status) {
		return bcOrderDAO.getBcOrders(id, orderFormId, contractId, contractVersion, orgId, status);
	}
	
	/**
	 * Block chain
	 * @param Order
	 * @return String orderId
	 */
	@RequestMapping(value = "/bcOrder", method = RequestMethod.POST)
	@ResponseBody
	public void newBcTradeOrder(@RequestBody Order order) {
		bcOrderDAO.submitBcOrder(order);
	}
	
	/**
	 * Block chain
	 * @param Tradecontract
	 * @return String contractId
	 */
	@RequestMapping(value = "/bcConfirmOrder/{id}", method = RequestMethod.POST)
	@ResponseBody
	public void confirmBcTradecontract(@PathVariable String id) {
		bcOrderDAO.confirmBcOrder(id);
	}
}