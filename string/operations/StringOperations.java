package edu.greenriver.it.string.operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The Class StringOperations.
 * 
 * @author jtryon
 * @version 1.0
 */
public class StringOperations
{	
	
	/**
	 * Removes the duplicates from a string array.
	 *
	 * @param values the values
	 * @return the string[]
	 */
	public static String[] removeDuplicates(String[] values)
	{
		Set<String> wordSet = new HashSet<String>();
		Collections.addAll(wordSet, values);
		// return the set as an array
		return wordSet.toArray(new String[wordSet.size()]);
	}

	/**
	 * Creates a new array from the given size
	 *
	 * @param values the values
	 * @param newLength the new length
	 * @return the string[]
	 */
	public static String[] resize(String[] values, int newLength)
	{
		// accepts a string array and an integer, creates a new array with the
		// given size
		
		// create a new array
		String[] stringArray = new String[newLength];
		// return the new one 
		
		for (int i = 0; i < newLength && i < values.length; i++)
		{
			// push the values from the old array into the new array
			stringArray[i] = values[i];
		}
		// any existing elements are copied over to the new array
		// if the size of the new array is smaller than the original, the array 
		// is truncated and any new values are lost
		return stringArray;
	}
	
	/**
	 * Removes all instances of the given search value from the string array
	 *
	 * @param values the values
	 * @param search the search
	 * @return the string[]
	 */
	public static String[] filter(String[] values, String search)
	{
		// remove all instances of the given search value (ArrayList)
		// toArray
		List<String> filterArrayList = new ArrayList<String>();
		
		for (String value : values)
		{
			// not the filter
			if (!value.equals(search))
			{
				filterArrayList.add(value);
			}
		}
		
		// convert my list to a string array
		return filterArrayList.toArray(new String[filterArrayList.size()]);
	}
}
