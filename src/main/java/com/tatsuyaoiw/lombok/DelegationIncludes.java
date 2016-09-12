package com.tatsuyaoiw.lombok;

import lombok.Getter;
import lombok.experimental.Delegate;

import java.util.ArrayList;
import java.util.Collection;


public class DelegationIncludes {
	private interface Includes {
		boolean add(String item);
		boolean remove(Object item);
	}

	@Getter
	@Delegate(types = Includes.class)
	private final Collection<String> collection = new ArrayList<>();
}
