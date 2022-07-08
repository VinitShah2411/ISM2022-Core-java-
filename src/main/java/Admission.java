import java.util.Scanner;

public class Admission 
{
	private int math,phy,chemistry,total,mh;
	String name;
	String eli;
	
	void check()
	{
		Scanner sc = new Scanner(System.in);
		//Admission a[] = new Admission[3];
		System.out.println("Enter Student Name");
		name = sc.next();
		System.out.println("Enter your Math,Physics,Chemistry marks");
		math = sc.nextInt();
		phy = sc.nextInt();
		chemistry = sc.nextInt();
		mh = math+phy;
		if(math>=60 && phy>=50 && chemistry>=40 && total>=200 || math+phy+chemistry>=200 || math+phy>=150)
		{
			//System.out.println("You are Eligible");
			eli="Eligible";
		}
		/*	else if(math+phy+chemistry>=200)
				eli="Eligible";
				//System.out.println("You are Eligible");
		else if(math+phy>=150)
			eli="Eligible";
			//System.out.println("You are Eligible");  */
		else
		{
			eli="NotEligible";
			//System.out.println("You are not Eligible");
		}
		
	}
	
	void display()
	{
		System.out.println("Maths   Physics  Chemistry   Maths+Physics       Eligiable or not");
		System.out.println(math +"\t" + phy + "\t" + chemistry + "\t" + mh + "\t" + eli);
	}
	
	public static void main(String[] args) 
	{
		Admission a[] = new Admission[10];
		for(int i=0;i<3;i++)
		{
			a[i] = new Admission();
			a[i].check();
		}
		
		for(int i=0;i<3;i++)
		{
			a[i].display();
		}
	}
}
	
	
			
		
		
		


