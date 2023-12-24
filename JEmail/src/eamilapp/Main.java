package eamilapp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your First Name: ");
		String fName = input.nextLine();
		System.out.println("Enter your Last Name:");
		String lName = input.nextLine();
		
		Email email = new Email(fName, lName);
		System.out.println(email.showInfo());
		
//		email.setPassword("@Suyog123");
//		System.out.println("\nAlternate Email: "+email.getPassword());
	}
}
