package com.tatsuyaoiw.lombok;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DelegationIncludesTest {
	@Test
	public void test() throws Exception {
		DelegationIncludes delegation = new DelegationIncludes();
		delegation.add("a");
		assertTrue(delegation.getCollection().contains("a"));
		delegation.remove("a");
		assertFalse(delegation.getCollection().contains("a"));
	}
}