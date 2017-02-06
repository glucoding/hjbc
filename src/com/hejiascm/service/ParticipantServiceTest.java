package com.hejiascm.service;

import com.hejiascm.domain.Participant;
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
public class ParticipantServiceTest {

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
	protected ParticipantService service;

	/**
	 * Instantiates a new ParticipantServiceTest.
	 *
	 */
	public ParticipantServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Participant entity
	 * 
	 */
	@Test
	public void deleteParticipant() {
		// TODO: JUnit - Populate test inputs for operation: deleteParticipant 
		Participant participant = new com.hejiascm.domain.Participant();
		service.deleteParticipant(participant);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Participant entity
	 * 
	 */
	@Test
	public void saveParticipant() {
		// TODO: JUnit - Populate test inputs for operation: saveParticipant 
		Participant participant_1 = new com.hejiascm.domain.Participant();
		service.saveParticipant(participant_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Participant entity
	 * 
	 */
	@Test
	public void countParticipants() {
		Integer response = null;
		response = service.countParticipants();
		// TODO: JUnit - Add assertions to test outputs of operation: countParticipants
	}

	/**
	 * Operation Unit Test
	 * Save an existing Tradecontract entity
	 * 
	 */
	@Test
	public void saveParticipantTradecontract() {
		// TODO: JUnit - Populate test inputs for operation: saveParticipantTradecontract 
		String id = null;
		Tradecontract related_tradecontract = new com.hejiascm.domain.Tradecontract();
		Participant response = null;
		response = service.saveParticipantTradecontract(id, related_tradecontract);
		// TODO: JUnit - Add assertions to test outputs of operation: saveParticipantTradecontract
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@Test
	public void deleteParticipantTradecontract() {
		// TODO: JUnit - Populate test inputs for operation: deleteParticipantTradecontract 
		String participant_id = null;
		String related_tradecontract_id = null;
		Participant response = null;
		response = service.deleteParticipantTradecontract(participant_id, related_tradecontract_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteParticipantTradecontract
	}

	/**
	 * Operation Unit Test
	 * Return all Participant entity
	 * 
	 */
	@Test
	public void findAllParticipants() {
		// TODO: JUnit - Populate test inputs for operation: findAllParticipants 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Participant> response = null;
		response = service.findAllParticipants(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllParticipants
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findParticipantByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findParticipantByPrimaryKey 
		String id_1 = null;
		Participant response = null;
		response = service.findParticipantByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findParticipantByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing Participant entity
	 * 
	 */
	@Test
	public void loadParticipants() {
		Set<Participant> response = null;
		response = service.loadParticipants();
		// TODO: JUnit - Add assertions to test outputs of operation: loadParticipants
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
