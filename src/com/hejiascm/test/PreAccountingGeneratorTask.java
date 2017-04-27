/*
Copyright IBM Corp. 2017 All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable la:w or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.hejiascm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ibm.crl.bc.hejia.app.GeneratorTask;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.accounting.AccountingType;
import com.ibm.crl.bc.hejia.sdk.accounting.PreAccountingProxy;
import com.ibm.crl.bc.hejia.sdk.accounting.SingleAccountingApplication;
import com.ibm.crl.bc.hejia.sdk.accounting.SingleAccountingApplicationProxy;
import com.ibm.crl.bc.hejia.sdk.accounting.SingleAccountingApplicationStatus;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Currency;
import com.ibm.crl.bc.hejia.sdk.common.Goods;
import com.ibm.crl.bc.hejia.sdk.util.TimeConverter;

/**
 * 
 * This is an automatic task implementation to generate PreAccounting based on the exisiting SingleAccountingApplication(s). This task is executed just once. If periodically execution is needed, another wrapper, e.g. Timer, should be used to get this task scheduled.
 *
 */
public class PreAccountingGeneratorTask extends GeneratorTask {
	
	public static final String TASK_NAME = PreAccountingGeneratorTask.class.getSimpleName();
	
	private String operator;

	public PreAccountingGeneratorTask(String operator) {
		this.operator = operator;
	}
	/**
	 * Execute once the PreAccounting generation
	 * 
	 */
	@Override
	public void run() {
		try {
			generatePreAccounting();
		} catch (BlockchainException e) {
			logger.error("Error occurs during task execution");
			logger.error(e);
		}

	}

	/**
	 * Real implementation of PreAccounting generation.
	 * 
	 * @throws BlockchainException
	 */
	public void generatePreAccounting() throws BlockchainException {
		logger.info("Start generating PreAccounting @ [" + TimeConverter.getCurrentTimeInISOFormat() + "]");

		PreAccountingProxy proxy = SdkFactory.getInstance().getPreAccountingProxy(getOperator());
		Map<String, List<SingleAccountingApplication>> saas = getUnusedSingleAccountingApplicationsByOrders();
		int i = 0;

		for (String orderId : saas.keySet()) {
			List<String> singleAccountingApplicationIds = new ArrayList<String>();
			String contractId = null;
			Currency totalAmount = new Currency(0d, "CNY");
			String buyerId = null;
			String sellerId = null;
			List<Goods> goods = new ArrayList<Goods>();
			String notes = "auto-generation";

			for (SingleAccountingApplication saa : saas.get(orderId)) {
				if (contractId == null) {
					contractId = saa.getContractId();
					orderId = saa.getOrderId();
					buyerId = saa.getBuyerId();
					sellerId = saa.getSellerId();
				}

				if ((contractId != saa.getContractId()) || buyerId != saa.getBuyerId()
						|| sellerId != saa.getSellerId()) {
					logger.error(
							"There are inconsistent information in the Single Accounting Applictations (contractId, buyerId or SellerId for ["
									+ saa.getId() + "]");
					continue;
				}
				goods.addAll(Arrays.asList(saa.getGoods()));
				totalAmount.setCurrencyType(saa.getAmount().getCurrencyType());
				totalAmount.setAmount(totalAmount.getAmount() + saa.getAmount().getAmount());
				singleAccountingApplicationIds.add(saa.getId());
			}
			String id = proxy.submitPreAccounting(proxy.generateAccountingSerialNumber(),contractId, AccountingType.NUM_ACCOUNTING, totalAmount, orderId,
					buyerId, sellerId, goods.toArray(new Goods[0]),
					singleAccountingApplicationIds.toArray(new String[]{}), notes, null);
			logger.debug("generate PreAccounting [" + id + "] for SingleAccountingApplications {"
					+ singleAccountingApplicationIds + "} in Order {" + orderId + "}");
			i++;
		}
		logger.info("Complete generating PreAccounting @ [" + TimeConverter.getCurrentTimeInISOFormat() + "]");
		logger.info("[" + i + "] PreAccountings generated in total");
	}

	private Map<String, List<SingleAccountingApplication>> getUnusedSingleAccountingApplicationsByOrders() throws BlockchainException {
		SingleAccountingApplicationProxy proxy = SdkFactory.getInstance().getSingleAccountingApplicationProxy(getOperator());
		String queryCondition = "{\"status\":\"" + SingleAccountingApplicationStatus.NOT_IN_PREACCOUNTING + "\"}";

		List<SingleAccountingApplication> all = proxy.getSingleAccountingApplications(queryCondition);

		Map<String, List<SingleAccountingApplication>> ret = new HashMap<String, List<SingleAccountingApplication>>();
		for (SingleAccountingApplication saa : all) {
			if (SingleAccountingApplicationStatus.NOT_IN_PREACCOUNTING.equals(saa.getStatus())) {
				if (ret.get(saa.getOrderId()) == null) {
					List<SingleAccountingApplication> list = new ArrayList<SingleAccountingApplication>();
					ret.put(saa.getOrderId(), list);
				}
				ret.get(saa.getOrderId()).add(saa);
			}
		}
		return ret;
	}
	public String getOperator() {
		if (this.operator != null) {
			return this.operator;
		} else {
			return ROBOT;
		}
	}
	
	
}
