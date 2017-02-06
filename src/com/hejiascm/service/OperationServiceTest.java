package com.hejiascm.service;

import com.hejiascm.domain.Operation;
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
public class OperationServiceTest {

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
	protected OperationService service;

	/**
	 * Instantiates a new OperationServiceTest.
	 *
	 */
	public OperationServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing Operation entity
	 * 
	 */
	@Test
	public void loadOperations() {
		Set<Operation> response = null;
		response = service.loadOperations();
		// TODO: JUnit - Add assertions to test outputs of operation: loadOperations
	}

	/**
	 * Operation Unit Test
	 * Save an existing Operation entity
	 * 
	 */
	@Test
	public void saveOperation() {
		// TODO: JUnit - Populate test inputs for operation: saveOperation 
		Operation operation = new com.hejiascm.domain.Operation();
		service.saveOperation(operation);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@Test
	public void deleteOperationTradecontract() {
		// TODO: JUnit - Populate test inputs for operation: deleteOperationTradecontract 
		String operation_id = null;
		String related_tradecontract_id = null;
		Operation response = null;
		response = service.deleteOperationTradecontract(operation_id, related_tradecontract_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOperationTradecontract
	}

	/**
	 * Operation Unit Test
	 * Save an existing Tradecontract entity
	 * 
	 */
	@Test
	public void saveOperationTradecontract() {
		// TODO: JUnit - Populate test inputs for operation: saveOperationTradecontract 
		String id = null;
		Tradecontract related_tradecontract = new com.hejiascm.domain.Tradecontract();
		Operation response = null;
		response = service.saveOperationTradecontract(id, related_tradecontract);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOperationTradecontract
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Operation entity
	 * 
	 */
	@Test
	public void deleteOperation() {
		// TODO: JUnit - Populate test inputs for operation: deleteOperation 
		Operation operation_1 = new com.hejiascm.domain.Operation();
		service.deleteOperation(operation_1);
	}

	/**
	 * Operation Unit Test
	 * Return all Operation entity
	 * 
	 */
	@Test
	public void findAllOperations() {
		// TODO: JUnit - Populate test inputs for operation: findAllOperations 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Operation> response = null;
		response = service.findAllOperations(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllOperations
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findOperationByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findOperationByPrimaryKey 
		String id_1 = null;
		Operation response = null;
		response = service.findOperationByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findOperationByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Operation entity
	 * 
	 */
	@Test
	public void countOperations() {
		Integer response = null;
		response = service.countOperations();
		// TODO: JUnit - Add assertions to test outputs of operation: countOperations
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
