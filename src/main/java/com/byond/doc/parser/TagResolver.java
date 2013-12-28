package com.byond.doc.parser;

import java.util.HashMap;
import java.util.Map;

import com.byond.doc.model.Tag;
import com.byond.doc.model.tags.ParamTag;

public final class TagResolver {
	private static final Tag[] TAGS = new Tag[] {new ParamTag()};
	private static final Map<String, Tag> TAG_MAP = new HashMap<String, Tag>();
	
	static {
		for (Tag tag : TAGS) {
			TAG_MAP.put(tag.getName(), tag);
		}
	}
	
	public static Tag resolve(final String tagName) {
		return TAG_MAP.get(tagName);
	}
}
