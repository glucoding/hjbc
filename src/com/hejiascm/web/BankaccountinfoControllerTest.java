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
 * Unit test for the <code>BankaccountinfoController</code> controller.
 *
 * @see com.hejiascm.web.BankaccountinfoController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class BankaccountinfoControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editBankaccountinfoOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditBankaccountinfoOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editBankaccountinfoOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newBankaccountinfoOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewBankaccountinfoOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newBankaccountinfoOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveBankaccountinfoOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveBankaccountinfoOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveBankaccountinfoOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteBankaccountinfoOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteBankaccountinfoOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteBankaccountinfoOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteBankaccountinfoOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteBankaccountinfoOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteBankaccountinfoOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectBankaccountinfoOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectBankaccountinfoOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectBankaccountinfoOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listBankaccountinfoOrginfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistBankaccountinfoOrginfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listBankaccountinfoOrginfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexBankaccountinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexBankaccountinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexBankaccountinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectBankaccountinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectBankaccountinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectBankaccountinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editBankaccountinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditBankaccountinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editBankaccountinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveBankaccountinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveBankaccountinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveBankaccountinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newBankaccountinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewBankaccountinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newBankaccountinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteBankaccountinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteBankaccountinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteBankaccountinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteBankaccountinfo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteBankaccountinfo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteBankaccountinfo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>bankaccountinfoControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetbankaccountinfoControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/bankaccountinfoController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountinfoController controller = (BankaccountinfoController) context.getBean("BankaccountinfoController");

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