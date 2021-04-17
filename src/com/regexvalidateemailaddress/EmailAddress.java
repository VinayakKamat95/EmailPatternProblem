package com.regexvalidateemailaddress;

import java.util.regex.*;

public class EmailAddress {

	public static boolean isValidEmailAddress(String emailAddress) {

		String regex = "^[a-z]+[-.+]*[0-9]*@[a-z0-9]+[.]{1}[com]*[net]*[.{1},]*[a-z{2}]*$";
		Pattern p = Pattern.compile(regex);

		if (emailAddress == null) {
			return false;
		}

		Matcher m = p.matcher(emailAddress);

		return m.matches();
	}

	public static void main(String[] arg) {

		String email = "abc@yahoo.com,";
		System.out.println(email + ": " + isValidEmailAddress(email));
		
		String email1 = "abc-100@yahoo.com,";
		System.out.println(email1 + ": " + isValidEmailAddress(email1));
		
		String email2 = "abc.100@yahoo.com";
		System.out.println(email2 + ": " + isValidEmailAddress(email2));
		
		String email3 = "abc111@abc.com,";
		System.out.println(email3 + ": " + isValidEmailAddress(email3));
		
		String email4 = "abc-100@abc.net,";
		System.out.println(email4 + ": " + isValidEmailAddress(email4));
		
		String email5 = "abc.100@abc.com.au";
		System.out.println(email5 + ": " + isValidEmailAddress(email5));
		
		String email6 = "abc@1.com,";
		System.out.println(email6 + ": " + isValidEmailAddress(email6));
		
		String email7 = "abc@gmail.com.com";
		System.out.println(email7+ ": " + isValidEmailAddress(email7));
		
		String email8 = "abc+100@gmail.com";
		System.out.println(email8+ ": " + isValidEmailAddress(email8));
		
	}

}
