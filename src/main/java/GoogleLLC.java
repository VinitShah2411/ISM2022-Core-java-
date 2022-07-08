import java.util.Scanner;

//You need to design an api for google LLC.   your api will verify the syntax of email address ,  syntax for email is , 
//it must contains gmail.com at last. 
//The name can have a-z A_Z 0-9
//Between name(tejasshah)  and domain(gmail.com)  it must contains “@”
//If above rule is not followed then InvalidEmailException will throw by your api. 



public class GoogleLLC 
{
	//String email;
	
	
	
	void Verify()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email");
		String email = sc.next();
		try
		{
			if(email.matches("[a-zA-Z0-9]+@gmail.com"))
			{
				System.out.println("Email is valid");
			}
			else 
			{
				throw new InvalidEmailException("Invalid Email Address");
			}
	
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}

	class InvalidEmailException extends Exception
	{
		public InvalidEmailException(String email)
		{
			super(email);
		}
	}
	
	
	public static void main(String[] args) 
	{
		GoogleLLC gl= new GoogleLLC ();
		gl.Verify();
	}
}
