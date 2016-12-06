/*
 * Contact List application
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
