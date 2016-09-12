package com.tatsuyaoiw.lombok;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DelegationTest {
	@Test
	public void test() throws Exception {
		Delegation delegation = new Delegation();
		delegation.add("a");
		assertTrue(delegation.contains("a"));
		delegation.remove("a");
		assertFalse(delegation.contains("a"));
	}
}