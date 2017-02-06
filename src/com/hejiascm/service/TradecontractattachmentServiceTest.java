package com.hejiascm.service;

import com.hejiascm.domain.Tradecontract;
import com.hejiascm.domain.Tradecontractattachment;

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
public class TradecontractattachmentServiceTest {

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
	protected TradecontractattachmentService service;

	/**
	 * Instantiates a new TradecontractattachmentServiceTest.
	 *
	 */
	public TradecontractattachmentServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing Tradecontractattachment entity
	 * 
	 */
	@Test
	public void loadTradecontractattachments() {
		Set<Tradecontractattachment> response = null;
		response = service.loadTradecontractattachments();
		// TODO: JUnit - Add assertions to test outputs of operation: loadTradecontractattachments
	}

	/**
	 * Operation Unit Test
	 * Save an existing Tradecontractattachment entity
	 * 
	 */
	@Test
	public void saveTradecontractattachment() {
		// TODO: JUnit - Populate test inputs for operation: saveTradecontractattachment 
		Tradecontractattachment tradecontractattachment = new com.hejiascm.domain.Tradecontractattachment();
		service.saveTradecontractattachment(tradecontractattachment);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findTradecontractattachmentByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findTradecontractattachmentByPrimaryKey 
		String id = null;
		Tradecontractattachment response = null;
		response = service.findTradecontractattachmentByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findTradecontractattachmentByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Tradecontractattachment entity
	 * 
	 */
	@Test
	public void deleteTradecontractattachment() {
		// TODO: JUnit - Populate test inputs for operation: deleteTradecontractattachment 
		Tradecontractattachment tradecontractattachment_1 = new com.hejiascm.domain.Tradecontractattachment();
		service.deleteTradecontractattachment(tradecontractattachment_1);
	}

	/**
	 * Operation Unit Test
	 * Return all Tradecontractattachment entity
	 * 
	 */
	@Test
	public void findAllTradecontractattachments() {
		// TODO: JUnit - Populate test inputs for operation: findAllTradecontractattachments 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Tradecontractattachment> response = null;
		response = service.findAllTradecontractattachments(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllTradecontractattachments
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Tradecontractattachment entity
	 * 
	 */
	@Test
	public void countTradecontractattachments() {
		Integer response = null;
		response = service.countTradecontractattachments();
		// TODO: JUnit - Add assertions to test outputs of operation: countTradecontractattachments
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@Test
	public void deleteTradecontractattachmentTradecontract() {
		// TODO: JUnit - Populate test inputs for operation: deleteTradecontractattachmentTradecontract 
		String tradecontractattachment_id = null;
		String related_tradecontract_id = null;
		Tradecontractattachment response = null;
		response = service.deleteTradecontractattachmentTradecontract(tradecontractattachment_id, related_tradecontract_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteTradecontractattachmentTradecontract
	}

	/**
	 * Operation Unit Test
	 * Save an existing Tradecontract entity
	 * 
	 */
	@Test
	public void saveTradecontractattachmentTradecontract() {
		// TODO: JUnit - Populate test inputs for operation: saveTradecontractattachmentTradecontract 
		String id_1 = null;
		Tradecontract related_tradecontract = new com.hejiascm.domain.Tradecontract();
		Tradecontractattachment response = null;
		response = service.saveTradecontractattachmentTradecontract(id_1, related_tradecontract);
		// TODO: JUnit - Add assertions to test outputs of operation: saveTradecontractattachmentTradecontract
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
