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
 * Unit test for the <code>TradecontractattachmentController</code> controller.
 *
 * @see com.hejiascm.web.TradecontractattachmentController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class TradecontractattachmentControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editTradecontractattachmentTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTradecontractattachmentTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTradecontractattachmentTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTradecontractattachmentTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTradecontractattachmentTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTradecontractattachmentTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTradecontractattachmentTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTradecontractattachmentTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTradecontractattachmentTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTradecontractattachmentTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTradecontractattachmentTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTradecontractattachmentTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTradecontractattachmentTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTradecontractattachmentTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTradecontractattachmentTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTradecontractattachmentTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTradecontractattachmentTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTradecontractattachmentTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listTradecontractattachmentTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistTradecontractattachmentTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listTradecontractattachmentTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexTradecontractattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexTradecontractattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexTradecontractattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTradecontractattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTradecontractattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTradecontractattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editTradecontractattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTradecontractattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTradecontractattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTradecontractattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTradecontractattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTradecontractattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTradecontractattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTradecontractattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTradecontractattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTradecontractattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTradecontractattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTradecontractattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTradecontractattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTradecontractattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTradecontractattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>tradecontractattachmentControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GettradecontractattachmentControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/tradecontractattachmentController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentController controller = (TradecontractattachmentController) context.getBean("TradecontractattachmentController");

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