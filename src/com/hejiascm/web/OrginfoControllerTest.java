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
 * Unit test for the <code>OrginfoController</code> controller.
 *
 * @see com.hejiascm.web.OrginfoController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class OrginfoControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOrginfoOrginfoattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrginfoOrginfoattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrginfoOrginfoattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrginfoOrginfoattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrginfoOrginfoattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrginfoOrginfoattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrginfoOrginfoattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrginfoOrginfoattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrginfoOrginfoattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrginfoOrginfoattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrginfoOrginfoattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrginfoOrginfoattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrginfoOrginfoattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrginfoOrginfoattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrginfoOrginfoattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrginfoOrginfoattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrginfoOrginfoattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrginfoOrginfoattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrginfoOrginfoattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrginfoOrginfoattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrginfoOrginfoattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrginfoBankaccountinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrginfoBankaccountinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrginfoBankaccountinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrginfoBankaccountinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrginfoBankaccountinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrginfoBankaccountinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrginfoBankaccountinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrginfoBankaccountinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrginfoBankaccountinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrginfoBankaccountinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrginfoBankaccountinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrginfoBankaccountinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrginfoBankaccountinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrginfoBankaccountinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrginfoBankaccountinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrginfoBankaccountinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrginfoBankaccountinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrginfoBankaccountinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOrginfoBankaccountinfos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOrginfoBankaccountinfos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOrginfoBankaccountinfos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>orginfoControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetorginfoControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/orginfoController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OrginfoController controller = (OrginfoController) context.getBean("OrginfoController");

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