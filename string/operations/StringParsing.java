package edu.greenriver.it.string.operations;

/**
 * The Class StringParsing.
 */
public class StringParsing
{
	// returns all characters from the start of the string to the
	/**
	 * Returns all characters in subject from the start of the string
	 * to the first delimiter
	 *
	 * @param subject the subject
	 * @param delimiter the delimiter
	 * @return the string
	 */
	// first occurence of the delimiter
	public static String before(String subject, String delimiter)
	{
		// 4
		int endString = subject.indexOf(delimiter);
		
		String subString = null;
		
		// check if value exists
		if (endString != -1)
		{
			subString = subject.substring(0, endString);
			
		}
		return subString;
	}
	
	// returns all characters from the delimiter to the end
	/**
	 * Returns all characters in the subject from the first occurrence 
	 * of the delimiter to the end of the subject
	 *
	 * @param subject the subject
	 * @param delimiter the delimiter
	 * @return the string
	 */
	// of the string 
	public static String after(String subject, String delimiter)
	{
		int endString = subject.indexOf(delimiter);
		int length = subject.length();
		
		String subString = null;
		
		if (endString != -1)
		{
			subString = subject.substring(endString+1, length);
		}
		return subString;
		
	}

}
