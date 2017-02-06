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
 * Unit test for the <code>OrdergoodsController</code> controller.
 *
 * @see com.hejiascm.web.OrdergoodsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class OrdergoodsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOrdergoodsOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrdergoodsOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrdergoodsOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrdergoodsOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrdergoodsOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrdergoodsOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrdergoodsOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrdergoodsOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrdergoodsOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrdergoodsOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrdergoodsOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrdergoodsOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrdergoodsOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrdergoodsOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrdergoodsOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrdergoodsOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrdergoodsOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrdergoodsOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrdergoodsOrder()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrdergoodsOrder() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrdergoodsOrder");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOrdergoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrdergoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrdergoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrdergoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrdergoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrdergoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrdergoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrdergoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrdergoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrdergoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrdergoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrdergoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrdergoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrdergoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrdergoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrdergoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrdergoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrdergoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrdergoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrdergoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrdergoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ordergoodsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetordergoodsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ordergoodsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrdergoodsController controller = (OrdergoodsController) context.getBean("OrdergoodsController");

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