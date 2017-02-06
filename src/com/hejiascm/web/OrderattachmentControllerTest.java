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
 * Unit test for the <code>OrderattachmentController</code> controller.
 *
 * @see com.hejiascm.web.OrderattachmentController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class OrderattachmentControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOrderattachmentOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderattachmentOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderattachmentOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderattachmentOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderattachmentOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderattachmentOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderattachmentOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderattachmentOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderattachmentOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderattachmentOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderattachmentOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderattachmentOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderattachmentOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderattachmentOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderattachmentOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderattachmentOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderattachmentOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderattachmentOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderattachmentOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderattachmentOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderattachmentOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOrderattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrderattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrderattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>orderattachmentControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetorderattachmentControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/orderattachmentController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderattachmentController controller = (OrderattachmentController) context.getBean("OrderattachmentController");

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