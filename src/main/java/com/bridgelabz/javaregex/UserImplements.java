package com.bridgelabz.javaregex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserImplements implements IUser {

	// UC1 - First name starts with caps and has minimum 3 characters.
	public void validateFirstName() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String fName = input.nextLine();

		String regex = "^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);

		if (pattern.matcher(fName).matches()) {
			System.out.println("First name: " + fName + " is valid.");
		} else {
			System.out.println("First name: " + fName + " is invalid.");
		}

	}

	// UC2 - Last name starts with caps and has minimum 3 characters.
	public void validateLastName() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter last name: ");
		String lName = input.nextLine();

		String regex = "^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);

		if (pattern.matcher(lName).matches()) {
			System.out.println("Last name: " + lName + " is valid.");
		} else {
			System.out.println("Last name: " + lName + " is invalid.");
		}

	}

	public void validateEmail() {
		// TODO Auto-generated method stub

	}

	public void validateMobileNumber() {
		// TODO Auto-generated method stub

	}

	public void validatePassword() {
		// TODO Auto-generated method stub

	}

	public void clearAllEmailSamples() {
		// TODO Auto-generated method stub

	}

}