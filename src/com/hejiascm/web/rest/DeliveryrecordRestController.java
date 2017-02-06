package com.hejiascm.web.rest;

import com.hejiascm.dao.DeliveryattachmentDAO;
import com.hejiascm.dao.DeliverygoodsDAO;
import com.hejiascm.dao.DeliveryrecordDAO;

import com.hejiascm.domain.Deliveryattachment;
import com.hejiascm.domain.Deliverygoods;
import com.hejiascm.domain.Deliveryrecord;

import com.hejiascm.service.DeliveryrecordService;

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
 * Spring Rest controller that handles CRUD requests for Deliveryrecord entities
 * 
 */

@Controller("DeliveryrecordRestController")
public class DeliveryrecordRestController {

	/**
	 * DAO injected by Spring that manages Deliveryattachment entities
	 * 
	 */
	@Autowired
	private DeliveryattachmentDAO deliveryattachmentDAO;

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
	 * Service injected by Spring that provides CRUD operations for Deliveryrecord entities
	 * 
	 */
	@Autowired
	private DeliveryrecordService deliveryrecordService;

	/**
	 * View an existing Deliverygoods entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord/{deliveryrecord_id}/deliverygoodses/{deliverygoods_id}", method = RequestMethod.GET)
	@ResponseBody
	public Deliverygoods loadDeliveryrecordDeliverygoodses(@PathVariable String deliveryrecord_id, @PathVariable String related_deliverygoodses_id) {
		Deliverygoods deliverygoods = deliverygoodsDAO.findDeliverygoodsByPrimaryKey(related_deliverygoodses_id, -1, -1);

		return deliverygoods;
	}

	/**
	 * Delete an existing Deliverygoods entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord/{deliveryrecord_id}/deliverygoodses/{deliverygoods_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDeliveryrecordDeliverygoodses(@PathVariable String deliveryrecord_id, @PathVariable String related_deliverygoodses_id) {
		deliveryrecordService.deleteDeliveryrecordDeliverygoodses(deliveryrecord_id, related_deliverygoodses_id);
	}

	/**
	 * Create a new Deliveryrecord entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord", method = RequestMethod.POST)
	@ResponseBody
	public Deliveryrecord newDeliveryrecord(@RequestBody Deliveryrecord deliveryrecord) {
		deliveryrecordService.saveDeliveryrecord(deliveryrecord);
		return deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord.getId());
	}

	/**
	 * View an existing Deliveryattachment entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord/{deliveryrecord_id}/deliveryattachments/{deliveryattachment_id}", method = RequestMethod.GET)
	@ResponseBody
	public Deliveryattachment loadDeliveryrecordDeliveryattachments(@PathVariable String deliveryrecord_id, @PathVariable String related_deliveryattachments_id) {
		Deliveryattachment deliveryattachment = deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(related_deliveryattachments_id, -1, -1);

		return deliveryattachment;
	}

	/**
	 * Save an existing Deliverygoods entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord/{deliveryrecord_id}/deliverygoodses", method = RequestMethod.PUT)
	@ResponseBody
	public Deliverygoods saveDeliveryrecordDeliverygoodses(@PathVariable String deliveryrecord_id, @RequestBody Deliverygoods deliverygoodses) {
		deliveryrecordService.saveDeliveryrecordDeliverygoodses(deliveryrecord_id, deliverygoodses);
		return deliverygoodsDAO.findDeliverygoodsByPrimaryKey(deliverygoodses.getId());
	}

	/**
	 * Save an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord", method = RequestMethod.PUT)
	@ResponseBody
	public Deliveryrecord saveDeliveryrecord(@RequestBody Deliveryrecord deliveryrecord) {
		deliveryrecordService.saveDeliveryrecord(deliveryrecord);
		return deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord.getId());
	}

	/**
	 * Create a new Deliverygoods entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord/{deliveryrecord_id}/deliverygoodses", method = RequestMethod.POST)
	@ResponseBody
	public Deliverygoods newDeliveryrecordDeliverygoodses(@PathVariable String deliveryrecord_id, @RequestBody Deliverygoods deliverygoods) {
		deliveryrecordService.saveDeliveryrecordDeliverygoodses(deliveryrecord_id, deliverygoods);
		return deliverygoodsDAO.findDeliverygoodsByPrimaryKey(deliverygoods.getId());
	}

	/**
	 * Delete an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord/{deliveryrecord_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDeliveryrecord(@PathVariable String deliveryrecord_id) {
		Deliveryrecord deliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord_id);
		deliveryrecordService.deleteDeliveryrecord(deliveryrecord);
	}

	/**
	 * Save an existing Deliveryattachment entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord/{deliveryrecord_id}/deliveryattachments", method = RequestMethod.PUT)
	@ResponseBody
	public Deliveryattachment saveDeliveryrecordDeliveryattachments(@PathVariable String deliveryrecord_id, @RequestBody Deliveryattachment deliveryattachments) {
		deliveryrecordService.saveDeliveryrecordDeliveryattachments(deliveryrecord_id, deliveryattachments);
		return deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(deliveryattachments.getId());
	}

	/**
	 * Show all Deliveryrecord entities
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord", method = RequestMethod.GET)
	@ResponseBody
	public List<Deliveryrecord> listDeliveryrecords() {
		return new java.util.ArrayList<Deliveryrecord>(deliveryrecordService.loadDeliveryrecords());
	}

	/**
	 * Create a new Deliveryattachment entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord/{deliveryrecord_id}/deliveryattachments", method = RequestMethod.POST)
	@ResponseBody
	public Deliveryattachment newDeliveryrecordDeliveryattachments(@PathVariable String deliveryrecord_id, @RequestBody Deliveryattachment deliveryattachment) {
		deliveryrecordService.saveDeliveryrecordDeliveryattachments(deliveryrecord_id, deliveryattachment);
		return deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(deliveryattachment.getId());
	}

	/**
	 * Select an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord/{deliveryrecord_id}", method = RequestMethod.GET)
	@ResponseBody
	public Deliveryrecord loadDeliveryrecord(@PathVariable String deliveryrecord_id) {
		return deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord_id);
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
	 * Show all Deliverygoods entities by Deliveryrecord
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord/{deliveryrecord_id}/deliverygoodses", method = RequestMethod.GET)
	@ResponseBody
	public List<Deliverygoods> getDeliveryrecordDeliverygoodses(@PathVariable String deliveryrecord_id) {
		return new java.util.ArrayList<Deliverygoods>(deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord_id).getDeliverygoodses());
	}

	/**
	 * Show all Deliveryattachment entities by Deliveryrecord
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord/{deliveryrecord_id}/deliveryattachments", method = RequestMethod.GET)
	@ResponseBody
	public List<Deliveryattachment> getDeliveryrecordDeliveryattachments(@PathVariable String deliveryrecord_id) {
		return new java.util.ArrayList<Deliveryattachment>(deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord_id).getDeliveryattachments());
	}

	/**
	 * Delete an existing Deliveryattachment entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryrecord/{deliveryrecord_id}/deliveryattachments/{deliveryattachment_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDeliveryrecordDeliveryattachments(@PathVariable String deliveryrecord_id, @PathVariable String related_deliveryattachments_id) {
		deliveryrecordService.deleteDeliveryrecordDeliveryattachments(deliveryrecord_id, related_deliveryattachments_id);
	}
}