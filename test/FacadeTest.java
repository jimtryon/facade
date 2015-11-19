package edu.greenriver.it.test;

import java.util.Arrays;

import edu.greeenriver.it.entities.Facade;
import edu.greeenriver.it.entities.Operator;
import edu.greeenriver.it.entities.Facade.ValidationType;

public class FacadeTest
{
	
	/**
	 * The main method.
	 * This class tests the Facade Pattern 
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{	
		Facade facadeValidator = new Facade();
		
		System.out.println("Is this a valid email? " + facadeValidator.validate(ValidationType.EMAIL, "my_email@gmail.com"));
		System.out.println("Is this a valid email? " + facadeValidator.validate(ValidationType.EMAIL, "e@e.com"));
		System.out.println("Is this a valid email? " + facadeValidator.validate(ValidationType.EMAIL, "catch@22@msn.com"));
		
		System.out.println("Is this a valid zip? " + facadeValidator.validate(ValidationType.ZIPCODE, "99999"));
		System.out.println("Is this a valid zip? " + facadeValidator.validate(ValidationType.ZIPCODE, "88888-0000"));
		System.out.println("Is this a valid zip? " + facadeValidator.validate(ValidationType.ZIPCODE, "9999"));
		System.out.println("Is this a valid zip? " + facadeValidator.validate(ValidationType.ZIPCODE, "xxxxx"));
		
		String[] operatorArray = {"blue", "red", "white", "blue", "yellow", "yellow", "", "red", "red"};
		Operator opObject = facadeValidator.getOperator(operatorArray);
		
		String[] results = opObject.filter("yellow").resize(5).getSubject();
		System.out.println(Arrays.toString(results));
	}

}
