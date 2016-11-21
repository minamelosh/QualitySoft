/*
 * Creates reusable Class contactList, which stores 
 * a list of contacts.  Class contactList allows you 
 * to create a new contact, search for a contact by 
 * last name, print the entire list in alphabetical 
 * order by last name, and save to desk.
 * @ author MM
 */
import java.util.ArrayList;
public class ContactList {
	private ArrayList<Person> contactList = new ArrayList<Person>();
	
	/**
	 * Adds a new contact to contact list if true.
	 */
	public boolean createContact(String firstName, String lastName, String address, 
			String email, String phoneNumber, String notes){
		//Add a contact to the contact list 
		//...
		
		return false;
	}
	 
	/**
	 * Prints out whole contact list in alphabetical order 
	 * by last name.
	 */
	public void printContactList(){
		//Print out the contact list
		//... for loop and sort method
	}
	
	/**
	 * Returns the person be we are search in for, if no lastname
	 * in the contact list equals what we are looking for we will
	 * get an error.
	 */
	public String getContact(String lastName){
		//Return the person whose last name is equal to lastName or an error if they aren't in the list
		//...
			
		return "";
	}
	
	/**
	 * Saves the ContactList to disk.
	 */
	public void save(){
		//Save the ContactList as a file
		//...
	}
	
	/**
	 * Loads the saved ContactList from a file.
	 */
	public void load(){
		//Load the saved ContactList from a file
		//...
	}
}
