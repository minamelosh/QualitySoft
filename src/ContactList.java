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
	 * Adds a new contact to contact list if true.
	 */
	public boolean createContact(){
		//scanner
		
		return false;
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
	 * Returns the contact we are searching for, if no last name
	 * in the contact list equals what we are looking for we will
	 * get an error.
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
