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
 * Unit test for the <code>OrgsummaryinfoController</code> controller.
 *
 * @see com.hejiascm.web.OrgsummaryinfoController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class OrgsummaryinfoControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexOrgsummaryinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrgsummaryinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrgsummaryinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgsummaryinfoController controller = (OrgsummaryinfoController) context.getBean("OrgsummaryinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrgsummaryinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrgsummaryinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrgsummaryinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgsummaryinfoController controller = (OrgsummaryinfoController) context.getBean("OrgsummaryinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrgsummaryinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrgsummaryinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrgsummaryinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgsummaryinfoController controller = (OrgsummaryinfoController) context.getBean("OrgsummaryinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrgsummaryinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrgsummaryinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrgsummaryinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgsummaryinfoController controller = (OrgsummaryinfoController) context.getBean("OrgsummaryinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrgsummaryinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrgsummaryinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrgsummaryinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgsummaryinfoController controller = (OrgsummaryinfoController) context.getBean("OrgsummaryinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrgsummaryinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrgsummaryinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrgsummaryinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgsummaryinfoController controller = (OrgsummaryinfoController) context.getBean("OrgsummaryinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrgsummaryinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrgsummaryinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrgsummaryinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgsummaryinfoController controller = (OrgsummaryinfoController) context.getBean("OrgsummaryinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>orgsummaryinfoControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetorgsummaryinfoControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/orgsummaryinfoController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrgsummaryinfoController controller = (OrgsummaryinfoController) context.getBean("OrgsummaryinfoController");

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