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
 * Unit test for the <code>TradecontractController</code> controller.
 *
 * @see com.hejiascm.web.TradecontractController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class TradecontractControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editTradecontractOperations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTradecontractOperations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTradecontractOperations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTradecontractOperations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTradecontractOperations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTradecontractOperations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTradecontractOperations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTradecontractOperations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTradecontractOperations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTradecontractOperations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTradecontractOperations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTradecontractOperations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTradecontractOperations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTradecontractOperations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTradecontractOperations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTradecontractOperations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTradecontractOperations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTradecontractOperations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listTradecontractOperations()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistTradecontractOperations() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listTradecontractOperations");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editTradecontractContractgoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTradecontractContractgoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTradecontractContractgoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTradecontractContractgoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTradecontractContractgoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTradecontractContractgoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTradecontractContractgoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTradecontractContractgoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTradecontractContractgoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTradecontractContractgoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTradecontractContractgoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTradecontractContractgoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTradecontractContractgoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTradecontractContractgoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTradecontractContractgoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTradecontractContractgoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTradecontractContractgoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTradecontractContractgoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listTradecontractContractgoodses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistTradecontractContractgoodses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listTradecontractContractgoodses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editTradecontractParticipants()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTradecontractParticipants() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTradecontractParticipants");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTradecontractParticipants()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTradecontractParticipants() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTradecontractParticipants");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTradecontractParticipants()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTradecontractParticipants() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTradecontractParticipants");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTradecontractParticipants()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTradecontractParticipants() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTradecontractParticipants");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTradecontractParticipants()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTradecontractParticipants() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTradecontractParticipants");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTradecontractParticipants()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTradecontractParticipants() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTradecontractParticipants");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listTradecontractParticipants()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistTradecontractParticipants() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listTradecontractParticipants");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editTradecontractTradecontractattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTradecontractTradecontractattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTradecontractTradecontractattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTradecontractTradecontractattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTradecontractTradecontractattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTradecontractTradecontractattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTradecontractTradecontractattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTradecontractTradecontractattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTradecontractTradecontractattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTradecontractTradecontractattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTradecontractTradecontractattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTradecontractTradecontractattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTradecontractTradecontractattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTradecontractTradecontractattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTradecontractTradecontractattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTradecontractTradecontractattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTradecontractTradecontractattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTradecontractTradecontractattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listTradecontractTradecontractattachments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistTradecontractTradecontractattachments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listTradecontractTradecontractattachments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editTradecontractTerms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTradecontractTerms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTradecontractTerms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTradecontractTerms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTradecontractTerms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTradecontractTerms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTradecontractTerms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTradecontractTerms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTradecontractTerms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTradecontractTerms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTradecontractTerms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTradecontractTerms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTradecontractTerms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTradecontractTerms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTradecontractTerms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTradecontractTerms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTradecontractTerms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTradecontractTerms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listTradecontractTerms()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistTradecontractTerms() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listTradecontractTerms");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>tradecontractControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GettradecontractControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/tradecontractController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TradecontractController controller = (TradecontractController) context.getBean("TradecontractController");

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