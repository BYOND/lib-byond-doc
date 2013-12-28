package com.byond.doc.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ParsedTag {
	private final Tag tag;
	private final List<String> arguments = new ArrayList<String>();
	
	public ParsedTag(final Tag tag) {
		this.tag = tag;
	}
	
	public void addArgument(final String arg) {
		if (arguments.size() + 1 > tag.getNumberOfArguments()) {
			throw new IllegalStateException("Adding more arguments than this tag permits.");
		}
		arguments.add(arg);
	}
	
	public List<String> getArguments() {
		return Collections.unmodifiableList(this.arguments);
	}
}
