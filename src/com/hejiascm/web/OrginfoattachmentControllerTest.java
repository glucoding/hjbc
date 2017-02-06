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
 * Unit test for the <code>OrginfoattachmentController</code> controller.
 *
 * @see com.hejiascm.web.OrginfoattachmentController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class OrginfoattachmentControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOrginfoattachmentOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrginfoattachmentOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrginfoattachmentOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrginfoattachmentOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrginfoattachmentOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrginfoattachmentOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrginfoattachmentOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrginfoattachmentOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrginfoattachmentOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrginfoattachmentOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrginfoattachmentOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrginfoattachmentOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrginfoattachmentOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrginfoattachmentOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrginfoattachmentOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrginfoattachmentOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrginfoattachmentOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrginfoattachmentOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrginfoattachmentOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrginfoattachmentOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrginfoattachmentOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOrginfoattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrginfoattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrginfoattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrginfoattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrginfoattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrginfoattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrginfoattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrginfoattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrginfoattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrginfoattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrginfoattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrginfoattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrginfoattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrginfoattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrginfoattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrginfoattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrginfoattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrginfoattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrginfoattachment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrginfoattachment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrginfoattachment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>orginfoattachmentControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetorginfoattachmentControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/orginfoattachmentController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoattachmentController controller = (OrginfoattachmentController) context.getBean("OrginfoattachmentController");

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