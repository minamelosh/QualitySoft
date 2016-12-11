import java.io.Serializable;

/**
 * test One object of class Person stores the information for one contact in
 * class contactList: name, address, email, phone number and notes. @ author MM
 */

public class Person implements Comparable<Person>, Serializable {
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String phoneNumber;
	private String notes;

	public Person(String lastName, String firstName, String address, String email, String phoneNumber, String notes) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.notes = notes;
	}

	public String getLastName() {
		return this.lastName;
	}

	/**
	 * Returns String of one contacts information.
	 */
	@Override
	public String toString() {
		String OneGuy = lastName + ", " + firstName + "\n" + address + "\n" + phoneNumber + "\n" + email + "\n" + notes
				+ "\n";
		return OneGuy;
	}

	/**
	 * Method compares based on last name (Alphabetically)
	 */

	@Override
	public int compareTo(Person personComp) {
		return this.lastName.compareTo(personComp.getLastName());
	}

}
