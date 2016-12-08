/*
 * Tests class ContactList and class Person by allowing the user to create two contacts 
 * and printing the current ContactList after each successful creation
 */
public class app {

	public static void main(String[] args) {
		ContactList app = new ContactList();
		app.createContact();
		app.printContactList();
		app.createContact();
		app.printContactList();
	}
}

/**
Please fill out the following.
Last Name*: Wayne
First Name: Bruce
Address: 374 Wayne Tower, Shasta, CA 92374
Email Address: wayne@towers.com
Phone Number: 832-322-4539
Notes: The real Batman
Contact has been created successfully!

Wayne, Bruce
374 Wayne Tower, Shasta, CA 92374
832-322-4539
wayne@towers.com
The real Batman

Please fill out the following.
Last Name*: Pan
First Name: Peter
Address: 948 Neverland Circle, San Francisco, CA 94123
Email Address: ppan@gmail.com
Phone Number: 048-234-3243
Notes: This is not the real Peter Pan
Contact has been created successfully!

Wayne, Bruce
374 Wayne Tower, Shasta, CA 92374
832-322-4539
wayne@towers.com
The real Batman

Pan, Peter
948 Neverland Circle, San Francisco, CA 94123
048-234-3243
ppan@gmail.com
This is not the real Peter Pan

*/
