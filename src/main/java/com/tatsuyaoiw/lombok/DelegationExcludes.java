package com.tatsuyaoiw.lombok;

import lombok.Getter;
import lombok.experimental.Delegate;

import java.util.ArrayList;
import java.util.Collection;

public class DelegationExcludes {
	@Getter
	private long counter = 0;

	private interface Excludes {
		boolean add(String x);
		boolean addAll(Collection<? extends String> x);
	}

	@Delegate(excludes = Excludes.class)
	private final Collection<String> collection = new ArrayList<String>();

	public boolean add(final String item) {
		counter++;
		return collection.add(item);
	}

	public boolean addAll(final Collection<? extends String> col) {
		counter += col.size();
		return collection.addAll(col);
	}
}
