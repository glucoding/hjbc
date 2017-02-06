package com.hejiascm.service;

import com.hejiascm.dao.ContractgoodsDAO;
import com.hejiascm.dao.TradecontractDAO;

import com.hejiascm.domain.Contractgoods;
import com.hejiascm.domain.Tradecontract;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Contractgoods entities
 * 
 */

@Service("ContractgoodsService")
@Transactional
public class ContractgoodsServiceImpl implements ContractgoodsService {

	/**
	 * DAO injected by Spring that manages Contractgoods entities
	 * 
	 */
	@Autowired
	private ContractgoodsDAO contractgoodsDAO;

	/**
	 * DAO injected by Spring that manages Tradecontract entities
	 * 
	 */
	@Autowired
	private TradecontractDAO tradecontractDAO;

	/**
	 * Instantiates a new ContractgoodsServiceImpl.
	 *
	 */
	public ContractgoodsServiceImpl() {
	}

	/**
	 * Return a count of all Contractgoods entity
	 * 
	 */
	@Transactional
	public Integer countContractgoodss() {
		return ((Long) contractgoodsDAO.createQuerySingleResult("select count(o) from Contractgoods o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Tradecontract entity
	 * 
	 */
	@Transactional
	public Contractgoods saveContractgoodsTradecontract(String id, Tradecontract related_tradecontract) {
		Contractgoods contractgoods = contractgoodsDAO.findContractgoodsByPrimaryKey(id, -1, -1);
		Tradecontract existingtradecontract = tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract.getId());

		// copy into the existing record to preserve existing relationships
		if (existingtradecontract != null) {
			existingtradecontract.setId(related_tradecontract.getId());
			existingtradecontract.setVersion(related_tradecontract.getVersion());
			existingtradecontract.setSerial(related_tradecontract.getSerial());
			existingtradecontract.setContractType(related_tradecontract.getContractType());
			existingtradecontract.setServiceType(related_tradecontract.getServiceType());
			existingtradecontract.setEffectiveTime(related_tradecontract.getEffectiveTime());
			existingtradecontract.setExpirationTime(related_tradecontract.getExpirationTime());
			existingtradecontract.setCurrency(related_tradecontract.getCurrency());
			existingtradecontract.setDataEffectivePaticipant(related_tradecontract.getDataEffectivePaticipant());
			existingtradecontract.setOrderSubmitterId(related_tradecontract.getOrderSubmitterId());
			existingtradecontract.setMeansOfTransportation(related_tradecontract.getMeansOfTransportation());
			existingtradecontract.setExecutionStatus(related_tradecontract.getExecutionStatus());
			existingtradecontract.setChangeStatus(related_tradecontract.getChangeStatus());
			existingtradecontract.setPreviousVersion(related_tradecontract.getPreviousVersion());
			existingtradecontract.setCurrentEffectiveVersion(related_tradecontract.getCurrentEffectiveVersion());
			existingtradecontract.setRemarks(related_tradecontract.getRemarks());
			existingtradecontract.setDescription(related_tradecontract.getDescription());
			existingtradecontract.setOrgid(related_tradecontract.getOrgid());
			related_tradecontract = existingtradecontract;
		} else {
			related_tradecontract = tradecontractDAO.store(related_tradecontract);
			tradecontractDAO.flush();
		}

		contractgoods.setTradecontract(related_tradecontract);
		related_tradecontract.getContractgoodses().add(contractgoods);
		contractgoods = contractgoodsDAO.store(contractgoods);
		contractgoodsDAO.flush();

		related_tradecontract = tradecontractDAO.store(related_tradecontract);
		tradecontractDAO.flush();

		return contractgoods;
	}

	/**
	 */
	@Transactional
	public Contractgoods findContractgoodsByPrimaryKey(String id) {
		return contractgoodsDAO.findContractgoodsByPrimaryKey(id);
	}

	/**
	 * Delete an existing Contractgoods entity
	 * 
	 */
	@Transactional
	public void deleteContractgoods(Contractgoods contractgoods) {
		contractgoodsDAO.remove(contractgoods);
		contractgoodsDAO.flush();
	}

	/**
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@Transactional
	public Contractgoods deleteContractgoodsTradecontract(String contractgoods_id, String related_tradecontract_id) {
		Contractgoods contractgoods = contractgoodsDAO.findContractgoodsByPrimaryKey(contractgoods_id, -1, -1);
		Tradecontract related_tradecontract = tradecontractDAO.findTradecontractByPrimaryKey(related_tradecontract_id, -1, -1);

		contractgoods.setTradecontract(null);
		related_tradecontract.getContractgoodses().remove(contractgoods);
		contractgoods = contractgoodsDAO.store(contractgoods);
		contractgoodsDAO.flush();

		related_tradecontract = tradecontractDAO.store(related_tradecontract);
		tradecontractDAO.flush();

		tradecontractDAO.remove(related_tradecontract);
		tradecontractDAO.flush();

		return contractgoods;
	}

	/**
	 * Save an existing Contractgoods entity
	 * 
	 */
	@Transactional
	public void saveContractgoods(Contractgoods contractgoods) {
		Contractgoods existingContractgoods = contractgoodsDAO.findContractgoodsByPrimaryKey(contractgoods.getId());

		if (existingContractgoods != null) {
			if (existingContractgoods != contractgoods) {
				existingContractgoods.setId(contractgoods.getId());
				existingContractgoods.setSerial(contractgoods.getSerial());
				existingContractgoods.setName(contractgoods.getName());
				existingContractgoods.setDescription(contractgoods.getDescription());
				existingContractgoods.setSpecs(contractgoods.getSpecs());
				existingContractgoods.setUnit(contractgoods.getUnit());
				existingContractgoods.setQuantity(contractgoods.getQuantity());
				existingContractgoods.setProducer(contractgoods.getProducer());
				existingContractgoods.setUnitPrice(contractgoods.getUnitPrice());
				existingContractgoods.setTaxRate(contractgoods.getTaxRate());
				existingContractgoods.setTotalAmount(contractgoods.getTotalAmount());
			}
			contractgoods = contractgoodsDAO.store(existingContractgoods);
		} else {
			contractgoods = contractgoodsDAO.store(contractgoods);
		}
		contractgoodsDAO.flush();
	}

	/**
	 * Load an existing Contractgoods entity
	 * 
	 */
	@Transactional
	public Set<Contractgoods> loadContractgoodss() {
		return contractgoodsDAO.findAllContractgoodss();
	}

	/**
	 * Return all Contractgoods entity
	 * 
	 */
	@Transactional
	public List<Contractgoods> findAllContractgoodss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Contractgoods>(contractgoodsDAO.findAllContractgoodss(startResult, maxRows));
	}
}
