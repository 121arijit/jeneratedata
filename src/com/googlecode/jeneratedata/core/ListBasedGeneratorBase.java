package com.googlecode.jeneratedata.core;

import java.util.List;

/**
 * An abstracts class to be extended by classes that will generate data items
 * from a {@link List} of values of type <code>T</code>
 * 
 * @author Agustin Barto <abarto@gmail.com>
 *
 * @param <T> Type of data items that will be generated by the classes that
 * extends this one. 
 */
public class ListBasedGeneratorBase<T> {
	/**
	 * The values that will be used to generate data items.
	 */
	protected List<T> values;

	/**
	 * Constructor.
	 * 
	 * @param values A {@link List} of values to be used to generate data
	 * items.
	 */
	public ListBasedGeneratorBase(List<T> values) {
		super();
		this.values = values;
	}
}
