package com.bridgelabz.javaregex;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("*********Welcome to user registration with regex***********");
		
		UserImplements user = new UserImplements();
		user.validateFirstName();
		System.out.println("<--------------------------------------->");
		user.validateLastName();
		System.out.println("<--------------------------------------->");
		user.validateEmail();
		System.out.println("<--------------------------------------->");
		user.validateMobileNumber();
		System.out.println("<--------------------------------------->");

	}

}
