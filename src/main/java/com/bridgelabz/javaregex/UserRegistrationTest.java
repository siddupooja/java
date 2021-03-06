package com.bridgelabz.javaregex;

import java.util.regex.Pattern;

import org.junit.Test;

public class UserRegistrationTest {

	// UC1 - First name starts with caps and has minimum 3 characters.
	@Test
	public void validateFirstNameTest() {
		String regex = "^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		String fName = "Koda";

		if (pattern.matcher(fName).matches()) {
			System.out.println("First name: " + fName + " is valid.");
		} else {
			System.out.println("First name: " + fName + " is invalid.");
		}

	}

	// UC2 - Last name starts with caps and has minimum 3 characters.
	@Test
	public void validateLastNameTest() {
		String regex = "^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		String lName = "Ashok";

		if (pattern.matcher(lName).matches()) {
			System.out.println("Last name: " + lName + " is valid.");
		} else {
			System.out.println("Last name: " + lName + " is invalid.");
		}

	}

	// UC3 - Need to validate email.
	@Test
	public void validateEmailTest() {
		String regex = "^[a-z0-9]{1,20}([_.+-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$";
		Pattern pattern = Pattern.compile(regex);
		String email = "abc-100@abc.net";

		if (pattern.matcher(email).matches()) {
			System.out.println("Email: " + email + " is valid.");
		} else {
			System.out.println("Email: " + email + " is invalid.");
		}

	}

	// UC4 - Need to validate mobile number example: 91 9919819801.
	@Test
	public void validateMobileNumberTest() {
		String regex = "^(91[ ])?[6-9]\\d{9}$";
		Pattern pattern = Pattern.compile(regex);
		String mobile = "91 9919819801";

		if (pattern.matcher(mobile).matches()) {
			System.out.println("Mobile No: " + mobile + " is valid.");
		} else {
			System.out.println("Mobile No: " + mobile + " is invalid.");
		}

	}

	// UC5 - Password rule - 1: Minimum 8 characters
	// UC6 - Password rule - 2: Starts with Upper case
	// UC7 - Password rule - 3: At least one numeric number in password
	// UC8 - Password rule - 4: At least one special character in password
	@Test
	public void validatePasswordRules() {
		// String regex = "^[a-zA-z0-9!@#$%^&*()?]{8,}$"; //UC5
		// String regex = "(?=.*[A-Z])[a-zA-Z0-9@#$%^&*()]{8,}$"; //UC6
		// String regex = "(?=.*\\d)(?=.*[A-Z])[a-zA-Z0-9@#$%^&*()]{8,}$"; // UC7
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$"; // UC8
		Pattern pattern = Pattern.compile(regex);
		String password = "Ashok@123";

		if (pattern.matcher(password).matches()) {
			System.out.println("Password: " + password + " is valid.");
		} else {
			System.out.println("Password: " + password + " is invalid.");
		}

	}
}
