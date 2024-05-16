package com.eComDeveloper.commonPage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

	public static boolean isEmailValid(String email) {
		String regExp = "^[A-Za-z0-9+_.-]+@(.+)$";

		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher = pattern.matcher(email);
		
		return matcher.matches();
		
	}

	public static void main(String[] args) {
		String email = "rahulk@gmail.com";
		System.out.println(isEmailValid(email));
	}
}
