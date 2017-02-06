package com.hejiascm.web.rest;

import com.hejiascm.dao.DeliverygoodsDAO;
import com.hejiascm.dao.DeliveryrecordDAO;

import com.hejiascm.domain.Deliverygoods;
import com.hejiascm.domain.Deliveryrecord;

import com.hejiascm.service.DeliverygoodsService;

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
 * Spring Rest controller that handles CRUD requests for Deliverygoods entities
 * 
 */

@Controller("DeliverygoodsRestController")
public class DeliverygoodsRestController {

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
	 * Show all Deliverygoods entities
	 * 
	 */
	@RequestMapping(value = "/Deliverygoods", method = RequestMethod.GET)
	@ResponseBody
	public List<Deliverygoods> listDeliverygoodss() {
		return new java.util.ArrayList<Deliverygoods>(deliverygoodsService.loadDeliverygoodss());
	}

	/**
	 * Create a new Deliverygoods entity
	 * 
	 */
	@RequestMapping(value = "/Deliverygoods", method = RequestMethod.POST)
	@ResponseBody
	public Deliverygoods newDeliverygoods(@RequestBody Deliverygoods deliverygoods) {
		deliverygoodsService.saveDeliverygoods(deliverygoods);
		return deliverygoodsDAO.findDeliverygoodsByPrimaryKey(deliverygoods.getId());
	}

	/**
	 * Save an existing Deliverygoods entity
	 * 
	 */
	@RequestMapping(value = "/Deliverygoods", method = RequestMethod.PUT)
	@ResponseBody
	public Deliverygoods saveDeliverygoods(@RequestBody Deliverygoods deliverygoods) {
		deliverygoodsService.saveDeliverygoods(deliverygoods);
		return deliverygoodsDAO.findDeliverygoodsByPrimaryKey(deliverygoods.getId());
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
	 * Get Deliveryrecord entity by Deliverygoods
	 * 
	 */
	@RequestMapping(value = "/Deliverygoods/{deliverygoods_id}/deliveryrecord", method = RequestMethod.GET)
	@ResponseBody
	public Deliveryrecord getDeliverygoodsDeliveryrecord(@PathVariable String deliverygoods_id) {
		return deliverygoodsDAO.findDeliverygoodsByPrimaryKey(deliverygoods_id).getDeliveryrecord();
	}

	/**
	 * View an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping(value = "/Deliverygoods/{deliverygoods_id}/deliveryrecord/{deliveryrecord_id}", method = RequestMethod.GET)
	@ResponseBody
	public Deliveryrecord loadDeliverygoodsDeliveryrecord(@PathVariable String deliverygoods_id, @PathVariable String related_deliveryrecord_id) {
		Deliveryrecord deliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(related_deliveryrecord_id, -1, -1);

		return deliveryrecord;
	}

	/**
	 * Delete an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping(value = "/Deliverygoods/{deliverygoods_id}/deliveryrecord/{deliveryrecord_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDeliverygoodsDeliveryrecord(@PathVariable String deliverygoods_id, @PathVariable String related_deliveryrecord_id) {
		deliverygoodsService.deleteDeliverygoodsDeliveryrecord(deliverygoods_id, related_deliveryrecord_id);
	}

	/**
	 * Delete an existing Deliverygoods entity
	 * 
	 */
	@RequestMapping(value = "/Deliverygoods/{deliverygoods_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDeliverygoods(@PathVariable String deliverygoods_id) {
		Deliverygoods deliverygoods = deliverygoodsDAO.findDeliverygoodsByPrimaryKey(deliverygoods_id);
		deliverygoodsService.deleteDeliverygoods(deliverygoods);
	}

	/**
	 * Select an existing Deliverygoods entity
	 * 
	 */
	@RequestMapping(value = "/Deliverygoods/{deliverygoods_id}", method = RequestMethod.GET)
	@ResponseBody
	public Deliverygoods loadDeliverygoods(@PathVariable String deliverygoods_id) {
		return deliverygoodsDAO.findDeliverygoodsByPrimaryKey(deliverygoods_id);
	}

	/**
	 * Create a new Deliveryrecord entity
	 * 
	 */
	@RequestMapping(value = "/Deliverygoods/{deliverygoods_id}/deliveryrecord", method = RequestMethod.POST)
	@ResponseBody
	public Deliveryrecord newDeliverygoodsDeliveryrecord(@PathVariable String deliverygoods_id, @RequestBody Deliveryrecord deliveryrecord) {
		deliverygoodsService.saveDeliverygoodsDeliveryrecord(deliverygoods_id, deliveryrecord);
		return deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord.getId());
	}

	/**
	 * Save an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping(value = "/Deliverygoods/{deliverygoods_id}/deliveryrecord", method = RequestMethod.PUT)
	@ResponseBody
	public Deliveryrecord saveDeliverygoodsDeliveryrecord(@PathVariable String deliverygoods_id, @RequestBody Deliveryrecord deliveryrecord) {
		deliverygoodsService.saveDeliverygoodsDeliveryrecord(deliverygoods_id, deliveryrecord);
		return deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord.getId());
	}
}