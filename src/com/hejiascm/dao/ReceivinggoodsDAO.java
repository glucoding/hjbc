package com.hejiascm.dao;

import com.hejiascm.domain.Receivinggoods;

import java.math.BigDecimal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Receivinggoods entities.
 * 
 */
public interface ReceivinggoodsDAO extends JpaDao<Receivinggoods> {

	/**
	 * JPQL Query - findReceivinggoodsByNameContaining
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByNameContaining
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByTotalAmount
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByTotalAmount(java.math.BigDecimal totalAmount) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByTotalAmount
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByTotalAmount(BigDecimal totalAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsBySerial
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsBySerial(String serial) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsBySerial
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsBySerial(String serial, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByUnitContaining
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByUnitContaining(String unit) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByUnitContaining
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByUnitContaining(String unit, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByName
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByName
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsBySpecsContaining
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsBySpecsContaining(String specs) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsBySpecsContaining
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsBySpecsContaining(String specs, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllReceivinggoodss
	 *
	 */
	public Set<Receivinggoods> findAllReceivinggoodss() throws DataAccessException;

	/**
	 * JPQL Query - findAllReceivinggoodss
	 *
	 */
	public Set<Receivinggoods> findAllReceivinggoodss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByUnit
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByUnit(String unit_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByUnit
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByUnit(String unit_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByUnitPrice
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByUnitPrice(java.math.BigDecimal unitPrice) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByUnitPrice
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByUnitPrice(BigDecimal unitPrice, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsBySpecs
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsBySpecs(String specs_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsBySpecs
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsBySpecs(String specs_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByProducerContaining
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByProducerContaining(String producer) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByProducerContaining
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByProducerContaining(String producer, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByDescriptionContaining
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByDescriptionContaining
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsById
	 *
	 */
	public Receivinggoods findReceivinggoodsById(String id) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsById
	 *
	 */
	public Receivinggoods findReceivinggoodsById(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByPrimaryKey
	 *
	 */
	public Receivinggoods findReceivinggoodsByPrimaryKey(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByPrimaryKey
	 *
	 */
	public Receivinggoods findReceivinggoodsByPrimaryKey(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByDescription
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByDescription
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByTaxRate
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByTaxRate(java.math.BigDecimal taxRate) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByTaxRate
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByTaxRate(BigDecimal taxRate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByProducer
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByProducer(String producer_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByProducer
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByProducer(String producer_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByIdContaining
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByIdContaining
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsBySerialContaining
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsBySerialContaining(String serial_1) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsBySerialContaining
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsBySerialContaining(String serial_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByQuantity
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByQuantity(Integer quantity) throws DataAccessException;

	/**
	 * JPQL Query - findReceivinggoodsByQuantity
	 *
	 */
	public Set<Receivinggoods> findReceivinggoodsByQuantity(Integer quantity, int startResult, int maxRows) throws DataAccessException;

}