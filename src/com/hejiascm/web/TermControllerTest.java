package com.hejiascm.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>TermController</code> controller.
 *
 * @see com.hejiascm.web.TermController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class TermControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editTermTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTermTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTermTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTermTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTermTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTermTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTermTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTermTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTermTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTermTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTermTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTermTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTermTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTermTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTermTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTermTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTermTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTermTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listTermTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistTermTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listTermTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexTerm()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexTerm() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexTerm");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTerm()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTerm() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTerm");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editTerm()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTerm() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTerm");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTerm()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTerm() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTerm");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTerm()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTerm() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTerm");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTerm()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTerm() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTerm");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTerm()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTerm() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTerm");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>termControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GettermControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/termController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TermController controller = (TermController) context.getBean("TermController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}