/*task 3)
 	class Levis 
 		name
 		price
 		category 
 		tax 
 		amount    
   	methods 
   		input 
   		print 
   		
   	user can purchase any item from levis . when user purchase they input all the details
   	of item for levis , tax need to calculate automatically. 
   	tax is based on price of levis item. 
   	like, if category is men then tax is 15% 
   	         category is women then tax is 10% 
   	         category is student then tax is 5% 
   	         
   	once all input done print all response. 
   	
   	ex: 
   	input:
   	    name : denim jeans  
   	    price : 1500
   	    category : men 
   	    
   	output : 
   	  denim jeans 	1500	men 225  1725 
   	  */
   	  
package Task3;
import java.util.Scanner;

public class Levis {

		String Name;
		double Tax=0.0,Amount=0.0,price;
		int Category; 
		String s;
		
		void input()
		{
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter Choice");
				System.out.println("1---------Men");
				System.out.println("2---------Women");
				System.out.println("3---------Student");
				Category = sc.nextInt();
				System.out.println(" Enter name");
				Name = sc.next();
				System.out.println(" Price of Levis"); 
				price = sc.nextDouble();
			}
			
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
