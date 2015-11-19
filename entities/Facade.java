package edu.greeenriver.it.entities;

import edu.greenriver.it.string.operations.StringRegex;

/**
 * The Class Facade.
 */
public class Facade
{
	
	/**
	 * Validates any of the types from the previous classes (StringOperations, StringParsing, StringRegex)
	 *
	 * @param type the type
	 * @param subject the subject
	 * @return true, if successful
	 */
	public boolean validate(ValidationType type, String subject)
	{
		switch(type)
		{
			case EMAIL:
				return StringRegex.isEmail(subject);
			case ZIPCODE:
				return StringRegex.isZipCode(subject);
			case PHONE_NUMBER:
				return StringRegex.isPhoneNumber(subject);
			case URL:
				return StringRegex.isUrl(subject);
				default:
					throw new IllegalStateException("Validation type is not valid");
		}	
	}
	
	/**
	 * Gets the operator.
	 * Uses a technique called method chaining
	 * and returns an Operator object
	 *
	 * @param subject the subject
	 * @return the operator
	 */
	public Operator getOperator(String[] subject)
	{
		return new Operator(subject);
	}
	
	/**
	 * The Enum ValidationType.
	 */
	public static enum ValidationType
	{
		
		/** The email. */
		EMAIL,
		
		/** The zipcode. */
		ZIPCODE,
		
		/** The phone number. */
		PHONE_NUMBER,
		
		/** The url. */
		URL
	}

}
