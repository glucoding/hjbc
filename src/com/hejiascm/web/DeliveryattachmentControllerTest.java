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
 * Unit test for the <code>DeliveryattachmentController</code> controller.
 *
 * @see com.hejiascm.web.DeliveryattachmentController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class DeliveryattachmentControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editDeliveryattachmentDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDeliveryattachmentDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDeliveryattachmentDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDeliveryattachmentDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDeliveryattachmentDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDeliveryattachmentDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDeliveryattachmentDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDeliveryattachmentDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDeliveryattachmentDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDeliveryattachmentDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDeliveryattachmentDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDeliveryattachmentDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDeliveryattachmentDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDeliveryattachmentDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDeliveryattachmentDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDeliveryattachmentDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDeliveryattachmentDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDeliveryattachmentDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listDeliveryattachmentDeliveryrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistDeliveryattachmentDeliveryrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listDeliveryattachmentDeliveryrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexDeliveryattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexDeliveryattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexDeliveryattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDeliveryattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDeliveryattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDeliveryattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDeliveryattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDeliveryattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDeliveryattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDeliveryattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDeliveryattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDeliveryattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDeliveryattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDeliveryattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDeliveryattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDeliveryattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDeliveryattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDeliveryattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDeliveryattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDeliveryattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDeliveryattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deliveryattachmentControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeliveryattachmentControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deliveryattachmentController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DeliveryattachmentController controller = (DeliveryattachmentController) context.getBean("DeliveryattachmentController");

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