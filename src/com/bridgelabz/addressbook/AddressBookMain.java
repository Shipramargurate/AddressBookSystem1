package com.bridgelabz.addressbook;

public class AddressBookMain {

	public static void main(String[] args) {
		
			System.out.println("WELCOME TO ADDRESSBOOK PROGRAM");
			AddressBook addressbook = new AddressBook();
			addressbook.addContact();
			addressbook.displayContact();
			
		}

	}