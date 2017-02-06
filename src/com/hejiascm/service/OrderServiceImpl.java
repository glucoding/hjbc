package com.hejiascm.service;

import com.hejiascm.dao.OrderDAO;
import com.hejiascm.dao.OrderattachmentDAO;
import com.hejiascm.dao.OrdergoodsDAO;

import com.hejiascm.domain.Order;
import com.hejiascm.domain.Orderattachment;
import com.hejiascm.domain.Ordergoods;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Order entities
 * 
 */

@Service("OrderService")
@Transactional
public class OrderServiceImpl implements OrderService {

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
	 * Instantiates a new OrderServiceImpl.
	 *
	 */
	public OrderServiceImpl() {
	}

	/**
	 * Save an existing Ordergoods entity
	 * 
	 */
	@Transactional
	public Order saveOrderOrdergoodses(String id, Ordergoods related_ordergoodses) {
		Order order = orderDAO.findOrderByPrimaryKey(id, -1, -1);
		Ordergoods existingordergoodses = ordergoodsDAO.findOrdergoodsByPrimaryKey(related_ordergoodses.getId());

		// copy into the existing record to preserve existing relationships
		if (existingordergoodses != null) {
			existingordergoodses.setId(related_ordergoodses.getId());
			existingordergoodses.setSerial(related_ordergoodses.getSerial());
			existingordergoodses.setName(related_ordergoodses.getName());
			existingordergoodses.setDescription(related_ordergoodses.getDescription());
			existingordergoodses.setSpec(related_ordergoodses.getSpec());
			existingordergoodses.setUnit(related_ordergoodses.getUnit());
			existingordergoodses.setQuantity(related_ordergoodses.getQuantity());
			existingordergoodses.setProducer(related_ordergoodses.getProducer());
			existingordergoodses.setUnitPrice(related_ordergoodses.getUnitPrice());
			existingordergoodses.setTaxRate(related_ordergoodses.getTaxRate());
			existingordergoodses.setTotalAmount(related_ordergoodses.getTotalAmount());
			related_ordergoodses = existingordergoodses;
		}

		related_ordergoodses.setOrder(order);
		order.getOrdergoodses().add(related_ordergoodses);
		related_ordergoodses = ordergoodsDAO.store(related_ordergoodses);
		ordergoodsDAO.flush();

		order = orderDAO.store(order);
		orderDAO.flush();

		return order;
	}

	/**
	 * Return all Order entity
	 * 
	 */
	@Transactional
	public List<Order> findAllOrders(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Order>(orderDAO.findAllOrders(startResult, maxRows));
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@Transactional
	public void saveOrder(Order order) {
		Order existingOrder = orderDAO.findOrderByPrimaryKey(order.getId());

		if (existingOrder != null) {
			if (existingOrder != order) {
				existingOrder.setId(order.getId());
				existingOrder.setOrderFormId(order.getOrderFormId());
				existingOrder.setContractId(order.getContractId());
				existingOrder.setContractVersion(order.getContractVersion());
				existingOrder.setSubmitterId(order.getSubmitterId());
				existingOrder.setSubmitTime(order.getSubmitTime());
				existingOrder.setLastUpdateTime(order.getLastUpdateTime());
				existingOrder.setDeliveryStartTime(order.getDeliveryStartTime());
				existingOrder.setDelivertyEndTime(order.getDelivertyEndTime());
				existingOrder.setType(order.getType());
				existingOrder.setDeliveryType(order.getDeliveryType());
				existingOrder.setName(order.getName());
				existingOrder.setDescription(order.getDescription());
				existingOrder.setAddress(order.getAddress());
				existingOrder.setNotes(order.getNotes());
				existingOrder.setStatus(order.getStatus());
				existingOrder.setOrgid(order.getOrgid());
			}
			order = orderDAO.store(existingOrder);
		} else {
			order = orderDAO.store(order);
		}
		orderDAO.flush();
	}

	/**
	 * Delete an existing Ordergoods entity
	 * 
	 */
	@Transactional
	public Order deleteOrderOrdergoodses(String order_id, String related_ordergoodses_id) {
		Ordergoods related_ordergoodses = ordergoodsDAO.findOrdergoodsByPrimaryKey(related_ordergoodses_id, -1, -1);

		Order order = orderDAO.findOrderByPrimaryKey(order_id, -1, -1);

		related_ordergoodses.setOrder(null);
		order.getOrdergoodses().remove(related_ordergoodses);

		ordergoodsDAO.remove(related_ordergoodses);
		ordergoodsDAO.flush();

		return order;
	}

	/**
	 * Delete an existing Orderattachment entity
	 * 
	 */
	@Transactional
	public Order deleteOrderOrderattachments(String order_id, String related_orderattachments_id) {
		Orderattachment related_orderattachments = orderattachmentDAO.findOrderattachmentByPrimaryKey(related_orderattachments_id, -1, -1);

		Order order = orderDAO.findOrderByPrimaryKey(order_id, -1, -1);

		related_orderattachments.setOrder(null);
		order.getOrderattachments().remove(related_orderattachments);

		orderattachmentDAO.remove(related_orderattachments);
		orderattachmentDAO.flush();

		return order;
	}

	/**
	 * Load an existing Order entity
	 * 
	 */
	@Transactional
	public Set<Order> loadOrders() {
		return orderDAO.findAllOrders();
	}

	/**
	 * Return a count of all Order entity
	 * 
	 */
	@Transactional
	public Integer countOrders() {
		return ((Long) orderDAO.createQuerySingleResult("select count(o) from Order o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Orderattachment entity
	 * 
	 */
	@Transactional
	public Order saveOrderOrderattachments(String id, Orderattachment related_orderattachments) {
		Order order = orderDAO.findOrderByPrimaryKey(id, -1, -1);
		Orderattachment existingorderattachments = orderattachmentDAO.findOrderattachmentByPrimaryKey(related_orderattachments.getId());

		// copy into the existing record to preserve existing relationships
		if (existingorderattachments != null) {
			existingorderattachments.setId(related_orderattachments.getId());
			existingorderattachments.setAddress(related_orderattachments.getAddress());
			existingorderattachments.setDescription(related_orderattachments.getDescription());
			related_orderattachments = existingorderattachments;
		} else {
			related_orderattachments = orderattachmentDAO.store(related_orderattachments);
			orderattachmentDAO.flush();
		}

		related_orderattachments.setOrder(order);
		order.getOrderattachments().add(related_orderattachments);
		related_orderattachments = orderattachmentDAO.store(related_orderattachments);
		orderattachmentDAO.flush();

		order = orderDAO.store(order);
		orderDAO.flush();

		return order;
	}

	/**
	 */
	@Transactional
	public Order findOrderByPrimaryKey(String id) {
		return orderDAO.findOrderByPrimaryKey(id);
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@Transactional
	public void deleteOrder(Order order) {
		orderDAO.remove(order);
		orderDAO.flush();
	}
}
