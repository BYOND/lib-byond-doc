package com.byond.doc.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import com.byond.doc.model.ParseTree;

public class DocContentParser {
	private final String content;
	
	public DocContentParser(final String content) {
		this.content = content;
	}
	
	public void parse(final ParseTree tree) {
		try (BufferedReader reader = new BufferedReader(new StringReader(content))) {
			
		} catch (IOException e) {
			// TODO: Being a string reader, we shouldn't get here. Debug log it.
		}
	}
}
