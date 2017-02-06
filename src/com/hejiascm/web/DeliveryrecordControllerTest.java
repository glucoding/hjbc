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
 * Unit test for the <code>DeliveryrecordController</code> controller.
 *
 * @see com.hejiascm.web.DeliveryrecordController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class DeliveryrecordControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editDeliveryrecordDeliverygoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDeliveryrecordDeliverygoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDeliveryrecordDeliverygoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDeliveryrecordDeliverygoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDeliveryrecordDeliverygoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDeliveryrecordDeliverygoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDeliveryrecordDeliverygoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDeliveryrecordDeliverygoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDeliveryrecordDeliverygoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDeliveryrecordDeliverygoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDeliveryrecordDeliverygoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDeliveryrecordDeliverygoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDeliveryrecordDeliverygoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDeliveryrecordDeliverygoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDeliveryrecordDeliverygoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDeliveryrecordDeliverygoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDeliveryrecordDeliverygoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDeliveryrecordDeliverygoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listDeliveryrecordDeliverygoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistDeliveryrecordDeliverygoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listDeliveryrecordDeliverygoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDeliveryrecordDeliveryattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDeliveryrecordDeliveryattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDeliveryrecordDeliveryattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDeliveryrecordDeliveryattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDeliveryrecordDeliveryattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDeliveryrecordDeliveryattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDeliveryrecordDeliveryattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDeliveryrecordDeliveryattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDeliveryrecordDeliveryattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDeliveryrecordDeliveryattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDeliveryrecordDeliveryattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDeliveryrecordDeliveryattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDeliveryrecordDeliveryattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDeliveryrecordDeliveryattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDeliveryrecordDeliveryattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDeliveryrecordDeliveryattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDeliveryrecordDeliveryattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDeliveryrecordDeliveryattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listDeliveryrecordDeliveryattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistDeliveryrecordDeliveryattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listDeliveryrecordDeliveryattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deliveryrecordControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeliveryrecordControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deliveryrecordController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryrecordController controller = (DeliveryrecordController) context.getBean("DeliveryrecordController");

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