package com.hejiascm.dao;

import com.hejiascm.domain.Ordergoods;

import java.math.BigDecimal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Ordergoods entities.
 * 
 */
public interface OrdergoodsDAO extends JpaDao<Ordergoods> {

	/**
	 * JPQL Query - findOrdergoodsBySerialContaining
	 *
	 */
	public Set<Ordergoods> findOrdergoodsBySerialContaining(String serial) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsBySerialContaining
	 *
	 */
	public Set<Ordergoods> findOrdergoodsBySerialContaining(String serial, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByDescription
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByDescription
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOrdergoodss
	 *
	 */
	public Set<Ordergoods> findAllOrdergoodss() throws DataAccessException;

	/**
	 * JPQL Query - findAllOrdergoodss
	 *
	 */
	public Set<Ordergoods> findAllOrdergoodss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsBySerial
	 *
	 */
	public Set<Ordergoods> findOrdergoodsBySerial(String serial_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsBySerial
	 *
	 */
	public Set<Ordergoods> findOrdergoodsBySerial(String serial_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByProducer
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByProducer(String producer) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByProducer
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByProducer(String producer, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByNameContaining
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByNameContaining
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByUnit
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByUnit(String unit) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByUnit
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByUnit(String unit, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByTaxRate
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByTaxRate(java.math.BigDecimal taxRate) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByTaxRate
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByTaxRate(BigDecimal taxRate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByIdContaining
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByIdContaining(String id) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByIdContaining
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByIdContaining(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByUnitPrice
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByUnitPrice(java.math.BigDecimal unitPrice) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByUnitPrice
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByUnitPrice(BigDecimal unitPrice, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsBySpecContaining
	 *
	 */
	public Set<Ordergoods> findOrdergoodsBySpecContaining(String spec) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsBySpecContaining
	 *
	 */
	public Set<Ordergoods> findOrdergoodsBySpecContaining(String spec, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsBySpec
	 *
	 */
	public Set<Ordergoods> findOrdergoodsBySpec(String spec_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsBySpec
	 *
	 */
	public Set<Ordergoods> findOrdergoodsBySpec(String spec_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsById
	 *
	 */
	public Ordergoods findOrdergoodsById(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsById
	 *
	 */
	public Ordergoods findOrdergoodsById(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByTotalAmount
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByTotalAmount(java.math.BigDecimal totalAmount) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByTotalAmount
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByTotalAmount(BigDecimal totalAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByName
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByName
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByQuantity
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByQuantity(Integer quantity) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByQuantity
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByQuantity(Integer quantity, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByDescriptionContaining
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByDescriptionContaining
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByProducerContaining
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByProducerContaining(String producer_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByProducerContaining
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByProducerContaining(String producer_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByUnitContaining
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByUnitContaining(String unit_1) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByUnitContaining
	 *
	 */
	public Set<Ordergoods> findOrdergoodsByUnitContaining(String unit_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByPrimaryKey
	 *
	 */
	public Ordergoods findOrdergoodsByPrimaryKey(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findOrdergoodsByPrimaryKey
	 *
	 */
	public Ordergoods findOrdergoodsByPrimaryKey(String id_2, int startResult, int maxRows) throws DataAccessException;

}