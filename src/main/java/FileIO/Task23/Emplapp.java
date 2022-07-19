package FileIO.Task23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Emplapp 
{
	private int id,salary,n; 
	private String name;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void add() throws FileNotFoundException
	{
		File f = new File("C:\\Users\\Vinit\\Desktop\\VInit\\met.txt");
		try (PrintWriter pw = new PrintWriter(f)) 	
		{
			ArrayList<String> data = new ArrayList<>();
			try (Scanner sc = new Scanner(System.in)) 
			{
				System.out.println("Enter How many EMp Do you Want to Enter");
				n = sc.nextInt();
				for(int i=1;i<=n;i++)
				{
					System.out.println("Enter Emp Name");		
					name = sc.next();
					System.out.println("Enter Salary");		
					salary = sc.nextInt();
					pw.print(name);
					pw.print(","+ salary+"\n");
					
		//			for(int i=1;i<=f.length();i++)
		//			{
		//				pw.print(i + " ");
		//			}
		//		System.out.println("Enter Emp Name");		
		//		name = sc.next();
				}	
			}
		}
	}
	
	void find(String name,int salary) throws FileNotFoundException
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter Way You Want To Search");
			System.out.println("1.Enter Emp Name ");
			String ename = sc.next();
			System.out.println("2.Enter Salary");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1: 
			{
				try (Scanner scan = new Scanner(new File("C:\\Users\\Vinit\\Desktop\\VInit\\met.txt"))) 
				{
					while(scan.hasNext())
					{
						String line = scan.nextLine().toLowerCase().toString();
						if(line.contains(name))
						{
							System.out.println(line);
						}
					}
				}
				break;
			}
			
			case 2:
				try (Scanner scan = new Scanner(new File("C:\\Users\\Vinit\\Desktop\\VInit\\met.txt"))) 
				{
					while(scan.hasNext())
					{
						String line = scan.nextLine().toLowerCase().toString();
						if(line.equals(salary))
						{
							System.out.println(line);
						}
					}
				}
		}
		}
	}
	
		public static void main(String[] args) throws FileNotFoundException 
		{
			Emplapp emp = new Emplapp();
			emp.add();
//			emp.find(name, salary);
		}
}
