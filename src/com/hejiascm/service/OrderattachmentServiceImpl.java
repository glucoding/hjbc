package com.hejiascm.service;

import com.hejiascm.dao.OrderDAO;
import com.hejiascm.dao.OrderattachmentDAO;

import com.hejiascm.domain.Order;
import com.hejiascm.domain.Orderattachment;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Orderattachment entities
 * 
 */

@Service("OrderattachmentService")
@Transactional
public class OrderattachmentServiceImpl implements OrderattachmentService {

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
	 * Instantiates a new OrderattachmentServiceImpl.
	 *
	 */
	public OrderattachmentServiceImpl() {
	}

	/**
	 * Return all Orderattachment entity
	 * 
	 */
	@Transactional
	public List<Orderattachment> findAllOrderattachments(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Orderattachment>(orderattachmentDAO.findAllOrderattachments(startResult, maxRows));
	}

	/**
	 * Delete an existing Orderattachment entity
	 * 
	 */
	@Transactional
	public void deleteOrderattachment(Orderattachment orderattachment) {
		orderattachmentDAO.remove(orderattachment);
		orderattachmentDAO.flush();
	}

	/**
	 * Load an existing Orderattachment entity
	 * 
	 */
	@Transactional
	public Set<Orderattachment> loadOrderattachments() {
		return orderattachmentDAO.findAllOrderattachments();
	}

	/**
	 * Save an existing Orderattachment entity
	 * 
	 */
	@Transactional
	public void saveOrderattachment(Orderattachment orderattachment) {
		Orderattachment existingOrderattachment = orderattachmentDAO.findOrderattachmentByPrimaryKey(orderattachment.getId());

		if (existingOrderattachment != null) {
			if (existingOrderattachment != orderattachment) {
				existingOrderattachment.setId(orderattachment.getId());
				existingOrderattachment.setAddress(orderattachment.getAddress());
				existingOrderattachment.setDescription(orderattachment.getDescription());
			}
			orderattachment = orderattachmentDAO.store(existingOrderattachment);
		} else {
			orderattachment = orderattachmentDAO.store(orderattachment);
		}
		orderattachmentDAO.flush();
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@Transactional
	public Orderattachment saveOrderattachmentOrder(String id, Order related_order) {
		Orderattachment orderattachment = orderattachmentDAO.findOrderattachmentByPrimaryKey(id, -1, -1);
		Order existingorder = orderDAO.findOrderByPrimaryKey(related_order.getId());

		// copy into the existing record to preserve existing relationships
		if (existingorder != null) {
			existingorder.setId(related_order.getId());
			existingorder.setOrderFormId(related_order.getOrderFormId());
			existingorder.setContractId(related_order.getContractId());
			existingorder.setContractVersion(related_order.getContractVersion());
			existingorder.setSubmitterId(related_order.getSubmitterId());
			existingorder.setSubmitTime(related_order.getSubmitTime());
			existingorder.setLastUpdateTime(related_order.getLastUpdateTime());
			existingorder.setDeliveryStartTime(related_order.getDeliveryStartTime());
			existingorder.setDelivertyEndTime(related_order.getDelivertyEndTime());
			existingorder.setType(related_order.getType());
			existingorder.setDeliveryType(related_order.getDeliveryType());
			existingorder.setName(related_order.getName());
			existingorder.setDescription(related_order.getDescription());
			existingorder.setAddress(related_order.getAddress());
			existingorder.setNotes(related_order.getNotes());
			existingorder.setStatus(related_order.getStatus());
			existingorder.setOrgid(related_order.getOrgid());
			related_order = existingorder;
		} else {
			related_order = orderDAO.store(related_order);
			orderDAO.flush();
		}

		orderattachment.setOrder(related_order);
		related_order.getOrderattachments().add(orderattachment);
		orderattachment = orderattachmentDAO.store(orderattachment);
		orderattachmentDAO.flush();

		related_order = orderDAO.store(related_order);
		orderDAO.flush();

		return orderattachment;
	}

	/**
	 */
	@Transactional
	public Orderattachment findOrderattachmentByPrimaryKey(String id) {
		return orderattachmentDAO.findOrderattachmentByPrimaryKey(id);
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@Transactional
	public Orderattachment deleteOrderattachmentOrder(String orderattachment_id, String related_order_id) {
		Orderattachment orderattachment = orderattachmentDAO.findOrderattachmentByPrimaryKey(orderattachment_id, -1, -1);
		Order related_order = orderDAO.findOrderByPrimaryKey(related_order_id, -1, -1);

		orderattachment.setOrder(null);
		related_order.getOrderattachments().remove(orderattachment);
		orderattachment = orderattachmentDAO.store(orderattachment);
		orderattachmentDAO.flush();

		related_order = orderDAO.store(related_order);
		orderDAO.flush();

		orderDAO.remove(related_order);
		orderDAO.flush();

		return orderattachment;
	}

	/**
	 * Return a count of all Orderattachment entity
	 * 
	 */
	@Transactional
	public Integer countOrderattachments() {
		return ((Long) orderattachmentDAO.createQuerySingleResult("select count(o) from Orderattachment o").getSingleResult()).intValue();
	}
}
