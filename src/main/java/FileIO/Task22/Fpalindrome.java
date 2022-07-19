/*create 1 file and store 100 name. 
now open that file and read name and check any name is palindrome or not. [use thread ] */


package FileIO.Task22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Fpalindrome extends Thread
{
	int a;
	int b;
	public Fpalindrome(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public void run() 
	{
		try 
		{
			for(int i=a;i<b;i++)
			{
				String lines = Files.readAllLines(Paths.get("D:\\IMS\\VInit\\met.txt")).get(i);
				String s = lines.toLowerCase();
				StringBuilder sb = new StringBuilder(s);
				StringBuilder sb1 = sb.reverse();
				if(s.contentEquals(sb1))
				{
					System.out.println(lines +"Palindrome is:" + i);
				}
			}
		} 
		catch (Exception e) {
			System.out.println("SWR in Fpalindrome");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException 
	{
		Path file = Paths.get("D:\\IMS\\VInit\\met.txt");
		
		//Read All lines From File
		
		long count = Files.lines(file).count();
		int no = (int) count; 
		Fpalindrome a = new Fpalindrome(0, no/10);
		Fpalindrome b = new Fpalindrome(no/10, no/8);
		Fpalindrome c = new Fpalindrome(no/8, no/6);
		Fpalindrome d = new Fpalindrome(no/6, no/4);
		Fpalindrome e = new Fpalindrome(no/4, no/2);
		Fpalindrome f = new Fpalindrome(no/2, no);
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		f.start();
	}
	
}
