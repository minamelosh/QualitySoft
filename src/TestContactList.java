/**
 * Tests class contactList by creating a new contact
 * list.  TestContactList creates new contacts, searchs
 * for a contact, creates contacts with missing information, 
 * prints the contact list, and saves to disk.
 * 
 *@author MM
 */
public class TestContactList {
	public static void main(String args[]){
		ContactList Broccoli = new ContactList(); 	
		Broccoli.createContact("Joe", "Broccoli", "111 Strawberry Lane", "JoeBroccoli@gmail.com", "111-1111", "Prefers to be contacted by phone");
		Broccoli.createContact("", "Pepper", "222 Banana Street", "MaxPepper@gmail.com", "222-2222", "Free in the evenings");
		Broccoli.createContact("Bobby", "Tomato", "333 Orange Drive", "BobbyTomato_googlemail.com", "333-3333", "Wants to volunteer");
		Broccoli.createContact("Katie", "Lettuce", "444 Cherry Way", "KatieLettuce@yahoo.com", "444-444", "Please email only");
		Broccoli.getContact("Broccoli");
		Broccoli.printContactList();
		Broccoli.save();
		Broccoli.load();
	}
}
/*
This contact was added to the contact list.
This contact as not added to the contact list.
Please reenter the email address.
Please reenter the phone number.
Broccoli, Joe
111 Strawberry Lane
JoeBroccoli@gmail.com
111-1111
Prefers to be contacted by phone

Broccoli, Joe
111 Strawberry Lane
JoeBroccoli@gmail.com
111-1111
Prefers to be contacted by phone

Lettuce, Katie
444 Cherry Way
KatieLettuce@yahoo.com
444-444
Please email only

Lettuce, Katie
444 Cherry Way
KatieLettuce@yahoo.com
444-444
Please email only


Tomato, Bobby
333 Orange Drive
BobbyTomato_googlemail.com
333-3333
Wants to volunteer
Contact List has saved to disk.
 */
