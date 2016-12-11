
/*
 * Creates reusable Class contactList, which stores
 * a list of contacts.  Class contactList allows you
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
	 */
	private ArrayList<Person> contactList = new ArrayList<Person>();

	/**
	 * Creates a contact in the Contact List. If The last name is missing the
	 * contact won't be created
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
	 */
	public void printContactList() {
		File newFile = new File("CLFileName");
		if (newFile.exists()) {
			try {
				FileInputStream fis = new FileInputStream("CLFileName");
				ObjectInputStream ois = new ObjectInputStream(fis);
				ArrayList<ContactList> contactList = (ArrayList<ContactList>) ois.readObject();
				for (int i = 0; i < contactList.size(); i++) {
					System.out.println(contactList.get(i));
				}
				ois.close();
			} catch (IOException ioe) {
				System.out.println("Error reading from file: " + ioe.getMessage());
			} catch (ClassNotFoundException cnfe) {
				System.out.println("Error in casting to Person:");
			} finally {
				Collections.sort(contactList);

				for (Person person : contactList) {
					System.out.print(person);
					System.out.println("");
				}
			}
		}
	}

	/**
	 * Returns all contacts with last names equal to the one we are searching
	 * for. If there are no matches in the contact list this will return a
	 * message stating this contact doesn't exist.
	 */
	void getContact() { // potentially add static JL
		Scanner console = new Scanner(System.in);
		System.out.println("Please write a Contact's last name to search for");
		String lastName = console.nextLine();
		for (Person person : contactList) {
			if (lastName.equals(person.getLastName())) {
				System.out.println(person);
			}

		}
	}

	/**
	 * Saves the ContactList to disk.
	 */
	public void save() {
		try {
			File newFile = new File("CLFileName");
			FileOutputStream fos = new FileOutputStream("CLFileName");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(contactList);
			oos.flush();
			oos.close();
		} catch (IOException ioe) {
			System.out.println("Error writing Contacts to file: " + ioe.getMessage());
		} finally {
			System.out.println("Contacts saved. Goodbye!");
			System.exit(0);
		}
	}

	/**
	 * Loads the saved ContactList from a file.
	 */
	public void load() {
		try {
			FileInputStream fis = new FileInputStream("CLFileName");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<ContactList> contactList = (ArrayList<ContactList>) ois.readObject();
			ois.close();
		} catch (IOException ioe) {
			System.out.println("Error reading from file: " + ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error in casting to Person:");
		}

	}
}
