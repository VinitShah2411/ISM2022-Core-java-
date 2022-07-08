import java.util.Scanner;

public class Telephonediary 
{
	String firstName,lastName,fn;
	Scanner sc = new Scanner(System.in);
	int pno;
	int Choice=0;
	static int count=0;
	static int i=0;
	Telephonediary t[] = new Telephonediary[10];
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	
	void add()
	{
		System.out.println("Enter First Name,Last Name & Mobile No");
		firstName = sc.next();
		lastName = sc.next();
		pno = sc.nextInt();
		count++;
	}
	
	void edit(String search)
	{
		for(i=0;i<count;i++)
		{
			if(search.equals(t[i].firstName))
			{
				System.out.println("Change firstname");
				//int en = sc.nextInt();
				System.out.println("FirstName");
				t[i].firstName = sc.next();
				for(i=0;i<count;i++)
				{
					System.out.println(t[i].firstName);
				}
				break;
			}
		}
	}
				
	void print()
	{
		for(i=0;i<count;i++)
		{
			System.out.println(t[i].firstName + "\t" + t[i].lastName + "\t" + t[i].pno);
		}
		
	}
	
	void search(String name) 
	{
		for (int i = 0; i <count; i++) 
		{
			if (name.equals(t[i].firstName)) 
			{
				System.out.println(t[i].firstName + " " + t[i].lastName + " " + t[i].pno);
			}
		}
	}
	
	void delete(String name)
	{
		for(i=0;i<count;i++)
		{
			if(name.equals(t[i].firstName))
			{
				System.out.println(t[i].firstName + "\t" + t[i].lastName + " " + t[i].pno);
				t[i].firstName="";
				t[i].lastName="";
				t[i].pno=0;
				System.out.println("User deleted Successfully");
			}
		}
	}
	
	void display() 
	{
		for(int i=0;i<t.length-1;i++) 
		{
			System.out.println(t[i].firstName + "\t" + t[i].lastName + "\t" + t[i].pno);
		}
	}
	
	public void Choice() 
	{
		while(true)
		{
			System.out.println("1. Add new Contact");
			System.out.println("2. Edit Contact");
			System.out.println("3. Search Contact");
			System.out.println("4. Remove Contact");
			System.out.println("5. Display");
			System.out.println("6. Exit From App ");
			System.out.println("----------------------");
			System.out.println("Enter Choice");
			Choice = sc.nextInt();
			
			switch (Choice) 
			{
			case 1: 
			{
				t[i] = new Telephonediary();
				t[i].add();
				i++;
				break;
			}  
			case 2:
			{
				System.out.println("Enter the first Name of contact you want to Change");
				String search = sc.next();
				edit(search);
				break;
			}
			case 3:
			{
				System.out.println("Enter the first name of contact you want to Search");
				String name = sc.next();
				search(name);
				break;
			}
			case 4:
			{
				System.out.println("Enter the first name of contact you want to Delete");
				String name = sc.next();
				delete(name);
				break;
			}
			case 5:
			{
				System.out.println("Display");
				display();
				break;
			}
			
			case 6:
			{
				System.out.println("Logout");
				System.exit(0);
				break;
			}
			
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Telephonediary td = new Telephonediary(); 
		td.Choice();
	}
}