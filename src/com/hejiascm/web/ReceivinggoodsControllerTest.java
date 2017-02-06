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
 * Unit test for the <code>ReceivinggoodsController</code> controller.
 *
 * @see com.hejiascm.web.ReceivinggoodsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class ReceivinggoodsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editReceivinggoodsReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditReceivinggoodsReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editReceivinggoodsReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newReceivinggoodsReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewReceivinggoodsReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newReceivinggoodsReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveReceivinggoodsReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveReceivinggoodsReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveReceivinggoodsReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteReceivinggoodsReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteReceivinggoodsReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteReceivinggoodsReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteReceivinggoodsReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteReceivinggoodsReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteReceivinggoodsReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectReceivinggoodsReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectReceivinggoodsReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectReceivinggoodsReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listReceivinggoodsReceivingrecord()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistReceivinggoodsReceivingrecord() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listReceivinggoodsReceivingrecord");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexReceivinggoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexReceivinggoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexReceivinggoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectReceivinggoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectReceivinggoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectReceivinggoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editReceivinggoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditReceivinggoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editReceivinggoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveReceivinggoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveReceivinggoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveReceivinggoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newReceivinggoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewReceivinggoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newReceivinggoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteReceivinggoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteReceivinggoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteReceivinggoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteReceivinggoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteReceivinggoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteReceivinggoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>receivinggoodsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetreceivinggoodsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/receivinggoodsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ReceivinggoodsController controller = (ReceivinggoodsController) context.getBean("ReceivinggoodsController");

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