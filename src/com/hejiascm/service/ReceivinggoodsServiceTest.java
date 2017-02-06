package com.hejiascm.service;

import com.hejiascm.domain.Receivinggoods;
import com.hejiascm.domain.Receivingrecord;

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
public class ReceivinggoodsServiceTest {

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
	protected ReceivinggoodsService service;

	/**
	 * Instantiates a new ReceivinggoodsServiceTest.
	 *
	 */
	public ReceivinggoodsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	@Test
	public void deleteReceivinggoodsReceivingrecord() {
		// TODO: JUnit - Populate test inputs for operation: deleteReceivinggoodsReceivingrecord 
		String receivinggoods_id = null;
		String related_receivingrecord_id = null;
		Receivinggoods response = null;
		response = service.deleteReceivinggoodsReceivingrecord(receivinggoods_id, related_receivingrecord_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteReceivinggoodsReceivingrecord
	}

	/**
	 * Operation Unit Test
	 * Save an existing Receivingrecord entity
	 * 
	 */
	@Test
	public void saveReceivinggoodsReceivingrecord() {
		// TODO: JUnit - Populate test inputs for operation: saveReceivinggoodsReceivingrecord 
		String id = null;
		Receivingrecord related_receivingrecord = new com.hejiascm.domain.Receivingrecord();
		Receivinggoods response = null;
		response = service.saveReceivinggoodsReceivingrecord(id, related_receivingrecord);
		// TODO: JUnit - Add assertions to test outputs of operation: saveReceivinggoodsReceivingrecord
	}

	/**
	 * Operation Unit Test
	 * Load an existing Receivinggoods entity
	 * 
	 */
	@Test
	public void loadReceivinggoodss() {
		Set<Receivinggoods> response = null;
		response = service.loadReceivinggoodss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadReceivinggoodss
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Receivinggoods entity
	 * 
	 */
	@Test
	public void countReceivinggoodss() {
		Integer response = null;
		response = service.countReceivinggoodss();
		// TODO: JUnit - Add assertions to test outputs of operation: countReceivinggoodss
	}

	/**
	 * Operation Unit Test
	 * Return all Receivinggoods entity
	 * 
	 */
	@Test
	public void findAllReceivinggoodss() {
		// TODO: JUnit - Populate test inputs for operation: findAllReceivinggoodss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Receivinggoods> response = null;
		response = service.findAllReceivinggoodss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllReceivinggoodss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Receivinggoods entity
	 * 
	 */
	@Test
	public void deleteReceivinggoods() {
		// TODO: JUnit - Populate test inputs for operation: deleteReceivinggoods 
		Receivinggoods receivinggoods = new com.hejiascm.domain.Receivinggoods();
		service.deleteReceivinggoods(receivinggoods);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findReceivinggoodsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findReceivinggoodsByPrimaryKey 
		String id_1 = null;
		Receivinggoods response = null;
		response = service.findReceivinggoodsByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findReceivinggoodsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Receivinggoods entity
	 * 
	 */
	@Test
	public void saveReceivinggoods() {
		// TODO: JUnit - Populate test inputs for operation: saveReceivinggoods 
		Receivinggoods receivinggoods_1 = new com.hejiascm.domain.Receivinggoods();
		service.saveReceivinggoods(receivinggoods_1);
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
