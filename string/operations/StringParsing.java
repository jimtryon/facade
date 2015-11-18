package edu.greenriver.it.string.operations;

public class StringParsing
{
	// returns all characters from the start of the string to the
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
	// of the string 
	public static String after(String subject, String delimiter)
	{
		int endString = subject.indexOf(delimiter);
		int length = subject.length();
		
		String subString = null;
		
		if (endString != -1)
		{
			subString = subject.substring(endString, length);
		}
		return subString;
		
	}

}
