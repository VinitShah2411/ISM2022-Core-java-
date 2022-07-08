import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Tele {

	public static void main(String[] args) {
		ArrayList<Person2> person2 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. Add new Contact");
			System.out.println("2. Edit Contact");
			System.out.println("3 Remove Contact");
			System.out.println("4.Display");
			System.out.println("5 Exit From App");
			System.out.println("----------------------");
			System.out.println("Enter Choice");
			int Choice = sc.nextInt();

			Person2 p = new Person2();
			switch (Choice) {
			case 1:
				System.out.println("Enter FirstName");
				p.firstname = sc.next();
				System.out.println("Enter LastName");
				p.lastname = sc.next();
				System.out.println("Enter Contect No");
				p.number = sc.next();
				person2.add(p);
				System.out.println("Registered");
				break;

			case 2:
				System.out.println("Enter FirstName");
				String firstname = sc.next();
				for (int i = 0; i < person2.size(); i++) {
					if (person2.get(0).getFirstname().equals(firstname)) {
						System.out.println("1. Edit FirstName");
						System.out.println("2. Edit LastName");
						System.out.println("3. Edit Number");
						System.out.println("Enter Choice");
						Choice = sc.nextInt();

						switch (Choice) {
						case 1:
							System.out.println("Enter First Name That You Want To Change");
							person2.get(i).setFirstname(sc.next());
							break;

						case 2:
							System.out.println("Enter Last Name That You Want To Change");
							person2.get(i).setLastname(sc.next());
							break;

						case 3:
							System.out.println("Enter Number That You Want To Change");
							person2.get(i).setNumber(sc.next());
							break;
						}
					}
				}
				break;
					
			case 4: 
				System.out.println("Enter FirstName");
				String firstName = sc.next();
				for (int i = 0; i < person2.size(); i++) {
					if (person2.get(0).getFirstname().equals(firstName)) {
						person2.remove(i);
						System.out.println("User Removed");
					}
				}
				break;
				
			case 5:
				
				System.out.println(person2);
				break;
				
			case 6:
				System.exit(0);
				
			}
		}
	}
	
}

class Person2 {
	String firstname;
	String lastname;
	String number;
	
	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String toString() {
		return (firstname + "   " + lastname + "   " + number);
	}

}
