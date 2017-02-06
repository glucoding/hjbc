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
 * Unit test for the <code>PermissionsController</code> controller.
 *
 * @see com.hejiascm.web.PermissionsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class PermissionsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexPermissions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexPermissions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexPermissions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PermissionsController controller = (PermissionsController) context.getBean("PermissionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectPermissions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectPermissions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectPermissions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PermissionsController controller = (PermissionsController) context.getBean("PermissionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editPermissions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditPermissions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editPermissions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PermissionsController controller = (PermissionsController) context.getBean("PermissionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>savePermissions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsavePermissions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/savePermissions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PermissionsController controller = (PermissionsController) context.getBean("PermissionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newPermissions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewPermissions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newPermissions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PermissionsController controller = (PermissionsController) context.getBean("PermissionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeletePermissions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeletePermissions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeletePermissions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PermissionsController controller = (PermissionsController) context.getBean("PermissionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deletePermissions()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeletePermissions() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deletePermissions");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PermissionsController controller = (PermissionsController) context.getBean("PermissionsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>permissionsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetpermissionsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/permissionsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PermissionsController controller = (PermissionsController) context.getBean("PermissionsController");

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