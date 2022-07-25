/*14.Bank App.

Bank provides various service to the user  like deposit money, wid money and customer can check balance. 
Bank have some conditions. 
Customer have to maintain 5000 min balance. 
Customer can perform max 5  transaction and then customer is charged 10 Rs per transaction.
Customer can access bank app via Username/Password. 
Customers have an account number which is generated via random algo. 

Menu
Login
Exit 

	1.1 wid
	1.2 Dep 
	1.3 CheckBal 
	1.4 Logout */

package Task14;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	String userName, Password;
	int amount, total, temp = 0;
	int count = 0;
	Scanner sc = new Scanner(System.in);
	ArrayList<Bnk> bnk = new ArrayList<>();

	void Signup() {
		Bnk b = new Bnk();
		System.out.println("Enter Details For Signup");
		System.out.println("Enter UserName");
		b.userName = sc.next();
		System.out.println("Enter Password");
		b.Password = sc.next();
		int x = (int) (Math.floor(Math.random() * 9_000L) + 1_000L);
		b.accountno = x;
		System.out.println("Your Account Number is: " + b.accountno);
		bnk.add(b);
	}

	void Choice() {

		while (true) {
			System.out.println("Enter Your Choice");
			System.out.println("---------------------");
			System.out.println("1.Login");
			System.out.println("2.Sign Up");
			System.out.println("3.Menu");
			System.out.println("4.Exit");
			int choice = sc.nextInt();

//		if(count>5)
//		{

			Bank b1 = new Bank();
			switch (choice) {
			case 1:
				System.out.println("Enter UserName");
				String username = sc.next();
				System.out.println("Enter Password");
				String password = sc.next();
				for (int i = 0; i < bnk.size(); i++) {
					if (bnk.get(i).getUserName().equals(username) && bnk.get(i).getPassword().equals(password)) {
						System.out.println("Login Successful");
						// b1.
					} else {
						System.out.println("Invalid Details");
						System.out.println("Login Again");
					}
				}
				break;

			case 2:
				b1.Signup();
				break;

			case 3:
				while (true) {
					System.out.println("-------------------");
					System.out.println("Enter Your choice");
					System.out.println("1.Deposit");
					System.out.println("2.Withdraw");
					System.out.println("3.Check Balance");
					System.out.println("4.Logout");
					int subchoice = sc.nextInt();

					switch (subchoice) {
					case 1:
						System.out.println("Enter Amount you want To Deposit");
						amount = sc.nextInt();
						total = temp + amount;
						if (total > 0) {
							System.out.println("Deposit Successfully Done");
						}
						count++;
						break;

					case 2:
						System.out.println("Enter Amount you want To Withdraw");
						amount = sc.nextInt();
						if (total <= 5000) {
							System.out.println("You have to Maintain 5000 Minimum Balance");
						} else {
							total = total - amount;
							System.out.println("Withdrawn SucessFully Done");
							count++;
						}
						break;

					case 3:
						System.out.println("Your Balance is-->" + total);
						break;

					case 4:
						System.out.println("Logout Done");
						System.exit(0);
					}
				}
			}
		}
	}

	class Bnk {
		String userName;
		String Password;
		int amount;
		int total;
		int accountno;

		public int getAccountno() {
			return accountno;
		}

		public void setAccountno(int accountno) {
			this.accountno = accountno;
		}

		public String getUserName() {
			return userName;
		}

		public String getPassword() {
			return Password;
		}

		public int getAmount() {
			return amount;
		}

		public int getTotal() {
			return total;
		}
//		public String toString() {
//			return ("userName" + "accountno");
//		}

	}

	public static void main(String[] args) {
		Bank b = new Bank();
		b.Signup();
		b.Choice();
	}
}
