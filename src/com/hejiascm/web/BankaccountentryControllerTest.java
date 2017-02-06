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
 * Unit test for the <code>BankaccountentryController</code> controller.
 *
 * @see com.hejiascm.web.BankaccountentryController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class BankaccountentryControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexBankaccountentry()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexBankaccountentry() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexBankaccountentry");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountentryController controller = (BankaccountentryController) context.getBean("BankaccountentryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectBankaccountentry()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectBankaccountentry() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectBankaccountentry");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountentryController controller = (BankaccountentryController) context.getBean("BankaccountentryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editBankaccountentry()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditBankaccountentry() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editBankaccountentry");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountentryController controller = (BankaccountentryController) context.getBean("BankaccountentryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveBankaccountentry()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveBankaccountentry() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveBankaccountentry");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountentryController controller = (BankaccountentryController) context.getBean("BankaccountentryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newBankaccountentry()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewBankaccountentry() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newBankaccountentry");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountentryController controller = (BankaccountentryController) context.getBean("BankaccountentryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteBankaccountentry()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteBankaccountentry() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteBankaccountentry");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountentryController controller = (BankaccountentryController) context.getBean("BankaccountentryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteBankaccountentry()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteBankaccountentry() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteBankaccountentry");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountentryController controller = (BankaccountentryController) context.getBean("BankaccountentryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>bankaccountentryControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetbankaccountentryControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/bankaccountentryController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankaccountentryController controller = (BankaccountentryController) context.getBean("BankaccountentryController");

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