package com.hejiascm.web.rest;

import com.hejiascm.dao.DeliveryattachmentDAO;
import com.hejiascm.dao.DeliveryrecordDAO;

import com.hejiascm.domain.Deliveryattachment;
import com.hejiascm.domain.Deliveryrecord;

import com.hejiascm.service.DeliveryattachmentService;

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
 * Spring Rest controller that handles CRUD requests for Deliveryattachment entities
 * 
 */

@Controller("DeliveryattachmentRestController")
public class DeliveryattachmentRestController {

	/**
	 * DAO injected by Spring that manages Deliveryattachment entities
	 * 
	 */
	@Autowired
	private DeliveryattachmentDAO deliveryattachmentDAO;

	/**
	 * DAO injected by Spring that manages Deliveryrecord entities
	 * 
	 */
	@Autowired
	private DeliveryrecordDAO deliveryrecordDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Deliveryattachment entities
	 * 
	 */
	@Autowired
	private DeliveryattachmentService deliveryattachmentService;

	/**
	 * Show all Deliveryattachment entities
	 * 
	 */
	@RequestMapping(value = "/Deliveryattachment", method = RequestMethod.GET)
	@ResponseBody
	public List<Deliveryattachment> listDeliveryattachments() {
		return new java.util.ArrayList<Deliveryattachment>(deliveryattachmentService.loadDeliveryattachments());
	}

	/**
	 * Delete an existing Deliveryattachment entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryattachment/{deliveryattachment_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDeliveryattachment(@PathVariable String deliveryattachment_id) {
		Deliveryattachment deliveryattachment = deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(deliveryattachment_id);
		deliveryattachmentService.deleteDeliveryattachment(deliveryattachment);
	}

	/**
	 * Select an existing Deliveryattachment entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryattachment/{deliveryattachment_id}", method = RequestMethod.GET)
	@ResponseBody
	public Deliveryattachment loadDeliveryattachment(@PathVariable String deliveryattachment_id) {
		return deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(deliveryattachment_id);
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
	 * Delete an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryattachment/{deliveryattachment_id}/deliveryrecord/{deliveryrecord_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDeliveryattachmentDeliveryrecord(@PathVariable String deliveryattachment_id, @PathVariable String related_deliveryrecord_id) {
		deliveryattachmentService.deleteDeliveryattachmentDeliveryrecord(deliveryattachment_id, related_deliveryrecord_id);
	}

	/**
	 * Save an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryattachment/{deliveryattachment_id}/deliveryrecord", method = RequestMethod.PUT)
	@ResponseBody
	public Deliveryrecord saveDeliveryattachmentDeliveryrecord(@PathVariable String deliveryattachment_id, @RequestBody Deliveryrecord deliveryrecord) {
		deliveryattachmentService.saveDeliveryattachmentDeliveryrecord(deliveryattachment_id, deliveryrecord);
		return deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord.getId());
	}

	/**
	 * Get Deliveryrecord entity by Deliveryattachment
	 * 
	 */
	@RequestMapping(value = "/Deliveryattachment/{deliveryattachment_id}/deliveryrecord", method = RequestMethod.GET)
	@ResponseBody
	public Deliveryrecord getDeliveryattachmentDeliveryrecord(@PathVariable String deliveryattachment_id) {
		return deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(deliveryattachment_id).getDeliveryrecord();
	}

	/**
	 * View an existing Deliveryrecord entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryattachment/{deliveryattachment_id}/deliveryrecord/{deliveryrecord_id}", method = RequestMethod.GET)
	@ResponseBody
	public Deliveryrecord loadDeliveryattachmentDeliveryrecord(@PathVariable String deliveryattachment_id, @PathVariable String related_deliveryrecord_id) {
		Deliveryrecord deliveryrecord = deliveryrecordDAO.findDeliveryrecordByPrimaryKey(related_deliveryrecord_id, -1, -1);

		return deliveryrecord;
	}

	/**
	 * Create a new Deliveryrecord entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryattachment/{deliveryattachment_id}/deliveryrecord", method = RequestMethod.POST)
	@ResponseBody
	public Deliveryrecord newDeliveryattachmentDeliveryrecord(@PathVariable String deliveryattachment_id, @RequestBody Deliveryrecord deliveryrecord) {
		deliveryattachmentService.saveDeliveryattachmentDeliveryrecord(deliveryattachment_id, deliveryrecord);
		return deliveryrecordDAO.findDeliveryrecordByPrimaryKey(deliveryrecord.getId());
	}

	/**
	 * Save an existing Deliveryattachment entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryattachment", method = RequestMethod.PUT)
	@ResponseBody
	public Deliveryattachment saveDeliveryattachment(@RequestBody Deliveryattachment deliveryattachment) {
		deliveryattachmentService.saveDeliveryattachment(deliveryattachment);
		return deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(deliveryattachment.getId());
	}

	/**
	 * Create a new Deliveryattachment entity
	 * 
	 */
	@RequestMapping(value = "/Deliveryattachment", method = RequestMethod.POST)
	@ResponseBody
	public Deliveryattachment newDeliveryattachment(@RequestBody Deliveryattachment deliveryattachment) {
		deliveryattachmentService.saveDeliveryattachment(deliveryattachment);
		return deliveryattachmentDAO.findDeliveryattachmentByPrimaryKey(deliveryattachment.getId());
	}
}