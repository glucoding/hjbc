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
 * Unit test for the <code>OperationController</code> controller.
 *
 * @see com.hejiascm.web.OperationController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class OperationControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOperationTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOperationTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOperationTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOperationTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOperationTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOperationTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOperationTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOperationTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOperationTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOperationTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOperationTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOperationTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOperationTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOperationTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOperationTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOperationTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOperationTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOperationTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOperationTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOperationTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOperationTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOperation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOperation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOperation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOperation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOperation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOperation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOperation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOperation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOperation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOperation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOperation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOperation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOperation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOperation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOperation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOperation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOperation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOperation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOperation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOperation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOperation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>operationControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetoperationControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/operationController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OperationController controller = (OperationController) context.getBean("OperationController");

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