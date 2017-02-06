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
 * Unit test for the <code>ContractgoodsController</code> controller.
 *
 * @see com.hejiascm.web.ContractgoodsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class ContractgoodsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editContractgoodsTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditContractgoodsTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editContractgoodsTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newContractgoodsTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewContractgoodsTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newContractgoodsTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveContractgoodsTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveContractgoodsTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveContractgoodsTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteContractgoodsTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteContractgoodsTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteContractgoodsTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteContractgoodsTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteContractgoodsTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteContractgoodsTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectContractgoodsTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectContractgoodsTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectContractgoodsTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listContractgoodsTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistContractgoodsTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listContractgoodsTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexContractgoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexContractgoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexContractgoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectContractgoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectContractgoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectContractgoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editContractgoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditContractgoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editContractgoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveContractgoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveContractgoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveContractgoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newContractgoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewContractgoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newContractgoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteContractgoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteContractgoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteContractgoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteContractgoods()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteContractgoods() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteContractgoods");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>contractgoodsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcontractgoodsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/contractgoodsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ContractgoodsController controller = (ContractgoodsController) context.getBean("ContractgoodsController");

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