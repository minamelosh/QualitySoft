/**
 * Creates reusable Class ContactList, which stores
 * a list of contacts.  Class ContactList allows you
 * to create a new contact, search for a contact by
 * last name, print the entire list in alphabetical
 * order by last name, and save to disk.
 * @ author MM
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ContactList {
	/**
	 * Creates an array of Person objects.
	 * @author MM
	 */
	private ArrayList<Person> contactList = new ArrayList<Person>();
	/**
	 * Creates a contact in the Contact List based on user input. 
	 * If the last name is missing the contact won't be created
	 * and the user will receive a message stating last name is 
	 * required.
	 * @author MM
	 */
	public void createContact() {
		Scanner console = new Scanner(System.in);
		System.out.println("Please fill out the following.");
		System.out.print("Last Name*: ");
		String lastName = console.nextLine();
		if (lastName == null || lastName.length() == 0) {
			System.out.println("Last name required. Your contact was not created." + "\n");
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
			System.out.println("Contact has been created successfully!"+ "\n");
		}
	}
	/**
	 * Prints out whole contact list in alphabetical order by last name.
	 * @author JL
	 */
	public void printContactList() {
		Collections.sort(contactList);
		for (Person person : contactList) {
			System.out.print(person);
			System.out.println("");
		}
	}
	/**
	 * Returns all contacts with last names equal to the one the user is searching
	 * for. If there are no matches in the contact list this will return a
	 * message stating this contact doesn't exist.
	 * @author JL
	 */
	public void getContact() {
		int helper = 0;
		if (contactList.isEmpty()) {
			System.out.println("*** Contact List is empty, nothing to search for ***" + "\n");
		} else {
			Scanner console = new Scanner(System.in);
			System.out.println("Please write a Contact's last name to search for: ");
			String lastName = console.nextLine();
			for (Person person : contactList) {
			if (lastName.equals(person.getLastName())) {
				System.out.println(person);
				helper++;
				}
			}
			if (helper == 0) {
				System.out.println("***no contacts found***");
			}
		}
	}
	/**
	 * Saves the ContactList to disk.
	 * @author JL
	 */
	public void save() {
		FileOutputStream outFile;
		ObjectOutputStream outObject;
		try {
			outFile = new FileOutputStream("MyContactList");
			outObject = new ObjectOutputStream(outFile);
			outObject.writeObject(contactList);
			outFile.close();
			outObject.close();
		} catch (IOException ioe) {
			System.out.println("Error writing objects to the file: " + ioe.getMessage());

		} finally {
			System.out.println("See you later!");
			System.exit(0);
		}
	}
	/**
	 * Loads the saved ContactList from a file.
	 * @author JL
	 */
	public void load() {
		ObjectInputStream inObject;
		FileInputStream inFile;
		try {
			inFile = new FileInputStream("MyContactList");
			inObject = new ObjectInputStream(inFile);
			contactList = (ArrayList<Person>) inObject.readObject();
			inFile.close();
			inObject.close();
		} catch (IOException ioe) {
			System.out.println("Error reading from the file: " + ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error in casting to ContactList: " + cnfe);
		}
	}
	/**
	 * Returns integer number of contacts in the Contact List.
	 * @author EK
	 */
	public int numberOfContacts() {
		int numberOfContacts = contactList.size();
		return numberOfContacts;
	}
}

