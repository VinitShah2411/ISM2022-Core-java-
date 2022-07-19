/*task 5) 

Ticket Booking System.

Login
Exit 

Login => mobile number 

1.1 	Book Ticket { Gold Silver Diamond -Qty } 
1.2	View Booked Tickets
1.3	Available Tickets 
1.4       Logout

Three Types of Ticket , Diamond - Rs.200 , Gold - Rs.150 , Silver -Rs.100 	
One user can book max 7 Tickets.
Total 60 tickets we have 20 Diamond , 20 Gold and 20 Silver.
User can identified by mobile number. */



package Task5;
import java.util.Scanner;

public class Ticket {
	
	void Verify()
	{
		int no;
		int flag=0;
		int gt=20,st=20,dt=20;
		int bgt=0;
		 int dgt=0;
		int rgt;
		int Availablet=60;
		String arr[] = {"1","2","3"};
		int Choice=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice");
		System.out.println("1. For login");
		System.out.println("2. Logout");
		Choice = sc.nextInt();
		
		if(Choice==1)
		{
			System.out.print("Enter mobile no for Login:-");
			no = new Scanner(System.in).nextInt();	
			System.out.println("Login Sucessful");
			System.out.println("Silver ticket rate:-150");
			System.out.println("Gold ticket rate:-200");
			System.out.println("Diamond ticket rate:-250");
			while (flag==0)
			{
			System.out.println("How many tickets you want to book & max limit is 7");
			no = sc.nextInt();
			
				if(no>7)
				{
					System.out.println("Max limit is 7");
					flag=0;
				
				}
				else 
				{
					flag=1;
					
					System.out.println("And which Section");
					Scanner s = new Scanner(System.in);
					System.out.println("Available Tickets are 60");
					System.out.println("1. Gold Section");
					System.out.println("2. Silver Section");
					System.out.println("3. Diamond Section");
					
					//st = s.nextInt();
					//dt = s.nextInt();
					Choice = sc.nextInt();
				
					switch (Choice) {
					case 1:
						System.out.println("Gold");
						bgt=no;
						System.out.println("Succefully Book Gold ticket "+bgt);
						break;
					case 2:
						System.out.println("Silver");
					 
					
							break;
						case 3:
							System.out.println("Diamond");
							break;
						default:
							System.out.println("Not selected");
							
					}
							
							
						    
						   
					
					break;
					}
				}
				
				
				
			}
			else
			{
				System.out.println("Logout Sucessful");
				System.exit(0);
			}
			
			
			
		}
	
		void display() 
		{
			//System.out.println("Remaining Ticket:-"+bgt);
		}
		
		
		public static void main(String[] args) {
			Ticket t = new Ticket();
			t.Verify();
			t.display();
			
		}
		
	}
						
						
						
						
						
					
						
					
					
					
					
					
					
					
					
