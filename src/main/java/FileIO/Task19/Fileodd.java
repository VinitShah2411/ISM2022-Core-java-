//take 10 numbers from user. now read that number and store into odd.txt if number is odd and 
//store into 	even.txt if number is even.

package FileIO.Task19;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Fileodd 
{
	public static void main(String[] args) throws IOException 
	{
		int no;
		try (Scanner sc = new Scanner(System.in)) {
			File odd = new File("D:\\IMS\\Core JAVA\\FileIO\\odd.txt");   //current folder
			PrintWriter pw = new PrintWriter(odd);
			File even = new File("D:\\IMS\\Core JAVA\\FileIO\\even.txt");   //current folder
			PrintWriter pw1 = new PrintWriter(even);
			
			for(int i=1;i<=10;i++)
			{
				System.out.println("Enter Numbers");
				no = sc.nextInt();
				pw.println(no);
				
				if(no % 2 == 0)
				{
					pw1.println(no);
				}
				else
				{
					pw.println(no);
				}
			}
			pw.close();
			pw1.close();
		}
	}
}
	
	
	

