package com.hejiascm.service;

import com.hejiascm.domain.Receivingattachment;
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
public class ReceivingattachmentServiceTest {

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
	protected ReceivingattachmentService service;

	/**
	 * Instantiates a new ReceivingattachmentServiceTest.
	 *
	 */
	public ReceivingattachmentServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Receivingrecord entity
	 * 
	 */
	@Test
	public void deleteReceivingattachmentReceivingrecord() {
		// TODO: JUnit - Populate test inputs for operation: deleteReceivingattachmentReceivingrecord 
		String receivingattachment_id = null;
		String related_receivingrecord_id = null;
		Receivingattachment response = null;
		response = service.deleteReceivingattachmentReceivingrecord(receivingattachment_id, related_receivingrecord_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteReceivingattachmentReceivingrecord
	}

	/**
	 * Operation Unit Test
	 * Load an existing Receivingattachment entity
	 * 
	 */
	@Test
	public void loadReceivingattachments() {
		Set<Receivingattachment> response = null;
		response = service.loadReceivingattachments();
		// TODO: JUnit - Add assertions to test outputs of operation: loadReceivingattachments
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Receivingattachment entity
	 * 
	 */
	@Test
	public void countReceivingattachments() {
		Integer response = null;
		response = service.countReceivingattachments();
		// TODO: JUnit - Add assertions to test outputs of operation: countReceivingattachments
	}

	/**
	 * Operation Unit Test
	 * Save an existing Receivingrecord entity
	 * 
	 */
	@Test
	public void saveReceivingattachmentReceivingrecord() {
		// TODO: JUnit - Populate test inputs for operation: saveReceivingattachmentReceivingrecord 
		String id = null;
		Receivingrecord related_receivingrecord = new com.hejiascm.domain.Receivingrecord();
		Receivingattachment response = null;
		response = service.saveReceivingattachmentReceivingrecord(id, related_receivingrecord);
		// TODO: JUnit - Add assertions to test outputs of operation: saveReceivingattachmentReceivingrecord
	}

	/**
	 * Operation Unit Test
	 * Save an existing Receivingattachment entity
	 * 
	 */
	@Test
	public void saveReceivingattachment() {
		// TODO: JUnit - Populate test inputs for operation: saveReceivingattachment 
		Receivingattachment receivingattachment = new com.hejiascm.domain.Receivingattachment();
		service.saveReceivingattachment(receivingattachment);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Receivingattachment entity
	 * 
	 */
	@Test
	public void deleteReceivingattachment() {
		// TODO: JUnit - Populate test inputs for operation: deleteReceivingattachment 
		Receivingattachment receivingattachment_1 = new com.hejiascm.domain.Receivingattachment();
		service.deleteReceivingattachment(receivingattachment_1);
	}

	/**
	 * Operation Unit Test
	 * Return all Receivingattachment entity
	 * 
	 */
	@Test
	public void findAllReceivingattachments() {
		// TODO: JUnit - Populate test inputs for operation: findAllReceivingattachments 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Receivingattachment> response = null;
		response = service.findAllReceivingattachments(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllReceivingattachments
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findReceivingattachmentByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findReceivingattachmentByPrimaryKey 
		String id_1 = null;
		Receivingattachment response = null;
		response = service.findReceivingattachmentByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findReceivingattachmentByPrimaryKey
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
