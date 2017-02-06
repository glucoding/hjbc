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
 * Unit test for the <code>ReceivingrecordController</code> controller.
 *
 * @see com.hejiascm.web.ReceivingrecordController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class ReceivingrecordControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editReceivingrecordReceivinggoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditReceivingrecordReceivinggoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editReceivingrecordReceivinggoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newReceivingrecordReceivinggoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewReceivingrecordReceivinggoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newReceivingrecordReceivinggoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveReceivingrecordReceivinggoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveReceivingrecordReceivinggoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveReceivingrecordReceivinggoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteReceivingrecordReceivinggoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteReceivingrecordReceivinggoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteReceivingrecordReceivinggoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteReceivingrecordReceivinggoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteReceivingrecordReceivinggoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteReceivingrecordReceivinggoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectReceivingrecordReceivinggoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectReceivingrecordReceivinggoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectReceivingrecordReceivinggoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listReceivingrecordReceivinggoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistReceivingrecordReceivinggoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listReceivingrecordReceivinggoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editReceivingrecordReceivingattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditReceivingrecordReceivingattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editReceivingrecordReceivingattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newReceivingrecordReceivingattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewReceivingrecordReceivingattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newReceivingrecordReceivingattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveReceivingrecordReceivingattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveReceivingrecordReceivingattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveReceivingrecordReceivingattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteReceivingrecordReceivingattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteReceivingrecordReceivingattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteReceivingrecordReceivingattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteReceivingrecordReceivingattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteReceivingrecordReceivingattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteReceivingrecordReceivingattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectReceivingrecordReceivingattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectReceivingrecordReceivingattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectReceivingrecordReceivingattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listReceivingrecordReceivingattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistReceivingrecordReceivingattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listReceivingrecordReceivingattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>receivingrecordControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetreceivingrecordControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/receivingrecordController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivingrecordController controller = (ReceivingrecordController) context.getBean("ReceivingrecordController");

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