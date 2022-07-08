import java.util.Scanner;

public class Levis {

		String Name;
		double Tax=0.0,Amount=0.0,price;
		int Category; 
		String s;
		
		void input()
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Choice");
			System.out.println("1---------Men");
			System.out.println("2---------Women");
			System.out.println("3---------Student");
			Category = sc.nextInt();
			System.out.println(" Enter name");
			Name = sc.next();
			System.out.println(" Price of Levis"); 
			price = sc.nextDouble();
			if(Category ==1)
			{
				Tax = price * 0.15;
				s = "Men";
			}
			else if(Category ==2)
			{
				Tax = price * 0.1;
				s = "Women";
			}
			else
			{
				Tax = price * 0.05;
				s = "Student";
			}	
			System.out.println("---> " + Tax);
			Amount = price + Tax;	
		}	
		void print()
		{
			System.out.print(Name+ "\t" + price + "\t" + s + "\t" + Tax + "\t" + Amount);
		}
		public static void main(String[] args) {
			Levis l = new Levis();
			l.input();
			l.print();
		}
}

			
				
			
			
	   
		 
		
	



