//take 1 file name with entire path

//	if file is present count total number of vowels from it.
//	if file not present print file not present try again.

package FileIO.Task20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Vowels
{
	public static void main(String[] args) throws IOException 
	{
		int count=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter File Path");
			String path = sc.next();
			File f = new File(path); 
//	System.out.println(f.exists());
//		System.out.println(path);
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			while(true)
			{
				int s = br.read();
				if(s==-1)
				{
					break;
				}
				else if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u' || s=='A' || s=='E' || s=='I' || s=='O' || s=='U') 
				{
					count++;
				}
				
				  else 
				  {
					  System.out.println("File Not Found"+f); 
				  }
			}
		}
		System.out.println("Total numbers of Vowels is:-"+count);
	}
}
		
				 
				

