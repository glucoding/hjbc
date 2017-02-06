package com.hejiascm.service;

import com.hejiascm.dao.OrderDAO;
import com.hejiascm.dao.OrdergoodsDAO;

import com.hejiascm.domain.Order;
import com.hejiascm.domain.Ordergoods;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Ordergoods entities
 * 
 */

@Service("OrdergoodsService")
@Transactional
public class OrdergoodsServiceImpl implements OrdergoodsService {

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
	 * Instantiates a new OrdergoodsServiceImpl.
	 *
	 */
	public OrdergoodsServiceImpl() {
	}

	/**
	 * Return a count of all Ordergoods entity
	 * 
	 */
	@Transactional
	public Integer countOrdergoodss() {
		return ((Long) ordergoodsDAO.createQuerySingleResult("select count(o) from Ordergoods o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public Ordergoods findOrdergoodsByPrimaryKey(String id) {
		return ordergoodsDAO.findOrdergoodsByPrimaryKey(id);
	}

	/**
	 * Load an existing Ordergoods entity
	 * 
	 */
	@Transactional
	public Set<Ordergoods> loadOrdergoodss() {
		return ordergoodsDAO.findAllOrdergoodss();
	}

	/**
	 * Save an existing Order entity
	 * 
	 */
	@Transactional
	public Ordergoods saveOrdergoodsOrder(String id, Order related_order) {
		Ordergoods ordergoods = ordergoodsDAO.findOrdergoodsByPrimaryKey(id, -1, -1);
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
		}

		ordergoods.setOrder(related_order);
		related_order.getOrdergoodses().add(ordergoods);
		ordergoods = ordergoodsDAO.store(ordergoods);
		ordergoodsDAO.flush();

		related_order = orderDAO.store(related_order);
		orderDAO.flush();

		return ordergoods;
	}

	/**
	 * Save an existing Ordergoods entity
	 * 
	 */
	@Transactional
	public void saveOrdergoods(Ordergoods ordergoods) {
		Ordergoods existingOrdergoods = ordergoodsDAO.findOrdergoodsByPrimaryKey(ordergoods.getId());

		if (existingOrdergoods != null) {
			if (existingOrdergoods != ordergoods) {
				existingOrdergoods.setId(ordergoods.getId());
				existingOrdergoods.setSerial(ordergoods.getSerial());
				existingOrdergoods.setName(ordergoods.getName());
				existingOrdergoods.setDescription(ordergoods.getDescription());
				existingOrdergoods.setSpec(ordergoods.getSpec());
				existingOrdergoods.setUnit(ordergoods.getUnit());
				existingOrdergoods.setQuantity(ordergoods.getQuantity());
				existingOrdergoods.setProducer(ordergoods.getProducer());
				existingOrdergoods.setUnitPrice(ordergoods.getUnitPrice());
				existingOrdergoods.setTaxRate(ordergoods.getTaxRate());
				existingOrdergoods.setTotalAmount(ordergoods.getTotalAmount());
			}
			ordergoods = ordergoodsDAO.store(existingOrdergoods);
		} else {
			ordergoods = ordergoodsDAO.store(ordergoods);
		}
		ordergoodsDAO.flush();
	}

	/**
	 * Return all Ordergoods entity
	 * 
	 */
	@Transactional
	public List<Ordergoods> findAllOrdergoodss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Ordergoods>(ordergoodsDAO.findAllOrdergoodss(startResult, maxRows));
	}

	/**
	 * Delete an existing Ordergoods entity
	 * 
	 */
	@Transactional
	public void deleteOrdergoods(Ordergoods ordergoods) {
		ordergoodsDAO.remove(ordergoods);
		ordergoodsDAO.flush();
	}

	/**
	 * Delete an existing Order entity
	 * 
	 */
	@Transactional
	public Ordergoods deleteOrdergoodsOrder(String ordergoods_id, String related_order_id) {
		Ordergoods ordergoods = ordergoodsDAO.findOrdergoodsByPrimaryKey(ordergoods_id, -1, -1);
		Order related_order = orderDAO.findOrderByPrimaryKey(related_order_id, -1, -1);

		ordergoods.setOrder(null);
		related_order.getOrdergoodses().remove(ordergoods);
		ordergoods = ordergoodsDAO.store(ordergoods);
		ordergoodsDAO.flush();

		related_order = orderDAO.store(related_order);
		orderDAO.flush();

		orderDAO.remove(related_order);
		orderDAO.flush();

		return ordergoods;
	}
}
