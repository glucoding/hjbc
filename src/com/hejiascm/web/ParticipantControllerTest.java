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
 * Unit test for the <code>ParticipantController</code> controller.
 *
 * @see com.hejiascm.web.ParticipantController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/HejiaSCM-security-context.xml",
		"file:./resources/HejiaSCM-service-context.xml",
		"file:./resources/HejiaSCM-dao-context.xml",
		"file:./resources/HejiaSCM-web-context.xml" })
public class ParticipantControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editParticipantTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditParticipantTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editParticipantTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newParticipantTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewParticipantTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newParticipantTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveParticipantTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveParticipantTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveParticipantTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteParticipantTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteParticipantTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteParticipantTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteParticipantTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteParticipantTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteParticipantTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectParticipantTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectParticipantTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectParticipantTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listParticipantTradecontract()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistParticipantTradecontract() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listParticipantTradecontract");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexParticipant()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexParticipant() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexParticipant");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectParticipant()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectParticipant() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectParticipant");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editParticipant()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditParticipant() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editParticipant");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveParticipant()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveParticipant() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveParticipant");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newParticipant()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewParticipant() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newParticipant");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteParticipant()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteParticipant() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteParticipant");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteParticipant()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteParticipant() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteParticipant");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>participantControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetparticipantControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/participantController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ParticipantController controller = (ParticipantController) context.getBean("ParticipantController");

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