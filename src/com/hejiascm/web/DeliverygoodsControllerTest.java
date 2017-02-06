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
 * Unit test for the <code>DeliverygoodsController</code> controller.
 *
 * @see com.hejiascm.web.DeliverygoodsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class DeliverygoodsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editDeliverygoodsDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDeliverygoodsDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDeliverygoodsDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDeliverygoodsDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDeliverygoodsDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDeliverygoodsDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDeliverygoodsDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDeliverygoodsDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDeliverygoodsDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDeliverygoodsDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDeliverygoodsDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDeliverygoodsDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDeliverygoodsDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDeliverygoodsDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDeliverygoodsDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDeliverygoodsDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDeliverygoodsDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDeliverygoodsDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listDeliverygoodsDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistDeliverygoodsDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listDeliverygoodsDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexDeliverygoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexDeliverygoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexDeliverygoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDeliverygoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDeliverygoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDeliverygoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDeliverygoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDeliverygoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDeliverygoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDeliverygoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDeliverygoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDeliverygoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDeliverygoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDeliverygoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDeliverygoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDeliverygoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDeliverygoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDeliverygoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDeliverygoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDeliverygoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDeliverygoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deliverygoodsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeliverygoodsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deliverygoodsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliverygoodsController controller = (DeliverygoodsController) context.getBean("DeliverygoodsController");

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