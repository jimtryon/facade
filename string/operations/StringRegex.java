package edu.greenriver.it.string.operations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex
{	
	public static boolean isEmail(String subject)
	{	
		String emailPattern = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$";
		
		Pattern regex = Pattern.compile(emailPattern);
		
		Matcher emailMatcher = regex.matcher(subject);
		
		if (emailMatcher.matches())
		{
			return true;
		}
		return false;
	}
	
	public static boolean isZipCode(String subject)
	{
		String zipCodePattern = "^\\d{5}(-\\d{4})?$";

		Pattern regex = Pattern.compile(zipCodePattern);

		Matcher zipCodeMatcher = regex.matcher(subject);

		if (zipCodeMatcher.matches())
		{
			return true;
		}
		return false;
	}
	
	public static boolean isPhoneNumber(String subject)
	{
		String phoneNumberPattern = "^(\\d{3}-?\\d{3}-?\\d{4})$";

		Pattern regex = Pattern.compile(phoneNumberPattern);

		Matcher phoneNumberMatcher = regex.matcher(subject);

		if (phoneNumberMatcher.matches())
		{
			return true;
		}
		return false;
	}
	
	public static boolean isUrl(String subject)
	{
		String urlPattern = "^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$";

		Pattern regex = Pattern.compile(urlPattern);

		Matcher urlMatcher = regex.matcher(subject);

		if (urlMatcher.matches())
		{
			return true;
		}
		return false;
	}
}
