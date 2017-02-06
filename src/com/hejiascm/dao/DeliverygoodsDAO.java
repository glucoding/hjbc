package com.hejiascm.dao;

import com.hejiascm.domain.Deliverygoods;

import java.math.BigDecimal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Deliverygoods entities.
 * 
 */
public interface DeliverygoodsDAO extends JpaDao<Deliverygoods> {

	/**
	 * JPQL Query - findDeliverygoodsById
	 *
	 */
	public Deliverygoods findDeliverygoodsById(String id) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsById
	 *
	 */
	public Deliverygoods findDeliverygoodsById(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsBySpecs
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsBySpecs(String specs) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsBySpecs
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsBySpecs(String specs, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByTaxRate
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByTaxRate(java.math.BigDecimal taxRate) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByTaxRate
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByTaxRate(BigDecimal taxRate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByTotalAmount
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByTotalAmount(java.math.BigDecimal totalAmount) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByTotalAmount
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByTotalAmount(BigDecimal totalAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByUnitContaining
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByUnitContaining(String unit) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByUnitContaining
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByUnitContaining(String unit, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByProducer
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByProducer(String producer) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByProducer
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByProducer(String producer, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByQuantity
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByQuantity(Integer quantity) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByQuantity
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByQuantity(Integer quantity, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByDescriptionContaining
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByDescriptionContaining
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByDescription
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByDescription
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsBySerial
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsBySerial(String serial) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsBySerial
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsBySerial(String serial, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByProducerContaining
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByProducerContaining(String producer_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByProducerContaining
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByProducerContaining(String producer_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsBySpecsContaining
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsBySpecsContaining(String specs_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsBySpecsContaining
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsBySpecsContaining(String specs_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByUnit
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByUnit(String unit_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByUnit
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByUnit(String unit_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByNameContaining
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByNameContaining
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsBySerialContaining
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsBySerialContaining(String serial_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsBySerialContaining
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsBySerialContaining(String serial_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllDeliverygoodss
	 *
	 */
	public Set<Deliverygoods> findAllDeliverygoodss() throws DataAccessException;

	/**
	 * JPQL Query - findAllDeliverygoodss
	 *
	 */
	public Set<Deliverygoods> findAllDeliverygoodss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByPrimaryKey
	 *
	 */
	public Deliverygoods findDeliverygoodsByPrimaryKey(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByPrimaryKey
	 *
	 */
	public Deliverygoods findDeliverygoodsByPrimaryKey(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByIdContaining
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByIdContaining
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByName
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByName
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByUnitPrice
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByUnitPrice(java.math.BigDecimal unitPrice) throws DataAccessException;

	/**
	 * JPQL Query - findDeliverygoodsByUnitPrice
	 *
	 */
	public Set<Deliverygoods> findDeliverygoodsByUnitPrice(BigDecimal unitPrice, int startResult, int maxRows) throws DataAccessException;

}