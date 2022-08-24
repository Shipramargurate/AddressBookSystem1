package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {

	Scanner sc = new Scanner(System.in);
	
Contact contact = new Contact();

public void addContact() {
	
	System.out.println("Enter the First Name : ");
	contact.setFirstName(sc.next());
	System.out.println("Enter the Last Name : ");
	contact.setLastName(sc.next());
	System.out.println("Enter the Address: ");
	contact.setAddress(sc.next());
	System.out.println("Enter the City : ");
	contact.setCity(sc.next());
	System.out.println("Enter the State : ");
	contact.setState(sc.next());
	System.out.println("Enter the Zip code : ");
	contact.setZipCode(sc.next());
	System.out.println("Enter the Mobile Number : ");
	contact.setMobileNo(sc.next());
	System.out.println("Enter the Email ID : ");
	contact.setEmailID(sc.next());
}

public void displayContact() {
	System.out.println("First Name : " +  contact.getFirstName());	
	System.out.println("Last Name : " +  contact.getLastName());
    System.out.println("Address : " +  contact.getAddress());
    System.out.println("City : " +  contact.getCity());
	System.out.println("State : " +  contact.getState());
    System.out.println("Zip code : " +  contact.getZipCode());
    System.out.println("Mobile Number : " +  contact.getMobileNo());
    System.out.println("Email ID : " +  contact.getEmailID());
    										
}

}

