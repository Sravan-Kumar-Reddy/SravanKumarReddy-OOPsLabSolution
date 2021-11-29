package com.greatlearning.service;
import java.util.Random;

public class CredentialService {
	
	public String generatePassword() {
	    String numbers = "1234567890";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
	    String specialCharacters = "!@#$/*%&?";
	    String combinedCharacterSet = numbers+capitalLetters+lowerLetters+specialCharacters;
	    String password = "";
	    Random random = new Random();
	    password += String.valueOf(numbers.charAt(random.nextInt(numbers.length())));
	    password += String.valueOf(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
	    password += String.valueOf(lowerLetters.charAt(random.nextInt(lowerLetters.length())));
	    password += String.valueOf(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
	    
	    while(password.length()<8) {
	    	password += String.valueOf(combinedCharacterSet.charAt(random.nextInt(combinedCharacterSet.length())));
	    }
	    
	    //Alternative Approach
	    /*char[] password = new char[length];

	      password[0] = lowerLetters.charAt(random.nextInt(lowerLetters.length()));
	      password[1] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedCharacterSet.charAt(random.nextInt(combinedCharacterSet.length()));
	      }
	      */
	    
		return password;
	}
	
	public String generateEmailAddress(String firstName,String lastName,String department) {
		
		//Checking if there are any spaces firstName
		if(firstName.contains(" ")) {
			firstName = firstName.replaceAll(" ","");//If there are any white spaces, removing them 
		}		
		//Checking if there are any spaces lastName
		if(lastName.contains(" ")) {
			lastName = lastName.replaceAll(" ","");//If there are any white spaces, removing them
		}
		
		return firstName+lastName+"@"+department+".company.com";
	}
	
	public void showCredentials (String firstName,String lastName,String department) {
		System.out.println("Dear " + firstName + " your generated credentials are as follows");
		System.out.println("Email  --->  " + generateEmailAddress(firstName,lastName,department));
		System.out.println("Password ---> " + generatePassword());
	}
}