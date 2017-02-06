package com.hejiascm.service;

import com.hejiascm.domain.Receivingattachment;
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
public class ReceivingrecordServiceTest {

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
	protected ReceivingrecordService service;

	/**
	 * Instantiates a new ReceivingrecordServiceTest.
	 *
	 */
	public ReceivingrecordServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all Receivingrecord entity
	 * 
	 */
	@Test
	public void findAllReceivingrecords() {
		// TODO: JUnit - Populate test inputs for operation: findAllReceivingrecords 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Receivingrecord> response = null;
		response = service.findAllReceivingrecords(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllReceivingrecords
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Receivingrecord entity
	 * 
	 */
	@Test
	public void countReceivingrecords() {
		Integer response = null;
		response = service.countReceivingrecords();
		// TODO: JUnit - Add assertions to test outputs of operation: countReceivingrecords
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Receivingattachment entity
	 * 
	 */
	@Test
	public void deleteReceivingrecordReceivingattachments() {
		// TODO: JUnit - Populate test inputs for operation: deleteReceivingrecordReceivingattachments 
		String receivingrecord_id = null;
		String related_receivingattachments_id = null;
		Receivingrecord response = null;
		response = service.deleteReceivingrecordReceivingattachments(receivingrecord_id, related_receivingattachments_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteReceivingrecordReceivingattachments
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	@Test
	public void deleteReceivingrecord() {
		// TODO: JUnit - Populate test inputs for operation: deleteReceivingrecord 
		Receivingrecord receivingrecord = new com.hejiascm.domain.Receivingrecord();
		service.deleteReceivingrecord(receivingrecord);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Receivingrecord entity
	 * 
	 */
	@Test
	public void loadReceivingrecords() {
		Set<Receivingrecord> response = null;
		response = service.loadReceivingrecords();
		// TODO: JUnit - Add assertions to test outputs of operation: loadReceivingrecords
	}

	/**
	 * Operation Unit Test
	 * Save an existing Receivinggoods entity
	 * 
	 */
	@Test
	public void saveReceivingrecordReceivinggoodses() {
		// TODO: JUnit - Populate test inputs for operation: saveReceivingrecordReceivinggoodses 
		String id = null;
		Receivinggoods related_receivinggoodses = new com.hejiascm.domain.Receivinggoods();
		Receivingrecord response = null;
		response = service.saveReceivingrecordReceivinggoodses(id, related_receivinggoodses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveReceivingrecordReceivinggoodses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Receivinggoods entity
	 * 
	 */
	@Test
	public void deleteReceivingrecordReceivinggoodses() {
		// TODO: JUnit - Populate test inputs for operation: deleteReceivingrecordReceivinggoodses 
		String receivingrecord_id_1 = null;
		String related_receivinggoodses_id = null;
		Receivingrecord response = null;
		response = service.deleteReceivingrecordReceivinggoodses(receivingrecord_id_1, related_receivinggoodses_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteReceivingrecordReceivinggoodses
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findReceivingrecordByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findReceivingrecordByPrimaryKey 
		String id_1 = null;
		Receivingrecord response = null;
		response = service.findReceivingrecordByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findReceivingrecordByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Receivingrecord entity
	 * 
	 */
	@Test
	public void saveReceivingrecord() {
		// TODO: JUnit - Populate test inputs for operation: saveReceivingrecord 
		Receivingrecord receivingrecord_1 = new com.hejiascm.domain.Receivingrecord();
		service.saveReceivingrecord(receivingrecord_1);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Receivingattachment entity
	 * 
	 */
	@Test
	public void saveReceivingrecordReceivingattachments() {
		// TODO: JUnit - Populate test inputs for operation: saveReceivingrecordReceivingattachments 
		String id_2 = null;
		Receivingattachment related_receivingattachments = new com.hejiascm.domain.Receivingattachment();
		Receivingrecord response = null;
		response = service.saveReceivingrecordReceivingattachments(id_2, related_receivingattachments);
		// TODO: JUnit - Add assertions to test outputs of operation: saveReceivingrecordReceivingattachments
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
