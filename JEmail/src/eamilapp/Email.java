package eamilapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String companySuffix = "example.com";
	private int capacity = 500;
	private String alternateEmail;
	private final int defaultPasswordLength = 8;
	Scanner input = new Scanner(System.in);
	
	//A Constructor to receive all the details
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = passwordGenerator(defaultPasswordLength);
		email = firstName.toLowerCase()+ "." +lastName.toLowerCase()+ "@" +department.toLowerCase()+ "." +companySuffix;
		
	
//		System.out.println("\nEmail Created: "+this.firstName+" "+this.lastName);
//		System.out.println("\nDepartment: "+ department);
		System.out.println("\nYour Password: "+password);
//		System.out.println("\nYour Email: "+email);
	}
	
	/**
	 * Generate a random temporary password
	 * 
	 * We get the length of the string from the constructor Email which is given as defaultPasswordLength = 8
	 * Math.random() --> double values from 0.0 - 1.0 so, we put (int) at the front to convert into integer value
	 * After that we put passwordSet.length() to increase the default value from 0 - 1 to 0 - passwordSet length
	 * Finally we put password[i] = passwordSet.charAt(ran) to store the randomly picked values form passwordSet until the loop terminates
	 * @return new String(password) returning the random string we generated
	 */
	private String passwordGenerator(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@%$";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
		int ran = (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(ran);
		}
		return new String(password);
	}
	//Set the department
	private String setDepartment() {
		
		System.out.print("DEPARTMENT CODES \n1.Sales\n2.Development\n3.Accounting\nEnter your Department Code:");
		int depC = input.nextInt();
		
		if(depC == 0) {
			return " ";
		}else if(depC == 1) {
			return "Sales";
		}else if(depC == 2) {
			return "Development";
		}else{
			return "Accounting"; 
		}		
	}
	
	//Set the mailboxCapacity
	public void setMailboxCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int getMailboxCapacity() {
		return capacity;
	}
	
	//Create a new alternateEmail;
	public void alternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	//Change the password 
	 public void setPassword(String password) {
		 this.password = password;
	 }
	 
	 public String getPassword() {
		 return password;
	 }
	 
	 public String showInfo() {
		 return "\nDISPLAY_NAME: " + firstName + " " + lastName +
				"\nCOMPANY_EMAIL: " + email +
				"\nMAILBOX_CAPACITY: " + capacity + "mb";
	 }
	 
}
