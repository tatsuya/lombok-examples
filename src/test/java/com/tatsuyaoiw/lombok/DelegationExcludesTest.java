package com.tatsuyaoiw.lombok;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DelegationExcludesTest {
	@Test
	public void test() throws Exception {
		DelegationExcludes delegation = new DelegationExcludes();
		delegation.add("a");
		assertEquals(delegation.getCounter(), 1);
		delegation.remove("a");
		assertEquals(delegation.getCounter(), 1);
		delegation.addAll(Arrays.asList("a", "b", "c"));
		assertEquals(delegation.getCounter(), 4);
	}
}