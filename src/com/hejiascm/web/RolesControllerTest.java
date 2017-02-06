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
 * Unit test for the <code>RolesController</code> controller.
 *
 * @see com.hejiascm.web.RolesController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class RolesControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexRoles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRoles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRoles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolesController controller = (RolesController) context.getBean("RolesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRoles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRoles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRoles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolesController controller = (RolesController) context.getBean("RolesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRoles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRoles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRoles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolesController controller = (RolesController) context.getBean("RolesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRoles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRoles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRoles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolesController controller = (RolesController) context.getBean("RolesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRoles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRoles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRoles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolesController controller = (RolesController) context.getBean("RolesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRoles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRoles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRoles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolesController controller = (RolesController) context.getBean("RolesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRoles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRoles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRoles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolesController controller = (RolesController) context.getBean("RolesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rolesControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrolesControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rolesController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RolesController controller = (RolesController) context.getBean("RolesController");

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