package com.hejiascm.service;

import com.hejiascm.domain.Contractgoods;
import com.hejiascm.domain.Tradecontract;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
@Transactional
public class ContractgoodsServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected ContractgoodsService service;

	/**
	 * Instantiates a new ContractgoodsServiceTest.
	 *
	 */
	public ContractgoodsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Contractgoods entity
	 * 
	 */
	@Test
	public void countContractgoodss() {
		Integer response = null;
		response = service.countContractgoodss();
		// TODO: JUnit - Add assertions to test outputs of operation: countContractgoodss
	}

	/**
	 * Operation Unit Test
	 * Save an existing Tradecontract entity
	 * 
	 */
	@Test
	public void saveContractgoodsTradecontract() {
		// TODO: JUnit - Populate test inputs for operation: saveContractgoodsTradecontract 
		String id = null;
		Tradecontract related_tradecontract = new com.hejiascm.domain.Tradecontract();
		Contractgoods response = null;
		response = service.saveContractgoodsTradecontract(id, related_tradecontract);
		// TODO: JUnit - Add assertions to test outputs of operation: saveContractgoodsTradecontract
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findContractgoodsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findContractgoodsByPrimaryKey 
		String id_1 = null;
		Contractgoods response = null;
		response = service.findContractgoodsByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findContractgoodsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Contractgoods entity
	 * 
	 */
	@Test
	public void deleteContractgoods() {
		// TODO: JUnit - Populate test inputs for operation: deleteContractgoods 
		Contractgoods contractgoods = new com.hejiascm.domain.Contractgoods();
		service.deleteContractgoods(contractgoods);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@Test
	public void deleteContractgoodsTradecontract() {
		// TODO: JUnit - Populate test inputs for operation: deleteContractgoodsTradecontract 
		String contractgoods_id = null;
		String related_tradecontract_id = null;
		Contractgoods response = null;
		response = service.deleteContractgoodsTradecontract(contractgoods_id, related_tradecontract_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteContractgoodsTradecontract
	}

	/**
	 * Operation Unit Test
	 * Save an existing Contractgoods entity
	 * 
	 */
	@Test
	public void saveContractgoods() {
		// TODO: JUnit - Populate test inputs for operation: saveContractgoods 
		Contractgoods contractgoods_1 = new com.hejiascm.domain.Contractgoods();
		service.saveContractgoods(contractgoods_1);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Contractgoods entity
	 * 
	 */
	@Test
	public void loadContractgoodss() {
		Set<Contractgoods> response = null;
		response = service.loadContractgoodss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadContractgoodss
	}

	/**
	 * Operation Unit Test
	 * Return all Contractgoods entity
	 * 
	 */
	@Test
	public void findAllContractgoodss() {
		// TODO: JUnit - Populate test inputs for operation: findAllContractgoodss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Contractgoods> response = null;
		response = service.findAllContractgoodss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllContractgoodss
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
