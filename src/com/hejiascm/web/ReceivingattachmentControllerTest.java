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
 * Unit test for the <code>ReceivingattachmentController</code> controller.
 *
 * @see com.hejiascm.web.ReceivingattachmentController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class ReceivingattachmentControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editReceivingattachmentReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditReceivingattachmentReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editReceivingattachmentReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newReceivingattachmentReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewReceivingattachmentReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newReceivingattachmentReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveReceivingattachmentReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveReceivingattachmentReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveReceivingattachmentReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteReceivingattachmentReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteReceivingattachmentReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteReceivingattachmentReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteReceivingattachmentReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteReceivingattachmentReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteReceivingattachmentReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectReceivingattachmentReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectReceivingattachmentReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectReceivingattachmentReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listReceivingattachmentReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistReceivingattachmentReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listReceivingattachmentReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexReceivingattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexReceivingattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexReceivingattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectReceivingattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectReceivingattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectReceivingattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editReceivingattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditReceivingattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editReceivingattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveReceivingattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveReceivingattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveReceivingattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newReceivingattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewReceivingattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newReceivingattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteReceivingattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteReceivingattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteReceivingattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteReceivingattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteReceivingattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteReceivingattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>receivingattachmentControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetreceivingattachmentControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/receivingattachmentController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingattachmentController controller = (ReceivingattachmentController) context.getBean("ReceivingattachmentController");

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