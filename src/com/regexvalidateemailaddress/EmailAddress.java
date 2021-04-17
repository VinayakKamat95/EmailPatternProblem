package com.regexvalidateemailaddress;

import java.util.regex.*;

public class EmailAddress {

	public static boolean isValidEmailAddress(String emailAddress) {

		String regex = "^[a-z]+[[-.+]{0,1}0-9]*@[a-z0-9]+[.]{1}(com|net)[.,]{0,1}[a-z{2}]*$";
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
		
		 String email9 = "abc";
      System.out.println(email9+ ": " + isValidEmailAddress(email9));

		 String email10 = "abc@.com.my";
      System.out.println(email10+ ": " + isValidEmailAddress(email10));

		 String email11 = "abc123@gmail.a";
      System.out.println(email11+ ": " + isValidEmailAddress(email11));

		 String email12 = "abc123@.com";
      System.out.println(email12+ ": " + isValidEmailAddress(email12));

		 String email13 = "abc123@.com.com";
      System.out.println(email13+ ": " + isValidEmailAddress(email13));

		 String email14 = ".abc@abc.com";
      System.out.println(email14+ ": " + isValidEmailAddress(email14));

		 String email15 = "abc()*@gmail.com";
      System.out.println(email15+ ": " + isValidEmailAddress(email15));

		 String email16 = "abc@%*.com";
      System.out.println(email16+ ": " + isValidEmailAddress(email16));

		 String email17 = "abc..2002@gmail.com";
      System.out.println(email17+ ": " + isValidEmailAddress(email17));

		 String email18 = "abc.@gmail.com";
      System.out.println(email18+ ": " + isValidEmailAddress(email18));

		 String email19 = "abc@abc@gmail.com";
      System.out.println(email19+ ": " + isValidEmailAddress(email19));

		 String email20 = "abc@gmail.com.1a";
      System.out.println(email20+ ": " + isValidEmailAddress(email20));

		 String email21 = "abc@gmail.com.aa.au";
      System.out.println(email21+ ": " + isValidEmailAddress(email21));
	}

}
