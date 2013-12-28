package com.byond.doc.model.tags;

import com.byond.doc.model.Tag;

public final class ParamTag implements Tag {

	/* (non-Javadoc)
	 * @see com.byond.doc.model.Tag#getName()
	 */
	@Override
	public String getName() {
		return "param";
	}

	/* (non-Javadoc)
	 * @see com.byond.doc.model.Tag#getNumberOfArguments()
	 */
	@Override
	public int getNumberOfArguments() {
		return 2;
	}
}
