/**
 * test One object of class Person stores the information for one contact in
 * class contactList: name, address, email, phone number and notes. @ author MM
 */

public class Person implements Comparable<Person> {
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

	/**
	 * Returns true if entered lastname equals this.lastname.
	 */
	public boolean equals(String lastname) {

		return false;
	}

	/**
	 * Returns String of one contacts information.
	 */
	@Override
	public String toString() {
		String OneGuy = lastName + ", " + firstName + "\n" + address + "\n" + phoneNumber + "\n" + email + "\n" + notes + "\n";
		return OneGuy;
	}

	/**
	 * Returns a value representing if this object comes before or after the
	 * object it is being compared to.
	 */
	public int compareTo(Person personComp) {
		return 0;
		// return personComp.compareTo(this);
	}
}
