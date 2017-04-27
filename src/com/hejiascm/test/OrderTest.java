package com.hejiascm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hejiascm.blockchain.impl.OrderDAOImpl;
import com.ibm.crl.bc.hejia.sdk.logistics.Order;

import junit.framework.Assert;

public class OrderTest {
	OrderDAOImpl odao = null;
	
	@Before
	public void setUp() throws Exception {
		odao = new OrderDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<Order> orders = odao.getOrders("{'id':'ba216784-381b-45d3-b9e8-4963297578d2'}", "ppp");
		for(Order o : orders){
			System.out.println(o.getId());
		}
		Assert.assertNotNull("test null",orders);
	}

}
