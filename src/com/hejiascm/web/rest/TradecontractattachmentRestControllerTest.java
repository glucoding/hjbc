package com.hejiascm.web.rest;

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
 * Unit test for the <code>TradecontractattachmentRestController</code> controller.
 *
 * @see com.hejiascm.web.rest.TradecontractattachmentRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class TradecontractattachmentRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Tradecontractattachmenttradecontractattachment_idtradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetTradecontractattachmenttradecontractattachment_idtradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Tradecontractattachment/{tradecontractattachment_id}/tradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentRestController controller = (TradecontractattachmentRestController) context.getBean("TradecontractattachmentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tradecontractattachmenttradecontractattachment_idtradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostTradecontractattachmenttradecontractattachment_idtradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Tradecontractattachment/{tradecontractattachment_id}/tradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentRestController controller = (TradecontractattachmentRestController) context.getBean("TradecontractattachmentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tradecontractattachmenttradecontractattachment_idtradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutTradecontractattachmenttradecontractattachment_idtradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Tradecontractattachment/{tradecontractattachment_id}/tradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentRestController controller = (TradecontractattachmentRestController) context.getBean("TradecontractattachmentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tradecontractattachmenttradecontractattachment_idtradecontracttradecontract_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteTradecontractattachmenttradecontractattachment_idtradecontracttradecontract_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Tradecontractattachment/{tradecontractattachment_id}/tradecontract/{tradecontract_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentRestController controller = (TradecontractattachmentRestController) context.getBean("TradecontractattachmentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tradecontractattachmenttradecontractattachment_idtradecontracttradecontract_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetTradecontractattachmenttradecontractattachment_idtradecontracttradecontract_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Tradecontractattachment/{tradecontractattachment_id}/tradecontract/{tradecontract_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentRestController controller = (TradecontractattachmentRestController) context.getBean("TradecontractattachmentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tradecontractattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetTradecontractattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Tradecontractattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentRestController controller = (TradecontractattachmentRestController) context.getBean("TradecontractattachmentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tradecontractattachmenttradecontractattachment_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetTradecontractattachmenttradecontractattachment_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Tradecontractattachment/{tradecontractattachment_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentRestController controller = (TradecontractattachmentRestController) context.getBean("TradecontractattachmentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tradecontractattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutTradecontractattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Tradecontractattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentRestController controller = (TradecontractattachmentRestController) context.getBean("TradecontractattachmentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tradecontractattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostTradecontractattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Tradecontractattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentRestController controller = (TradecontractattachmentRestController) context.getBean("TradecontractattachmentRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Tradecontractattachmenttradecontractattachment_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteTradecontractattachmenttradecontractattachment_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Tradecontractattachment/{tradecontractattachment_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractattachmentRestController controller = (TradecontractattachmentRestController) context.getBean("TradecontractattachmentRestController");

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