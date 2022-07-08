import java.util.Scanner;

public class Person 
{
	private String firstName;
	private String lastName;
	private String gender;
	String user;
	static int salary;
	int n;
	int increment;
	
	Person()
	{
		salary=10000;
	}
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		firstName = sc.next();
		System.out.println("Enter Last Name");
		lastName = sc.next();
		System.out.println("Enter Gender");
		gender = sc.next();
		System.out.println("Enter Increment");
		increment = sc.nextInt(); 
		increment = increment + salary;
	}
	
	void display()
	{
		for(int i=0;i<=n;i++) 
		{
			System.out.println(firstName +"\t" +lastName +"\t" + gender + "\t" + increment);
		}
		
	}
	
	public static void main(String[] args) 
	{
		Person p[] = new Person[3];
		for(int i=0;i<3;i++)
		{
			p[i] = new Person();
			p[i].input();
		}
		int max=0;
		for(int i=0;i<3;i++)
		{
			if(max<p[i].increment)
			{
				max=p[i].increment;
			}
			p[i].display();
		}
		System.out.println(max);
	}
}
				
		
	
		
			
			
			
		
	
		
		

		
	
		
	
	
			


