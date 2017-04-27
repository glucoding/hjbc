package com.hejiascm.test;

import static org.junit.Assert.*;

import org.apache.commons.codec.binary.Base64;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hejiascm.util.MiscTool;

public class Base64Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		System.out.println(MiscTool.getBase64Email("YXNkZkBhc2RmYXNkZi5jb21hcw=="));//cWttMTA2NzJAcHNveHMuY29t, Bearer YWRtaW4=
	}

}
