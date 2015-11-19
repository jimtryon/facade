package edu.greeenriver.it.entities;

import edu.greenriver.it.string.operations.StringOperations;

/**
 * The Class Operator.
 */
public class Operator
{
	
	/** The subject. */
	private String[] subject;
	
	/**
	 * Instantiates a new operator.
	 *
	 * @param subject the subject
	 */
	public Operator(String[] subject)
	{
		this.subject = subject;
	}
	
	/**
	 * Gets the subject.
	 *
	 * @return the subject
	 */
	public String[] getSubject()
	{
		return subject;
	}
	
	/**
	 * Removes all instances of search from the subject
	 * and returns a new Operator with the result 
	 *
	 * @param search the search
	 * @return the operator
	 */
	public Operator filter(String search)
	{
		String[] filterArray = StringOperations.filter(subject, search);
		return new Operator(filterArray);
		
	}
	
	/**
	 * Removes all duplicates from the subject
	 * and returns a new Operator with the result 
	 *
	 * @return the operator
	 */
	public Operator removeDuplicates()
	{
		String[] removeDuplicatesArray = StringOperations.removeDuplicates(subject);
		return new Operator(removeDuplicatesArray);
	}
	
	/**
	 * Resizes the subject and returns a new Operator
	 * with the result 
	 *
	 * @param length the length
	 * @return the operator
	 */
	public Operator resize(int length)
	{
		String[] resizeArray = StringOperations.resize(subject, length);
		return new Operator(resizeArray);
	}
}
