
/*
 * Creates reusable Class contactList, which stores 
 * a list of contacts.  Class contactList allows you 
 * to create a new contact, search for a contact by 
 * last name, print the entire list in alphabetical 
 * order by last name, and save to disk.
 * @ author MM
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
	/**
	 * Creates an array of Person objects.
	 */
	private ArrayList<Person> contactList = new ArrayList<Person>();

	/**
	 * Creates a contact in the Contact List. If The last name is missing
	 * the contact won't be created
	 */
	public void createContact() {
		Scanner console = new Scanner(System.in);
		System.out.println("Please fill out the following.");
		System.out.print("Last Name*: ");
		String lastName = console.nextLine();
		if (lastName == null || lastName.length() == 0) {
			// put check here! no reason to execute further code if it fails
			System.out.println("Last name required. Your contact was not created." + "\n");
			return;
		} else {
			System.out.print("First Name: ");
			String firstName = console.nextLine();
			System.out.print("Address: ");
			String address = console.nextLine();
			System.out.print("Email Address: ");
			String email = console.nextLine();
			System.out.print("Phone Number: ");
			String phoneNumber = console.nextLine();
			System.out.print("Notes: ");
			String notes = console.nextLine();
			contactList.add(new Person(lastName, firstName, address, email, phoneNumber, notes));
			System.out.println("Contact has been created successfully!");
			System.out.println("");
		}
	}

	/**
	 * Prints out whole contact list in alphabetical order by last name.
	 */	// ... for loop and sort method
	// uses method compareTo(person) from class person
	public void printContactList() {
		
		for(int i = 0; i < contactList.size(); i++) {   
		    System.out.print(contactList.get(i));
		    System.out.println("");
		}  
		
	}

	/**
	 * Returns all contacts with last names equal to the one we are searching
	 * for. If there are no matches in the contact list this will return a
	 * message stating this contact doesn't exist.
	 */
	public Person getContact(String lastName) {
		// uses method equals(lastname) from class person

		return null;
	}
	
	
	
	/**
	 * Saves the ContactList to disk.
	 */
	public void save() { //please close console in this method

	}

	/**
	 * Loads the saved ContactList from a file.
	 */
	public void load() {

	}
}
