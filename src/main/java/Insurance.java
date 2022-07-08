import java.util.Scanner;

public class Insurance
{
	void check()
	{
		String health,live,gender;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Health excellent & poor");
		health = sc.next();	
		System.out.println("Enter Your Age");
		age = sc.nextInt();
		System.out.println("Enter Your Living Area City or Village");
		live = sc.next();
		System.out.println("Enter Your Gender male & female");
		gender = sc.next();
		
		if(health.equals("excellent") && age>=25 && age<=35 && live.equals("city") && gender.equals("male"))
		{
			System.out.println("Premium is Rs. 4 per thousand");
		}
		else if(health.equals("excellent") && age>=25 && age<=35 && live.equals("city") && gender.equals("female"))
		{
			System.out.println("Premium is Rs. 3 per thousand");
		}
		else if (health.equals("poor") && age>=25 && age<=35 && live.equals("village") && gender.equals("male"))
		{
			System.out.println("Premium is Rs. 6 per thousand");
		}
		else
		{
			System.out.println("person is not insured");
		}
	}
		
	public static void main(String[] args)
	{
		Insurance i = new Insurance();
		i.check();
	}
}
	
	
	
			
	
	
	
	
