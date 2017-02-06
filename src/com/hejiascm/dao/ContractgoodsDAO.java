package com.hejiascm.dao;

import com.hejiascm.domain.Contractgoods;

import java.math.BigDecimal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Contractgoods entities.
 * 
 */
public interface ContractgoodsDAO extends JpaDao<Contractgoods> {

	/**
	 * JPQL Query - findContractgoodsById
	 *
	 */
	public Contractgoods findContractgoodsById(String id) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsById
	 *
	 */
	public Contractgoods findContractgoodsById(String id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByName
	 *
	 */
	public Set<Contractgoods> findContractgoodsByName(String name) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByName
	 *
	 */
	public Set<Contractgoods> findContractgoodsByName(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByUnitPrice
	 *
	 */
	public Set<Contractgoods> findContractgoodsByUnitPrice(java.math.BigDecimal unitPrice) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByUnitPrice
	 *
	 */
	public Set<Contractgoods> findContractgoodsByUnitPrice(BigDecimal unitPrice, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsBySerial
	 *
	 */
	public Set<Contractgoods> findContractgoodsBySerial(String serial) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsBySerial
	 *
	 */
	public Set<Contractgoods> findContractgoodsBySerial(String serial, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsBySpecs
	 *
	 */
	public Set<Contractgoods> findContractgoodsBySpecs(String specs) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsBySpecs
	 *
	 */
	public Set<Contractgoods> findContractgoodsBySpecs(String specs, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByDescriptionContaining
	 *
	 */
	public Set<Contractgoods> findContractgoodsByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByDescriptionContaining
	 *
	 */
	public Set<Contractgoods> findContractgoodsByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByTaxRate
	 *
	 */
	public Set<Contractgoods> findContractgoodsByTaxRate(java.math.BigDecimal taxRate) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByTaxRate
	 *
	 */
	public Set<Contractgoods> findContractgoodsByTaxRate(BigDecimal taxRate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsBySerialContaining
	 *
	 */
	public Set<Contractgoods> findContractgoodsBySerialContaining(String serial_1) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsBySerialContaining
	 *
	 */
	public Set<Contractgoods> findContractgoodsBySerialContaining(String serial_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByUnitContaining
	 *
	 */
	public Set<Contractgoods> findContractgoodsByUnitContaining(String unit) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByUnitContaining
	 *
	 */
	public Set<Contractgoods> findContractgoodsByUnitContaining(String unit, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllContractgoodss
	 *
	 */
	public Set<Contractgoods> findAllContractgoodss() throws DataAccessException;

	/**
	 * JPQL Query - findAllContractgoodss
	 *
	 */
	public Set<Contractgoods> findAllContractgoodss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByNameContaining
	 *
	 */
	public Set<Contractgoods> findContractgoodsByNameContaining(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByNameContaining
	 *
	 */
	public Set<Contractgoods> findContractgoodsByNameContaining(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByUnit
	 *
	 */
	public Set<Contractgoods> findContractgoodsByUnit(String unit_1) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByUnit
	 *
	 */
	public Set<Contractgoods> findContractgoodsByUnit(String unit_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByDescription
	 *
	 */
	public Set<Contractgoods> findContractgoodsByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByDescription
	 *
	 */
	public Set<Contractgoods> findContractgoodsByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsBySpecsContaining
	 *
	 */
	public Set<Contractgoods> findContractgoodsBySpecsContaining(String specs_1) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsBySpecsContaining
	 *
	 */
	public Set<Contractgoods> findContractgoodsBySpecsContaining(String specs_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByQuantity
	 *
	 */
	public Set<Contractgoods> findContractgoodsByQuantity(java.math.BigDecimal quantity) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByQuantity
	 *
	 */
	public Set<Contractgoods> findContractgoodsByQuantity(BigDecimal quantity, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByTotalAmount
	 *
	 */
	public Set<Contractgoods> findContractgoodsByTotalAmount(java.math.BigDecimal totalAmount) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByTotalAmount
	 *
	 */
	public Set<Contractgoods> findContractgoodsByTotalAmount(BigDecimal totalAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByPrimaryKey
	 *
	 */
	public Contractgoods findContractgoodsByPrimaryKey(String id_1) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByPrimaryKey
	 *
	 */
	public Contractgoods findContractgoodsByPrimaryKey(String id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByIdContaining
	 *
	 */
	public Set<Contractgoods> findContractgoodsByIdContaining(String id_2) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByIdContaining
	 *
	 */
	public Set<Contractgoods> findContractgoodsByIdContaining(String id_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByProducer
	 *
	 */
	public Set<Contractgoods> findContractgoodsByProducer(String producer) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByProducer
	 *
	 */
	public Set<Contractgoods> findContractgoodsByProducer(String producer, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByProducerContaining
	 *
	 */
	public Set<Contractgoods> findContractgoodsByProducerContaining(String producer_1) throws DataAccessException;

	/**
	 * JPQL Query - findContractgoodsByProducerContaining
	 *
	 */
	public Set<Contractgoods> findContractgoodsByProducerContaining(String producer_1, int startResult, int maxRows) throws DataAccessException;

}