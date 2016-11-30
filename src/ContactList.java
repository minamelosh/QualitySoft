/*
 * Creates reusable Class contactList, which stores 
 * a list of contacts.  Class contactList allows you 
 * to create a new contact, search for a contact by 
 * last name, print the entire list in alphabetical 
 * order by last name, and save to desk.
 * @ author MM
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ContactList {
	/**
	 * Creates an array of object persons.
	 */
	private ArrayList<Person> contactList = new ArrayList<Person>();
	
	/**
	 * Returns true if user input for the new contact has all the 
	 * necessary info and adds the new contact to the contact list.  
	 * If missing last name than returns false and the contact is
	 * not added to the contact list. 
	 */
	public boolean createContact(){
	Scanner console = new Scanner (System.in);
		System.out.println("Please fill out the following.");
		System.out.print("Last Name: ");
		String lastName = console.next();
		System.out.print("First Name: ");
		String firstName = console.next();
		System.out.print("Address: ");
		String address = console.next();
		System.out.print("Email Address: ");
		String email = console.next();
		System.out.print("Phone Number: ");
		String phoneNumber= console.next();
		System.out.print("Notes: ");
		String notes = console.next();
		if (lastName == null || lastName.length() == 0){
			System.out.println("Last name required. Your contact was not saved.");
			return false;
		}
		Person contact = new Person(lastName, firstName, address, email, phoneNumber, notes);
		return true;
	}
	 
	/**
	 * Prints out whole contact list in alphabetical order 
	 * by last name.
	 */
	public void printContactList(){
		//... for loop and sort method
		//uses method compareTo(person) from class person
	}
	
	/**
	 * Returns all contacts with last names equal to the one
	 * we are searching for.  If there are no matches in the 
	 * contact list this will return a message stating this 
	 * contact doesn't exist.
	 */
	public Person getContact(String lastName){
		//uses method equals(lastname) from class person
		
		return null;
	}
	
	/**
	 * Saves the ContactList to disk.
	 */
	public void save(){
		
	}
	
	/**
	 * Loads the saved ContactList from a file.
	 */
	public void load(){
		
	}
}
