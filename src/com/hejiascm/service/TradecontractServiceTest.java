package com.hejiascm.service;

import com.hejiascm.domain.Contractgoods;
import com.hejiascm.domain.Operation;
import com.hejiascm.domain.Participant;
import com.hejiascm.domain.Term;
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
public class TradecontractServiceTest {

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
	protected TradecontractService service;

	/**
	 * Instantiates a new TradecontractServiceTest.
	 *
	 */
	public TradecontractServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Contractgoods entity
	 * 
	 */
	@Test
	public void deleteTradecontractContractgoodses() {
		// TODO: JUnit - Populate test inputs for operation: deleteTradecontractContractgoodses 
		String tradecontract_id = null;
		String related_contractgoodses_id = null;
		Tradecontract response = null;
		response = service.deleteTradecontractContractgoodses(tradecontract_id, related_contractgoodses_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteTradecontractContractgoodses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Contractgoods entity
	 * 
	 */
	@Test
	public void saveTradecontractContractgoodses() {
		// TODO: JUnit - Populate test inputs for operation: saveTradecontractContractgoodses 
		String id = null;
		Contractgoods related_contractgoodses = new com.hejiascm.domain.Contractgoods();
		Tradecontract response = null;
		response = service.saveTradecontractContractgoodses(id, related_contractgoodses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveTradecontractContractgoodses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Tradecontractattachment entity
	 * 
	 */
	@Test
	public void saveTradecontractTradecontractattachments() {
		// TODO: JUnit - Populate test inputs for operation: saveTradecontractTradecontractattachments 
		String id_1 = null;
		Tradecontractattachment related_tradecontractattachments = new com.hejiascm.domain.Tradecontractattachment();
		Tradecontract response = null;
		response = service.saveTradecontractTradecontractattachments(id_1, related_tradecontractattachments);
		// TODO: JUnit - Add assertions to test outputs of operation: saveTradecontractTradecontractattachments
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Operation entity
	 * 
	 */
	@Test
	public void deleteTradecontractOperations() {
		// TODO: JUnit - Populate test inputs for operation: deleteTradecontractOperations 
		String tradecontract_id_1 = null;
		String related_operations_id = null;
		Tradecontract response = null;
		response = service.deleteTradecontractOperations(tradecontract_id_1, related_operations_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteTradecontractOperations
	}

	/**
	 * Operation Unit Test
	 * Save an existing Participant entity
	 * 
	 */
	@Test
	public void saveTradecontractParticipants() {
		// TODO: JUnit - Populate test inputs for operation: saveTradecontractParticipants 
		String id_2 = null;
		Participant related_participants = new com.hejiascm.domain.Participant();
		Tradecontract response = null;
		response = service.saveTradecontractParticipants(id_2, related_participants);
		// TODO: JUnit - Add assertions to test outputs of operation: saveTradecontractParticipants
	}

	/**
	 * Operation Unit Test
	 * Save an existing Operation entity
	 * 
	 */
	@Test
	public void saveTradecontractOperations() {
		// TODO: JUnit - Populate test inputs for operation: saveTradecontractOperations 
		String id_3 = null;
		Operation related_operations = new com.hejiascm.domain.Operation();
		Tradecontract response = null;
		response = service.saveTradecontractOperations(id_3, related_operations);
		// TODO: JUnit - Add assertions to test outputs of operation: saveTradecontractOperations
	}

	/**
	 * Operation Unit Test
	 * Load an existing Tradecontract entity
	 * 
	 */
	@Test
	public void loadTradecontracts() {
		Set<Tradecontract> response = null;
		response = service.loadTradecontracts();
		// TODO: JUnit - Add assertions to test outputs of operation: loadTradecontracts
	}

	/**
	 * Operation Unit Test
	 * Return all Tradecontract entity
	 * 
	 */
	@Test
	public void findAllTradecontracts() {
		// TODO: JUnit - Populate test inputs for operation: findAllTradecontracts 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Tradecontract> response = null;
		response = service.findAllTradecontracts(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllTradecontracts
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Tradecontractattachment entity
	 * 
	 */
	@Test
	public void deleteTradecontractTradecontractattachments() {
		// TODO: JUnit - Populate test inputs for operation: deleteTradecontractTradecontractattachments 
		String tradecontract_id_2 = null;
		String related_tradecontractattachments_id = null;
		Tradecontract response = null;
		response = service.deleteTradecontractTradecontractattachments(tradecontract_id_2, related_tradecontractattachments_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteTradecontractTradecontractattachments
	}

	/**
	 * Operation Unit Test
	 * Save an existing Tradecontract entity
	 * 
	 */
	@Test
	public void saveTradecontract() {
		// TODO: JUnit - Populate test inputs for operation: saveTradecontract 
		Tradecontract tradecontract = new com.hejiascm.domain.Tradecontract();
		service.saveTradecontract(tradecontract);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Participant entity
	 * 
	 */
	@Test
	public void deleteTradecontractParticipants() {
		// TODO: JUnit - Populate test inputs for operation: deleteTradecontractParticipants 
		String tradecontract_id_3 = null;
		String related_participants_id = null;
		Tradecontract response = null;
		response = service.deleteTradecontractParticipants(tradecontract_id_3, related_participants_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteTradecontractParticipants
	}

	/**
	 * Operation Unit Test
	 * Save an existing Term entity
	 * 
	 */
	@Test
	public void saveTradecontractTerms() {
		// TODO: JUnit - Populate test inputs for operation: saveTradecontractTerms 
		String id_4 = null;
		Term related_terms = new com.hejiascm.domain.Term();
		Tradecontract response = null;
		response = service.saveTradecontractTerms(id_4, related_terms);
		// TODO: JUnit - Add assertions to test outputs of operation: saveTradecontractTerms
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findTradecontractByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findTradecontractByPrimaryKey 
		String id_5 = null;
		Tradecontract response = null;
		response = service.findTradecontractByPrimaryKey(id_5);
		// TODO: JUnit - Add assertions to test outputs of operation: findTradecontractByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Term entity
	 * 
	 */
	@Test
	public void deleteTradecontractTerms() {
		// TODO: JUnit - Populate test inputs for operation: deleteTradecontractTerms 
		String tradecontract_id_4 = null;
		String related_terms_id = null;
		Tradecontract response = null;
		response = service.deleteTradecontractTerms(tradecontract_id_4, related_terms_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteTradecontractTerms
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@Test
	public void deleteTradecontract() {
		// TODO: JUnit - Populate test inputs for operation: deleteTradecontract 
		Tradecontract tradecontract_1 = new com.hejiascm.domain.Tradecontract();
		service.deleteTradecontract(tradecontract_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Tradecontract entity
	 * 
	 */
	@Test
	public void countTradecontracts() {
		Integer response = null;
		response = service.countTradecontracts();
		// TODO: JUnit - Add assertions to test outputs of operation: countTradecontracts
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
