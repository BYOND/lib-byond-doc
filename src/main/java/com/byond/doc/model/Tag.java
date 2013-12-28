/**
 * 
 */
package com.byond.doc.model;

/**
 * Represents a tag within a doc comment section.
 * 
 * @author Stephen Badger [stephen.badger@gmail.com]
 */
public interface Tag {
	/**
	 * Gets the name of the tag. This will be used in token
	 * matching, after being prefixed with @
	 * 
	 * @return The name of the tag.
	 */
	public String getName();
	
	/**
	 * Gets number of arguments this tag expects. The last
	 * argument can span multiple words, until the end of the line.
	 * 
	 * @return The number of arguments this tag supports.
	 */
	public int getNumberOfArguments();
}
