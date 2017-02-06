package com.hejiascm.service;

import com.hejiascm.domain.Term;
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
public class TermServiceTest {

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
	protected TermService service;

	/**
	 * Instantiates a new TermServiceTest.
	 *
	 */
	public TermServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Term entity
	 * 
	 */
	@Test
	public void countTerms() {
		Integer response = null;
		response = service.countTerms();
		// TODO: JUnit - Add assertions to test outputs of operation: countTerms
	}

	/**
	 * Operation Unit Test
	 * Save an existing Term entity
	 * 
	 */
	@Test
	public void saveTerm() {
		// TODO: JUnit - Populate test inputs for operation: saveTerm 
		Term term = new com.hejiascm.domain.Term();
		service.saveTerm(term);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Tradecontract entity
	 * 
	 */
	@Test
	public void saveTermTradecontract() {
		// TODO: JUnit - Populate test inputs for operation: saveTermTradecontract 
		String id = null;
		Tradecontract related_tradecontract = new com.hejiascm.domain.Tradecontract();
		Term response = null;
		response = service.saveTermTradecontract(id, related_tradecontract);
		// TODO: JUnit - Add assertions to test outputs of operation: saveTermTradecontract
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findTermByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findTermByPrimaryKey 
		String id_1 = null;
		Term response = null;
		response = service.findTermByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findTermByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all Term entity
	 * 
	 */
	@Test
	public void findAllTerms() {
		// TODO: JUnit - Populate test inputs for operation: findAllTerms 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Term> response = null;
		response = service.findAllTerms(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllTerms
	}

	/**
	 * Operation Unit Test
	 * Load an existing Term entity
	 * 
	 */
	@Test
	public void loadTerms() {
		Set<Term> response = null;
		response = service.loadTerms();
		// TODO: JUnit - Add assertions to test outputs of operation: loadTerms
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Tradecontract entity
	 * 
	 */
	@Test
	public void deleteTermTradecontract() {
		// TODO: JUnit - Populate test inputs for operation: deleteTermTradecontract 
		String term_id = null;
		String related_tradecontract_id = null;
		Term response = null;
		response = service.deleteTermTradecontract(term_id, related_tradecontract_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteTermTradecontract
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Term entity
	 * 
	 */
	@Test
	public void deleteTerm() {
		// TODO: JUnit - Populate test inputs for operation: deleteTerm 
		Term term_1 = new com.hejiascm.domain.Term();
		service.deleteTerm(term_1);
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
