package com.tatsuyaoiw.lombok;

import lombok.experimental.Delegate;

import java.util.ArrayList;
import java.util.Collection;


public class Delegation {
	@Delegate
	private final Collection<String> collection = new ArrayList<>();
}