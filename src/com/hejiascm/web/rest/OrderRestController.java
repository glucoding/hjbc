package com.hejiascm.web.rest;

import com.hejiascm.blockchain.interfaces.OrderDAO;
import com.hejiascm.util.MiscTool;
import com.ibm.crl.bc.hejia.sdk.logistics.Order;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	private OrderDAO orderDAO;

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
	@RequestMapping(value = "/bcOrder/query", method = RequestMethod.POST)
	@ResponseBody
	public List<Order> getOrders(@RequestBody QueryObject q, HttpServletRequest req, HttpServletResponse res) {
		List<Order> orders = orderDAO.getOrders(q.getQ().replaceAll("\'", "\""), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(orders != null){
			return orders;
		}else{
			//res.setStatus(499);
			return new ArrayList<Order>();
		}
	}
	
	/**
	 * Block chain
	 * @param Order
	 * @return String orderId
	 */
	@RequestMapping(value = "/bcOrder", method = RequestMethod.POST)
	@ResponseBody
	public String newBcTradeOrder(@RequestBody Order o, HttpServletRequest req, HttpServletResponse res) {
		String result = orderDAO.submitOrder(o, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
		if(result != null){
			return result;
		}else{
			res.setStatus(499);
			return "合同创建失败";
		}
	}
	
	/**
	 * Block chain
	 * @param Tradecontract
	 * @return String contractId
	 */
	@RequestMapping(value = "/bcConfirmOrder/{id}", method = RequestMethod.POST)
	@ResponseBody
	public void confirmOrder(@PathVariable String id, HttpServletRequest req, HttpServletResponse res) {
		orderDAO.confirmOrder(id, MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
	
	@RequestMapping(value = "/bcOrder/reject/{id}", method = RequestMethod.POST)
	@ResponseBody
	public void rejectOrder(@PathVariable String id,@RequestBody RemarkObject r, HttpServletRequest req, HttpServletResponse res) {
		orderDAO.rejectOrder(id, r.getR(), MiscTool.getBase64Name(req.getHeader("Authorization").trim()));
	}
}