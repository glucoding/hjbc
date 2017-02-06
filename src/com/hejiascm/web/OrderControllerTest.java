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
 * Unit test for the <code>OrderController</code> controller.
 *
 * @see com.hejiascm.web.OrderController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class OrderControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOrderOrdergoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderOrdergoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderOrdergoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderOrdergoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderOrdergoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderOrdergoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderOrdergoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderOrdergoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderOrdergoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderOrdergoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderOrdergoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderOrdergoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderOrdergoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderOrdergoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderOrdergoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderOrdergoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderOrdergoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderOrdergoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderOrdergoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderOrdergoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderOrdergoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrderOrderattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrderOrderattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrderOrderattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrderOrderattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrderOrderattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrderOrderattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrderOrderattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrderOrderattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrderOrderattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrderOrderattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrderOrderattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrderOrderattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrderOrderattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrderOrderattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrderOrderattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrderOrderattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrderOrderattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrderOrderattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrderOrderattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrderOrderattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrderOrderattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>orderControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetorderControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/orderController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrderController controller = (OrderController) context.getBean("OrderController");

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