/**
 * Tests class ContactList and class Person by allowing the user to create contacts,
 * print the current ContactList, search a contact by last name, and exit/save
 * the Contact List. 
 * @author EK
 */
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		ContactList app = new ContactList();
		app.load();
		Scanner console = new Scanner(System.in);
		System.out.println("What would you like to do? (type a number and hit Enter)"+ "\n");
		while (true) {
			System.out.println("Current number of contacts in your Contact List: " + app.numberOfContacts() + "\n");
			System.out.println("1 - Create a New Contact");
			System.out.println("2 - Search for existing contact by Last name");
			System.out.println("3 - Print out the whole Contact List");
			System.out.println("4 - Exit the program");
			String input = console.next();
			try {
				int userChoice = Integer.parseInt(input);
				switch (userChoice) {
				case 1:
					app.createContact();
					break;
				case 2:
					app.getContact();
					break;
				case 3:
					app.printContactList();
					break;
				case 4:
					app.save();
				default:
					System.out.println("\n" + "***INPUT ERROR***-Please use only option numbers (1-4) as your input-***INPUT ERROR***"+ "\n");
				}
			} catch (NumberFormatException e) {
					System.out.println("\n" + "***INPUT ERROR***-Please use only option numbers (1-4) as your input-***INPUT ERROR***"+ "\n");
			}
		}
	}
}
/*
What would you like to do? (type a number and hit Enter)

Current number of contacts in your Contact List: 3

1 - Create a New Contact
2 - Search for existing contact by Last name
3 - Print out the whole Contact List
4 - Exit the program
3
Blue, Amanda
Mountain View, CA
787 655 4099
blue@amanda.com
Second Contact

Green, George
Sunnyvale, CA
767 655 40 24
george@green.com
First Contact

Red, Joseph
Cupertino, CA
877 677 8933
red@joseph.com
Third Contact

Current number of contacts in your Contact List: 3

1 - Create a New Contact
2 - Search for existing contact by Last name
3 - Print out the whole Contact List
4 - Exit the program
1
Please fill out the following.
Last Name*: Green
First Name: Mary
Address: Sunnyvale, CA
Email Address: mary@green.com
Phone Number: 878 777 66 34
Notes: George's wife
Contact has been created successfully!

Current number of contacts in your Contact List: 4

1 - Create a New Contact
2 - Search for existing contact by Last name
3 - Print out the whole Contact List
4 - Exit the program
2
Please write a Contact's last name to search for: 
Green
Green, George
Sunnyvale, CA
767 655 40 24
george@green.com
First Contact

Green, Mary
Sunnyvale, CA
878 777 66 34
mary@green.com
George's wife

Current number of contacts in your Contact List: 4

1 - Create a New Contact
2 - Search for existing contact by Last name
3 - Print out the whole Contact List
4 - Exit the program
2
Please write a Contact's last name to search for: 
NoLastName
***no contacts found***
Current number of contacts in your Contact List: 4

1 - Create a New Contact
2 - Search for existing contact by Last name
3 - Print out the whole Contact List
4 - Exit the program
4
See you later!
*/